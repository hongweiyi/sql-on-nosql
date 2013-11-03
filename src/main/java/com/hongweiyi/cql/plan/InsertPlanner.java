package com.hongweiyi.cql.plan;

import java.util.List;

import com.hongweiyi.cql.parse.expr.Expression;

public abstract class InsertPlanner extends BasePlanner {
    public static final String TYPE = "INSERT";

    protected String destination;
    protected List<String> fields;
    protected List<Expression> values;
    protected SelectPlanner selectPlanner;

    public InsertPlanner() {
        super();
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setValues(List<Expression> values) {
        this.values = values;
    }

    public List<Expression> getValues() {
        return values;
    }

    public void setSelectPlanner(SelectPlanner planner) {
        this.selectPlanner = planner;
    }

    public SelectPlanner getSelectPlanner() {
        return selectPlanner;
    }

}
