package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Subtract implements BinaryOperator {
    public static final Subtract INSTANCE = new Subtract();

    private Subtract() {
    }

    public BigDecimal doBigDecimal(BigDecimal lho, BigDecimal rho) {
        return lho.subtract(rho);
    }

    public BigInteger doBigInteger(BigInteger lho, BigInteger rho) {
        return lho.subtract(rho);
    }

    public Double doDouble(Double lho, Double rho) {
        return (lho - rho);
    }

    public Float doFloat(Float lho, Float rho) {
        return (lho - rho);
    }

    public Integer doInteger(Integer lho, Integer rho) {
        return (lho - rho);
    }

    public Long doLong(Long lho, Long rho) {
        return (lho - rho);
    }
}
