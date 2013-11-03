package com.hongweiyi.cql.parse.semantic;

import java.util.ArrayList;
import java.util.List;

import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.CqlContext;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.parse.expr.IdLiteral;
import com.hongweiyi.cql.plan.Planner;
import com.hongweiyi.cql.plan.SelectPlanner;

public class SelectSemanticAnalyzer extends SemanticAnalyzer {

    @Override
    protected Planner analyzeInternal(Tree node, CqlContext ctx)
            throws SyntaxException {
        SelectPlanner planner = (SelectPlanner) getPhsicalPlanner(
                SelectPlanner.TYPE, ctx);

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_FIELDS) {
                // result expressions
                List<SelectPlanner.ResultField> resultFields = getResultFields(child);
                if (statField) {
                    planner.setStatField(statField);
                    statField = false;
                }
                planner.setResultFields(resultFields);
            } else if (type == CqlParser.T_FROM) {
                // source
                planner.setSource(ParseUtils.unescapeId(child.getChild(0)
                        .getText()));
            } else if (type == CqlParser.T_WHERE) {
                // where expression
                Expression expr = exprBuilder.build(child.getChild(0));
                planner.setCondition(expr);
            } else if (type == CqlParser.T_NWHERE) {
                // native query
                planner.setNativeQuery(ParseUtils.unescapeString(child
                        .getChild(0).getText()));
            } else if (type == CqlParser.T_ORDER) {
                // order by
                List<SelectPlanner.Sort> orderings = getOrderings(child);
                planner.setSortConditions(orderings);
            } else if (type == CqlParser.T_LIMIT) {
                // number of rows
                planner.setLimit(Integer.parseInt(child.getChild(0).getText()));
            } else if (type == CqlParser.T_OFFSET) {
                // offset
                planner.setOffset(Integer.parseInt(child.getChild(0).getText()));
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return planner;
    }

    private List<SelectPlanner.ResultField> getResultFields(Tree node)
            throws SyntaxException {
        List<SelectPlanner.ResultField> ret = new ArrayList<SelectPlanner.ResultField>();

        Tree child;
        int type;

        int autoAliasCount = 0;
        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_FIELD_ALIAS) {
                SelectPlanner.ResultField rf = new SelectPlanner.ResultField();
                rf.expression = exprBuilder.build(child.getChild(0));
                if (child.getChildCount() > 1) {
                    rf.alias = ParseUtils.unescapeId(child.getChild(1)
                            .getText());
                } else {
                    if (rf.expression instanceof IdLiteral) {
                        rf.alias = ((IdLiteral) (rf.expression)).getValue();
                    } else {
                        rf.alias = "__field_"
                                + Integer.toString(autoAliasCount) + "__";
                        ++autoAliasCount;
                    }
                }
                ret.add(rf);
            } else if (type == CqlParser.T_MAX) {
                SelectPlanner.ResultField rf = new SelectPlanner.ResultField();
                rf.expression = exprBuilder.build(child);
                if (child.getChildCount() > 4) {
                    rf.alias = ParseUtils.unescapeId(child.getChild(4)
                            .getText());
                } else {
                    rf.alias = null;
                }
                ret.add(rf);
                statField = true;
            } else if (type == CqlParser.T_MIN) {
                SelectPlanner.ResultField rf = new SelectPlanner.ResultField();
                rf.expression = exprBuilder.build(child);
                if (child.getChildCount() > 4) {
                    rf.alias = ParseUtils.unescapeId(child.getChild(4)
                            .getText());
                } else {
                    rf.alias = null;
                }

                ret.add(rf);
                statField = true;
            } else if (type == CqlParser.T_SUM) {
                SelectPlanner.ResultField rf = new SelectPlanner.ResultField();
                rf.expression = exprBuilder.build(child);
                if (child.getChildCount() > 4) {
                    rf.alias = ParseUtils.unescapeId(child.getChild(4)
                            .getText());
                } else {
                    rf.alias = null;
                }

                ret.add(rf);
                statField = true;
            } else if (type == CqlParser.T_COUNT) {
                SelectPlanner.ResultField rf = new SelectPlanner.ResultField();
                rf.expression = exprBuilder.build(child);
                if (child.getChildCount() > 4) {
                    rf.alias = ParseUtils.unescapeId(child.getChild(4)
                            .getText());
                } else {
                    rf.alias = null;
                }

                ret.add(rf);
                statField = true;
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return ret;
    }

    private List<SelectPlanner.Sort> getOrderings(Tree node)
            throws SyntaxException {
        List<SelectPlanner.Sort> ret = new ArrayList<SelectPlanner.Sort>();

        Tree child;
        int type;

        for (int i = 0; i < node.getChildCount(); ++i) {
            child = node.getChild(i);
            type = child.getType();

            if (type == CqlParser.T_ORDERING) {
                SelectPlanner.Sort s = new SelectPlanner.Sort();
                s.field = ParseUtils.unescapeId(child.getChild(0).getChild(0)
                        .getText());

                int direction = child.getChild(0).getType();
                if (direction == CqlParser.T_ASC) {
                    s.order = SelectPlanner.SortOrder.Ascending;
                } else if (direction == CqlParser.T_DESC) {
                    s.order = SelectPlanner.SortOrder.Descending;
                } else {
                    throw new SyntaxException("Unknonw direction: " + direction);
                }

                ret.add(s);
            } else {
                throw new SyntaxException("Unknown token type: " + type);
            }
        }

        return ret;
    }
}
