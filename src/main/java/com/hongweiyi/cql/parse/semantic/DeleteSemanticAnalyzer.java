package com.hongweiyi.cql.parse.semantic;

import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.plan.DeletePlanner;
import com.hongweiyi.cql.plan.Planner;

public class DeleteSemanticAnalyzer extends SemanticAnalyzer {

    @Override
    protected Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException {
        DeletePlanner planner = (DeletePlanner) getPhsicalPlanner(
                DeletePlanner.TYPE, ctx);

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_FROM) {
                // source
                planner.setSource(ParseUtils.unescapeId(child.getChild(0)
                        .getText()));
            } else if (type == CqlParser.T_WHERE) {
                // where expression
                Expression expr = exprBuilder.build(child.getChild(0));
                planner.setCondition(expr);
            } else if (type == CqlParser.T_NWHERE) {
                // native query
                planner.setNativeQuery(ParseUtils.unescapeId(child.getChild(0)
                        .getText()));
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return planner;
    }

}
