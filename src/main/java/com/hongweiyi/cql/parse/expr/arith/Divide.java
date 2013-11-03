package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Divide implements BinaryOperator {
    public static final Divide INSTANCE = new Divide();

    private Divide() {
    }

    public BigDecimal doBigDecimal(BigDecimal lho, BigDecimal rho) {
        return lho.divide(rho);
    }

    public BigInteger doBigInteger(BigInteger lho, BigInteger rho) {
        return lho.divide(rho);
    }

    public Double doDouble(Double lho, Double rho) {
        return (lho / rho);
    }

    public Float doFloat(Float lho, Float rho) {
        return (lho / rho);
    }

    public Integer doInteger(Integer lho, Integer rho) {
        return (lho / rho);
    }

    public Long doLong(Long lho, Long rho) {
        return (lho / rho);
    }
}
