package com.hongweiyi.cql.parse.expr;

import java.math.BigDecimal;
import java.math.BigInteger;


import com.hongweiyi.cql.parse.syntax.ParseUtils;
import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.expr.AddExpression;
import com.hongweiyi.cql.parse.expr.AndExpression;
import com.hongweiyi.cql.parse.expr.BigDecimalLiteral;
import com.hongweiyi.cql.parse.expr.BigIntegerLiteral;
import com.hongweiyi.cql.parse.expr.BinaryOperatorExpression;
import com.hongweiyi.cql.parse.expr.BooleanLiteral;
import com.hongweiyi.cql.parse.expr.CallExpression;
import com.hongweiyi.cql.parse.expr.CompareExpression;
import com.hongweiyi.cql.parse.expr.DivideExpression;
import com.hongweiyi.cql.parse.expr.DoubleLiteral;
import com.hongweiyi.cql.parse.expr.EqualToExpression;
import com.hongweiyi.cql.parse.expr.Expression;
import com.hongweiyi.cql.parse.expr.FloatLiteral;
import com.hongweiyi.cql.parse.expr.IdLiteral;
import com.hongweiyi.cql.parse.expr.IndexExpression;
import com.hongweiyi.cql.parse.expr.IntegerLiteral;
import com.hongweiyi.cql.parse.expr.ListExpression;
import com.hongweiyi.cql.parse.expr.LongLiteral;
import com.hongweiyi.cql.parse.expr.MultiplyExpression;
import com.hongweiyi.cql.parse.expr.NegateExpression;
import com.hongweiyi.cql.parse.expr.NotEqualToExpression;
import com.hongweiyi.cql.parse.expr.NotExpression;
import com.hongweiyi.cql.parse.expr.NullLiteral;
import com.hongweiyi.cql.parse.expr.NumberLiteralExpression;
import com.hongweiyi.cql.parse.expr.OrExpression;
import com.hongweiyi.cql.parse.expr.StatLiteral;
import com.hongweiyi.cql.parse.expr.StringLiteral;
import com.hongweiyi.cql.parse.expr.SubtractExpression;
import com.hongweiyi.cql.parse.expr.UnaryOperatorExpression;
import com.hongweiyi.cql.parse.expr.WildcardLiteral;

public class ExpressionBuilder {
    public ExpressionBuilder() {
    }

