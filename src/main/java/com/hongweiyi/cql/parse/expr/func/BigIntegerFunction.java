package com.hongweiyi.cql.parse.expr.func;

import java.math.BigInteger;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class BigIntegerFunction extends BaseFunction {
    public BigIntegerFunction() {
        super();
    }

    @Override
    public BigInteger call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToBigInteger((Number) arg);
            } else if (isString(arg)) {
                try {
                    return new BigInteger((String) arg);
                } catch (Exception e) {
                    throw new ExecException(e);
                }
            } else {
                throw new ExecException("Can't convert "
                        + arg.getClass().getCanonicalName()
                        + " to a BigInteger.");
            }
        } else {
            throw new ExecException("BIGINTEGER function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
