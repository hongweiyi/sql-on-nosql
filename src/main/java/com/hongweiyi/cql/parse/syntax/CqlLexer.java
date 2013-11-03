// $ANTLR 3.5 F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g 2013-09-07 16:23:49

package com.hongweiyi.cql.parse.syntax;


import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
    public static final int EOF = -1;
    public static final int A = 4;
    public static final int AND = 5;
    public static final int AS = 6;
    public static final int ASC = 7;
    public static final int ASTERISK = 8;
    public static final int AVG = 9;
    public static final int B = 10;
    public static final int BACKSLASH = 11;
    public static final int BACKTICK = 12;
    public static final int BY = 13;
    public static final int C = 14;
    public static final int COMMA = 15;
    public static final int COMMIT = 16;
    public static final int COUNT = 17;
    public static final int D = 18;
    public static final int DELETE = 19;
    public static final int DESC = 20;
    public static final int DISTICNT = 21;
    public static final int E = 22;
    public static final int EQUAL_TO_DOUBLE = 23;
    public static final int EQUAL_TO_SINGLE = 24;
    public static final int EXPONENT = 25;
    public static final int F = 26;
    public static final int FALSE = 27;
    public static final int FLOAT = 28;
    public static final int FROM = 29;
    public static final int G = 30;
    public static final int GREATER_THAN = 31;
    public static final int GREATER_THAN_OR_EQUAL_TO = 32;
    public static final int H = 33;
    public static final int I = 34;
    public static final int ID = 35;
    public static final int ID_CORE = 36;
    public static final int ID_ESCAPE = 37;
    public static final int ID_ESCAPE_CORE = 38;
    public static final int ID_PLAIN = 39;
    public static final int ID_START = 40;
    public static final int INSERT = 41;
    public static final int INTEGER = 42;
    public static final int INTO = 43;
    public static final int J = 44;
    public static final int K = 45;
    public static final int L = 46;
    public static final int LESS_THAN = 47;
    public static final int LESS_THAN_OR_EQUAL_TO = 48;
    public static final int LIMIT = 49;
    public static final int LPAREN = 50;
    public static final int LSBRACKET = 51;
    public static final int M = 52;
    public static final int MAX = 53;
    public static final int MID = 54;
    public static final int MIN = 55;
    public static final int MINUS = 56;
    public static final int N = 57;
    public static final int NOT = 58;
    public static final int NOT_EQUAL_TO_DOUBLE = 59;
    public static final int NOT_EQUAL_TO_SINGLE = 60;
    public static final int NULL = 61;
    public static final int NWHERE = 62;
    public static final int O = 63;
    public static final int OFFSET = 64;
    public static final int OPTIMIZE = 65;
    public static final int OR = 66;
    public static final int ORDER = 67;
    public static final int P = 68;
    public static final int PLUS = 69;
    public static final int Q = 70;
    public static final int QUOTE_DOUBLE = 71;
    public static final int QUOTE_SINGLE = 72;
    public static final int R = 73;
    public static final int ROLLBACK = 74;
    public static final int RPAREN = 75;
    public static final int RSBRACKET = 76;
    public static final int S = 77;
    public static final int SELECT = 78;
    public static final int SEMICOLON = 79;
    public static final int SLASH = 80;
    public static final int STRING = 81;
    public static final int STRING_CORE = 82;
    public static final int STRING_CORE_DOUBLE = 83;
    public static final int STRING_CORE_SINGLE = 84;
    public static final int STRING_DOUBLE = 85;
    public static final int STRING_ESCAPE_CORE = 86;
    public static final int STRING_SINGLE = 87;
    public static final int SUM = 88;
    public static final int T = 89;
    public static final int TRUE = 90;
    public static final int T_AS = 91;
    public static final int T_ASC = 92;
    public static final int T_AVG = 93;
    public static final int T_COMMIT = 94;
    public static final int T_COUNT = 95;
    public static final int T_DELETE = 96;
    public static final int T_DESC = 97;
    public static final int T_DISTINCT = 98;
    public static final int T_FIELDS = 99;
    public static final int T_FIELD_ALIAS = 100;
    public static final int T_FROM = 101;
    public static final int T_INSERT = 102;
    public static final int T_INTO = 103;
    public static final int T_LIMIT = 104;
    public static final int T_LIST = 105;
    public static final int T_MAX = 106;
    public static final int T_MIN = 107;
    public static final int T_NWHERE = 108;
    public static final int T_OFFSET = 109;
    public static final int T_OPERATOR_ADD = 110;
    public static final int T_OPERATOR_AND = 111;
    public static final int T_OPERATOR_CALL = 112;
    public static final int T_OPERATOR_DIVIDE = 113;
    public static final int T_OPERATOR_EQUAL_TO_DOUBLE = 114;
    public static final int T_OPERATOR_EQUAL_TO_SINGLE = 115;
    public static final int T_OPERATOR_GREATER_THAN = 116;
    public static final int T_OPERATOR_GREATER_THAN_OR_EQUAL_TO = 117;
    public static final int T_OPERATOR_INDEX = 118;
    public static final int T_OPERATOR_LESS_THAN = 119;
    public static final int T_OPERATOR_LESS_THAN_OR_EQUAL_TO = 120;
    public static final int T_OPERATOR_MINUS = 121;
    public static final int T_OPERATOR_MULTIPLY = 122;
    public static final int T_OPERATOR_NOT = 123;
    public static final int T_OPERATOR_NOT_EQUAL_TO_DOUBLE = 124;
    public static final int T_OPERATOR_NOT_EQUAL_TO_SINGLE = 125;
    public static final int T_OPERATOR_OR = 126;
    public static final int T_OPERATOR_PLUS = 127;
    public static final int T_OPERATOR_SUBTRACT = 128;
    public static final int T_OPTIMIZE = 129;
    public static final int T_ORDER = 130;
    public static final int T_ORDERING = 131;
    public static final int T_ROLLBACK = 132;
    public static final int T_SELECT = 133;
    public static final int T_SERVER = 134;
    public static final int T_SUM = 135;
    public static final int T_USE = 136;
    public static final int T_VALUES = 137;
    public static final int T_WHERE = 138;
    public static final int U = 139;
    public static final int UNDERSCORE = 140;
    public static final int USE = 141;
    public static final int V = 142;
    public static final int VALUES = 143;
    public static final int W = 144;
    public static final int WHERE = 145;
    public static final int WS = 146;
    public static final int X = 147;
    public static final int Y = 148;
    public static final int Z = 149;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public CqlLexer() {
    }

    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g";
    }

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:323:10: ( ';' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:323:17: ';'
            {
                match(';');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:324:9: ( '*' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:324:17: '*'
            {
                match('*');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:325:6: ( ',' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:325:17: ','
            {
                match(',');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:326:11: ( '_' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:326:17: '_'
            {
                match('_');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "QUOTE_DOUBLE"
    public final void mQUOTE_DOUBLE() throws RecognitionException {
        try {
            int _type = QUOTE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:327:13: ( '\"' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:327:17: '\"'
            {
                match('\"');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE_DOUBLE"

    // $ANTLR start "QUOTE_SINGLE"
    public final void mQUOTE_SINGLE() throws RecognitionException {
        try {
            int _type = QUOTE_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:328:13: ( '\\'' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:328:17: '\\''
            {
                match('\'');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE_SINGLE"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:329:10: ( '\\\\' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:329:17: '\\\\'
            {
                match('\\');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "BACKTICK"
    public final void mBACKTICK() throws RecognitionException {
        try {
            int _type = BACKTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:330:9: ( '`' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:330:17: '`'
            {
                match('`');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "BACKTICK"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:331:7: ( '(' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:331:17: '('
            {
                match('(');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:332:7: ( ')' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:332:17: ')'
            {
                match(')');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LSBRACKET"
    public final void mLSBRACKET() throws RecognitionException {
        try {
            int _type = LSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:333:10: ( '[' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:333:17: '['
            {
                match('[');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LSBRACKET"

    // $ANTLR start "RSBRACKET"
    public final void mRSBRACKET() throws RecognitionException {
        try {
            int _type = RSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:334:10: ( ']' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:334:17: ']'
            {
                match(']');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "RSBRACKET"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:335:10: ( '<' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:335:17: '<'
            {
                match('<');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "LESS_THAN_OR_EQUAL_TO"
    public final void mLESS_THAN_OR_EQUAL_TO() throws RecognitionException {
        try {
            int _type = LESS_THAN_OR_EQUAL_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:336:22: ( '<=' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:336:24: '<='
            {
                match("<=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUAL_TO"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:337:13: ( '>' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:337:17: '>'
            {
                match('>');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "GREATER_THAN_OR_EQUAL_TO"
    public final void mGREATER_THAN_OR_EQUAL_TO() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OR_EQUAL_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:338:25: ( '>=' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:338:27: '>='
            {
                match(">=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUAL_TO"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:339:5: ( '+' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:339:17: '+'
            {
                match('+');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:340:6: ( '-' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:340:17: '-'
            {
                match('-');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:341:6: ( '/' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:341:17: '/'
            {
                match('/');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "EQUAL_TO_SINGLE"
    public final void mEQUAL_TO_SINGLE() throws RecognitionException {
        try {
            int _type = EQUAL_TO_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:342:16: ( '=' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:342:18: '='
            {
                match('=');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL_TO_SINGLE"

    // $ANTLR start "EQUAL_TO_DOUBLE"
    public final void mEQUAL_TO_DOUBLE() throws RecognitionException {
        try {
            int _type = EQUAL_TO_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:343:16: ( '==' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:343:18: '=='
            {
                match("==");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL_TO_DOUBLE"

    // $ANTLR start "NOT_EQUAL_TO_SINGLE"
    public final void mNOT_EQUAL_TO_SINGLE() throws RecognitionException {
        try {
            int _type = NOT_EQUAL_TO_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:344:20: ( '!=' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:344:22: '!='
            {
                match("!=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL_TO_SINGLE"

    // $ANTLR start "NOT_EQUAL_TO_DOUBLE"
    public final void mNOT_EQUAL_TO_DOUBLE() throws RecognitionException {
        try {
            int _type = NOT_EQUAL_TO_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:345:20: ( '!==' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:345:22: '!=='
            {
                match("!==");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL_TO_DOUBLE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:347:11: ( ( 'a' | 'A' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'A' || input.LA(1) == 'a') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:348:11: ( ( 'b' | 'B' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'B' || input.LA(1) == 'b') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:349:11: ( ( 'c' | 'C' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'C' || input.LA(1) == 'c') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:350:11: ( ( 'd' | 'D' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'D' || input.LA(1) == 'd') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:351:11: ( ( 'e' | 'E' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:352:11: ( ( 'f' | 'F' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'F' || input.LA(1) == 'f') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:353:11: ( ( 'g' | 'G' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'G' || input.LA(1) == 'g') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:354:11: ( ( 'h' | 'H' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'H' || input.LA(1) == 'h') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:355:11: ( ( 'i' | 'I' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'I' || input.LA(1) == 'i') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:356:11: ( ( 'j' | 'J' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'J' || input.LA(1) == 'j') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:357:11: ( ( 'k' | 'K' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'K' || input.LA(1) == 'k') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:358:11: ( ( 'l' | 'L' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'L' || input.LA(1) == 'l') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:359:11: ( ( 'm' | 'M' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'M' || input.LA(1) == 'm') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:360:11: ( ( 'n' | 'N' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'N' || input.LA(1) == 'n') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:361:11: ( ( 'o' | 'O' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'O' || input.LA(1) == 'o') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:362:11: ( ( 'p' | 'P' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'P' || input.LA(1) == 'p') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:363:11: ( ( 'q' | 'Q' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'Q' || input.LA(1) == 'q') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:364:11: ( ( 'r' | 'R' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'R' || input.LA(1) == 'r') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:365:11: ( ( 's' | 'S' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'S' || input.LA(1) == 's') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:366:11: ( ( 't' | 'T' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'T' || input.LA(1) == 't') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:367:11: ( ( 'u' | 'U' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'U' || input.LA(1) == 'u') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:368:11: ( ( 'v' | 'V' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'V' || input.LA(1) == 'v') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:369:11: ( ( 'w' | 'W' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'W' || input.LA(1) == 'w') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:370:11: ( ( 'x' | 'X' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'X' || input.LA(1) == 'x') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:371:11: ( ( 'y' | 'Y' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'Y' || input.LA(1) == 'y') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:372:11: ( ( 'z' | 'Z' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if (input.LA(1) == 'Z' || input.LA(1) == 'z') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:375:7: ( D E L E T E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:375:13: D E L E T E
            {
                mD();

                mE();

                mL();

                mE();

                mT();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:376:7: ( I N S E R T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:376:13: I N S E R T
            {
                mI();

                mN();

                mS();

                mE();

                mR();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:377:5: ( I N T O )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:377:13: I N T O
            {
                mI();

                mN();

                mT();

                mO();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:378:7: ( V A L U E S )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:378:13: V A L U E S
            {
                mV();

                mA();

                mL();

                mU();

                mE();

                mS();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:379:7: ( S E L E C T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:379:13: S E L E C T
            {
                mS();

                mE();

                mL();

                mE();

                mC();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:380:6: ( O R D E R )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:380:13: O R D E R
            {
                mO();

                mR();

                mD();

                mE();

                mR();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:381:3: ( B Y )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:381:13: B Y
            {
                mB();

                mY();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:382:6: ( L I M I T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:382:13: L I M I T
            {
                mL();

                mI();

                mM();

                mI();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:383:7: ( O F F S E T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:383:13: O F F S E T
            {
                mO();

                mF();

                mF();

                mS();

                mE();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:384:5: ( F R O M )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:384:13: F R O M
            {
                mF();

                mR();

                mO();

                mM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:385:6: ( W H E R E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:385:13: W H E R E
            {
                mW();

                mH();

                mE();

                mR();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "NWHERE"
    public final void mNWHERE() throws RecognitionException {
        try {
            int _type = NWHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:386:7: ( N W H E R E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:386:13: N W H E R E
            {
                mN();

                mW();

                mH();

                mE();

                mR();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NWHERE"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:387:4: ( A S C )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:387:13: A S C
            {
                mA();

                mS();

                mC();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:388:5: ( D E S C )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:388:13: D E S C
            {
                mD();

                mE();

                mS();

                mC();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:389:4: ( U S E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:389:13: U S E
            {
                mU();

                mS();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:390:3: ( A S )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:390:13: A S
            {
                mA();

                mS();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:391:7: ( C O M M I T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:391:13: C O M M I T
            {
                mC();

                mO();

                mM();

                mM();

                mI();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:392:9: ( R O L L B A C K )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:392:13: R O L L B A C K
            {
                mR();

                mO();

                mL();

                mL();

                mB();

                mA();

                mC();

                mK();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "OPTIMIZE"
    public final void mOPTIMIZE() throws RecognitionException {
        try {
            int _type = OPTIMIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:393:9: ( O P T I M I Z E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:393:13: O P T I M I Z E
            {
                mO();

                mP();

                mT();

                mI();

                mM();

                mI();

                mZ();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "OPTIMIZE"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:394:3: ( O R )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:394:13: O R
            {
                mO();

                mR();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:395:4: ( A N D )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:395:13: A N D
            {
                mA();

                mN();

                mD();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:396:4: ( N O T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:396:13: N O T
            {
                mN();

                mO();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:397:5: ( N U L L )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:397:13: N U L L
            {
                mN();

                mU();

                mL();

                mL();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:398:5: ( T R U E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:398:13: T R U E
            {
                mT();

                mR();

                mU();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:399:6: ( F A L S E )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:399:13: F A L S E
            {
                mF();

                mA();

                mL();

                mS();

                mE();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:400:4: ( S U M )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:400:10: S U M
            {
                mS();

                mU();

                mM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:401:4: ( M A X )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:401:10: M A X
            {
                mM();

                mA();

                mX();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:402:4: ( M I N )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:402:10: M I N
            {
                mM();

                mI();

                mN();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:403:4: ( A V G )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:403:10: A V G
            {
                mA();

                mV();

                mG();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "MID"
    public final void mMID() throws RecognitionException {
        try {
            int _type = MID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:404:4: ( M I D )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:404:10: M I D
            {
                mM();

                mI();

                mD();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "MID"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:405:6: ( C O U N T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:405:12: C O U N T
            {
                mC();

                mO();

                mU();

                mN();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "DISTICNT"
    public final void mDISTICNT() throws RecognitionException {
        try {
            int _type = DISTICNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:406:9: ( D I S T I C N T )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:406:13: D I S T I C N T
            {
                mD();

                mI();

                mS();

                mT();

                mI();

                mC();

                mN();

                mT();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DISTICNT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:410:7: ( STRING_SINGLE | STRING_DOUBLE )
            int alt1 = 2;
            int LA1_0 = input.LA(1);
            if ((LA1_0 == '\'')) {
                alt1 = 1;
            } else if ((LA1_0 == '\"')) {
                alt1 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 1, 0, input);
                throw nvae;
            }

            switch (alt1) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:410:33: STRING_SINGLE
                {
                    mSTRING_SINGLE();

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:410:49: STRING_DOUBLE
                {
                    mSTRING_DOUBLE();

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "STRING_DOUBLE"
    public final void mSTRING_DOUBLE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:411:23: ( QUOTE_DOUBLE ( STRING_CORE_DOUBLE )* QUOTE_DOUBLE )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:411:33: QUOTE_DOUBLE ( STRING_CORE_DOUBLE )* QUOTE_DOUBLE
            {
                mQUOTE_DOUBLE();

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:411:46: ( STRING_CORE_DOUBLE )*
                loop2:
                while (true) {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if (((LA2_0 >= '\u0000' && LA2_0 <= '!') || (LA2_0 >= '#' && LA2_0 <= '\uFFFF'))) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:411:46: STRING_CORE_DOUBLE
                        {
                            mSTRING_CORE_DOUBLE();

                        }
                        break;

                        default:
                            break loop2;
                    }
                }

                mQUOTE_DOUBLE();

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_DOUBLE"

    // $ANTLR start "STRING_SINGLE"
    public final void mSTRING_SINGLE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:412:23: ( QUOTE_SINGLE ( STRING_CORE_SINGLE )* QUOTE_SINGLE )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:412:33: QUOTE_SINGLE ( STRING_CORE_SINGLE )* QUOTE_SINGLE
            {
                mQUOTE_SINGLE();

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:412:46: ( STRING_CORE_SINGLE )*
                loop3:
                while (true) {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if (((LA3_0 >= '\u0000' && LA3_0 <= '&') || (LA3_0 >= '(' && LA3_0 <= '\uFFFF'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:412:46: STRING_CORE_SINGLE
                        {
                            mSTRING_CORE_SINGLE();

                        }
                        break;

                        default:
                            break loop3;
                    }
                }

                mQUOTE_SINGLE();

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_SINGLE"

    // $ANTLR start "STRING_CORE_DOUBLE"
    public final void mSTRING_CORE_DOUBLE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:413:28: ( STRING_CORE | QUOTE_SINGLE | STRING_ESCAPE_CORE )
            int alt4 = 3;
            int LA4_0 = input.LA(1);
            if ((LA4_0 == '\\')) {
                int LA4_1 = input.LA(2);
                if ((LA4_1 == '\"' || LA4_1 == '\'' || LA4_1 == '\\' || LA4_1 == 'n' || LA4_1 == 'r' || LA4_1 == 't')) {
                    alt4 = 3;
                } else {
                    alt4 = 1;
                }

            } else if ((LA4_0 == '\'')) {
                alt4 = 2;
            } else if (((LA4_0 >= '\u0000' && LA4_0 <= '!') || (LA4_0 >= '#' && LA4_0 <= '&') || (LA4_0 >= '(' && LA4_0 <= '[') || (LA4_0 >= ']' && LA4_0 <= '\uFFFF'))) {
                alt4 = 1;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 4, 0, input);
                throw nvae;
            }

            switch (alt4) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:413:33: STRING_CORE
                {
                    mSTRING_CORE();

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:413:47: QUOTE_SINGLE
                {
                    mQUOTE_SINGLE();

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:413:62: STRING_ESCAPE_CORE
                {
                    mSTRING_ESCAPE_CORE();

                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE_DOUBLE"

    // $ANTLR start "STRING_CORE_SINGLE"
    public final void mSTRING_CORE_SINGLE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:414:28: ( STRING_CORE | QUOTE_DOUBLE | STRING_ESCAPE_CORE )
            int alt5 = 3;
            int LA5_0 = input.LA(1);
            if ((LA5_0 == '\\')) {
                int LA5_1 = input.LA(2);
                if ((LA5_1 == '\"' || LA5_1 == '\'' || LA5_1 == '\\' || LA5_1 == 'n' || LA5_1 == 'r' || LA5_1 == 't')) {
                    alt5 = 3;
                } else {
                    alt5 = 1;
                }

            } else if ((LA5_0 == '\"')) {
                alt5 = 2;
            } else if (((LA5_0 >= '\u0000' && LA5_0 <= '!') || (LA5_0 >= '#' && LA5_0 <= '&') || (LA5_0 >= '(' && LA5_0 <= '[') || (LA5_0 >= ']' && LA5_0 <= '\uFFFF'))) {
                alt5 = 1;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 5, 0, input);
                throw nvae;
            }

            switch (alt5) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:414:33: STRING_CORE
                {
                    mSTRING_CORE();

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:414:47: QUOTE_DOUBLE
                {
                    mQUOTE_DOUBLE();

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:414:62: STRING_ESCAPE_CORE
                {
                    mSTRING_ESCAPE_CORE();

                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE_SINGLE"

    // $ANTLR start "STRING_CORE"
    public final void mSTRING_CORE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:415:21: (~ ( QUOTE_SINGLE | QUOTE_DOUBLE ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '\uFFFF')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE"

    // $ANTLR start "STRING_ESCAPE_CORE"
    public final void mSTRING_ESCAPE_CORE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:416:28: ( BACKSLASH ( BACKSLASH | QUOTE_DOUBLE | QUOTE_SINGLE | 'r' | 'n' | 't' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:416:33: BACKSLASH ( BACKSLASH | QUOTE_DOUBLE | QUOTE_SINGLE | 'r' | 'n' | 't' )
            {
                mBACKSLASH();

                if (input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING_ESCAPE_CORE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:418:3: ( ID_PLAIN | ID_ESCAPE )
            int alt6 = 2;
            int LA6_0 = input.LA(1);
            if (((LA6_0 >= 'A' && LA6_0 <= 'Z') || LA6_0 == '_' || (LA6_0 >= 'a' && LA6_0 <= 'z'))) {
                alt6 = 1;
            } else if ((LA6_0 == '`')) {
                alt6 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 6, 0, input);
                throw nvae;
            }

            switch (alt6) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:418:33: ID_PLAIN
                {
                    mID_PLAIN();

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:418:44: ID_ESCAPE
                {
                    mID_ESCAPE();

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ID_PLAIN"
    public final void mID_PLAIN() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:419:18: ( ID_START ( ID_CORE )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:419:33: ID_START ( ID_CORE )*
            {
                mID_START();

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:419:42: ( ID_CORE )*
                loop7:
                while (true) {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);
                    if (((LA7_0 >= '0' && LA7_0 <= '9') || (LA7_0 >= 'A' && LA7_0 <= 'Z') || LA7_0 == '_' || (LA7_0 >= 'a' && LA7_0 <= 'z'))) {
                        alt7 = 1;
                    }

                    switch (alt7) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop7;
                    }
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID_PLAIN"

    // $ANTLR start "ID_ESCAPE"
    public final void mID_ESCAPE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:420:19: ( BACKTICK ( ID_ESCAPE_CORE )+ BACKTICK )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:420:33: BACKTICK ( ID_ESCAPE_CORE )+ BACKTICK
            {
                mBACKTICK();

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:420:42: ( ID_ESCAPE_CORE )+
                int cnt8 = 0;
                loop8:
                while (true) {
                    int alt8 = 2;
                    int LA8_0 = input.LA(1);
                    if (((LA8_0 >= '\u0000' && LA8_0 <= '_') || (LA8_0 >= 'a' && LA8_0 <= '\uFFFF'))) {
                        alt8 = 1;
                    }

                    switch (alt8) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '_') || (input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt8 >= 1) break loop8;
                            EarlyExitException eee = new EarlyExitException(8, input);
                            throw eee;
                    }
                    cnt8++;
                }

                mBACKTICK();

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID_ESCAPE"

    // $ANTLR start "ID_START"
    public final void mID_START() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:421:18: ( 'a' .. 'z' | 'A' .. 'Z' | UNDERSCORE )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID_START"

    // $ANTLR start "ID_CORE"
    public final void mID_CORE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:422:17: ( ID_START | '0' .. '9' )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID_CORE"

    // $ANTLR start "ID_ESCAPE_CORE"
    public final void mID_ESCAPE_CORE() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:423:24: (~ BACKTICK )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '_') || (input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID_ESCAPE_CORE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:425:8: ( ( '0' .. '9' )+ )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:425:33: ( '0' .. '9' )+
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:425:33: ( '0' .. '9' )+
                int cnt9 = 0;
                loop9:
                while (true) {
                    int alt9 = 2;
                    int LA9_0 = input.LA(1);
                    if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
                        alt9 = 1;
                    }

                    switch (alt9) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt9 >= 1) break loop9;
                            EarlyExitException eee = new EarlyExitException(9, input);
                            throw eee;
                    }
                    cnt9++;
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt16 = 3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:7: ( '0' .. '9' )+
                    int cnt10 = 0;
                    loop10:
                    while (true) {
                        int alt10 = 2;
                        int LA10_0 = input.LA(1);
                        if (((LA10_0 >= '0' && LA10_0 <= '9'))) {
                            alt10 = 1;
                        }

                        switch (alt10) {
                            case 1:
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt10 >= 1) break loop10;
                                EarlyExitException eee = new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    }

                    match('.');
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:23: ( '0' .. '9' )*
                    loop11:
                    while (true) {
                        int alt11 = 2;
                        int LA11_0 = input.LA(1);
                        if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
                            alt11 = 1;
                        }

                        switch (alt11) {
                            case 1:
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                break loop11;
                        }
                    }

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:35: ( EXPONENT )?
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);
                    if ((LA12_0 == 'E' || LA12_0 == 'e')) {
                        alt12 = 1;
                    }
                    switch (alt12) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:428:35: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:429:7: '.' ( '0' .. '9' )+ ( EXPONENT )?
                {
                    match('.');
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:429:11: ( '0' .. '9' )+
                    int cnt13 = 0;
                    loop13:
                    while (true) {
                        int alt13 = 2;
                        int LA13_0 = input.LA(1);
                        if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
                            alt13 = 1;
                        }

                        switch (alt13) {
                            case 1:
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt13 >= 1) break loop13;
                                EarlyExitException eee = new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    }

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:429:23: ( EXPONENT )?
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);
                    if ((LA14_0 == 'E' || LA14_0 == 'e')) {
                        alt14 = 1;
                    }
                    switch (alt14) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:429:23: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:430:7: ( '0' .. '9' )+ EXPONENT
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:430:7: ( '0' .. '9' )+
                    int cnt15 = 0;
                    loop15:
                    while (true) {
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);
                        if (((LA15_0 >= '0' && LA15_0 <= '9'))) {
                            alt15 = 1;
                        }

                        switch (alt15) {
                            case 1:
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt15 >= 1) break loop15;
                                EarlyExitException eee = new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    }

                    mEXPONENT();

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:432:18: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:432:33: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:432:45: ( '+' | '-' )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);
                if ((LA17_0 == '+' || LA17_0 == '-')) {
                    alt17 = 1;
                }
                switch (alt17) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                    {
                        if (input.LA(1) == '+' || input.LA(1) == '-') {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                    break;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:432:58: ( '0' .. '9' )+
                int cnt18 = 0;
                loop18:
                while (true) {
                    int alt18 = 2;
                    int LA18_0 = input.LA(1);
                    if (((LA18_0 >= '0' && LA18_0 <= '9'))) {
                        alt18 = 1;
                    }

                    switch (alt18) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt18 >= 1) break loop18;
                            EarlyExitException eee = new EarlyExitException(18, input);
                            throw eee;
                    }
                    cnt18++;
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:434:3: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:434:5: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
                if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    @Override
    public void mTokens() throws RecognitionException {
        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:8: ( SEMICOLON | ASTERISK | COMMA | UNDERSCORE | QUOTE_DOUBLE | QUOTE_SINGLE | BACKSLASH | BACKTICK | LPAREN | RPAREN | LSBRACKET | RSBRACKET | LESS_THAN | LESS_THAN_OR_EQUAL_TO | GREATER_THAN | GREATER_THAN_OR_EQUAL_TO | PLUS | MINUS | SLASH | EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE | DELETE | INSERT | INTO | VALUES | SELECT | ORDER | BY | LIMIT | OFFSET | FROM | WHERE | NWHERE | ASC | DESC | USE | AS | COMMIT | ROLLBACK | OPTIMIZE | OR | AND | NOT | NULL | TRUE | FALSE | SUM | MAX | MIN | AVG | MID | COUNT | DISTICNT | STRING | ID | INTEGER | FLOAT | WS )
        int alt19 = 60;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:10: SEMICOLON
            {
                mSEMICOLON();

            }
            break;
            case 2:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:20: ASTERISK
            {
                mASTERISK();

            }
            break;
            case 3:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:29: COMMA
            {
                mCOMMA();

            }
            break;
            case 4:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:35: UNDERSCORE
            {
                mUNDERSCORE();

            }
            break;
            case 5:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:46: QUOTE_DOUBLE
            {
                mQUOTE_DOUBLE();

            }
            break;
            case 6:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:59: QUOTE_SINGLE
            {
                mQUOTE_SINGLE();

            }
            break;
            case 7:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:72: BACKSLASH
            {
                mBACKSLASH();

            }
            break;
            case 8:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:82: BACKTICK
            {
                mBACKTICK();

            }
            break;
            case 9:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:91: LPAREN
            {
                mLPAREN();

            }
            break;
            case 10:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:98: RPAREN
            {
                mRPAREN();

            }
            break;
            case 11:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:105: LSBRACKET
            {
                mLSBRACKET();

            }
            break;
            case 12:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:115: RSBRACKET
            {
                mRSBRACKET();

            }
            break;
            case 13:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:125: LESS_THAN
            {
                mLESS_THAN();

            }
            break;
            case 14:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:135: LESS_THAN_OR_EQUAL_TO
            {
                mLESS_THAN_OR_EQUAL_TO();

            }
            break;
            case 15:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:157: GREATER_THAN
            {
                mGREATER_THAN();

            }
            break;
            case 16:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:170: GREATER_THAN_OR_EQUAL_TO
            {
                mGREATER_THAN_OR_EQUAL_TO();

            }
            break;
            case 17:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:195: PLUS
            {
                mPLUS();

            }
            break;
            case 18:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:200: MINUS
            {
                mMINUS();

            }
            break;
            case 19:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:206: SLASH
            {
                mSLASH();

            }
            break;
            case 20:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:212: EQUAL_TO_SINGLE
            {
                mEQUAL_TO_SINGLE();

            }
            break;
            case 21:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:228: EQUAL_TO_DOUBLE
            {
                mEQUAL_TO_DOUBLE();

            }
            break;
            case 22:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:244: NOT_EQUAL_TO_SINGLE
            {
                mNOT_EQUAL_TO_SINGLE();

            }
            break;
            case 23:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:264: NOT_EQUAL_TO_DOUBLE
            {
                mNOT_EQUAL_TO_DOUBLE();

            }
            break;
            case 24:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:284: DELETE
            {
                mDELETE();

            }
            break;
            case 25:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:291: INSERT
            {
                mINSERT();

            }
            break;
            case 26:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:298: INTO
            {
                mINTO();

            }
            break;
            case 27:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:303: VALUES
            {
                mVALUES();

            }
            break;
            case 28:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:310: SELECT
            {
                mSELECT();

            }
            break;
            case 29:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:317: ORDER
            {
                mORDER();

            }
            break;
            case 30:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:323: BY
            {
                mBY();

            }
            break;
            case 31:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:326: LIMIT
            {
                mLIMIT();

            }
            break;
            case 32:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:332: OFFSET
            {
                mOFFSET();

            }
            break;
            case 33:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:339: FROM
            {
                mFROM();

            }
            break;
            case 34:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:344: WHERE
            {
                mWHERE();

            }
            break;
            case 35:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:350: NWHERE
            {
                mNWHERE();

            }
            break;
            case 36:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:357: ASC
            {
                mASC();

            }
            break;
            case 37:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:361: DESC
            {
                mDESC();

            }
            break;
            case 38:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:366: USE
            {
                mUSE();

            }
            break;
            case 39:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:370: AS
            {
                mAS();

            }
            break;
            case 40:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:373: COMMIT
            {
                mCOMMIT();

            }
            break;
            case 41:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:380: ROLLBACK
            {
                mROLLBACK();

            }
            break;
            case 42:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:389: OPTIMIZE
            {
                mOPTIMIZE();

            }
            break;
            case 43:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:398: OR
            {
                mOR();

            }
            break;
            case 44:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:401: AND
            {
                mAND();

            }
            break;
            case 45:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:405: NOT
            {
                mNOT();

            }
            break;
            case 46:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:409: NULL
            {
                mNULL();

            }
            break;
            case 47:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:414: TRUE
            {
                mTRUE();

            }
            break;
            case 48:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:419: FALSE
            {
                mFALSE();

            }
            break;
            case 49:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:425: SUM
            {
                mSUM();

            }
            break;
            case 50:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:429: MAX
            {
                mMAX();

            }
            break;
            case 51:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:433: MIN
            {
                mMIN();

            }
            break;
            case 52:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:437: AVG
            {
                mAVG();

            }
            break;
            case 53:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:441: MID
            {
                mMID();

            }
            break;
            case 54:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:445: COUNT
            {
                mCOUNT();

            }
            break;
            case 55:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:451: DISTICNT
            {
                mDISTICNT();

            }
            break;
            case 56:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:460: STRING
            {
                mSTRING();

            }
            break;
            case 57:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:467: ID
            {
                mID();

            }
            break;
            case 58:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:470: INTEGER
            {
                mINTEGER();

            }
            break;
            case 59:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:478: FLOAT
            {
                mFLOAT();

            }
            break;
            case 60:
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:1:484: WS
            {
                mWS();

            }
            break;

        }
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA16_eotS =
            "\5\uffff";
    static final String DFA16_eofS =
            "\5\uffff";
    static final String DFA16_minS =
            "\2\56\3\uffff";
    static final String DFA16_maxS =
            "\1\71\1\145\3\uffff";
    static final String DFA16_acceptS =
            "\2\uffff\1\2\1\1\1\3";
    static final String DFA16_specialS =
            "\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    protected class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }

        @Override
        public String getDescription() {
            return "427:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }

    static final String DFA19_eotS =
            "\4\uffff\1\50\1\51\1\53\1\uffff\1\54\4\uffff\1\56\1\60\3\uffff\1\62\1" +
                    "\uffff\20\44\1\uffff\1\116\15\uffff\1\120\6\44\1\131\2\44\1\135\7\44\1" +
                    "\145\10\44\3\uffff\7\44\1\170\1\uffff\3\44\1\uffff\5\44\1\u0081\1\44\1" +
                    "\uffff\1\u0083\1\u0084\1\u0085\1\u0086\4\44\1\u008b\1\u008c\1\u008d\1" +
                    "\44\1\u008f\2\44\1\u0092\2\44\1\uffff\4\44\1\u0099\3\44\1\uffff\1\u009d" +
                    "\4\uffff\3\44\1\u00a1\3\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\u00a7\2" +
                    "\44\1\u00aa\1\uffff\1\u00ab\1\u00ac\1\44\1\uffff\1\44\1\u00af\1\44\1\uffff" +
                    "\1\u00b1\1\44\1\u00b3\1\u00b4\1\u00b5\1\uffff\1\u00b6\1\44\3\uffff\1\u00b8" +
                    "\1\u00b9\1\uffff\1\44\1\uffff\1\44\4\uffff\1\44\2\uffff\1\44\1\u00be\1" +
                    "\u00bf\1\u00c0\3\uffff";
    static final String DFA19_eofS =
            "\u00c1\uffff";
    static final String DFA19_minS =
            "\1\11\3\uffff\1\60\2\0\1\uffff\1\0\4\uffff\2\75\3\uffff\2\75\1\105\1\116" +
                    "\1\101\1\105\1\106\1\131\1\111\1\101\1\110\1\117\1\116\1\123\2\117\1\122" +
                    "\1\101\1\uffff\1\56\15\uffff\1\75\1\114\2\123\2\114\1\115\1\60\1\106\1" +
                    "\124\1\60\1\115\1\117\1\114\1\105\1\110\1\124\1\114\1\60\1\104\1\107\1" +
                    "\105\1\115\1\114\1\125\1\130\1\104\3\uffff\1\105\1\103\1\124\1\105\1\117" +
                    "\1\125\1\105\1\60\1\uffff\1\105\1\123\1\111\1\uffff\1\111\1\115\1\123" +
                    "\1\122\1\105\1\60\1\114\1\uffff\4\60\1\115\1\116\1\114\1\105\3\60\1\124" +
                    "\1\60\1\111\1\122\1\60\1\105\1\103\1\uffff\1\122\1\105\1\115\1\124\1\60" +
                    "\2\105\1\122\1\uffff\1\60\4\uffff\1\111\1\124\1\102\1\60\3\uffff\1\105" +
                    "\1\uffff\1\103\1\124\1\uffff\1\123\1\124\1\60\1\124\1\111\1\60\1\uffff" +
                    "\2\60\1\105\1\uffff\1\124\1\60\1\101\1\uffff\1\60\1\116\3\60\1\uffff\1" +
                    "\60\1\132\3\uffff\2\60\1\uffff\1\103\1\uffff\1\124\4\uffff\1\105\2\uffff" +
                    "\1\113\3\60\3\uffff";
    static final String DFA19_maxS =
            "\1\172\3\uffff\1\172\2\uffff\1\uffff\1\uffff\4\uffff\2\75\3\uffff\2\75" +
                    "\1\151\1\156\1\141\1\165\1\162\1\171\1\151\1\162\1\150\1\167\1\166\1\163" +
                    "\2\157\1\162\1\151\1\uffff\1\145\15\uffff\1\75\2\163\1\164\2\154\1\155" +
                    "\1\172\1\146\1\164\1\172\1\155\1\157\1\154\1\145\1\150\1\164\1\154\1\172" +
                    "\1\144\1\147\1\145\1\165\1\154\1\165\1\170\1\156\3\uffff\1\145\1\143\1" +
                    "\164\1\145\1\157\1\165\1\145\1\172\1\uffff\1\145\1\163\1\151\1\uffff\1" +
                    "\151\1\155\1\163\1\162\1\145\1\172\1\154\1\uffff\4\172\1\155\1\156\1\154" +
                    "\1\145\3\172\1\164\1\172\1\151\1\162\1\172\1\145\1\143\1\uffff\1\162\1" +
                    "\145\1\155\1\164\1\172\2\145\1\162\1\uffff\1\172\4\uffff\1\151\1\164\1" +
                    "\142\1\172\3\uffff\1\145\1\uffff\1\143\1\164\1\uffff\1\163\1\164\1\172" +
                    "\1\164\1\151\1\172\1\uffff\2\172\1\145\1\uffff\1\164\1\172\1\141\1\uffff" +
                    "\1\172\1\156\3\172\1\uffff\2\172\3\uffff\2\172\1\uffff\1\143\1\uffff\1" +
                    "\164\4\uffff\1\145\2\uffff\1\153\3\172\3\uffff";
    static final String DFA19_acceptS =
            "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\1\uffff\1\11\1\12\1\13\1\14\2\uffff\1" +
                    "\21\1\22\1\23\22\uffff\1\71\1\uffff\1\73\1\74\1\4\1\5\1\70\1\6\1\10\1" +
                    "\16\1\15\1\20\1\17\1\25\1\24\33\uffff\1\72\1\27\1\26\10\uffff\1\53\3\uffff" +
                    "\1\36\7\uffff\1\47\22\uffff\1\61\10\uffff\1\55\1\uffff\1\44\1\54\1\64" +
                    "\1\46\4\uffff\1\62\1\63\1\65\1\uffff\1\45\2\uffff\1\32\6\uffff\1\41\3" +
                    "\uffff\1\56\3\uffff\1\57\5\uffff\1\35\2\uffff\1\37\1\60\1\42\2\uffff\1" +
                    "\66\1\uffff\1\30\1\uffff\1\31\1\33\1\34\1\40\1\uffff\1\43\1\50\4\uffff" +
                    "\1\67\1\52\1\51";
    static final String DFA19_specialS =
            "\5\uffff\1\0\1\1\1\uffff\1\2\u00b8\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\23\1\5\4\uffff\1\6\1\11\1\12\1\2\1" +
                    "\17\1\3\1\20\1\46\1\21\12\45\1\uffff\1\1\1\15\1\22\1\16\2\uffff\1\36" +
                    "\1\31\1\40\1\24\1\44\1\33\2\44\1\25\2\44\1\32\1\43\1\35\1\30\2\44\1\41" +
                    "\1\27\1\42\1\37\1\26\1\34\3\44\1\13\1\7\1\14\1\uffff\1\4\1\10\1\36\1" +
                    "\31\1\40\1\24\1\44\1\33\2\44\1\25\2\44\1\32\1\43\1\35\1\30\2\44\1\41" +
                    "\1\27\1\42\1\37\1\26\1\34\3\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\0\52",
            "\0\52",
            "",
            "\140\44\1\uffff\uff9f\44",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57",
            "",
            "",
            "",
            "\1\61",
            "\1\63",
            "\1\64\3\uffff\1\65\33\uffff\1\64\3\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\17\uffff\1\71\17\uffff\1\70\17\uffff\1\71",
            "\1\73\11\uffff\1\74\1\uffff\1\72\23\uffff\1\73\11\uffff\1\74\1\uffff" +
                    "\1\72",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\100\20\uffff\1\77\16\uffff\1\100\20\uffff\1\77",
            "\1\101\37\uffff\1\101",
            "\1\103\5\uffff\1\104\1\uffff\1\102\27\uffff\1\103\5\uffff\1\104\1\uffff" +
                    "\1\102",
            "\1\106\4\uffff\1\105\2\uffff\1\107\27\uffff\1\106\4\uffff\1\105\2\uffff" +
                    "\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\114\7\uffff\1\115\27\uffff\1\114\7\uffff\1\115",
            "",
            "\1\46\1\uffff\12\45\13\uffff\1\46\37\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\121\6\uffff\1\122\30\uffff\1\121\6\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\1\125\36\uffff\1\124\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\12\44\7\uffff\3\44\1\132\26\44\4\uffff\1\44\1\uffff\3\44\1\132\26\44",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\12\44\7\uffff\2\44\1\146\27\44\4\uffff\1\44\1\uffff\2\44\1\146\27\44",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\7\uffff\1\153\27\uffff\1\152\7\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\160\11\uffff\1\157\25\uffff\1\160\11\uffff\1\157",
            "",
            "",
            "",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0082\37\uffff\1\u0082",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008e\37\uffff\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\u00a2\37\uffff\1\u00a2",
            "",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ad\37\uffff\1\u00ad",
            "",
            "\1\u00ae\37\uffff\1\u00ae",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b0\37\uffff\1\u00b0",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b2\37\uffff\1\u00b2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b7\37\uffff\1\u00b7",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00ba\37\uffff\1\u00ba",
            "",
            "\1\u00bb\37\uffff\1\u00bb",
            "",
            "",
            "",
            "",
            "\1\u00bc\37\uffff\1\u00bc",
            "",
            "",
            "\1\u00bd\37\uffff\1\u00bd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    protected class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }

        @Override
        public String getDescription() {
            return "1:1: Tokens : ( SEMICOLON | ASTERISK | COMMA | UNDERSCORE | QUOTE_DOUBLE | QUOTE_SINGLE | BACKSLASH | BACKTICK | LPAREN | RPAREN | LSBRACKET | RSBRACKET | LESS_THAN | LESS_THAN_OR_EQUAL_TO | GREATER_THAN | GREATER_THAN_OR_EQUAL_TO | PLUS | MINUS | SLASH | EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE | DELETE | INSERT | INTO | VALUES | SELECT | ORDER | BY | LIMIT | OFFSET | FROM | WHERE | NWHERE | ASC | DESC | USE | AS | COMMIT | ROLLBACK | OPTIMIZE | OR | AND | NOT | NULL | TRUE | FALSE | SUM | MAX | MIN | AVG | MID | COUNT | DISTICNT | STRING | ID | INTEGER | FLOAT | WS );";
        }

        @Override
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch (s) {
                case 0:
                    int LA19_5 = input.LA(1);
                    s = -1;
                    if (((LA19_5 >= '\u0000' && LA19_5 <= '\uFFFF'))) {
                        s = 42;
                    } else s = 41;
                    if (s >= 0) return s;
                    break;

                case 1:
                    int LA19_6 = input.LA(1);
                    s = -1;
                    if (((LA19_6 >= '\u0000' && LA19_6 <= '\uFFFF'))) {
                        s = 42;
                    } else s = 43;
                    if (s >= 0) return s;
                    break;

                case 2:
                    int LA19_8 = input.LA(1);
                    s = -1;
                    if (((LA19_8 >= '\u0000' && LA19_8 <= '_') || (LA19_8 >= 'a' && LA19_8 <= '\uFFFF'))) {
                        s = 36;
                    } else s = 44;
                    if (s >= 0) return s;
                    break;
            }
            NoViableAltException nvae =
                    new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

}
