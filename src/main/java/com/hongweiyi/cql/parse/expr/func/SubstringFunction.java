package com.hongweiyi.cql.parse.expr.func;

import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class SubstringFunction extends BaseFunction {
    public SubstringFunction() {
        super();
    }

    @Override
    public Object call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        int numargs = arguments.size();

        if (numargs == 2) {
            // arg1.substring(arg2)
            Object arg1 = arguments.get(0);
            Object arg2 = arguments.get(1);
            if (arg1 == null || arg2 == null) {
                throw new ExecException("One of arguments is null.");
            }
            if (isString(arg1) && isNumber(arg2)) {
                return ((String) arg1)
                        .substring(convertToInteger((Number) arg2));
            } else {
                throw new ExecException(
                        "1st argument must be a string and 2nd must be a number.");
            }
        } else if (numargs == 3) {
            // arg1.substring(arg2, arg3)
            Object arg1 = arguments.get(0);
            Object arg2 = arguments.get(1);
            Object arg3 = arguments.get(2);
            if (arg1 == null || arg2 == null || arg3 == null) {
                throw new ExecException("One of arguments is null.");
            }
            if (isString(arg1) && isNumber(arg2) && isNumber(arg3)) {
                return ((String) arg1).substring(
                        convertToInteger((Number) arg2),
                        convertToInteger((Number) arg3));
            } else {
                throw new ExecException(
                        "1st argument must be a string and 2nd&3rd must be numbers.");
            }
        } else {
            throw new ExecException(
                    "SUBSTRING function must take 2 or 3 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
