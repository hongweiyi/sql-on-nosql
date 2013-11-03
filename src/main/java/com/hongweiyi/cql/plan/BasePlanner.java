package com.hongweiyi.cql.plan;

import org.apache.solr.client.solrj.SolrServer;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public abstract class BasePlanner implements Planner {
    public BasePlanner() {
    }

    // never returns null
    public SolrServer getSolrInstance(String name, CqlContext ctx)
            throws ExecException {
        if (name == null) {
            SolrServer server = ctx.getSolrInstance();
            if (server == null) {
                throw new ExecException("Default connection is not specified.");
            }
            return server;
        } else {
            Object obj = ctx.get(name);

            if (obj != null && obj instanceof SolrServer) {
                return (SolrServer) obj;
            } else {
                throw new ExecException("No such connection.");
            }
        }
    }

    @SuppressWarnings("unused")
    public Object getHbaseInstance(String name, CqlContext ctx)
            throws ExecException {
        // TODO
        throw new ExecException("Not support now!");
    }

    @Override
    public Object buildPlan(CqlContext ctx) throws ExecException {
        throw new ExecException("Should have implemented by sub-class!");
    }

}
