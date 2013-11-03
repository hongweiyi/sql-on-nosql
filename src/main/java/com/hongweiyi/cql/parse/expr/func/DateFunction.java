package com.hongweiyi.cql.parse.expr.func;

import java.util.Date;
import java.util.List;

import org.apache.solr.common.util.DateUtil;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class DateFunction extends BaseFunction {
    public DateFunction() {
        super();
    }

    @Override
    public Date call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isDate(arg)) {
                return (Date) arg;
            } else if (isNumber(arg)) {
                return new Date(convertToLong((Number) arg));
            } else if (isString(arg)) {
                try {
                    return DateUtil.parseDate((String) arg);
                } catch (Exception e) {
                    throw new ExecException(e);
                }
            } else {
                throw new ExecException("Can't convert "
                        + arg.getClass().getCanonicalName() + " to a Date.");
            }
        } else {
            throw new ExecException("DATE function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
