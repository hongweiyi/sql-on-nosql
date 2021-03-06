package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Negate implements UnaryOperator {
    public static final Negate INSTANCE = new Negate();

    private Negate() {
    }

    public BigDecimal doBigDecimal(BigDecimal o) {
        return o.negate();
    }

    public BigInteger doBigInteger(BigInteger o) {
        return o.negate();
    }

    public Double doDouble(Double o) {
        return -o;
    }

    public Float doFloat(Float o) {
        return -o;
    }

    public Integer doInteger(Integer o) {
        return -o;
    }

    public Long doLong(Long o) {
        return -o;
    }
}
