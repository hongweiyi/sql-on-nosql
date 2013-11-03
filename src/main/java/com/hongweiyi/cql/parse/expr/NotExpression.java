package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class NotExpression extends BinaryOperatorExpression {
    public NotExpression() {
        super();
    }

    @Override
    protected Boolean evaluateInner(Object lho, Object rho, CqlContext ctx) {
        return (convertToBoolean(lho) && !convertToBoolean(rho));
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return ("(" + getLeftHandOperand().toSolrQuery(ctx) +
                ") NOT (" + getRightHandOperand().toSolrQuery(ctx) + ")");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
