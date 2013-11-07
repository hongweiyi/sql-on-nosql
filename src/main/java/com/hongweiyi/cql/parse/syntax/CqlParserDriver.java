package com.hongweiyi.cql.parse.syntax;

import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.CommonTree;
import org.apache.commons.io.input.CharSequenceReader;

import com.hongweiyi.cql.exception.ErrorMsg;
import com.hongweiyi.cql.exception.SyntaxException;
import com.hongweiyi.cql.parse.syntax.CqlParser.stmt_list_return;

public class CqlParserDriver {

    public CommonTree parse(String command) throws SyntaxException {
        CharSequenceReader reader = new CharSequenceReader(command);
        ANTLRReaderStream stream = null;
        try {
            stream = new ANTLRReaderStream(reader);
        } catch (IOException e) {
            throw new SyntaxException();
        }

        RecognizerSharedState state = new RecognizerSharedState();
        CqlLexer lexer = new CqlLexer(stream, state);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CqlParser parser = new CqlParser(tokenStream);

        try {
            stmt_list_return ret = parser.stmt_list();
            if (ret != null) {
                return (CommonTree) ret.getTree();
            }
        } catch (MismatchedTokenException e) {
            if (e.getUnexpectedType() == CqlParser.EOF) {
                // immature input. continue.
                ErrorMsg error = ErrorMsg.INVALID_END;
                throw new SyntaxException(error.getErrorCodedMsg(), e);
            } else {
                String exStr = ErrorMsg.SYNTAXERROR + getSyntaxExceptionStr(command, e.charPositionInLine);
                ErrorMsg error = ErrorMsg.getInstance(exStr);
                throw new SyntaxException(error.getErrorCodedMsg(), e);
            }
        } catch (RecognitionException e) {
            String exStr = ErrorMsg.EXECERROR + getSyntaxExceptionStr(command, e.charPositionInLine);
            ErrorMsg error = ErrorMsg.getInstance(exStr);
            throw new SyntaxException(error.getErrorCodedMsg(), e);
        }
        return null;
    }

    /**
     * Get the SyntaxException String
     * <p/>
     * Implementation:
     * get the next two word after wrong position.
     *
     * @param commmand user input command
     * @param pos      wrong position
     * @return the next two word after wrong position.
     */
    public String getSyntaxExceptionStr(String commmand, int pos) {
        int twoSpace = 0;
        int lastPos = commmand.length();
        for (lastPos = pos; lastPos < commmand.length(); lastPos++) {
            if (commmand.charAt(lastPos) == ' ') {
                twoSpace += 1;
            }
            if (twoSpace == 2) {
                break;
            }
        }
        return commmand.substring(pos, lastPos);
    }
}
