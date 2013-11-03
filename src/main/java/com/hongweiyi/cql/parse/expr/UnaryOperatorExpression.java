package com.hongweiyi.cql.parse.expr;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.UnaryOperator;


public abstract class UnaryOperatorExpression extends BaseExpression {
    private Expression operand;

    public UnaryOperatorExpression() {
        super();
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        if (operand == null) {
            throw new ExecException("Missing operand.");
        }

        Object o = operand.evaluate(ctx);

        return evaluateInner(o, ctx);
    }

    protected abstract Object evaluateInner(Object o, CqlContext ctx) throws ExecException;

    protected Object evaluateArithmeticCalculation(Number o, CqlContext ctx, UnaryOperator op)
            throws ExecException {
        if (isBigDecimal(o)) {
            return op.doBigDecimal((BigDecimal) o);
        } else if (isBigInteger(o)) {
            return op.doBigInteger((BigInteger) o);
        } else if (isDouble(o)) {
            return op.doDouble((Double) o);
        } else if (isFloat(o)) {
            return op.doFloat((Float) o);
        } else if (isLong(o)) {
            return op.doLong((Long) o);
        } else if (isInteger(o)) {
            return op.doInteger((Integer) o);
        } else {
            return op.doLong(convertToLong(o));
        }
    }
}
