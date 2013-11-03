package com.hongweiyi.cql.parse.semantic;

import com.hongweiyi.cql.parse.syntax.CqlParser;
import org.antlr.runtime.tree.Tree;

import com.hongweiyi.cql.exception.SyntaxException;

public class SemanticAnalyzerFactory {

    public static SemanticAnalyzer create(Tree node) throws SyntaxException {
        switch (node.getType()) {

            case CqlParser.T_USE:
                return new UseSemanticAnalyzer();

            case CqlParser.T_SELECT:
                return new SelectSemanticAnalyzer();

            case CqlParser.T_INSERT:
                return new InsertSemanticAnalyzer();

            case CqlParser.T_DELETE:
                return new DeleteSemanticAnalyzer();

            case CqlParser.T_COMMIT:
                return new ExtendedSemanticAnalyzer(
                        ExtendedSemanticAnalyzer.ExtendedEnum.SOLR_COMMIT);

            case CqlParser.T_ROLLBACK:
                return new ExtendedSemanticAnalyzer(
                        ExtendedSemanticAnalyzer.ExtendedEnum.SOLR_ROLLBACK);

            case CqlParser.T_OPTIMIZE:
                return new ExtendedSemanticAnalyzer(
                        ExtendedSemanticAnalyzer.ExtendedEnum.SOLR_OPTIMIZE);

            default:
                throw new SyntaxException("Unknown token type: " + node.getType());

        }
    }
}
