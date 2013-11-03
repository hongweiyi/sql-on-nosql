package com.hongweiyi.cql.parse.expr;

public abstract class NumberLiteralExpression extends LiteralExpression {
    public NumberLiteralExpression() {
        super();
    }

    public abstract boolean isNegativeValue();
}
