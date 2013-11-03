package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.Negate;


public class NegateExpression extends UnaryOperatorExpression {
    public NegateExpression() {
        super();
    }

    @Override
    protected Object evaluateInner(Object o, CqlContext ctx)
            throws ExecException {
        if (isNumber(o)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number) o, ctx, Negate.INSTANCE);
        }

        throw new ExecException("Operand has an incompatible type.");
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        // operandがNumberLiteralであった場合は、"-"を前置/除去する。
        // そうでない場合、例外
        Expression operand = getOperand();
        if (isNumberLiteralExpression(operand)) {
            String q = operand.toSolrQuery(ctx);
            if (((NumberLiteralExpression) operand).isNegativeValue()) {
                // 先頭の "\\-"を除去
                if (q.startsWith("\\-")) {
                    return q.substring(2);
                } else if (q.startsWith("-")) {
                    return q.substring(1);
                } else {
                    // negative but not prefixed with "-"
                    return q;
                }
            } else {
                return "\\-" + operand.toSolrQuery(ctx);
            }
        } else {
            throw new ExecException("Operator \"-\" can only be applied to number literals.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
