package com.hongweiyi.cql.plan;


public abstract class ExtendedPlanner extends BasePlanner {
    public static final String TYPE = "EXTENDED";

    protected String table;

    public ExtendedPlanner() {
        super();
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }

}
