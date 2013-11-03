package com.hongweiyi.cql.plan.solr;

import java.net.MalformedURLException;

import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.plan.UsePlanner;

public class SolrUsePlanner extends UsePlanner {

    public Object execute(CqlContext ctx) throws ExecException {
        try {
            if (connStr == null) {
                throw new ExecException("Url is null.");
            }

            CommonsHttpSolrServer server = new CommonsHttpSolrServer(connStr);
            if (name == null) {
                ctx.setSolrInstance(server);
            } else {
                ctx.putGlobal(name, server);
            }
        } catch (MalformedURLException e) {
            throw new ExecException("Invalid Solr URL: " + connStr, e);
        }

        return null;
    }
}
