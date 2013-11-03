package com.hongweiyi.cql.plan.solr;

import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrRequest;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.FieldStatsInfo;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.Namespace;
import com.hongweiyi.cql.exception.ErrorMsg;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.StatLiteral;
import com.hongweiyi.cql.plan.SelectPlanner;

public class SolrSelectPlanner extends SelectPlanner {

    @Override
    public SolrQuery buildPlan(CqlContext ctx) throws ExecException {
        SolrQuery query = new SolrQuery();
        // retrieve all fields + "score" by default.
        query.setIncludeScore(true);

        if (condition != null) {
            query.setQuery(condition.toSolrQuery(ctx));
        } else if (nativeQuery != null) {
            query.setQuery(nativeQuery);
        } else {
            query.setQuery("*:*");
        }

        if (limit != null) {
            query.setRows(limit);
        }
        if (offset != null) {
            query.setStart(offset);
        }

        if (sortConditions != null) {
            for (Sort s : sortConditions) {
                if (s.order == SortOrder.Ascending) {
                    query.addSortField(s.field, SolrQuery.ORDER.asc);
                } else if (s.order == SortOrder.Descending) {
                    query.addSortField(s.field, SolrQuery.ORDER.desc);
                } else {
                    throw new ExecException("Unknown sort order.");
                }
            }
        }

        if (statField) {
            query.set("stats", true);
            for (ResultField field : resultFields) {
                if (field.expression instanceof StatLiteral) {
                    StatLiteral stat = (StatLiteral) field.expression;
                    query.add("stats.field", stat.field);
                }
            }
        }

        return query;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Result execute(CqlContext ctx) throws ExecException {
        SolrServer server = getSolrInstance(source, ctx);

        SolrQuery query = buildPlan(ctx);

        try {
            ctx.enterFunction();
            Namespace ns = ctx.getNamespace();

            QueryResponse resp = server.query(query, SolrRequest.METHOD.POST);
            Result result = new Result(query.getQuery(), resp);
            if (statField) {
                Map<String, FieldStatsInfo> stats = resp.getFieldStatsInfo();
                SolrDocument resdoc = new SolrDocument();
                for (ResultField resultField : resultFields) {
                    if (resultField.expression instanceof StatLiteral) {
                        StatLiteral stat = (StatLiteral) resultField.expression;
                        FieldStatsInfo statInfo = stats.get(stat.field);
                        String field = stat.type + "(" + stat.field + ")";

                        if (resultField.alias != null) {
                            field = resultField.alias;
                        }
                        if (stat.type.equals("max")) { // TODO
                            resdoc.put(field, statInfo.getMax());
                        } else if (stat.type.equals("min")) {
                            resdoc.put(field, statInfo.getMin());
                        } else if (stat.type.equals("sum")) {
                            resdoc.put(field, statInfo.getSum());
                        } else if (stat.type.equals("count")) {
                            resdoc.put(field, statInfo.getCount());
                        } else { // TODO
                        }
                    } else {
                        // TODO
                    }
                }
                result.addDocument(resdoc);
            } else {
                for (SolrDocument doc : resp.getResults()) {
                    ns.setCurrent(doc);

                    SolrDocument resdoc = new SolrDocument();
                    for (ResultField rf : resultFields) {
                        Object o = rf.expression.evaluate(ctx);
                        if (o instanceof Map) {
                            resdoc.putAll((Map<? extends String, ? extends Object>) o);
                        } else {
                            resdoc.put(rf.alias, o);
                        }
                    }
                    result.addDocument(resdoc);
                }
            }

            return result;
        } catch (SolrServerException e) {
            String msg = e.getMessage();

            ErrorMsg error = ErrorMsg.GENERIC_ERROR;
            if (msg.equals("Error executing query")) {
                String subMsg = ErrorMsg.EXECERROR + e.getCause().getMessage().split("\n")[0];
                error = ErrorMsg.getInstance(subMsg);
            }

            throw new ExecException(error.getErrorCodedMsg(), e);
        } finally {
            ctx.leave();
        }
    }

    public static class Result {
        private SolrDocumentList documents;
        private QueryResponse response;
        private String query;

        public Result(String query, QueryResponse response) {
            documents = new SolrDocumentList();
            this.query = query;
            this.response = response;
        }

        public String getQuery() {
            return query;
        }

        public QueryResponse getResponse() {
            return response;
        }

        public SolrDocumentList getDocuments() {
            return documents;
        }

        public void addDocument(SolrDocument doc) {
            documents.add(doc);
        }
    }

}
