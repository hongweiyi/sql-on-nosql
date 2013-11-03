package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public class EqualTo implements BinaryOperator {
    public static final EqualTo INSTANCE = new EqualTo();

    private EqualTo() {
    }

    public Boolean doBigDecimal(BigDecimal lho, BigDecimal rho) {
        return lho.equals(rho);
    }

    public Boolean doBigInteger(BigInteger lho, BigInteger rho) {
        return lho.equals(rho);
    }

    public Boolean doDouble(Double lho, Double rho) {
        return lho.equals(rho);
    }

    public Boolean doFloat(Float lho, Float rho) {
        return lho.equals(rho);
    }

    public Boolean doInteger(Integer lho, Integer rho) {
        return lho.equals(rho);
    }

    public Boolean doLong(Long lho, Long rho) {
        return lho.equals(rho);
    }
}
