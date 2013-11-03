package com.hongweiyi.cql.plan;


public abstract class UsePlanner extends BasePlanner {
    public static final String TYPE = "USE";

    protected String connStr;
    protected String name;

    public UsePlanner() {
        super();
    }

    public void setConnStr(String connStr) {
        this.connStr = connStr;
    }

    public String getConnStr() {
        return connStr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
