package com.hongweiyi.cql.parse.semantic;

import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.plan.ExtendedPlanner;
import com.hongweiyi.cql.plan.Planner;

public class ExtendedSemanticAnalyzer extends SemanticAnalyzer {

    public static enum ExtendedEnum {
        SOLR_COMMIT, SOLR_OPTIMIZE, SOLR_ROLLBACK;
    }

    private ExtendedEnum eType;

    public ExtendedSemanticAnalyzer(ExtendedEnum type) {
        this.setType(type);
    }

    @Override
    protected Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException {

        ExtendedPlanner planner = (ExtendedPlanner) getPhsicalPlanner(
                ExtendedPlanner.TYPE, ctx);

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.ID) {
                planner.setTable(ParseUtils.unescapeId(child.getText()));
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return planner;
    }

    public ExtendedEnum getType() {
        return eType;
    }

    public void setType(ExtendedEnum type) {
        this.eType = type;
    }

}
