package com.hongweiyi.cql.parse.expr.arith;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface BinaryOperator {
    public Object doInteger(Integer lho, Integer rho);

    public Object doLong(Long lho, Long rho);

    public Object doFloat(Float lho, Float rho);

    public Object doDouble(Double lho, Double rho);

    public Object doBigDecimal(BigDecimal lho, BigDecimal rho);

    public Object doBigInteger(BigInteger lho, BigInteger rho);
}
