package com.hongweiyi.cql.parse.expr.func;

import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.BaseExpression;

public abstract class BaseFunction extends BaseExpression implements Function {
    public BaseFunction() {
        super();
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        return this;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException(
                "Function calls are not supported in WHERE expressions.");
    }

    public abstract Object call(List<Object> arguments, CqlContext ctx)
            throws ExecException;
}
