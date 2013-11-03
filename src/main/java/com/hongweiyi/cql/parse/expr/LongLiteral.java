package com.hongweiyi.cql.parse.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class LongLiteral extends NumberLiteralExpression {
    private Long value;

    public LongLiteral(Long value) {
        super();
        this.value = value;
    }

    public Long evaluate(CqlContext ctx) throws ExecException {
        return value;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(value.toString());
    }

    @Override
    public boolean isNegativeValue() {
        return (value < 0);
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
