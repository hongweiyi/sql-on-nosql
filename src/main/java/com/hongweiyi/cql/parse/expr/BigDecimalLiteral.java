package com.hongweiyi.cql.parse.expr;

import java.math.BigDecimal;

import org.apache.solr.client.solrj.util.ClientUtils;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class BigDecimalLiteral extends NumberLiteralExpression {
    private BigDecimal value;

    public BigDecimalLiteral(BigDecimal value) {
        super();
        this.value = value;
    }

    @Override
    public boolean isNegativeValue() {
        return (value.compareTo(BigDecimal.ZERO) < 0);
    }

    public BigDecimal evaluate(CqlContext ctx) throws ExecException {
        return value;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ClientUtils.escapeQueryChars(value.toString());
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
