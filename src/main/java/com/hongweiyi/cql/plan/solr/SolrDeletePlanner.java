package com.hongweiyi.cql.plan.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.plan.DeletePlanner;


public class SolrDeletePlanner extends DeletePlanner {
    private String source;
    private Expression condition;
    private String nativeQuery;

    public SolrDeletePlanner() {
        super();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setNativeQuery(String query) {
        this.nativeQuery = query;
    }

    public String getNativeQuery() {
        return nativeQuery;
    }

    public UpdateResponse execute(CqlContext ctx) throws ExecException {
        SolrServer server = getSolrInstance(source, ctx);

        try {
            if (condition == null) {
                // delete all
                return server.deleteByQuery("*:*");
            } else {
                if (condition != null) {
                    // delete by query
                    String query = condition.toSolrQuery(ctx);
                    return server.deleteByQuery((String) query);
                } else if (nativeQuery != null) {
                    return server.deleteByQuery(nativeQuery);
                } else {
                    throw new ExecException("No query.");
                }
            }
        } catch (SolrServerException e) {
            throw new ExecException(e);
        } catch (IOException e) {
            throw new ExecException(e);
        }
    }
}
