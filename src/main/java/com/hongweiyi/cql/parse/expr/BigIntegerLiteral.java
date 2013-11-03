package com.hongweiyi.cql.parse.expr;

import java.math.BigInteger;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class BigIntegerLiteral extends NumberLiteralExpression {
    private BigInteger value;

    public BigIntegerLiteral(BigInteger value) {
        super();
        this.value = value;
    }

    public BigInteger evaluate(CqlContext ctx) throws ExecException {
        return value;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(value.toString());
    }

    @Override
    public boolean isNegativeValue() {
        return (value.compareTo(BigInteger.ZERO) < 0);
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
