package com.hongweiyi.cql.parse.expr;

import java.util.Map;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class WildcardLiteral extends LiteralExpression {
    public WildcardLiteral() {
        super();
    }

    public Map<String, Object> evaluate(CqlContext ctx) throws ExecException {
        return ctx.getNamespace();
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        return "*";
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
