package com.hongweiyi.cql.parse.expr.func;

import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class IntegerFunction extends BaseFunction {
    public IntegerFunction() {
        super();
    }

    @Override
    public Integer call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToInteger((Number) arg);
            } else if (isString(arg)) {
                try {
                    return Integer.parseInt((String) arg);
                } catch (Exception e) {
                    throw new ExecException(e);
                }
            } else {
                throw new ExecException("Can't convert "
                        + arg.getClass().getCanonicalName() + " to an Integer.");
            }
        } else {
            throw new ExecException("INTEGER function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
