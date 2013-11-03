package com.hongweiyi.cql.parse.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class FloatLiteral extends NumberLiteralExpression {
    private Float value;

    public FloatLiteral(Float value) {
        this.value = value;
    }

    public Float evaluate(CqlContext ctx) throws ExecException {
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