    public Expression build(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        int type = node.getType();

        switch (type) {

            case CqlParser.T_OPERATOR_AND:
                // binary operator "AND"
                return buildBinaryOperator(node, new AndExpression());

            case CqlParser.T_OPERATOR_OR:
                // binary operator "OR"
                return buildBinaryOperator(node, new OrExpression());

            case CqlParser.T_OPERATOR_NOT:
                // binary operator "NOT"
                return buildBinaryOperator(node, new NotExpression());

            case CqlParser.T_OPERATOR_ADD:
                // binary operator "+"
                return buildBinaryOperator(node, new AddExpression());

            case CqlParser.T_OPERATOR_SUBTRACT:
                // binary operator "-"
                return buildBinaryOperator(node, new SubtractExpression());

            case CqlParser.T_OPERATOR_MULTIPLY:
                // binary operator "*"
                return buildBinaryOperator(node, new MultiplyExpression());

            case CqlParser.T_OPERATOR_DIVIDE:
                // binary operator "/"
                return buildBinaryOperator(node, new DivideExpression());

            case CqlParser.T_OPERATOR_PLUS:
                // unary operator "+"
                // ignore
                if (node.getChildCount() != 1) {
                    throw new SyntaxException("Unary operator must take 1 operand.");
                }
                return build(node.getChild(0));

            case CqlParser.T_OPERATOR_MINUS:
                // unary operator "-"
                return buildUnaryOperator(node, new NegateExpression());

            case CqlParser.T_OPERATOR_CALL:
                // call operator "()"
                return buildCallOperator(node);

            case CqlParser.T_OPERATOR_EQUAL_TO_SINGLE:
                // "="
                return buildBinaryOperator(node, new EqualToExpression(
                        EqualToExpression.Type.Single));

            case CqlParser.T_OPERATOR_EQUAL_TO_DOUBLE:
                // "=="
                return buildBinaryOperator(node, new EqualToExpression(
                        EqualToExpression.Type.Double));

            case CqlParser.T_OPERATOR_NOT_EQUAL_TO_SINGLE:
                // "!="
                return buildBinaryOperator(node, new NotEqualToExpression(
                        NotEqualToExpression.Type.Single));

            case CqlParser.T_OPERATOR_NOT_EQUAL_TO_DOUBLE:
                // "!=="
                return buildBinaryOperator(node, new NotEqualToExpression(
                        NotEqualToExpression.Type.Double));

            case CqlParser.T_OPERATOR_LESS_THAN:
                // "<"
                return buildBinaryOperator(node, new CompareExpression(
                        CompareExpression.Type.LessThan));

            case CqlParser.T_OPERATOR_LESS_THAN_OR_EQUAL_TO:
                // "<="
                return buildBinaryOperator(node, new CompareExpression(
                        CompareExpression.Type.LessThanOrEqualTo));

            case CqlParser.T_OPERATOR_GREATER_THAN:
                // ">"
                return buildBinaryOperator(node, new CompareExpression(
                        CompareExpression.Type.GreaterThan));

            case CqlParser.T_OPERATOR_GREATER_THAN_OR_EQUAL_TO:
                // ">="
                return buildBinaryOperator(node, new CompareExpression(
                        CompareExpression.Type.GreaterThanOrEqualTo));

            case CqlParser.T_OPERATOR_INDEX:
                // "[i]"
                return buildIndexOperator(node);

            case CqlParser.ID:
                // ID literal
                return buildIdLiteral(node);

            case CqlParser.TRUE:
            case CqlParser.FALSE:
                // Boolean literal
                return buildBooleanLiteral(node);

            case CqlParser.STRING:
                // String literal
                return buildStringLiteral(node);

            case CqlParser.INTEGER:
                // Integer/Long/BigInteger literal
                return buildIntegerLiteral(node);

            case CqlParser.FLOAT:
                // Float/Double/BigDecimal literal
                return buildFloatLiteral(node);

            case CqlParser.NULL:
                // NULL
                return buildNullLiteral(node);

            case CqlParser.ASTERISK:
                // Wildcard literal
                return buildWildcardLiteral(node);

            case CqlParser.T_LIST:
                // List
                return buildList(node);

            case CqlParser.T_MAX:
                // MAX
                return buildStat(node);

            case CqlParser.T_MIN:
                // MIN
                return buildStat(node);

            case CqlParser.T_SUM:
                // SUM
                return buildStat(node);

            case CqlParser.T_COUNT:
                // COUNT
                return buildStat(node);

            default:
                throw new SyntaxException("Unknown token type: " + type);

        }
    }

    private Expression buildStat(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        StatLiteral literal = null;
        if (node.getType() == CqlParser.T_MAX) {
            literal = new StatLiteral("max", node.getChild(2).getText());
        } else if (node.getType() == CqlParser.T_MIN) {
            literal = new StatLiteral("min", node.getChild(2).getText());
        } else if (node.getType() == CqlParser.T_SUM) {
            literal = new StatLiteral("sum", node.getChild(2).getText());
        } else if (node.getType() == CqlParser.T_COUNT) {
            literal = new StatLiteral("count", node.getChild(2).getText());
        } else {
            throw new SyntaxException("Unknown stat type: " + node.getType());
        }

        return literal;
    }

    public CallExpression buildCallOperator(Tree node) throws SyntaxException {
        int childCount = node.getChildCount();

        if (childCount < 1) {
            throw new SyntaxException("Invalid function call.");
        }

        CallExpression ret = new CallExpression();

        ret.setFunction(build(node.getChild(0)));
        for (int i = 1; i < childCount; ++i) {
            ret.addArgument(build(node.getChild(i)));
        }

        return ret;
    }

