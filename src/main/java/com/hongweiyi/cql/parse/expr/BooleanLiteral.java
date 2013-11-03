package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class BooleanLiteral extends LiteralExpression {
    private Boolean value;

    public BooleanLiteral(Boolean value) {
        this.value = value;
    }

    public Boolean evaluate(CqlContext ctx) {
        return value;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        if (value) {
            return "true";
        } else {
            return "false";
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
