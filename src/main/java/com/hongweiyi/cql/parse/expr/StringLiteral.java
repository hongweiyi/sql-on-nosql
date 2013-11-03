package com.hongweiyi.cql.parse.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class StringLiteral extends LiteralExpression {
    private String value;

    public StringLiteral(String value) {
        super();
        this.value = value;
    }

    public String evaluate(CqlContext ctx) {
        return value;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(value);
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