    public IndexExpression buildIndexOperator(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        int childCount = node.getChildCount();

        if (childCount != 2) {
            throw new SyntaxException(
                    "Index operator must take 1 operand and 1 index.");
        }

        IndexExpression expr = new IndexExpression();

        Expression operand = build(node.getChild(0));
        Expression idx = build(node.getChild(1));

        expr.setOperand(operand);
        expr.setIndex(idx);

        return expr;
    }

    public BinaryOperatorExpression buildBinaryOperator(Tree node,
                                                        BinaryOperatorExpression op) throws SyntaxException {
        if (node == null) {
            return null;
        }

        if (node.getChildCount() != 2) {
            throw new SyntaxException("Binary operator must take 2 operands.");
        }

        Expression lho = build(node.getChild(0));
        Expression rho = build(node.getChild(1));

        op.setLeftHandOperand(lho);
        op.setRightHandOperand(rho);

        return op;
    }

    public UnaryOperatorExpression buildUnaryOperator(Tree node,
                                                      UnaryOperatorExpression op) throws SyntaxException {
        if (node == null) {
            return null;
        }

        if (node.getChildCount() != 1) {
            throw new SyntaxException("Unary operator must take 1 operand.");
        }

        Expression o = build(node.getChild(0));
        op.setOperand(o);

        return op;
    }

    public BooleanLiteral buildBooleanLiteral(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        int type = node.getType();
        if (type == CqlParser.TRUE) {
            return new BooleanLiteral(true);
        } else if (type == CqlParser.FALSE) {
            return new BooleanLiteral(false);
        } else {
            throw new SyntaxException("Unknown boolean literal.");
        }
    }

    public StringLiteral buildStringLiteral(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        return new StringLiteral(ParseUtils.unescapeString(node.getText()));
    }

    public IdLiteral buildIdLiteral(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        return new IdLiteral(ParseUtils.unescapeId(node.getText()));
    }

    public NumberLiteralExpression buildIntegerLiteral(Tree node)
            throws SyntaxException {
        if (node == null) {
            return null;
        }

        String text = node.getText();

        try {
            return new IntegerLiteral(Integer.parseInt(text));
        } catch (NumberFormatException e) {
        }

        try {
            return new LongLiteral(Long.parseLong(text));
        } catch (NumberFormatException e) {
        }

        try {
            return new BigIntegerLiteral(new BigInteger(text));
        } catch (NumberFormatException e) {
        }

        throw new SyntaxException("Invalid integer literal: " + text);
    }

    public NumberLiteralExpression buildFloatLiteral(Tree node)
            throws SyntaxException {
        if (node == null) {
            return null;
        }

        String text = node.getText();

        try {
            float val = Float.parseFloat(text);
            if (!Float.isInfinite(val) && !Float.isNaN(val)) {
                return new FloatLiteral(val);
            }
        } catch (NumberFormatException e) {
        }

        try {
            double val = Double.parseDouble(text);
            if (!Double.isInfinite(val) && !Double.isNaN(val)) {
                return new DoubleLiteral(val);
            }
        } catch (NumberFormatException e) {
        }

        try {
            return new BigDecimalLiteral(new BigDecimal(text));
        } catch (NumberFormatException e) {
        }

        throw new SyntaxException("Invalid float literal: " + text);
    }

    public NullLiteral buildNullLiteral(Tree node) {
        if (node == null) {
            return null;
        }

        return new NullLiteral();
    }

    public WildcardLiteral buildWildcardLiteral(Tree node) {
        if (node == null) {
            return null;
        }

        return new WildcardLiteral();
    }

    public ListExpression buildList(Tree node) throws SyntaxException {
        if (node == null) {
            return null;
        }

        ListExpression expr = new ListExpression();

        int childCount = node.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            expr.addElement(build(node.getChild(i)));
        }

        return expr;
    }
}
