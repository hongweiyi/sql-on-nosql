package com.hongweiyi.cql.parse.expr;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public interface Expression {
    public Object evaluate(CqlContext ctx) throws ExecException;

    public String toSolrQuery(CqlContext ctx) throws ExecException;

    public String toHbaseQuery(CqlContext ctx) throws ExecException;
}
