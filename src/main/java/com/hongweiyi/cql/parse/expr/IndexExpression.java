package com.hongweiyi.cql.parse.expr;

import java.lang.reflect.Array;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class IndexExpression extends BaseExpression {
    private Expression operand;
    private Expression index;

    public IndexExpression() {
        super();
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    public Expression getIndex() {
        return index;
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        Object op = operand.evaluate(ctx);
        Object idx = index.evaluate(ctx);

        if (op == null) {
            throw new ExecException("The operand is null.");
        }

        if (op == null || !isNumber(idx)) {
            throw new ExecException("The index is null or is not a number.");
        }

        if (isArray(op)) {
            return Array.get(op, convertToInteger((Number) idx));
        } else if (isList(op)) {
            return ((List<?>) op).get(convertToInteger((Number) idx));
        } else if (isString(op)) {
            return Character.toString(((String) op).charAt(convertToInteger((Number) idx)));
        } else {
            throw new ExecException(
                    "Index oprator can't be applied to " +
                            op.getClass().getCanonicalName());
        }
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Operator \"[]\"is not supported");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
