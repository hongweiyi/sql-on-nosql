package com.hongweiyi.cql.parse.expr.func;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class LengthFunction extends BaseFunction {
    public LengthFunction() {
        super();
    }

    @Override
    public Integer call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                throw new ExecException("Argument is NULL.");
            } else if (isArray(arg)) {
                return Array.getLength(arg);
            } else if (isCollection(arg)) {
                return ((Collection<?>) arg).size();
            } else if (isString(arg)) {
                return ((String) arg).length();
            } else {
                throw new ExecException("Can't get length of "
                        + arg.getClass().getCanonicalName());
            }
        } else {
            throw new ExecException("LENGTH function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
