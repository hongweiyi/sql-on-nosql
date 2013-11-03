package com.hongweiyi.cql.parse.expr.func;

import java.util.Date;
import java.util.List;

import org.apache.solr.common.util.DateUtil;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public class StringFunction extends BaseFunction {
    public StringFunction() {
        super();
    }

    @Override
    public String call(List<Object> arguments, CqlContext ctx)
            throws ExecException {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isDate(arg)) {
                return DateUtil.getThreadLocalDateFormat().format((Date) arg);
            } else {
                return arguments.get(0).toString();
            }
        } else {
            throw new ExecException("STRING function must take 1 argument.");
        }
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
