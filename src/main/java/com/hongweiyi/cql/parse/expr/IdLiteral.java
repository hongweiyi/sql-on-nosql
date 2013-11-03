package com.hongweiyi.cql.parse.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class IdLiteral extends LiteralExpression {
    private String value;

    public IdLiteral(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        return ctx.get(value);
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(value);
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
