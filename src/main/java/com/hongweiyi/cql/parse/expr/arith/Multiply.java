package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Multiply implements BinaryOperator {
    public static final Multiply INSTANCE = new Multiply();

    private Multiply() {
    }

    public BigDecimal doBigDecimal(BigDecimal lho, BigDecimal rho) {
        return lho.multiply(rho);
    }

    public BigInteger doBigInteger(BigInteger lho, BigInteger rho) {
        return lho.multiply(rho);
    }

    public Double doDouble(Double lho, Double rho) {
        return (lho * rho);
    }

    public Float doFloat(Float lho, Float rho) {
        return (lho * rho);
    }

    public Integer doInteger(Integer lho, Integer rho) {
        return (lho * rho);
    }

    public Long doLong(Long lho, Long rho) {
        return (lho * rho);
    }
}
