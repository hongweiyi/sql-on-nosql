package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.Subtract;


public class SubtractExpression extends BinaryOperatorExpression {
    public SubtractExpression() {
        super();
    }

    @Override
    protected Object evaluateInner(Object lho, Object rho, CqlContext ctx)
            throws ExecException {
        if (isNumber(lho) && isNumber(rho)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number) lho, (Number) rho, ctx, Subtract.INSTANCE);
        }

        throw new ExecException("Operands have incompatible types.");
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Operator \"-\" is not supported in WHERE clauses.");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
