package com.hongweiyi.cql.parse.expr.func;

import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class LongFunction extends BaseFunction {
    public LongFunction() {
        super();
    }

    @Override
    public Long call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToLong((Number) arg);
            } else if (isString(arg)) {
                try {
                    return Long.parseLong((String) arg);
                } catch (Exception e) {
                    throw new ExecException(e);
                }
            } else {
                throw new ExecException("Can't convert "
                        + arg.getClass().getCanonicalName() + " to a Long.");
            }
        } else {
            throw new ExecException("LONG function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
