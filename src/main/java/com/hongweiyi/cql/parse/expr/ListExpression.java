package com.hongweiyi.cql.parse.expr;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;


public class ListExpression extends BaseExpression {
    private List<Expression> elements;

    public ListExpression() {
        super();
    }

    public List<Expression> getElements() {
        return elements;
    }

    public void setElements(List<Expression> elements) {
        this.elements = elements;
    }

    public void addElement(Expression expr) {
        if (elements == null) {
            elements = new ArrayList<Expression>();
        }

        elements.add(expr);
    }

    public List<Object> evaluate(CqlContext ctx) throws ExecException {
        List<Object> ret = new ArrayList<Object>(elements.size());

        if (elements != null) {
            for (Expression expr : elements) {
                ret.add(expr.evaluate(ctx));
            }
        }

        return ret;
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Lists are not supported in WHERE expressions.");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Not Support Hbase Query");
    }
}
