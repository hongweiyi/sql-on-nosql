package com.hongweiyi.cql.plan;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.parse.expr.Expression;

public abstract class SelectPlanner extends BasePlanner {
    public static enum SortOrder {
        Ascending, Descending
    }

    public static class Sort {
        public String field;
        public SortOrder order;
    }

    public static class ResultField {
        public Expression expression;
        public String alias;
    }

    public static final String TYPE = "SELECT";

    protected String source;
    protected List<ResultField> resultFields;
    protected Expression condition;
    protected String nativeQuery;
    protected List<Sort> sortConditions;
    protected Integer limit;
    protected Integer offset;

    protected boolean statField;

    public SelectPlanner() {
        super();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void addResultField(ResultField resultField) {
        resultFields.add(resultField);
    }

    public void setResultFields(List<ResultField> resultFields) {
        this.resultFields = resultFields;
    }

    public List<ResultField> getResultFields() {
        return resultFields;
    }

    public void setCondition(Expression expr) {
        this.condition = expr;
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

    public void addSortCondition(Sort sortCondition) {
        if (sortConditions == null) {
            sortConditions = new ArrayList<Sort>();
        }
        sortConditions.add(sortCondition);
    }

    public void setSortConditions(List<Sort> sortConditions) {
        this.sortConditions = sortConditions;
    }

    public List<Sort> getSortConditions() {
        return sortConditions;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setStatField(boolean statField) {
        this.statField = statField;
    }

    public boolean getStatField() {
        return statField;
    }

}
