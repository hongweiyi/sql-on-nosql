package com.hongweiyi.cql.parse.semantic;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.parse.expr.ExpressionBuilder;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.plan.Planner;

public abstract class SemanticAnalyzer {
    protected ExpressionBuilder exprBuilder;
    protected boolean statField = false;

    public SemanticAnalyzer() {
        exprBuilder = new ExpressionBuilder();
    }

    public List<Planner> analyze(Tree node, CqlContext ctx)
            throws SyntaxException {
        List<Planner> ret = new ArrayList<Planner>();

        if (node == null) {
            return ret;
        }

        if (node.isNil()) {
            for (int i = 0; i < node.getChildCount(); ++i) {
                ret.add(analyzeInternal(node, ctx));
            }
        } else {
            ret.add(analyzeInternal(node, ctx));
        }

        return ret;
    }

    protected Planner getPhsicalPlanner(String type, CqlContext ctx)
            throws SyntaxException {
        try {
            return (Planner) ctx.getPhysicalPlanner(type).newInstance();
        } catch (Exception e) {
            throw new SyntaxException(""); // TODO
        }
    }

    protected abstract Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException;

}
