package com.hongweiyi.cql.parse.expr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.ExecException;
import com.hongweiyi.cql.parse.expr.arith.Add;


public class AddExpression extends BinaryOperatorExpression {
    public AddExpression() {
        super();
    }

    @Override
    protected Object evaluateInner(Object lho, Object rho, CqlContext ctx)
            throws ExecException {
        if (isNumber(lho) && isNumber(rho)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number) lho, (Number) rho, ctx, Add.INSTANCE);
        } else if (isString(lho) && isString(rho)) {
            // concatenate
            return ((String) lho + (String) rho);
        } else if (isList(lho)) {
            // concatenate
            List<Object> ret = new ArrayList<Object>((List<?>) lho);
            addToList(ret, rho);
            return ret;
        } else if (isArray(lho)) {
            // concatenate
            List<Object> ret = new ArrayList<Object>();
            for (int i = 0; i < Array.getLength(lho); ++i) {
                ret.add(Array.get(lho, i));
            }
            addToList(ret, rho);
            // returned as Object[]
            return ret.toArray();
        }

        throw new ExecException("Operands have incompatible types.");
    }

    private void addToList(List<Object> list, Object obj) {
        if (isList(obj)) {
            // append all elements
            list.addAll((List<?>) obj);
        } else if (isArray(obj)) {
            // append all elements
            int len = Array.getLength(obj);
            for (int i = 0; i < len; ++i) {
                list.add(Array.get(obj, i));
            }
        } else {
            // append an element
            list.add(obj);
        }
    }

    public String toSolrQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Operator \"+\" is not supported in WHERE clauses.");
    }

    public String toHbaseQuery(CqlContext ctx) throws ExecException {
        throw new ExecException("Operator \"+\" is not supported in WHERE clauses.");
    }
}
