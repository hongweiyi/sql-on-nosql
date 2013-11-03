package com.hongweiyi.cql.parse.expr;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.func.Function;


public class CallExpression extends BaseExpression {
    public Expression function;
    public List<Expression> arguments;

    public CallExpression() {
        super();
    }

    public void setFunction(Expression function) {
        this.function = function;
    }

    public Expression getFunction() {
        return function;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void addArgument(Expression expr) {
        if (arguments == null) {
            arguments = new ArrayList<Expression>();
        }
        arguments.add(expr);
    }

    public Object evaluate(CqlContext ctx) throws ExecException {
        Object func = function.evaluate(ctx);

        if (func == null || !isFunction(func)) {
            throw new ExecException("No such function.");
        }

        List<Object> args = new ArrayList<Object>();
        if (arguments != null) {
            for (Expression expr : arguments) {
                args.add(expr.evaluate(ctx));
            }
        }

        try {
            ctx.enterFunction();
            return ((Function) func).call(args, ctx);
        } finally {
            ctx.leave();
        }
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Function call is not supported in WHERE clauses.");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
