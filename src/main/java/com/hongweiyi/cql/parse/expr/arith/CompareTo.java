package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CompareTo implements BinaryOperator {
    public static final CompareTo INSTANCE = new CompareTo();

    private CompareTo() {
    }

    public Integer doBigDecimal(BigDecimal lho, BigDecimal rho) {
        return lho.compareTo(rho);
    }

    public Integer doBigInteger(BigInteger lho, BigInteger rho) {
        return lho.compareTo(rho);
    }

    public Integer doDouble(Double lho, Double rho) {
        return lho.compareTo(rho);
    }

    public Integer doFloat(Float lho, Float rho) {
        return lho.compareTo(rho);
    }

    public Integer doInteger(Integer lho, Integer rho) {
        return lho.compareTo(rho);
    }

    public Integer doLong(Long lho, Long rho) {
        return lho.compareTo(rho);
    }
}
