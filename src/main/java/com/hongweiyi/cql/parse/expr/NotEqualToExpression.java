package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.NotEqualTo;


public class NotEqualToExpression extends BinaryOperatorExpression {
    public static enum Type {
        Single, Double
    }

    private Type type;

    public NotEqualToExpression(Type type) {
        super();
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    protected Object evaluateInner(Object lho, Object rho, CqlContext ctx)
            throws ExecException {
        if (isNumber(lho) && isNumber(rho)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number) lho, (Number) rho, ctx, NotEqualTo.INSTANCE);
        } else {
            return !lho.equals(rho);
        }
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        // 許されるパターン
        // 1. id != IdLiteral以外のLiteralExpression
        // 2. IdLiteral以外のLiteralExpression != id
        Expression lho = getLeftHandOperand();
        Expression rho = getRightHandOperand();

        if (isIdLiteral(lho)) {
            // id!=value, id!=NULL, or id!=*
            if (isLiteralExpressionExcludingId(rho)) {
                return getFieldQuery((IdLiteral) lho, (LiteralExpression) rho, ctx);
            }
        } else if (rho instanceof IdLiteral) {
            // value!=id, NULL!=id, or *!=id
            if (isLiteralExpressionExcludingId(lho)) {
                return getFieldQuery((IdLiteral) rho, (LiteralExpression) lho, ctx);
            }
        }

        throw new ExecException(
                "Specified expression is not supported in WHERE clauses.");
    }

    private String getFieldQuery(IdLiteral field, LiteralExpression value, CqlContext ctx)
            throws ExecException {
        if (isStringLiteral(value)) {
            String rho = value.toSolrQuery(ctx);

            if (rho.equals("")) {
                // id!="", id!==""
                // id:[* TO *] に変換
                return field.toSolrQuery(ctx) + ":[* TO *]";
            }

            if (type == Type.Single) {
                // term query
                // *:* NOT id=value に変換
                return "*:* NOT " + field.toSolrQuery(ctx) + ":" + rho;
            } else {
                // phrase query
                // *:* NOT id="value"に変換
                return "*:* NOT " + field.toSolrQuery(ctx) + ":\"" + rho + "\"";
            }
        } else if (isNullLiteral(value)) {
            // id!=NULL or id!==NULL
            // id:[* TO *] に変換
            return field.toSolrQuery(ctx) + ":[* TO *]";
        } else {
            // id=value
            // *:* NOT id=value に変換
            return "*:* NOT " + field.toSolrQuery(ctx) + ":" + value.toSolrQuery(ctx);
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
