package com.hongweiyi.cql.parse.semantic;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.plan.InsertPlanner;
import com.hongweiyi.cql.plan.Planner;
import com.hongweiyi.cql.plan.SelectPlanner;

public class InsertSemanticAnalyzer extends SemanticAnalyzer {

    @Override
    protected Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException {
        InsertPlanner planner = (InsertPlanner) getPhsicalPlanner(
                InsertPlanner.TYPE, ctx);

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_INTO) {
                // destination
                planner.setDestination(ParseUtils.unescapeId(child.getChild(0)
                        .getText()));
            } else if (type == CqlParser.T_FIELDS) {
                // field list
                List<String> fields = getFieldList(child);
                planner.setFields(fields);
            } else if (type == CqlParser.T_VALUES) {
                // value list
                List<Expression> values = getValueList(child);
                planner.setValues(values);
            } else if (type == CqlParser.T_SELECT) {
                // select statement
                SemanticAnalyzer analyzer = SemanticAnalyzerFactory
                        .create(child);
                SelectPlanner selectStmt = (SelectPlanner) analyzer.analyze(
                        child, ctx);
                planner.setSelectPlanner(selectStmt);
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return planner;
    }

    private List<String> getFieldList(Tree node) throws SyntaxException {
        List<String> ret = new ArrayList<String>();

        for (int i = 0; i < node.getChildCount(); ++i) {
            ret.add(ParseUtils.unescapeId(node.getChild(i).getText()));
        }

        return ret;
    }

    private List<Expression> getValueList(Tree node) throws SyntaxException {
        List<Expression> ret = new ArrayList<Expression>();

        for (int i = 0; i < node.getChildCount(); ++i) {
            ret.add(exprBuilder.build(node.getChild(i)));
        }

        return ret;
    }
}
