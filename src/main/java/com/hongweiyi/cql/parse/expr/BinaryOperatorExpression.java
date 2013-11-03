package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.BinaryOperator;


public abstract class BinaryOperatorExpression extends BaseExpression {
    private Expression leftHandOperand;
    private Expression rightHandOperand;

    public BinaryOperatorExpression() {
        super();
    }

    public void setLeftHandOperand(Expression leftHandOperand) {
        this.leftHandOperand = leftHandOperand;
    }

    public Expression getLeftHandOperand() {
        return leftHandOperand;
    }

    public void setRightHandOperand(Expression rightHandOperand) {
        this.rightHandOperand = rightHandOperand;
    }

    public Expression getRightHandOperand() {
        return rightHandOperand;
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        if (leftHandOperand == null || rightHandOperand == null) {
            throw new ExecException("Missing operand(s).");
        }

        Object lho = leftHandOperand.evaluate(ctx);
        Object rho = rightHandOperand.evaluate(ctx);

        return evaluateInner(lho, rho, ctx);
    }

    protected abstract Object evaluateInner(Object lho, Object rho, CqlContext ctx) throws ExecException;

    protected Object evaluateArithmeticCalculation(Number lho, Number rho, CqlContext ctx, BinaryOperator op)
            throws ExecException {
        // usual arithmetic conversions

        if (isBigDecimal(lho) || isBigDecimal(rho)) {
            return op.doBigDecimal(convertToBigDecimal(lho), convertToBigDecimal(rho));
        } else if (isDouble(lho) || isDouble(rho)) {
            return op.doDouble(convertToDouble(lho), convertToDouble(rho));
        } else if (isFloat(lho) || isFloat(rho)) {
            return op.doFloat(convertToFloat(lho), convertToFloat(rho));
        } else if (isBigInteger(lho) || isBigInteger(rho)) {
            return op.doBigInteger(convertToBigInteger(lho), convertToBigInteger(rho));
        } else if (isLong(lho) || isLong(rho)) {
            return op.doLong(convertToLong(lho), convertToLong(rho));
        } else if (isInteger(lho) || isInteger(rho)) {
            return op.doInteger(convertToInteger(lho), convertToInteger(rho));
        } else {
            return op.doLong(convertToLong(lho), convertToLong(rho));
        }
    }
}
