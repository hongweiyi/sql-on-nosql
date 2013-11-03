package com.hongweiyi.cql.parse.expr.func;

import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.Expression;

public interface Function extends Expression {
    public Object call(List<Object> arguments, CqlContext ctx)
            throws ExecException;
}
