package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class NullLiteral extends LiteralExpression {
    public NullLiteral() {
        super();
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        return null;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Unexpected NULL literal.");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
