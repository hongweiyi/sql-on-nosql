package com.hongweiyi.cql.plan;

import com.hongweiyi.cql.parse.expr.Expression;


public abstract class DeletePlanner extends BasePlanner {
    public static final String TYPE = "DELETE";

    private String source;
    private Expression condition;
    private String nativeQuery;

    public DeletePlanner() {
        super();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setNativeQuery(String query) {
        this.nativeQuery = query;
    }

    public String getNativeQuery() {
        return nativeQuery;
    }

}
