package com.hongweiyi.cql.plan.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.plan.ExtendedPlanner;

public class SolrExtendedPlanner extends ExtendedPlanner {

    public UpdateResponse execute(CqlContext ctx) throws ExecException {
        SolrServer server = getSolrInstance(table, ctx);
        try {
            return server.commit();
        } catch (IOException e) {
            throw new ExecException(e);
        } catch (SolrServerException e) {
            throw new ExecException(e);
        }
    }
}
