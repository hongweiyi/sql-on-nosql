package com.hongweiyi.cql.parse.semantic;

import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.plan.Planner;
import com.hongweiyi.cql.plan.UsePlanner;

public class UseSemanticAnalyzer extends SemanticAnalyzer {

    @Override
    protected Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException {
        UsePlanner planner = (UsePlanner) getPhsicalPlanner(
                UsePlanner.TYPE, ctx);

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_SERVER) {
                // connection string
                planner.setConnStr(ParseUtils.unescapeString(child.getChild(0).getText()));
            } else if (type == CqlParser.T_AS) {
                // ref
                planner.setName(ParseUtils.unescapeId(child.getChild(0).getText()));
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return planner;
    }

}
