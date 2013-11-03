package com.hongweiyi.cql.plan;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;

public interface Planner {
    public Object buildPlan(CqlContext ctx) throws ExecException;

    public Object execute(CqlContext ctx) throws ExecException;
}
