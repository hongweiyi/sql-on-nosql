package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.CompareTo;


public class CompareExpression extends BinaryOperatorExpression {
    public static enum Type {
        LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo
    }

    private Type type;

    public CompareExpression(Type type) {
        super();
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Boolean evaluateInner(Object lho, Object rho, CqlContext ctx)
            throws ExecException {
        if (lho == null || rho == null) {
            return false;
        }

        if (lho instanceof Number && rho instanceof Number) {
            // number
            int cmp = (Integer) evaluateArithmeticCalculation(
                    (Number) lho, (Number) rho, ctx, CompareTo.INSTANCE);
            return getResult(cmp);
        } else if (lho instanceof String && rho instanceof String) {
            // string
            int cmp = ((String) lho).compareTo((String) rho);
            return getResult(cmp);
        } else if (lho.getClass().equals(rho.getClass())) {
            // same class
            if (lho instanceof Comparable) {
                int cmp = ((Comparable<Object>) lho).compareTo(rho);
                return getResult(cmp);
            }
        }

        return false;
    }

    private Boolean getResult(int cmp) {
        switch (type) {

            case LessThan:
                return (cmp < 0);

            case LessThanOrEqualTo:
                return (cmp <= 0);

            case GreaterThan:
                return (cmp > 0);

            case GreaterThanOrEqualTo:
                return (cmp >= 0);

        }

        return false;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        // 許されるパターン
        // 1. id < {IdLiteral, WildcardLiteral, NullLiteral以外のLiteralExpression}
        // 2. {IdLiteral, WildcardLiteral, NullLiteral} < id
        Expression lho = getLeftHandOperand();
        Expression rho = getRightHandOperand();

        if (isIdLiteral(lho)) {
            if (isLiteralExpressionExcludingId(rho)) {
                return getFieldQuery((IdLiteral) lho, (LiteralExpression) rho, type, ctx);
            }
        } else if (isIdLiteral(rho)) {
            if (isLiteralExpressionExcludingId(lho)) {
                return getFieldQuery((IdLiteral) rho, (LiteralExpression) lho, getReversedOperator(), ctx);
            }
        }

        throw new ExecException(
                "Specified expression is not supported in WHERE clauses.");
    }

    private String getFieldQuery(IdLiteral lho, LiteralExpression rho, Type op, CqlContext ctx)
            throws ExecException {
        String field = lho.toSolrQuery(ctx);
        String limit = rho.toSolrQuery(ctx);

        if (limit.equals("")) {
            limit = "\"\"";
        }

        if (op == Type.LessThan) {
            return field + ":{* TO " + limit + "}";
        } else if (op == Type.LessThanOrEqualTo) {
            return field + ":[* TO " + limit + "]";
        } else if (op == Type.GreaterThan) {
            return field + ":{" + limit + " TO *}";
        } else if (op == Type.GreaterThanOrEqualTo) {
            return field + ":[" + limit + " TO *]";
        }

        throw new ExecException("Uknown comparation operator: " + type.toString());
    }

    private Type getReversedOperator() {
        if (type == Type.LessThan) {
            return Type.GreaterThan;
        } else if (type == Type.LessThanOrEqualTo) {
            return Type.GreaterThanOrEqualTo;
        } else if (type == Type.GreaterThan) {
            return Type.LessThan;
        } else if (type == Type.GreaterThanOrEqualTo) {
            return Type.LessThanOrEqualTo;
        }

        return null;
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
