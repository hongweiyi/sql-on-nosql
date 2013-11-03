package com.hongweiyi.cql.plan.solr;

import java.io.IOException;
import java.util.Iterator;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.plan.InsertPlanner;
import com.hongweiyi.cql.plan.solr.SolrSelectPlanner.Result;

public class SolrInsertPlanner extends InsertPlanner {

    public UpdateResponse execute(CqlContext ctx) throws ExecException {
        if (fields == null) {
            throw new ExecException("No field specified.");
        }

        SolrServer server = getSolrInstance(destination, ctx);

        SolrInputDocument doc = new SolrInputDocument();

        if (values != null) {
            if (fields.size() != values.size()) {
                throw new ExecException("len(fields) != len(values)");
            }

            Iterator<String> fit = fields.iterator();
            Iterator<Expression> vit = values.iterator();
            while (fit.hasNext()) {
                doc.addField(fit.next(), vit.next().evaluate(ctx));
            }
        } else if (selectPlanner != null) {
            SolrSelectPlanner.Result res = (Result) selectPlanner
                    .execute(ctx);
            SolrDocumentList results = res.getDocuments();
            for (SolrDocument resdoc : results) {
                for (String field : fields) {
                    doc.addField(field, resdoc.getFieldValue(field));
                }
            }
        } else {
            throw new ExecException(
                    "values and select statement are both null.");
        }

        // 追加
        try {
            return server.add(doc);
        } catch (SolrServerException e) {
            throw new ExecException(e);
        } catch (IOException e) {
            throw new ExecException(e);
        }
    }
}
