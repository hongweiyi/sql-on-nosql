// $ANTLR 3.5 F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\Solrql.g 2013-09-07 16:23:48

package com.hongweiyi.cql.parse.syntax;


import org.antlr.runtime.*;

import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASC", "ASTERISK",
            "AVG", "B", "BACKSLASH", "BACKTICK", "BY", "C", "COMMA", "COMMIT", "COUNT",
            "D", "DELETE", "DESC", "DISTICNT", "E", "EQUAL_TO_DOUBLE", "EQUAL_TO_SINGLE",
            "EXPONENT", "F", "FALSE", "FLOAT", "FROM", "G", "GREATER_THAN", "GREATER_THAN_OR_EQUAL_TO",
            "H", "I", "ID", "ID_CORE", "ID_ESCAPE", "ID_ESCAPE_CORE", "ID_PLAIN",
            "ID_START", "INSERT", "INTEGER", "INTO", "J", "K", "L", "LESS_THAN", "LESS_THAN_OR_EQUAL_TO",
            "LIMIT", "LPAREN", "LSBRACKET", "M", "MAX", "MID", "MIN", "MINUS", "N",
            "NOT", "NOT_EQUAL_TO_DOUBLE", "NOT_EQUAL_TO_SINGLE", "NULL", "NWHERE",
            "O", "OFFSET", "OPTIMIZE", "OR", "ORDER", "P", "PLUS", "Q", "QUOTE_DOUBLE",
            "QUOTE_SINGLE", "R", "ROLLBACK", "RPAREN", "RSBRACKET", "S", "SELECT",
            "SEMICOLON", "SLASH", "STRING", "STRING_CORE", "STRING_CORE_DOUBLE", "STRING_CORE_SINGLE",
            "STRING_DOUBLE", "STRING_ESCAPE_CORE", "STRING_SINGLE", "SUM", "T", "TRUE",
            "T_AS", "T_ASC", "T_AVG", "T_COMMIT", "T_COUNT", "T_DELETE", "T_DESC",
            "T_DISTINCT", "T_FIELDS", "T_FIELD_ALIAS", "T_FROM", "T_INSERT", "T_INTO",
            "T_LIMIT", "T_LIST", "T_MAX", "T_MIN", "T_NWHERE", "T_OFFSET", "T_OPERATOR_ADD",
            "T_OPERATOR_AND", "T_OPERATOR_CALL", "T_OPERATOR_DIVIDE", "T_OPERATOR_EQUAL_TO_DOUBLE",
            "T_OPERATOR_EQUAL_TO_SINGLE", "T_OPERATOR_GREATER_THAN", "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO",
            "T_OPERATOR_INDEX", "T_OPERATOR_LESS_THAN", "T_OPERATOR_LESS_THAN_OR_EQUAL_TO",
            "T_OPERATOR_MINUS", "T_OPERATOR_MULTIPLY", "T_OPERATOR_NOT", "T_OPERATOR_NOT_EQUAL_TO_DOUBLE",
            "T_OPERATOR_NOT_EQUAL_TO_SINGLE", "T_OPERATOR_OR", "T_OPERATOR_PLUS",
            "T_OPERATOR_SUBTRACT", "T_OPTIMIZE", "T_ORDER", "T_ORDERING", "T_ROLLBACK",
            "T_SELECT", "T_SERVER", "T_SUM", "T_USE", "T_VALUES", "T_WHERE", "U",
            "UNDERSCORE", "USE", "V", "VALUES", "W", "WHERE", "WS", "X", "Y", "Z"
    };
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
    public Parser[] getDelegates() {
        return new Parser[]{};
    }

    // delegators


    public CqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public CqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    @Override
    public String[] getTokenNames() {
        return CqlParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return "F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g";
    }


    public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
            throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
    }


    public static class stmt_list_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "stmt_list"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:83:1: stmt_list : ( stmt_core SEMICOLON !)* EOF !;
    public final CqlParser.stmt_list_return stmt_list() throws RecognitionException {
        CqlParser.stmt_list_return retval = new CqlParser.stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON2 = null;
        Token EOF3 = null;
        ParserRuleReturnScope stmt_core1 = null;

        Object SEMICOLON2_tree = null;
        Object EOF3_tree = null;

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:84:5: ( ( stmt_core SEMICOLON !)* EOF !)
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:84:7: ( stmt_core SEMICOLON !)* EOF !
            {
                root_0 = (Object) adaptor.nil();


                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:84:7: ( stmt_core SEMICOLON !)*
                loop1:
                while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == COMMIT || LA1_0 == DELETE || LA1_0 == INSERT || LA1_0 == OPTIMIZE || LA1_0 == ROLLBACK || LA1_0 == SELECT || LA1_0 == USE)) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:84:8: stmt_core SEMICOLON !
                        {
                            pushFollow(FOLLOW_stmt_core_in_stmt_list423);
                            stmt_core1 = stmt_core();
                            state._fsp--;

                            adaptor.addChild(root_0, stmt_core1.getTree());

                            SEMICOLON2 = (Token) match(input, SEMICOLON, FOLLOW_SEMICOLON_in_stmt_list425);
                        }
                        break;

                        default:
                            break loop1;
                    }
                }

                EOF3 = (Token) match(input, EOF, FOLLOW_EOF_in_stmt_list430);
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt_list"


    public static class stmt_core_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "stmt_core"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:87:1: stmt_core : ( select_stmt | insert_stmt | delete_stmt | use_stmt | commit_stmt | rollback_stmt | optimize_stmt );
    public final CqlParser.stmt_core_return stmt_core() throws RecognitionException {
        CqlParser.stmt_core_return retval = new CqlParser.stmt_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope select_stmt4 = null;
        ParserRuleReturnScope insert_stmt5 = null;
        ParserRuleReturnScope delete_stmt6 = null;
        ParserRuleReturnScope use_stmt7 = null;
        ParserRuleReturnScope commit_stmt8 = null;
        ParserRuleReturnScope rollback_stmt9 = null;
        ParserRuleReturnScope optimize_stmt10 = null;


        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:88:5: ( select_stmt | insert_stmt | delete_stmt | use_stmt | commit_stmt | rollback_stmt | optimize_stmt )
            int alt2 = 7;
            switch (input.LA(1)) {
                case SELECT: {
                    alt2 = 1;
                }
                break;
                case INSERT: {
                    alt2 = 2;
                }
                break;
                case DELETE: {
                    alt2 = 3;
                }
                break;
                case USE: {
                    alt2 = 4;
                }
                break;
                case COMMIT: {
                    alt2 = 5;
                }
                break;
                case ROLLBACK: {
                    alt2 = 6;
                }
                break;
                case OPTIMIZE: {
                    alt2 = 7;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);
                    throw nvae;
            }
            switch (alt2) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:88:7: select_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_select_stmt_in_stmt_core448);
                    select_stmt4 = select_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt4.getTree());

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:89:7: insert_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_insert_stmt_in_stmt_core456);
                    insert_stmt5 = insert_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt5.getTree());

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:90:7: delete_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_delete_stmt_in_stmt_core464);
                    delete_stmt6 = delete_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt6.getTree());

                }
                break;
                case 4:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:91:7: use_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_use_stmt_in_stmt_core472);
                    use_stmt7 = use_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, use_stmt7.getTree());

                }
                break;
                case 5:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:92:7: commit_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_commit_stmt_in_stmt_core480);
                    commit_stmt8 = commit_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt8.getTree());

                }
                break;
                case 6:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:93:7: rollback_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_rollback_stmt_in_stmt_core488);
                    rollback_stmt9 = rollback_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt9.getTree());

                }
                break;
                case 7:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:94:7: optimize_stmt
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_optimize_stmt_in_stmt_core496);
                    optimize_stmt10 = optimize_stmt();
                    state._fsp--;

                    adaptor.addChild(root_0, optimize_stmt10.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt_core"


    public static class optimize_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "optimize_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:97:1: optimize_stmt : OPTIMIZE ( ID )? -> ^( T_OPTIMIZE ( ID )? ) ;
    public final CqlParser.optimize_stmt_return optimize_stmt() throws RecognitionException {
        CqlParser.optimize_stmt_return retval = new CqlParser.optimize_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPTIMIZE11 = null;
        Token ID12 = null;

        Object OPTIMIZE11_tree = null;
        Object ID12_tree = null;
        RewriteRuleTokenStream stream_OPTIMIZE = new RewriteRuleTokenStream(adaptor, "token OPTIMIZE");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:98:5: ( OPTIMIZE ( ID )? -> ^( T_OPTIMIZE ( ID )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:98:7: OPTIMIZE ( ID )?
            {
                OPTIMIZE11 = (Token) match(input, OPTIMIZE, FOLLOW_OPTIMIZE_in_optimize_stmt513);
                stream_OPTIMIZE.add(OPTIMIZE11);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:98:16: ( ID )?
                int alt3 = 2;
                int LA3_0 = input.LA(1);
                if ((LA3_0 == ID)) {
                    alt3 = 1;
                }
                switch (alt3) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:98:16: ID
                    {
                        ID12 = (Token) match(input, ID, FOLLOW_ID_in_optimize_stmt515);
                        stream_ID.add(ID12);

                    }
                    break;

                }

                // AST REWRITE
                // elements: ID
                // token labels: 
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 99:7: -> ^( T_OPTIMIZE ( ID )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:99:10: ^( T_OPTIMIZE ( ID )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPTIMIZE, "T_OPTIMIZE"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:100:20: ( ID )?
                        if (stream_ID.hasNext()) {
                            adaptor.addChild(root_1, stream_ID.nextNode());
                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optimize_stmt"


    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "rollback_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:104:1: rollback_stmt : ROLLBACK ( ID )? -> ^( T_ROLLBACK ( ID )? ) ;
    public final CqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        CqlParser.rollback_stmt_return retval = new CqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK13 = null;
        Token ID14 = null;

        Object ROLLBACK13_tree = null;
        Object ID14_tree = null;
        RewriteRuleTokenStream stream_ROLLBACK = new RewriteRuleTokenStream(adaptor, "token ROLLBACK");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:105:5: ( ROLLBACK ( ID )? -> ^( T_ROLLBACK ( ID )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:105:7: ROLLBACK ( ID )?
            {
                ROLLBACK13 = (Token) match(input, ROLLBACK, FOLLOW_ROLLBACK_in_rollback_stmt564);
                stream_ROLLBACK.add(ROLLBACK13);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:105:16: ( ID )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);
                if ((LA4_0 == ID)) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:105:16: ID
                    {
                        ID14 = (Token) match(input, ID, FOLLOW_ID_in_rollback_stmt566);
                        stream_ID.add(ID14);

                    }
                    break;

                }

                // AST REWRITE
                // elements: ID
                // token labels: 
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 106:7: -> ^( T_ROLLBACK ( ID )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:106:10: ^( T_ROLLBACK ( ID )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ROLLBACK, "T_ROLLBACK"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:107:20: ( ID )?
                        if (stream_ID.hasNext()) {
                            adaptor.addChild(root_1, stream_ID.nextNode());
                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"


    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "commit_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:111:1: commit_stmt : COMMIT ( ID )? -> ^( T_COMMIT ( ID )? ) ;
    public final CqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        CqlParser.commit_stmt_return retval = new CqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT15 = null;
        Token ID16 = null;

        Object COMMIT15_tree = null;
        Object ID16_tree = null;
        RewriteRuleTokenStream stream_COMMIT = new RewriteRuleTokenStream(adaptor, "token COMMIT");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:112:5: ( COMMIT ( ID )? -> ^( T_COMMIT ( ID )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:112:7: COMMIT ( ID )?
            {
                COMMIT15 = (Token) match(input, COMMIT, FOLLOW_COMMIT_in_commit_stmt615);
                stream_COMMIT.add(COMMIT15);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:112:14: ( ID )?
                int alt5 = 2;
                int LA5_0 = input.LA(1);
                if ((LA5_0 == ID)) {
                    alt5 = 1;
                }
                switch (alt5) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:112:14: ID
                    {
                        ID16 = (Token) match(input, ID, FOLLOW_ID_in_commit_stmt617);
                        stream_ID.add(ID16);

                    }
                    break;

                }

                // AST REWRITE
                // elements: ID
                // token labels: 
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 113:7: -> ^( T_COMMIT ( ID )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:113:10: ^( T_COMMIT ( ID )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_COMMIT, "T_COMMIT"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:114:18: ( ID )?
                        if (stream_ID.hasNext()) {
                            adaptor.addChild(root_1, stream_ID.nextNode());
                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"


    public static class use_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "use_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:118:1: use_stmt : USE url= STRING ( AS ref= ID )? -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? ) ;
    public final CqlParser.use_stmt_return use_stmt() throws RecognitionException {
        CqlParser.use_stmt_return retval = new CqlParser.use_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token url = null;
        Token ref = null;
        Token USE17 = null;
        Token AS18 = null;

        Object url_tree = null;
        Object ref_tree = null;
        Object USE17_tree = null;
        Object AS18_tree = null;
        RewriteRuleTokenStream stream_AS = new RewriteRuleTokenStream(adaptor, "token AS");
        RewriteRuleTokenStream stream_USE = new RewriteRuleTokenStream(adaptor, "token USE");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
        RewriteRuleTokenStream stream_STRING = new RewriteRuleTokenStream(adaptor, "token STRING");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:119:5: ( USE url= STRING ( AS ref= ID )? -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:119:7: USE url= STRING ( AS ref= ID )?
            {
                USE17 = (Token) match(input, USE, FOLLOW_USE_in_use_stmt666);
                stream_USE.add(USE17);

                url = (Token) match(input, STRING, FOLLOW_STRING_in_use_stmt670);
                stream_STRING.add(url);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:119:22: ( AS ref= ID )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if ((LA6_0 == AS)) {
                    alt6 = 1;
                }
                switch (alt6) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:119:23: AS ref= ID
                    {
                        AS18 = (Token) match(input, AS, FOLLOW_AS_in_use_stmt673);
                        stream_AS.add(AS18);

                        ref = (Token) match(input, ID, FOLLOW_ID_in_use_stmt677);
                        stream_ID.add(ref);

                    }
                    break;

                }

                // AST REWRITE
                // elements: url, ref
                // token labels: ref, url
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleTokenStream stream_ref = new RewriteRuleTokenStream(adaptor, "token ref", ref);
                RewriteRuleTokenStream stream_url = new RewriteRuleTokenStream(adaptor, "token url", url);
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 120:7: -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:120:10: ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_USE, "T_USE"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:121:15: ^( T_SERVER $url)
                        {
                            Object root_2 = (Object) adaptor.nil();
                            root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_SERVER, "T_SERVER"), root_2);
                            adaptor.addChild(root_2, stream_url.nextNode());
                            adaptor.addChild(root_1, root_2);
                        }

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:121:32: ( ^( T_AS $ref) )?
                        if (stream_ref.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:121:32: ^( T_AS $ref)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_AS, "T_AS"), root_2);
                                adaptor.addChild(root_2, stream_ref.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ref.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "use_stmt"


    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "delete_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:125:1: delete_stmt : DELETE ( FROM src= ID )? ( where_clause )? -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? ) ;
    public final CqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        CqlParser.delete_stmt_return retval = new CqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token src = null;
        Token DELETE19 = null;
        Token FROM20 = null;
        ParserRuleReturnScope where_clause21 = null;

        Object src_tree = null;
        Object DELETE19_tree = null;
        Object FROM20_tree = null;
        RewriteRuleTokenStream stream_DELETE = new RewriteRuleTokenStream(adaptor, "token DELETE");
        RewriteRuleTokenStream stream_FROM = new RewriteRuleTokenStream(adaptor, "token FROM");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
        RewriteRuleSubtreeStream stream_where_clause = new RewriteRuleSubtreeStream(adaptor, "rule where_clause");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:5: ( DELETE ( FROM src= ID )? ( where_clause )? -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:7: DELETE ( FROM src= ID )? ( where_clause )?
            {
                DELETE19 = (Token) match(input, DELETE, FOLLOW_DELETE_in_delete_stmt739);
                stream_DELETE.add(DELETE19);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:14: ( FROM src= ID )?
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if ((LA7_0 == FROM)) {
                    alt7 = 1;
                }
                switch (alt7) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:15: FROM src= ID
                    {
                        FROM20 = (Token) match(input, FROM, FOLLOW_FROM_in_delete_stmt742);
                        stream_FROM.add(FROM20);

                        src = (Token) match(input, ID, FOLLOW_ID_in_delete_stmt746);
                        stream_ID.add(src);

                    }
                    break;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:29: ( where_clause )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);
                if ((LA8_0 == NWHERE || LA8_0 == WHERE)) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:126:29: where_clause
                    {
                        pushFollow(FOLLOW_where_clause_in_delete_stmt750);
                        where_clause21 = where_clause();
                        state._fsp--;

                        stream_where_clause.add(where_clause21.getTree());
                    }
                    break;

                }

                // AST REWRITE
                // elements: where_clause, src
                // token labels: src
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleTokenStream stream_src = new RewriteRuleTokenStream(adaptor, "token src", src);
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 127:7: -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:127:10: ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_DELETE, "T_DELETE"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:128:18: ( ^( T_FROM $src) )?
                        if (stream_src.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:128:18: ^( T_FROM $src)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_FROM, "T_FROM"), root_2);
                                adaptor.addChild(root_2, stream_src.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_src.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:128:34: ( where_clause )?
                        if (stream_where_clause.hasNext()) {
                            adaptor.addChild(root_1, stream_where_clause.nextTree());
                        }
                        stream_where_clause.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"


    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "insert_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:132:1: insert_stmt : INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt ) -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? ) ;
    public final CqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        CqlParser.insert_stmt_return retval = new CqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dest = null;
        Token INSERT22 = null;
        Token INTO23 = null;
        Token LPAREN24 = null;
        Token COMMA25 = null;
        Token RPAREN26 = null;
        Token VALUES27 = null;
        Token LPAREN28 = null;
        Token COMMA30 = null;
        Token RPAREN32 = null;
        Token fields = null;
        List<Object> list_fields = null;
        ParserRuleReturnScope expression29 = null;
        ParserRuleReturnScope expression31 = null;
        ParserRuleReturnScope select_stmt33 = null;

        Object dest_tree = null;
        Object INSERT22_tree = null;
        Object INTO23_tree = null;
        Object LPAREN24_tree = null;
        Object COMMA25_tree = null;
        Object RPAREN26_tree = null;
        Object VALUES27_tree = null;
        Object LPAREN28_tree = null;
        Object COMMA30_tree = null;
        Object RPAREN32_tree = null;
        Object fields_tree = null;
        RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(adaptor, "token RPAREN");
        RewriteRuleTokenStream stream_INSERT = new RewriteRuleTokenStream(adaptor, "token INSERT");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
        RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(adaptor, "token COMMA");
        RewriteRuleTokenStream stream_INTO = new RewriteRuleTokenStream(adaptor, "token INTO");
        RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(adaptor, "token LPAREN");
        RewriteRuleTokenStream stream_VALUES = new RewriteRuleTokenStream(adaptor, "token VALUES");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(adaptor, "rule expression");
        RewriteRuleSubtreeStream stream_select_stmt = new RewriteRuleSubtreeStream(adaptor, "rule select_stmt");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:5: ( INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt ) -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:7: INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt )
            {
                INSERT22 = (Token) match(input, INSERT, FOLLOW_INSERT_in_insert_stmt807);
                stream_INSERT.add(INSERT22);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:14: ( INTO dest= ID )?
                int alt9 = 2;
                int LA9_0 = input.LA(1);
                if ((LA9_0 == INTO)) {
                    alt9 = 1;
                }
                switch (alt9) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:15: INTO dest= ID
                    {
                        INTO23 = (Token) match(input, INTO, FOLLOW_INTO_in_insert_stmt810);
                        stream_INTO.add(INTO23);

                        dest = (Token) match(input, ID, FOLLOW_ID_in_insert_stmt814);
                        stream_ID.add(dest);

                    }
                    break;

                }

                LPAREN24 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_insert_stmt818);
                stream_LPAREN.add(LPAREN24);

                fields = (Token) match(input, ID, FOLLOW_ID_in_insert_stmt822);
                stream_ID.add(fields);

                if (list_fields == null) list_fields = new ArrayList<Object>();
                list_fields.add(fields);
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:48: ( COMMA fields+= ID )*
                loop10:
                while (true) {
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);
                    if ((LA10_0 == COMMA)) {
                        alt10 = 1;
                    }

                    switch (alt10) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:133:49: COMMA fields+= ID
                        {
                            COMMA25 = (Token) match(input, COMMA, FOLLOW_COMMA_in_insert_stmt825);
                            stream_COMMA.add(COMMA25);

                            fields = (Token) match(input, ID, FOLLOW_ID_in_insert_stmt829);
                            stream_ID.add(fields);

                            if (list_fields == null) list_fields = new ArrayList<Object>();
                            list_fields.add(fields);
                        }
                        break;

                        default:
                            break loop10;
                    }
                }

                RPAREN26 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_insert_stmt833);
                stream_RPAREN.add(RPAREN26);

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:134:7: ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt )
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == VALUES)) {
                    alt12 = 1;
                } else if ((LA12_0 == SELECT)) {
                    alt12 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);
                    throw nvae;
                }

                switch (alt12) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:134:9: VALUES LPAREN expression ( COMMA expression )* RPAREN
                    {
                        VALUES27 = (Token) match(input, VALUES, FOLLOW_VALUES_in_insert_stmt843);
                        stream_VALUES.add(VALUES27);

                        LPAREN28 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_insert_stmt845);
                        stream_LPAREN.add(LPAREN28);

                        pushFollow(FOLLOW_expression_in_insert_stmt847);
                        expression29 = expression();
                        state._fsp--;

                        stream_expression.add(expression29.getTree());
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:134:34: ( COMMA expression )*
                        loop11:
                        while (true) {
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);
                            if ((LA11_0 == COMMA)) {
                                alt11 = 1;
                            }

                            switch (alt11) {
                                case 1:
                                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:134:35: COMMA expression
                                {
                                    COMMA30 = (Token) match(input, COMMA, FOLLOW_COMMA_in_insert_stmt850);
                                    stream_COMMA.add(COMMA30);

                                    pushFollow(FOLLOW_expression_in_insert_stmt852);
                                    expression31 = expression();
                                    state._fsp--;

                                    stream_expression.add(expression31.getTree());
                                }
                                break;

                                default:
                                    break loop11;
                            }
                        }

                        RPAREN32 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_insert_stmt856);
                        stream_RPAREN.add(RPAREN32);

                    }
                    break;
                    case 2:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:135:9: select_stmt
                    {
                        pushFollow(FOLLOW_select_stmt_in_insert_stmt866);
                        select_stmt33 = select_stmt();
                        state._fsp--;

                        stream_select_stmt.add(select_stmt33.getTree());
                    }
                    break;

                }

                // AST REWRITE
                // elements: select_stmt, fields, expression, dest
                // token labels: dest
                // rule labels: retval
                // token list labels: fields
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleTokenStream stream_dest = new RewriteRuleTokenStream(adaptor, "token dest", dest);
                RewriteRuleTokenStream stream_fields = new RewriteRuleTokenStream(adaptor, "token fields", list_fields);
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 137:7: -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:137:10: ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_INSERT, "T_INSERT"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:18: ( ^( T_INTO $dest) )?
                        if (stream_dest.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:18: ^( T_INTO $dest)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_INTO, "T_INTO"), root_2);
                                adaptor.addChild(root_2, stream_dest.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_dest.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:35: ^( T_FIELDS ( $fields)+ )
                        {
                            Object root_2 = (Object) adaptor.nil();
                            root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_FIELDS, "T_FIELDS"), root_2);
                            if (!(stream_fields.hasNext())) {
                                throw new RewriteEarlyExitException();
                            }
                            while (stream_fields.hasNext()) {
                                adaptor.addChild(root_2, stream_fields.nextNode());
                            }
                            stream_fields.reset();

                            adaptor.addChild(root_1, root_2);
                        }

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:56: ( ^( T_VALUES ( expression )+ ) )?
                        if (stream_expression.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:56: ^( T_VALUES ( expression )+ )
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_VALUES, "T_VALUES"), root_2);
                                if (!(stream_expression.hasNext())) {
                                    throw new RewriteEarlyExitException();
                                }
                                while (stream_expression.hasNext()) {
                                    adaptor.addChild(root_2, stream_expression.nextTree());
                                }
                                stream_expression.reset();

                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:138:81: ( select_stmt )?
                        if (stream_select_stmt.hasNext()) {
                            adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        }
                        stream_select_stmt.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"


    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "select_stmt"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:142:1: select_stmt : select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )? -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? ) ;
    public final CqlParser.select_stmt_return select_stmt() throws RecognitionException {
        CqlParser.select_stmt_return retval = new CqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit = null;
        Token offset = null;
        Token ORDER35 = null;
        Token BY36 = null;
        Token COMMA38 = null;
        Token LIMIT40 = null;
        Token OFFSET41 = null;
        ParserRuleReturnScope select_core34 = null;
        ParserRuleReturnScope ordering_term37 = null;
        ParserRuleReturnScope ordering_term39 = null;

        Object limit_tree = null;
        Object offset_tree = null;
        Object ORDER35_tree = null;
        Object BY36_tree = null;
        Object COMMA38_tree = null;
        Object LIMIT40_tree = null;
        Object OFFSET41_tree = null;
        RewriteRuleTokenStream stream_INTEGER = new RewriteRuleTokenStream(adaptor, "token INTEGER");
        RewriteRuleTokenStream stream_BY = new RewriteRuleTokenStream(adaptor, "token BY");
        RewriteRuleTokenStream stream_ORDER = new RewriteRuleTokenStream(adaptor, "token ORDER");
        RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(adaptor, "token COMMA");
        RewriteRuleTokenStream stream_LIMIT = new RewriteRuleTokenStream(adaptor, "token LIMIT");
        RewriteRuleTokenStream stream_OFFSET = new RewriteRuleTokenStream(adaptor, "token OFFSET");
        RewriteRuleSubtreeStream stream_ordering_term = new RewriteRuleSubtreeStream(adaptor, "rule ordering_term");
        RewriteRuleSubtreeStream stream_select_core = new RewriteRuleSubtreeStream(adaptor, "rule select_core");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:5: ( select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )? -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:7: select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )?
            {
                pushFollow(FOLLOW_select_core_in_select_stmt946);
                select_core34 = select_core();
                state._fsp--;

                stream_select_core.add(select_core34.getTree());
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:19: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
                int alt14 = 2;
                int LA14_0 = input.LA(1);
                if ((LA14_0 == ORDER)) {
                    alt14 = 1;
                }
                switch (alt14) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:20: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                        ORDER35 = (Token) match(input, ORDER, FOLLOW_ORDER_in_select_stmt949);
                        stream_ORDER.add(ORDER35);

                        BY36 = (Token) match(input, BY, FOLLOW_BY_in_select_stmt951);
                        stream_BY.add(BY36);

                        pushFollow(FOLLOW_ordering_term_in_select_stmt953);
                        ordering_term37 = ordering_term();
                        state._fsp--;

                        stream_ordering_term.add(ordering_term37.getTree());
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:43: ( COMMA ordering_term )*
                        loop13:
                        while (true) {
                            int alt13 = 2;
                            int LA13_0 = input.LA(1);
                            if ((LA13_0 == COMMA)) {
                                alt13 = 1;
                            }

                            switch (alt13) {
                                case 1:
                                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:143:44: COMMA ordering_term
                                {
                                    COMMA38 = (Token) match(input, COMMA, FOLLOW_COMMA_in_select_stmt956);
                                    stream_COMMA.add(COMMA38);

                                    pushFollow(FOLLOW_ordering_term_in_select_stmt958);
                                    ordering_term39 = ordering_term();
                                    state._fsp--;

                                    stream_ordering_term.add(ordering_term39.getTree());
                                }
                                break;

                                default:
                                    break loop13;
                            }
                        }

                    }
                    break;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:144:7: ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )?
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == LIMIT)) {
                    alt16 = 1;
                }
                switch (alt16) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:144:8: LIMIT limit= INTEGER ( OFFSET offset= INTEGER )?
                    {
                        LIMIT40 = (Token) match(input, LIMIT, FOLLOW_LIMIT_in_select_stmt971);
                        stream_LIMIT.add(LIMIT40);

                        limit = (Token) match(input, INTEGER, FOLLOW_INTEGER_in_select_stmt975);
                        stream_INTEGER.add(limit);

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:144:28: ( OFFSET offset= INTEGER )?
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);
                        if ((LA15_0 == OFFSET)) {
                            alt15 = 1;
                        }
                        switch (alt15) {
                            case 1:
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:144:29: OFFSET offset= INTEGER
                            {
                                OFFSET41 = (Token) match(input, OFFSET, FOLLOW_OFFSET_in_select_stmt978);
                                stream_OFFSET.add(OFFSET41);

                                offset = (Token) match(input, INTEGER, FOLLOW_INTEGER_in_select_stmt982);
                                stream_INTEGER.add(offset);

                            }
                            break;

                        }

                    }
                    break;

                }

                // AST REWRITE
                // elements: limit, select_core, ordering_term, offset
                // token labels: limit, offset
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleTokenStream stream_limit = new RewriteRuleTokenStream(adaptor, "token limit", limit);
                RewriteRuleTokenStream stream_offset = new RewriteRuleTokenStream(adaptor, "token offset", offset);
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 145:7: -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:145:10: ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(stream_select_core.nextNode(), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:21: ( ^( T_ORDER ( ordering_term )+ ) )?
                        if (stream_ordering_term.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:21: ^( T_ORDER ( ordering_term )+ )
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ORDER, "T_ORDER"), root_2);
                                if (!(stream_ordering_term.hasNext())) {
                                    throw new RewriteEarlyExitException();
                                }
                                while (stream_ordering_term.hasNext()) {
                                    adaptor.addChild(root_2, stream_ordering_term.nextTree());
                                }
                                stream_ordering_term.reset();

                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ordering_term.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:48: ( ^( T_LIMIT $limit) )?
                        if (stream_limit.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:48: ^( T_LIMIT $limit)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_LIMIT, "T_LIMIT"), root_2);
                                adaptor.addChild(root_2, stream_limit.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:67: ( ^( T_OFFSET $offset) )?
                        if (stream_offset.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:146:67: ^( T_OFFSET $offset)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OFFSET, "T_OFFSET"), root_2);
                                adaptor.addChild(root_2, stream_offset.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_offset.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_stmt"


    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "select_core"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:150:1: select_core : SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )? -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? ) ;
    public final CqlParser.select_core_return select_core() throws RecognitionException {
        CqlParser.select_core_return retval = new CqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token src = null;
        Token SELECT42 = null;
        Token COMMA44 = null;
        Token FROM46 = null;
        ParserRuleReturnScope result_field43 = null;
        ParserRuleReturnScope result_field45 = null;
        ParserRuleReturnScope where_clause47 = null;

        Object src_tree = null;
        Object SELECT42_tree = null;
        Object COMMA44_tree = null;
        Object FROM46_tree = null;
        RewriteRuleTokenStream stream_FROM = new RewriteRuleTokenStream(adaptor, "token FROM");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
        RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(adaptor, "token COMMA");
        RewriteRuleTokenStream stream_SELECT = new RewriteRuleTokenStream(adaptor, "token SELECT");
        RewriteRuleSubtreeStream stream_where_clause = new RewriteRuleSubtreeStream(adaptor, "rule where_clause");
        RewriteRuleSubtreeStream stream_result_field = new RewriteRuleSubtreeStream(adaptor, "rule result_field");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:5: ( SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )? -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? ) )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:7: SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )?
            {
                SELECT42 = (Token) match(input, SELECT, FOLLOW_SELECT_in_select_core1055);
                stream_SELECT.add(SELECT42);

                pushFollow(FOLLOW_result_field_in_select_core1057);
                result_field43 = result_field();
                state._fsp--;

                stream_result_field.add(result_field43.getTree());
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:27: ( COMMA result_field )*
                loop17:
                while (true) {
                    int alt17 = 2;
                    int LA17_0 = input.LA(1);
                    if ((LA17_0 == COMMA)) {
                        alt17 = 1;
                    }

                    switch (alt17) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:28: COMMA result_field
                        {
                            COMMA44 = (Token) match(input, COMMA, FOLLOW_COMMA_in_select_core1060);
                            stream_COMMA.add(COMMA44);

                            pushFollow(FOLLOW_result_field_in_select_core1062);
                            result_field45 = result_field();
                            state._fsp--;

                            stream_result_field.add(result_field45.getTree());
                        }
                        break;

                        default:
                            break loop17;
                    }
                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:49: ( FROM src= ID )?
                int alt18 = 2;
                int LA18_0 = input.LA(1);
                if ((LA18_0 == FROM)) {
                    alt18 = 1;
                }
                switch (alt18) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:50: FROM src= ID
                    {
                        FROM46 = (Token) match(input, FROM, FOLLOW_FROM_in_select_core1067);
                        stream_FROM.add(FROM46);

                        src = (Token) match(input, ID, FOLLOW_ID_in_select_core1071);
                        stream_ID.add(src);

                    }
                    break;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:64: ( where_clause )?
                int alt19 = 2;
                int LA19_0 = input.LA(1);
                if ((LA19_0 == NWHERE || LA19_0 == WHERE)) {
                    alt19 = 1;
                }
                switch (alt19) {
                    case 1:
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:151:64: where_clause
                    {
                        pushFollow(FOLLOW_where_clause_in_select_core1075);
                        where_clause47 = where_clause();
                        state._fsp--;

                        stream_where_clause.add(where_clause47.getTree());
                    }
                    break;

                }

                // AST REWRITE
                // elements: where_clause, result_field, src
                // token labels: src
                // rule labels: retval
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                RewriteRuleTokenStream stream_src = new RewriteRuleTokenStream(adaptor, "token src", src);
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                root_0 = (Object) adaptor.nil();
                // 152:7: -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? )
                {
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:152:10: ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_SELECT, "T_SELECT"), root_1);
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:153:18: ^( T_FIELDS ( result_field )+ )
                        {
                            Object root_2 = (Object) adaptor.nil();
                            root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_FIELDS, "T_FIELDS"), root_2);
                            if (!(stream_result_field.hasNext())) {
                                throw new RewriteEarlyExitException();
                            }
                            while (stream_result_field.hasNext()) {
                                adaptor.addChild(root_2, stream_result_field.nextTree());
                            }
                            stream_result_field.reset();

                            adaptor.addChild(root_1, root_2);
                        }

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:153:44: ( ^( T_FROM $src) )?
                        if (stream_src.hasNext()) {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:153:44: ^( T_FROM $src)
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_FROM, "T_FROM"), root_2);
                                adaptor.addChild(root_2, stream_src.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_src.reset();

                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:153:60: ( where_clause )?
                        if (stream_where_clause.hasNext()) {
                            adaptor.addChild(root_1, stream_where_clause.nextTree());
                        }
                        stream_where_clause.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }


                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_core"


    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_clause"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:157:1: where_clause : ( WHERE where_expr= where_expression -> ^( T_WHERE where_expression ) | NWHERE STRING -> ^( T_NWHERE STRING ) );
    public final CqlParser.where_clause_return where_clause() throws RecognitionException {
        CqlParser.where_clause_return retval = new CqlParser.where_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE48 = null;
        Token NWHERE49 = null;
        Token STRING50 = null;
        ParserRuleReturnScope where_expr = null;

        Object WHERE48_tree = null;
        Object NWHERE49_tree = null;
        Object STRING50_tree = null;
        RewriteRuleTokenStream stream_NWHERE = new RewriteRuleTokenStream(adaptor, "token NWHERE");
        RewriteRuleTokenStream stream_WHERE = new RewriteRuleTokenStream(adaptor, "token WHERE");
        RewriteRuleTokenStream stream_STRING = new RewriteRuleTokenStream(adaptor, "token STRING");
        RewriteRuleSubtreeStream stream_where_expression = new RewriteRuleSubtreeStream(adaptor, "rule where_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:158:5: ( WHERE where_expr= where_expression -> ^( T_WHERE where_expression ) | NWHERE STRING -> ^( T_NWHERE STRING ) )
            int alt20 = 2;
            int LA20_0 = input.LA(1);
            if ((LA20_0 == WHERE)) {
                alt20 = 1;
            } else if ((LA20_0 == NWHERE)) {
                alt20 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 20, 0, input);
                throw nvae;
            }

            switch (alt20) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:158:7: WHERE where_expr= where_expression
                {
                    WHERE48 = (Token) match(input, WHERE, FOLLOW_WHERE_in_where_clause1139);
                    stream_WHERE.add(WHERE48);

                    pushFollow(FOLLOW_where_expression_in_where_clause1143);
                    where_expr = where_expression();
                    state._fsp--;

                    stream_where_expression.add(where_expr.getTree());
                    // AST REWRITE
                    // elements: where_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 159:7: -> ^( T_WHERE where_expression )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:159:10: ^( T_WHERE where_expression )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_WHERE, "T_WHERE"), root_1);
                            adaptor.addChild(root_1, stream_where_expression.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:160:7: NWHERE STRING
                {
                    NWHERE49 = (Token) match(input, NWHERE, FOLLOW_NWHERE_in_where_clause1165);
                    stream_NWHERE.add(NWHERE49);

                    STRING50 = (Token) match(input, STRING, FOLLOW_STRING_in_where_clause1167);
                    stream_STRING.add(STRING50);

                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 161:7: -> ^( T_NWHERE STRING )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:161:10: ^( T_NWHERE STRING )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_NWHERE, "T_NWHERE"), root_1);
                            adaptor.addChild(root_1, stream_STRING.nextNode());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_clause"


    public static class result_field_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "result_field"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:164:1: result_field : ( expression ( ( AS )? field_alias= ID )? -> ^( T_FIELD_ALIAS expression ( $field_alias)? ) |func= SUM LPAREN field_name= ID RPAREN ( AS field_alias= ID )? -> ^( T_SUM T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= COUNT LPAREN field_name= ( ID | ASTERISK ) RPAREN ( AS field_alias= ID )? -> ^( T_COUNT T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= MAX LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_MAX T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= MIN LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_MIN T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= AVG LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_AVG T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) );
    public final CqlParser.result_field_return result_field() throws RecognitionException {
        CqlParser.result_field_return retval = new CqlParser.result_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token field_alias = null;
        Token func = null;
        Token field_name = null;
        Token AS52 = null;
        Token LPAREN53 = null;
        Token RPAREN54 = null;
        Token AS55 = null;
        Token LPAREN56 = null;
        Token RPAREN57 = null;
        Token AS58 = null;
        Token LPAREN59 = null;
        Token RPAREN60 = null;
        Token AS61 = null;
        Token LPAREN62 = null;
        Token RPAREN63 = null;
        Token AS64 = null;
        Token LPAREN65 = null;
        Token RPAREN66 = null;
        Token AS67 = null;
        ParserRuleReturnScope expression51 = null;

        Object field_alias_tree = null;
        Object func_tree = null;
        Object field_name_tree = null;
        Object AS52_tree = null;
        Object LPAREN53_tree = null;
        Object RPAREN54_tree = null;
        Object AS55_tree = null;
        Object LPAREN56_tree = null;
        Object RPAREN57_tree = null;
        Object AS58_tree = null;
        Object LPAREN59_tree = null;
        Object RPAREN60_tree = null;
        Object AS61_tree = null;
        Object LPAREN62_tree = null;
        Object RPAREN63_tree = null;
        Object AS64_tree = null;
        Object LPAREN65_tree = null;
        Object RPAREN66_tree = null;
        Object AS67_tree = null;
        RewriteRuleTokenStream stream_MAX = new RewriteRuleTokenStream(adaptor, "token MAX");
        RewriteRuleTokenStream stream_AS = new RewriteRuleTokenStream(adaptor, "token AS");
        RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(adaptor, "token RPAREN");
        RewriteRuleTokenStream stream_COUNT = new RewriteRuleTokenStream(adaptor, "token COUNT");
        RewriteRuleTokenStream stream_MIN = new RewriteRuleTokenStream(adaptor, "token MIN");
        RewriteRuleTokenStream stream_SUM = new RewriteRuleTokenStream(adaptor, "token SUM");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
        RewriteRuleTokenStream stream_AVG = new RewriteRuleTokenStream(adaptor, "token AVG");
        RewriteRuleTokenStream stream_ASTERISK = new RewriteRuleTokenStream(adaptor, "token ASTERISK");
        RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(adaptor, "token LPAREN");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(adaptor, "rule expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:5: ( expression ( ( AS )? field_alias= ID )? -> ^( T_FIELD_ALIAS expression ( $field_alias)? ) |func= SUM LPAREN field_name= ID RPAREN ( AS field_alias= ID )? -> ^( T_SUM T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= COUNT LPAREN field_name= ( ID | ASTERISK ) RPAREN ( AS field_alias= ID )? -> ^( T_COUNT T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= MAX LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_MAX T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= MIN LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_MIN T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) |func= AVG LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )? -> ^( T_AVG T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? ) )
            int alt29 = 6;
            switch (input.LA(1)) {
                case ASTERISK:
                case FALSE:
                case FLOAT:
                case ID:
                case INTEGER:
                case LPAREN:
                case LSBRACKET:
                case MINUS:
                case NULL:
                case PLUS:
                case STRING:
                case TRUE: {
                    alt29 = 1;
                }
                break;
                case SUM: {
                    alt29 = 2;
                }
                break;
                case COUNT: {
                    alt29 = 3;
                }
                break;
                case MAX: {
                    alt29 = 4;
                }
                break;
                case MIN: {
                    alt29 = 5;
                }
                break;
                case AVG: {
                    alt29 = 6;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);
                    throw nvae;
            }
            switch (alt29) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:7: expression ( ( AS )? field_alias= ID )?
                {
                    pushFollow(FOLLOW_expression_in_result_field1198);
                    expression51 = expression();
                    state._fsp--;

                    stream_expression.add(expression51.getTree());
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:18: ( ( AS )? field_alias= ID )?
                    int alt22 = 2;
                    int LA22_0 = input.LA(1);
                    if ((LA22_0 == AS || LA22_0 == ID)) {
                        alt22 = 1;
                    }
                    switch (alt22) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:19: ( AS )? field_alias= ID
                        {
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:19: ( AS )?
                            int alt21 = 2;
                            int LA21_0 = input.LA(1);
                            if ((LA21_0 == AS)) {
                                alt21 = 1;
                            }
                            switch (alt21) {
                                case 1:
                                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:165:19: AS
                                {
                                    AS52 = (Token) match(input, AS, FOLLOW_AS_in_result_field1201);
                                    stream_AS.add(AS52);

                                }
                                break;

                            }

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1206);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: expression, field_alias
                    // token labels: field_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 166:7: -> ^( T_FIELD_ALIAS expression ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:166:10: ^( T_FIELD_ALIAS expression ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"), root_1);
                            adaptor.addChild(root_1, stream_expression.nextTree());
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:166:38: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:167:7: func= SUM LPAREN field_name= ID RPAREN ( AS field_alias= ID )?
                {
                    func = (Token) match(input, SUM, FOLLOW_SUM_in_result_field1236);
                    stream_SUM.add(func);

                    LPAREN53 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_result_field1238);
                    stream_LPAREN.add(LPAREN53);

                    field_name = (Token) match(input, ID, FOLLOW_ID_in_result_field1242);
                    stream_ID.add(field_name);

                    RPAREN54 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_result_field1244);
                    stream_RPAREN.add(RPAREN54);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:167:44: ( AS field_alias= ID )?
                    int alt23 = 2;
                    int LA23_0 = input.LA(1);
                    if ((LA23_0 == AS)) {
                        alt23 = 1;
                    }
                    switch (alt23) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:167:45: AS field_alias= ID
                        {
                            AS55 = (Token) match(input, AS, FOLLOW_AS_in_result_field1247);
                            stream_AS.add(AS55);

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1251);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: func, field_alias, field_name
                    // token labels: field_name, field_alias, func
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_name = new RewriteRuleTokenStream(adaptor, "token field_name", field_name);
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleTokenStream stream_func = new RewriteRuleTokenStream(adaptor, "token func", func);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 168:7: -> ^( T_SUM T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:168:9: ^( T_SUM T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_SUM, "T_SUM"), root_1);
                            adaptor.addChild(root_1, (Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"));
                            adaptor.addChild(root_1, stream_func.nextNode());
                            adaptor.addChild(root_1, stream_field_name.nextNode());
                            adaptor.addChild(root_1, (Object) adaptor.create(T_AS, "T_AS"));
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:168:55: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:7: func= COUNT LPAREN field_name= ( ID | ASTERISK ) RPAREN ( AS field_alias= ID )?
                {
                    func = (Token) match(input, COUNT, FOLLOW_COUNT_in_result_field1288);
                    stream_COUNT.add(func);

                    LPAREN56 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_result_field1290);
                    stream_LPAREN.add(LPAREN56);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:36: ( ID | ASTERISK )
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);
                    if ((LA24_0 == ID)) {
                        alt24 = 1;
                    } else if ((LA24_0 == ASTERISK)) {
                        alt24 = 2;
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("", 24, 0, input);
                        throw nvae;
                    }

                    switch (alt24) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:37: ID
                        {
                            field_name = (Token) match(input, ID, FOLLOW_ID_in_result_field1295);
                            stream_ID.add(field_name);

                        }
                        break;
                        case 2:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:40: ASTERISK
                        {
                            field_name = (Token) match(input, ASTERISK, FOLLOW_ASTERISK_in_result_field1297);
                            stream_ASTERISK.add(field_name);

                        }
                        break;

                    }

                    RPAREN57 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_result_field1300);
                    stream_RPAREN.add(RPAREN57);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:57: ( AS field_alias= ID )?
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);
                    if ((LA25_0 == AS)) {
                        alt25 = 1;
                    }
                    switch (alt25) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:169:58: AS field_alias= ID
                        {
                            AS58 = (Token) match(input, AS, FOLLOW_AS_in_result_field1303);
                            stream_AS.add(AS58);

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1307);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: field_name, field_alias, func
                    // token labels: field_name, field_alias, func
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_name = new RewriteRuleTokenStream(adaptor, "token field_name", field_name);
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleTokenStream stream_func = new RewriteRuleTokenStream(adaptor, "token func", func);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 170:7: -> ^( T_COUNT T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:170:9: ^( T_COUNT T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_COUNT, "T_COUNT"), root_1);
                            adaptor.addChild(root_1, (Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"));
                            adaptor.addChild(root_1, stream_func.nextNode());
                            adaptor.addChild(root_1, stream_field_name.nextNode());
                            adaptor.addChild(root_1, (Object) adaptor.create(T_AS, "T_AS"));
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:170:57: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 4:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:171:7: func= MAX LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )?
                {
                    func = (Token) match(input, MAX, FOLLOW_MAX_in_result_field1344);
                    stream_MAX.add(func);

                    LPAREN59 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_result_field1346);
                    stream_LPAREN.add(LPAREN59);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:171:34: ( ID )
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:171:35: ID
                    {
                        field_name = (Token) match(input, ID, FOLLOW_ID_in_result_field1351);
                        stream_ID.add(field_name);

                    }

                    RPAREN60 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_result_field1354);
                    stream_RPAREN.add(RPAREN60);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:171:46: ( AS field_alias= ID )?
                    int alt26 = 2;
                    int LA26_0 = input.LA(1);
                    if ((LA26_0 == AS)) {
                        alt26 = 1;
                    }
                    switch (alt26) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:171:47: AS field_alias= ID
                        {
                            AS61 = (Token) match(input, AS, FOLLOW_AS_in_result_field1357);
                            stream_AS.add(AS61);

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1361);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: field_alias, func, field_name
                    // token labels: field_name, field_alias, func
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_name = new RewriteRuleTokenStream(adaptor, "token field_name", field_name);
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleTokenStream stream_func = new RewriteRuleTokenStream(adaptor, "token func", func);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 172:7: -> ^( T_MAX T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:172:9: ^( T_MAX T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_MAX, "T_MAX"), root_1);
                            adaptor.addChild(root_1, (Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"));
                            adaptor.addChild(root_1, stream_func.nextNode());
                            adaptor.addChild(root_1, stream_field_name.nextNode());
                            adaptor.addChild(root_1, (Object) adaptor.create(T_AS, "T_AS"));
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:172:55: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 5:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:173:7: func= MIN LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )?
                {
                    func = (Token) match(input, MIN, FOLLOW_MIN_in_result_field1398);
                    stream_MIN.add(func);

                    LPAREN62 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_result_field1400);
                    stream_LPAREN.add(LPAREN62);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:173:34: ( ID )
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:173:35: ID
                    {
                        field_name = (Token) match(input, ID, FOLLOW_ID_in_result_field1405);
                        stream_ID.add(field_name);

                    }

                    RPAREN63 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_result_field1408);
                    stream_RPAREN.add(RPAREN63);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:173:46: ( AS field_alias= ID )?
                    int alt27 = 2;
                    int LA27_0 = input.LA(1);
                    if ((LA27_0 == AS)) {
                        alt27 = 1;
                    }
                    switch (alt27) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:173:47: AS field_alias= ID
                        {
                            AS64 = (Token) match(input, AS, FOLLOW_AS_in_result_field1411);
                            stream_AS.add(AS64);

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1415);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: field_alias, func, field_name
                    // token labels: field_name, field_alias, func
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_name = new RewriteRuleTokenStream(adaptor, "token field_name", field_name);
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleTokenStream stream_func = new RewriteRuleTokenStream(adaptor, "token func", func);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 174:7: -> ^( T_MIN T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:174:9: ^( T_MIN T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_MIN, "T_MIN"), root_1);
                            adaptor.addChild(root_1, (Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"));
                            adaptor.addChild(root_1, stream_func.nextNode());
                            adaptor.addChild(root_1, stream_field_name.nextNode());
                            adaptor.addChild(root_1, (Object) adaptor.create(T_AS, "T_AS"));
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:174:55: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 6:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:175:7: func= AVG LPAREN field_name= ( ID ) RPAREN ( AS field_alias= ID )?
                {
                    func = (Token) match(input, AVG, FOLLOW_AVG_in_result_field1452);
                    stream_AVG.add(func);

                    LPAREN65 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_result_field1454);
                    stream_LPAREN.add(LPAREN65);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:175:34: ( ID )
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:175:35: ID
                    {
                        field_name = (Token) match(input, ID, FOLLOW_ID_in_result_field1459);
                        stream_ID.add(field_name);

                    }

                    RPAREN66 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_result_field1462);
                    stream_RPAREN.add(RPAREN66);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:175:46: ( AS field_alias= ID )?
                    int alt28 = 2;
                    int LA28_0 = input.LA(1);
                    if ((LA28_0 == AS)) {
                        alt28 = 1;
                    }
                    switch (alt28) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:175:47: AS field_alias= ID
                        {
                            AS67 = (Token) match(input, AS, FOLLOW_AS_in_result_field1465);
                            stream_AS.add(AS67);

                            field_alias = (Token) match(input, ID, FOLLOW_ID_in_result_field1469);
                            stream_ID.add(field_alias);

                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: func, field_name, field_alias
                    // token labels: field_name, field_alias, func
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_field_name = new RewriteRuleTokenStream(adaptor, "token field_name", field_name);
                    RewriteRuleTokenStream stream_field_alias = new RewriteRuleTokenStream(adaptor, "token field_alias", field_alias);
                    RewriteRuleTokenStream stream_func = new RewriteRuleTokenStream(adaptor, "token func", func);
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 176:7: -> ^( T_AVG T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:176:9: ^( T_AVG T_FIELD_ALIAS $func $field_name T_AS ( $field_alias)? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_AVG, "T_AVG"), root_1);
                            adaptor.addChild(root_1, (Object) adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"));
                            adaptor.addChild(root_1, stream_func.nextNode());
                            adaptor.addChild(root_1, stream_field_name.nextNode());
                            adaptor.addChild(root_1, (Object) adaptor.create(T_AS, "T_AS"));
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:176:55: ( $field_alias)?
                            if (stream_field_alias.hasNext()) {
                                adaptor.addChild(root_1, stream_field_alias.nextNode());
                            }
                            stream_field_alias.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "result_field"


    public static class where_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:179:1: where_expression : (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )* ;
    public final CqlParser.where_expression_return where_expression() throws RecognitionException {
        CqlParser.where_expression_return retval = new CqlParser.where_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR68 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object OR68_tree = null;
        RewriteRuleTokenStream stream_OR = new RewriteRuleTokenStream(adaptor, "token OR");
        RewriteRuleSubtreeStream stream_where_and_expression = new RewriteRuleSubtreeStream(adaptor, "rule where_and_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:180:5: ( (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:180:7: (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:180:7: (expr1= where_and_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:180:8: expr1= where_and_expression
                {
                    pushFollow(FOLLOW_where_and_expression_in_where_expression1516);
                    expr1 = where_and_expression();
                    state._fsp--;

                    stream_where_and_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 180:35: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:181:7: ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )*
                loop30:
                while (true) {
                    int alt30 = 2;
                    int LA30_0 = input.LA(1);
                    if ((LA30_0 == OR)) {
                        alt30 = 1;
                    }

                    switch (alt30) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:181:8: OR expr2= where_and_expression
                        {
                            OR68 = (Token) match(input, OR, FOLLOW_OR_in_where_expression1531);
                            stream_OR.add(OR68);

                            pushFollow(FOLLOW_where_and_expression_in_where_expression1535);
                            expr2 = where_and_expression();
                            state._fsp--;

                            stream_where_and_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: expr2, where_expression
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 181:38: -> ^( T_OPERATOR_OR $where_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:181:41: ^( T_OPERATOR_OR $where_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_OR, "T_OPERATOR_OR"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop30;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_expression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:184:1: expression : (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )* ;
    public final CqlParser.expression_return expression() throws RecognitionException {
        CqlParser.expression_return retval = new CqlParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR69 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object OR69_tree = null;
        RewriteRuleTokenStream stream_OR = new RewriteRuleTokenStream(adaptor, "token OR");
        RewriteRuleSubtreeStream stream_and_expression = new RewriteRuleSubtreeStream(adaptor, "rule and_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:185:5: ( (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:185:7: (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:185:7: (expr1= and_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:185:8: expr1= and_expression
                {
                    pushFollow(FOLLOW_and_expression_in_expression1569);
                    expr1 = and_expression();
                    state._fsp--;

                    stream_and_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 185:29: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:186:7: ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )*
                loop31:
                while (true) {
                    int alt31 = 2;
                    int LA31_0 = input.LA(1);
                    if ((LA31_0 == OR)) {
                        alt31 = 1;
                    }

                    switch (alt31) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:186:8: OR expr2= and_expression
                        {
                            OR69 = (Token) match(input, OR, FOLLOW_OR_in_expression1584);
                            stream_OR.add(OR69);

                            pushFollow(FOLLOW_and_expression_in_expression1588);
                            expr2 = and_expression();
                            state._fsp--;

                            stream_and_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: expr2, expression
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 186:32: -> ^( T_OPERATOR_OR $expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:186:35: ^( T_OPERATOR_OR $expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_OR, "T_OPERATOR_OR"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop31;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class where_and_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_and_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:189:1: where_and_expression : (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )* ;
    public final CqlParser.where_and_expression_return where_and_expression() throws RecognitionException {
        CqlParser.where_and_expression_return retval = new CqlParser.where_and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND70 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object AND70_tree = null;
        RewriteRuleTokenStream stream_AND = new RewriteRuleTokenStream(adaptor, "token AND");
        RewriteRuleSubtreeStream stream_where_not_expression = new RewriteRuleSubtreeStream(adaptor, "rule where_not_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:190:5: ( (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:190:7: (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:190:7: (expr1= where_not_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:190:8: expr1= where_not_expression
                {
                    pushFollow(FOLLOW_where_not_expression_in_where_and_expression1622);
                    expr1 = where_not_expression();
                    state._fsp--;

                    stream_where_not_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 190:35: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:191:7: ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )*
                loop32:
                while (true) {
                    int alt32 = 2;
                    int LA32_0 = input.LA(1);
                    if ((LA32_0 == AND)) {
                        alt32 = 1;
                    }

                    switch (alt32) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:191:8: AND expr2= where_not_expression
                        {
                            AND70 = (Token) match(input, AND, FOLLOW_AND_in_where_and_expression1637);
                            stream_AND.add(AND70);

                            pushFollow(FOLLOW_where_not_expression_in_where_and_expression1641);
                            expr2 = where_not_expression();
                            state._fsp--;

                            stream_where_not_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: where_and_expression, expr2
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 191:39: -> ^( T_OPERATOR_AND $where_and_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:191:42: ^( T_OPERATOR_AND $where_and_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_AND, "T_OPERATOR_AND"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop32;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_and_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "and_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:194:1: and_expression : (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )* ;
    public final CqlParser.and_expression_return and_expression() throws RecognitionException {
        CqlParser.and_expression_return retval = new CqlParser.and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND71 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object AND71_tree = null;
        RewriteRuleTokenStream stream_AND = new RewriteRuleTokenStream(adaptor, "token AND");
        RewriteRuleSubtreeStream stream_not_expression = new RewriteRuleSubtreeStream(adaptor, "rule not_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:195:5: ( (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:195:7: (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:195:7: (expr1= not_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:195:8: expr1= not_expression
                {
                    pushFollow(FOLLOW_not_expression_in_and_expression1675);
                    expr1 = not_expression();
                    state._fsp--;

                    stream_not_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 195:29: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:196:7: ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )*
                loop33:
                while (true) {
                    int alt33 = 2;
                    int LA33_0 = input.LA(1);
                    if ((LA33_0 == AND)) {
                        alt33 = 1;
                    }

                    switch (alt33) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:196:8: AND expr2= not_expression
                        {
                            AND71 = (Token) match(input, AND, FOLLOW_AND_in_and_expression1690);
                            stream_AND.add(AND71);

                            pushFollow(FOLLOW_not_expression_in_and_expression1694);
                            expr2 = not_expression();
                            state._fsp--;

                            stream_not_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: and_expression, expr2
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 196:33: -> ^( T_OPERATOR_AND $and_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:196:36: ^( T_OPERATOR_AND $and_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_AND, "T_OPERATOR_AND"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop33;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class where_not_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_not_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:199:1: where_not_expression : (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )* ;
    public final CqlParser.where_not_expression_return where_not_expression() throws RecognitionException {
        CqlParser.where_not_expression_return retval = new CqlParser.where_not_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT72 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object NOT72_tree = null;
        RewriteRuleTokenStream stream_NOT = new RewriteRuleTokenStream(adaptor, "token NOT");
        RewriteRuleSubtreeStream stream_where_cmp_expression = new RewriteRuleSubtreeStream(adaptor, "rule where_cmp_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:200:5: ( (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:200:7: (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:200:7: (expr1= where_cmp_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:200:8: expr1= where_cmp_expression
                {
                    pushFollow(FOLLOW_where_cmp_expression_in_where_not_expression1728);
                    expr1 = where_cmp_expression();
                    state._fsp--;

                    stream_where_cmp_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 200:35: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:201:7: ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )*
                loop34:
                while (true) {
                    int alt34 = 2;
                    int LA34_0 = input.LA(1);
                    if ((LA34_0 == NOT)) {
                        alt34 = 1;
                    }

                    switch (alt34) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:201:8: NOT expr2= where_cmp_expression
                        {
                            NOT72 = (Token) match(input, NOT, FOLLOW_NOT_in_where_not_expression1743);
                            stream_NOT.add(NOT72);

                            pushFollow(FOLLOW_where_cmp_expression_in_where_not_expression1747);
                            expr2 = where_cmp_expression();
                            state._fsp--;

                            stream_where_cmp_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: expr2, where_not_expression
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 201:39: -> ^( T_OPERATOR_NOT $where_not_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:201:42: ^( T_OPERATOR_NOT $where_not_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_NOT, "T_OPERATOR_NOT"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop34;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_not_expression"


    public static class not_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "not_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:204:1: not_expression : (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )* ;
    public final CqlParser.not_expression_return not_expression() throws RecognitionException {
        CqlParser.not_expression_return retval = new CqlParser.not_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT73 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;

        Object NOT73_tree = null;
        RewriteRuleTokenStream stream_NOT = new RewriteRuleTokenStream(adaptor, "token NOT");
        RewriteRuleSubtreeStream stream_cmp_expression = new RewriteRuleSubtreeStream(adaptor, "rule cmp_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:205:5: ( (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:205:7: (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:205:7: (expr1= cmp_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:205:8: expr1= cmp_expression
                {
                    pushFollow(FOLLOW_cmp_expression_in_not_expression1781);
                    expr1 = cmp_expression();
                    state._fsp--;

                    stream_cmp_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 205:29: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:206:7: ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )*
                loop35:
                while (true) {
                    int alt35 = 2;
                    int LA35_0 = input.LA(1);
                    if ((LA35_0 == NOT)) {
                        alt35 = 1;
                    }

                    switch (alt35) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:206:8: NOT expr2= cmp_expression
                        {
                            NOT73 = (Token) match(input, NOT, FOLLOW_NOT_in_not_expression1796);
                            stream_NOT.add(NOT73);

                            pushFollow(FOLLOW_cmp_expression_in_not_expression1800);
                            expr2 = cmp_expression();
                            state._fsp--;

                            stream_cmp_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: expr2, not_expression
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 206:33: -> ^( T_OPERATOR_NOT $not_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:206:36: ^( T_OPERATOR_NOT $not_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_NOT, "T_OPERATOR_NOT"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop35;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "not_expression"


    public static class where_cmp_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_cmp_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:209:1: where_cmp_expression : (expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression -> ^( where_cmp_operator $expr1 $expr2) | LPAREN ! where_expression RPAREN !);
    public final CqlParser.where_cmp_expression_return where_cmp_expression() throws RecognitionException {
        CqlParser.where_cmp_expression_return retval = new CqlParser.where_cmp_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN75 = null;
        Token RPAREN77 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;
        ParserRuleReturnScope where_cmp_operator74 = null;
        ParserRuleReturnScope where_expression76 = null;

        Object LPAREN75_tree = null;
        Object RPAREN77_tree = null;
        RewriteRuleSubtreeStream stream_where_cmp_operator = new RewriteRuleSubtreeStream(adaptor, "rule where_cmp_operator");
        RewriteRuleSubtreeStream stream_where_unary_expression = new RewriteRuleSubtreeStream(adaptor, "rule where_unary_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:210:5: (expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression -> ^( where_cmp_operator $expr1 $expr2) | LPAREN ! where_expression RPAREN !)
            int alt36 = 2;
            int LA36_0 = input.LA(1);
            if ((LA36_0 == ASTERISK || (LA36_0 >= FALSE && LA36_0 <= FLOAT) || LA36_0 == ID || LA36_0 == INTEGER || LA36_0 == MINUS || LA36_0 == NULL || LA36_0 == PLUS || LA36_0 == STRING || LA36_0 == TRUE)) {
                alt36 = 1;
            } else if ((LA36_0 == LPAREN)) {
                alt36 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 36, 0, input);
                throw nvae;
            }

            switch (alt36) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:210:7: expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression
                {
                    pushFollow(FOLLOW_where_unary_expression_in_where_cmp_expression1833);
                    expr1 = where_unary_expression();
                    state._fsp--;

                    stream_where_unary_expression.add(expr1.getTree());
                    pushFollow(FOLLOW_where_cmp_operator_in_where_cmp_expression1835);
                    where_cmp_operator74 = where_cmp_operator();
                    state._fsp--;

                    stream_where_cmp_operator.add(where_cmp_operator74.getTree());
                    pushFollow(FOLLOW_where_unary_expression_in_where_cmp_expression1839);
                    expr2 = where_unary_expression();
                    state._fsp--;

                    stream_where_unary_expression.add(expr2.getTree());
                    // AST REWRITE
                    // elements: expr2, where_cmp_operator, expr1
                    // token labels: 
                    // rule labels: retval, expr1, expr2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 211:7: -> ^( where_cmp_operator $expr1 $expr2)
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:211:10: ^( where_cmp_operator $expr1 $expr2)
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(stream_where_cmp_operator.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_expr1.nextTree());
                            adaptor.addChild(root_1, stream_expr2.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:212:7: LPAREN ! where_expression RPAREN !
                {
                    root_0 = (Object) adaptor.nil();


                    LPAREN75 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_where_cmp_expression1865);
                    pushFollow(FOLLOW_where_expression_in_where_cmp_expression1868);
                    where_expression76 = where_expression();
                    state._fsp--;

                    adaptor.addChild(root_0, where_expression76.getTree());

                    RPAREN77 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_where_cmp_expression1870);
                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_cmp_expression"


    public static class cmp_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "cmp_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:215:1: cmp_expression : (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )* ;
    public final CqlParser.cmp_expression_return cmp_expression() throws RecognitionException {
        CqlParser.cmp_expression_return retval = new CqlParser.cmp_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;
        ParserRuleReturnScope cmp_operator78 = null;

        RewriteRuleSubtreeStream stream_add_expression = new RewriteRuleSubtreeStream(adaptor, "rule add_expression");
        RewriteRuleSubtreeStream stream_cmp_operator = new RewriteRuleSubtreeStream(adaptor, "rule cmp_operator");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:216:5: ( (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:216:7: (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:216:7: (expr1= add_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:216:8: expr1= add_expression
                {
                    pushFollow(FOLLOW_add_expression_in_cmp_expression1891);
                    expr1 = add_expression();
                    state._fsp--;

                    stream_add_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 216:29: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:217:7: ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )*
                loop37:
                while (true) {
                    int alt37 = 2;
                    int LA37_0 = input.LA(1);
                    if ((LA37_0 == EQUAL_TO_SINGLE || (LA37_0 >= GREATER_THAN && LA37_0 <= GREATER_THAN_OR_EQUAL_TO) || (LA37_0 >= LESS_THAN && LA37_0 <= LESS_THAN_OR_EQUAL_TO) || LA37_0 == NOT_EQUAL_TO_SINGLE)) {
                        alt37 = 1;
                    }

                    switch (alt37) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:217:8: cmp_operator expr2= add_expression
                        {
                            pushFollow(FOLLOW_cmp_operator_in_cmp_expression1906);
                            cmp_operator78 = cmp_operator();
                            state._fsp--;

                            stream_cmp_operator.add(cmp_operator78.getTree());
                            pushFollow(FOLLOW_add_expression_in_cmp_expression1910);
                            expr2 = add_expression();
                            state._fsp--;

                            stream_add_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: cmp_expression, expr2, cmp_operator
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 217:42: -> ^( cmp_operator $cmp_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:217:45: ^( cmp_operator $cmp_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot(stream_cmp_operator.nextNode(), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop37;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmp_expression"


    public static class where_cmp_operator_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_cmp_operator"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:220:1: where_cmp_operator : ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE -> T_OPERATOR_EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO );
    public final CqlParser.where_cmp_operator_return where_cmp_operator() throws RecognitionException {
        CqlParser.where_cmp_operator_return retval = new CqlParser.where_cmp_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL_TO_SINGLE79 = null;
        Token EQUAL_TO_DOUBLE80 = null;
        Token NOT_EQUAL_TO_SINGLE81 = null;
        Token NOT_EQUAL_TO_DOUBLE82 = null;
        Token LESS_THAN83 = null;
        Token LESS_THAN_OR_EQUAL_TO84 = null;
        Token GREATER_THAN85 = null;
        Token GREATER_THAN_OR_EQUAL_TO86 = null;

        Object EQUAL_TO_SINGLE79_tree = null;
        Object EQUAL_TO_DOUBLE80_tree = null;
        Object NOT_EQUAL_TO_SINGLE81_tree = null;
        Object NOT_EQUAL_TO_DOUBLE82_tree = null;
        Object LESS_THAN83_tree = null;
        Object LESS_THAN_OR_EQUAL_TO84_tree = null;
        Object GREATER_THAN85_tree = null;
        Object GREATER_THAN_OR_EQUAL_TO86_tree = null;
        RewriteRuleTokenStream stream_EQUAL_TO_SINGLE = new RewriteRuleTokenStream(adaptor, "token EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_LESS_THAN_OR_EQUAL_TO = new RewriteRuleTokenStream(adaptor, "token LESS_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_DOUBLE = new RewriteRuleTokenStream(adaptor, "token NOT_EQUAL_TO_DOUBLE");
        RewriteRuleTokenStream stream_GREATER_THAN = new RewriteRuleTokenStream(adaptor, "token GREATER_THAN");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_SINGLE = new RewriteRuleTokenStream(adaptor, "token NOT_EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_GREATER_THAN_OR_EQUAL_TO = new RewriteRuleTokenStream(adaptor, "token GREATER_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_LESS_THAN = new RewriteRuleTokenStream(adaptor, "token LESS_THAN");
        RewriteRuleTokenStream stream_EQUAL_TO_DOUBLE = new RewriteRuleTokenStream(adaptor, "token EQUAL_TO_DOUBLE");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:221:5: ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE -> T_OPERATOR_EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO )
            int alt38 = 8;
            switch (input.LA(1)) {
                case EQUAL_TO_SINGLE: {
                    alt38 = 1;
                }
                break;
                case EQUAL_TO_DOUBLE: {
                    alt38 = 2;
                }
                break;
                case NOT_EQUAL_TO_SINGLE: {
                    alt38 = 3;
                }
                break;
                case NOT_EQUAL_TO_DOUBLE: {
                    alt38 = 4;
                }
                break;
                case LESS_THAN: {
                    alt38 = 5;
                }
                break;
                case LESS_THAN_OR_EQUAL_TO: {
                    alt38 = 6;
                }
                break;
                case GREATER_THAN: {
                    alt38 = 7;
                }
                break;
                case GREATER_THAN_OR_EQUAL_TO: {
                    alt38 = 8;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);
                    throw nvae;
            }
            switch (alt38) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:221:7: EQUAL_TO_SINGLE
                {
                    EQUAL_TO_SINGLE79 = (Token) match(input, EQUAL_TO_SINGLE, FOLLOW_EQUAL_TO_SINGLE_in_where_cmp_operator1941);
                    stream_EQUAL_TO_SINGLE.add(EQUAL_TO_SINGLE79);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 221:23: -> T_OPERATOR_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_EQUAL_TO_SINGLE, "T_OPERATOR_EQUAL_TO_SINGLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:222:7: EQUAL_TO_DOUBLE
                {
                    EQUAL_TO_DOUBLE80 = (Token) match(input, EQUAL_TO_DOUBLE, FOLLOW_EQUAL_TO_DOUBLE_in_where_cmp_operator1953);
                    stream_EQUAL_TO_DOUBLE.add(EQUAL_TO_DOUBLE80);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 222:23: -> T_OPERATOR_EQUAL_TO_DOUBLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_EQUAL_TO_DOUBLE, "T_OPERATOR_EQUAL_TO_DOUBLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:223:7: NOT_EQUAL_TO_SINGLE
                {
                    NOT_EQUAL_TO_SINGLE81 = (Token) match(input, NOT_EQUAL_TO_SINGLE, FOLLOW_NOT_EQUAL_TO_SINGLE_in_where_cmp_operator1965);
                    stream_NOT_EQUAL_TO_SINGLE.add(NOT_EQUAL_TO_SINGLE81);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 223:27: -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_NOT_EQUAL_TO_SINGLE, "T_OPERATOR_NOT_EQUAL_TO_SINGLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 4:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:224:7: NOT_EQUAL_TO_DOUBLE
                {
                    NOT_EQUAL_TO_DOUBLE82 = (Token) match(input, NOT_EQUAL_TO_DOUBLE, FOLLOW_NOT_EQUAL_TO_DOUBLE_in_where_cmp_operator1977);
                    stream_NOT_EQUAL_TO_DOUBLE.add(NOT_EQUAL_TO_DOUBLE82);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 224:27: -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_NOT_EQUAL_TO_DOUBLE, "T_OPERATOR_NOT_EQUAL_TO_DOUBLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 5:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:225:7: LESS_THAN
                {
                    LESS_THAN83 = (Token) match(input, LESS_THAN, FOLLOW_LESS_THAN_in_where_cmp_operator1989);
                    stream_LESS_THAN.add(LESS_THAN83);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 225:17: -> T_OPERATOR_LESS_THAN
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_LESS_THAN, "T_OPERATOR_LESS_THAN"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 6:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:226:7: LESS_THAN_OR_EQUAL_TO
                {
                    LESS_THAN_OR_EQUAL_TO84 = (Token) match(input, LESS_THAN_OR_EQUAL_TO, FOLLOW_LESS_THAN_OR_EQUAL_TO_in_where_cmp_operator2001);
                    stream_LESS_THAN_OR_EQUAL_TO.add(LESS_THAN_OR_EQUAL_TO84);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 226:29: -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_LESS_THAN_OR_EQUAL_TO, "T_OPERATOR_LESS_THAN_OR_EQUAL_TO"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 7:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:227:7: GREATER_THAN
                {
                    GREATER_THAN85 = (Token) match(input, GREATER_THAN, FOLLOW_GREATER_THAN_in_where_cmp_operator2013);
                    stream_GREATER_THAN.add(GREATER_THAN85);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 227:20: -> T_OPERATOR_GREATER_THAN
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_GREATER_THAN, "T_OPERATOR_GREATER_THAN"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 8:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:228:7: GREATER_THAN_OR_EQUAL_TO
                {
                    GREATER_THAN_OR_EQUAL_TO86 = (Token) match(input, GREATER_THAN_OR_EQUAL_TO, FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_where_cmp_operator2025);
                    stream_GREATER_THAN_OR_EQUAL_TO.add(GREATER_THAN_OR_EQUAL_TO86);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 228:32: -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_GREATER_THAN_OR_EQUAL_TO, "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO"));
                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_cmp_operator"


    public static class cmp_operator_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "cmp_operator"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:231:1: cmp_operator : ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO );
    public final CqlParser.cmp_operator_return cmp_operator() throws RecognitionException {
        CqlParser.cmp_operator_return retval = new CqlParser.cmp_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL_TO_SINGLE87 = null;
        Token NOT_EQUAL_TO_SINGLE88 = null;
        Token LESS_THAN89 = null;
        Token LESS_THAN_OR_EQUAL_TO90 = null;
        Token GREATER_THAN91 = null;
        Token GREATER_THAN_OR_EQUAL_TO92 = null;

        Object EQUAL_TO_SINGLE87_tree = null;
        Object NOT_EQUAL_TO_SINGLE88_tree = null;
        Object LESS_THAN89_tree = null;
        Object LESS_THAN_OR_EQUAL_TO90_tree = null;
        Object GREATER_THAN91_tree = null;
        Object GREATER_THAN_OR_EQUAL_TO92_tree = null;
        RewriteRuleTokenStream stream_EQUAL_TO_SINGLE = new RewriteRuleTokenStream(adaptor, "token EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_LESS_THAN_OR_EQUAL_TO = new RewriteRuleTokenStream(adaptor, "token LESS_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_GREATER_THAN = new RewriteRuleTokenStream(adaptor, "token GREATER_THAN");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_SINGLE = new RewriteRuleTokenStream(adaptor, "token NOT_EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_GREATER_THAN_OR_EQUAL_TO = new RewriteRuleTokenStream(adaptor, "token GREATER_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_LESS_THAN = new RewriteRuleTokenStream(adaptor, "token LESS_THAN");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:232:5: ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO )
            int alt39 = 6;
            switch (input.LA(1)) {
                case EQUAL_TO_SINGLE: {
                    alt39 = 1;
                }
                break;
                case NOT_EQUAL_TO_SINGLE: {
                    alt39 = 2;
                }
                break;
                case LESS_THAN: {
                    alt39 = 3;
                }
                break;
                case LESS_THAN_OR_EQUAL_TO: {
                    alt39 = 4;
                }
                break;
                case GREATER_THAN: {
                    alt39 = 5;
                }
                break;
                case GREATER_THAN_OR_EQUAL_TO: {
                    alt39 = 6;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);
                    throw nvae;
            }
            switch (alt39) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:232:7: EQUAL_TO_SINGLE
                {
                    EQUAL_TO_SINGLE87 = (Token) match(input, EQUAL_TO_SINGLE, FOLLOW_EQUAL_TO_SINGLE_in_cmp_operator2046);
                    stream_EQUAL_TO_SINGLE.add(EQUAL_TO_SINGLE87);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 232:23: -> T_OPERATOR_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_EQUAL_TO_SINGLE, "T_OPERATOR_EQUAL_TO_SINGLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:233:7: NOT_EQUAL_TO_SINGLE
                {
                    NOT_EQUAL_TO_SINGLE88 = (Token) match(input, NOT_EQUAL_TO_SINGLE, FOLLOW_NOT_EQUAL_TO_SINGLE_in_cmp_operator2058);
                    stream_NOT_EQUAL_TO_SINGLE.add(NOT_EQUAL_TO_SINGLE88);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 233:27: -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_NOT_EQUAL_TO_SINGLE, "T_OPERATOR_NOT_EQUAL_TO_SINGLE"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:234:7: LESS_THAN
                {
                    LESS_THAN89 = (Token) match(input, LESS_THAN, FOLLOW_LESS_THAN_in_cmp_operator2070);
                    stream_LESS_THAN.add(LESS_THAN89);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 234:17: -> T_OPERATOR_LESS_THAN
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_LESS_THAN, "T_OPERATOR_LESS_THAN"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 4:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:235:7: LESS_THAN_OR_EQUAL_TO
                {
                    LESS_THAN_OR_EQUAL_TO90 = (Token) match(input, LESS_THAN_OR_EQUAL_TO, FOLLOW_LESS_THAN_OR_EQUAL_TO_in_cmp_operator2082);
                    stream_LESS_THAN_OR_EQUAL_TO.add(LESS_THAN_OR_EQUAL_TO90);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 235:29: -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_LESS_THAN_OR_EQUAL_TO, "T_OPERATOR_LESS_THAN_OR_EQUAL_TO"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 5:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:236:7: GREATER_THAN
                {
                    GREATER_THAN91 = (Token) match(input, GREATER_THAN, FOLLOW_GREATER_THAN_in_cmp_operator2094);
                    stream_GREATER_THAN.add(GREATER_THAN91);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 236:20: -> T_OPERATOR_GREATER_THAN
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_GREATER_THAN, "T_OPERATOR_GREATER_THAN"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 6:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:237:7: GREATER_THAN_OR_EQUAL_TO
                {
                    GREATER_THAN_OR_EQUAL_TO92 = (Token) match(input, GREATER_THAN_OR_EQUAL_TO, FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_cmp_operator2106);
                    stream_GREATER_THAN_OR_EQUAL_TO.add(GREATER_THAN_OR_EQUAL_TO92);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 237:32: -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_GREATER_THAN_OR_EQUAL_TO, "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO"));
                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmp_operator"


    public static class add_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "add_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:240:1: add_expression : (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )* ;
    public final CqlParser.add_expression_return add_expression() throws RecognitionException {
        CqlParser.add_expression_return retval = new CqlParser.add_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;
        ParserRuleReturnScope add_operator93 = null;

        RewriteRuleSubtreeStream stream_mul_expression = new RewriteRuleSubtreeStream(adaptor, "rule mul_expression");
        RewriteRuleSubtreeStream stream_add_operator = new RewriteRuleSubtreeStream(adaptor, "rule add_operator");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:241:5: ( (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:241:7: (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:241:7: (expr1= mul_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:241:8: expr1= mul_expression
                {
                    pushFollow(FOLLOW_mul_expression_in_add_expression2130);
                    expr1 = mul_expression();
                    state._fsp--;

                    stream_mul_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 241:29: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:242:7: ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )*
                loop40:
                while (true) {
                    int alt40 = 2;
                    int LA40_0 = input.LA(1);
                    if ((LA40_0 == MINUS || LA40_0 == PLUS)) {
                        alt40 = 1;
                    }

                    switch (alt40) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:242:8: add_operator expr2= mul_expression
                        {
                            pushFollow(FOLLOW_add_operator_in_add_expression2145);
                            add_operator93 = add_operator();
                            state._fsp--;

                            stream_add_operator.add(add_operator93.getTree());
                            pushFollow(FOLLOW_mul_expression_in_add_expression2149);
                            expr2 = mul_expression();
                            state._fsp--;

                            stream_mul_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: expr2, add_expression, add_operator
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 242:42: -> ^( add_operator $add_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:242:45: ^( add_operator $add_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot(stream_add_operator.nextNode(), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop40;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_expression"


    public static class mul_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "mul_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:245:1: mul_expression : (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )* ;
    public final CqlParser.mul_expression_return mul_expression() throws RecognitionException {
        CqlParser.mul_expression_return retval = new CqlParser.mul_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;
        ParserRuleReturnScope mul_operator94 = null;

        RewriteRuleSubtreeStream stream_mul_operator = new RewriteRuleSubtreeStream(adaptor, "rule mul_operator");
        RewriteRuleSubtreeStream stream_unary_expression = new RewriteRuleSubtreeStream(adaptor, "rule unary_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:246:5: ( (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:246:7: (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:246:7: (expr1= unary_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:246:8: expr1= unary_expression
                {
                    pushFollow(FOLLOW_unary_expression_in_mul_expression2183);
                    expr1 = unary_expression();
                    state._fsp--;

                    stream_unary_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 246:31: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:247:7: ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )*
                loop41:
                while (true) {
                    int alt41 = 2;
                    int LA41_0 = input.LA(1);
                    if ((LA41_0 == ASTERISK || LA41_0 == SLASH)) {
                        alt41 = 1;
                    }

                    switch (alt41) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:247:8: mul_operator expr2= unary_expression
                        {
                            pushFollow(FOLLOW_mul_operator_in_mul_expression2198);
                            mul_operator94 = mul_operator();
                            state._fsp--;

                            stream_mul_operator.add(mul_operator94.getTree());
                            pushFollow(FOLLOW_unary_expression_in_mul_expression2202);
                            expr2 = unary_expression();
                            state._fsp--;

                            stream_unary_expression.add(expr2.getTree());
                            // AST REWRITE
                            // elements: mul_expression, expr2, mul_operator
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 247:44: -> ^( mul_operator $mul_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:247:47: ^( mul_operator $mul_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot(stream_mul_operator.nextNode(), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop41;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_expression"


    public static class where_unary_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "where_unary_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:250:1: where_unary_expression : ( literal | unary_operator numeric_literal -> ^( unary_operator numeric_literal ) );
    public final CqlParser.where_unary_expression_return where_unary_expression() throws RecognitionException {
        CqlParser.where_unary_expression_return retval = new CqlParser.where_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope literal95 = null;
        ParserRuleReturnScope unary_operator96 = null;
        ParserRuleReturnScope numeric_literal97 = null;

        RewriteRuleSubtreeStream stream_numeric_literal = new RewriteRuleSubtreeStream(adaptor, "rule numeric_literal");
        RewriteRuleSubtreeStream stream_unary_operator = new RewriteRuleSubtreeStream(adaptor, "rule unary_operator");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:251:5: ( literal | unary_operator numeric_literal -> ^( unary_operator numeric_literal ) )
            int alt42 = 2;
            int LA42_0 = input.LA(1);
            if ((LA42_0 == ASTERISK || (LA42_0 >= FALSE && LA42_0 <= FLOAT) || LA42_0 == ID || LA42_0 == INTEGER || LA42_0 == NULL || LA42_0 == STRING || LA42_0 == TRUE)) {
                alt42 = 1;
            } else if ((LA42_0 == MINUS || LA42_0 == PLUS)) {
                alt42 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 42, 0, input);
                throw nvae;
            }

            switch (alt42) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:251:7: literal
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_literal_in_where_unary_expression2233);
                    literal95 = literal();
                    state._fsp--;

                    adaptor.addChild(root_0, literal95.getTree());

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:252:7: unary_operator numeric_literal
                {
                    pushFollow(FOLLOW_unary_operator_in_where_unary_expression2241);
                    unary_operator96 = unary_operator();
                    state._fsp--;

                    stream_unary_operator.add(unary_operator96.getTree());
                    pushFollow(FOLLOW_numeric_literal_in_where_unary_expression2243);
                    numeric_literal97 = numeric_literal();
                    state._fsp--;

                    stream_numeric_literal.add(numeric_literal97.getTree());
                    // AST REWRITE
                    // elements: numeric_literal, unary_operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 253:7: -> ^( unary_operator numeric_literal )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:253:10: ^( unary_operator numeric_literal )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(stream_unary_operator.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_numeric_literal.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_unary_expression"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "unary_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:256:1: unary_expression : ( postfix_expression | unary_operator unary_expression -> ^( unary_operator unary_expression ) );
    public final CqlParser.unary_expression_return unary_expression() throws RecognitionException {
        CqlParser.unary_expression_return retval = new CqlParser.unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ParserRuleReturnScope postfix_expression98 = null;
        ParserRuleReturnScope unary_operator99 = null;
        ParserRuleReturnScope unary_expression100 = null;

        RewriteRuleSubtreeStream stream_unary_operator = new RewriteRuleSubtreeStream(adaptor, "rule unary_operator");
        RewriteRuleSubtreeStream stream_unary_expression = new RewriteRuleSubtreeStream(adaptor, "rule unary_expression");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:257:5: ( postfix_expression | unary_operator unary_expression -> ^( unary_operator unary_expression ) )
            int alt43 = 2;
            int LA43_0 = input.LA(1);
            if ((LA43_0 == ASTERISK || (LA43_0 >= FALSE && LA43_0 <= FLOAT) || LA43_0 == ID || LA43_0 == INTEGER || (LA43_0 >= LPAREN && LA43_0 <= LSBRACKET) || LA43_0 == NULL || LA43_0 == STRING || LA43_0 == TRUE)) {
                alt43 = 1;
            } else if ((LA43_0 == MINUS || LA43_0 == PLUS)) {
                alt43 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 43, 0, input);
                throw nvae;
            }

            switch (alt43) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:257:7: postfix_expression
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2274);
                    postfix_expression98 = postfix_expression();
                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expression98.getTree());

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:258:7: unary_operator unary_expression
                {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression2282);
                    unary_operator99 = unary_operator();
                    state._fsp--;

                    stream_unary_operator.add(unary_operator99.getTree());
                    pushFollow(FOLLOW_unary_expression_in_unary_expression2284);
                    unary_expression100 = unary_expression();
                    state._fsp--;

                    stream_unary_expression.add(unary_expression100.getTree());
                    // AST REWRITE
                    // elements: unary_operator, unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 259:7: -> ^( unary_operator unary_expression )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:259:10: ^( unary_operator unary_expression )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot(stream_unary_operator.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_unary_expression.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "postfix_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:262:1: postfix_expression : (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )* ;
    public final CqlParser.postfix_expression_return postfix_expression() throws RecognitionException {
        CqlParser.postfix_expression_return retval = new CqlParser.postfix_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LSBRACKET101 = null;
        Token RSBRACKET102 = null;
        Token LPAREN103 = null;
        Token RPAREN105 = null;
        ParserRuleReturnScope expr1 = null;
        ParserRuleReturnScope expr2 = null;
        ParserRuleReturnScope argument_list104 = null;

        Object LSBRACKET101_tree = null;
        Object RSBRACKET102_tree = null;
        Object LPAREN103_tree = null;
        Object RPAREN105_tree = null;
        RewriteRuleTokenStream stream_LSBRACKET = new RewriteRuleTokenStream(adaptor, "token LSBRACKET");
        RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(adaptor, "token RPAREN");
        RewriteRuleTokenStream stream_RSBRACKET = new RewriteRuleTokenStream(adaptor, "token RSBRACKET");
        RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(adaptor, "token LPAREN");
        RewriteRuleSubtreeStream stream_atom_expression = new RewriteRuleSubtreeStream(adaptor, "rule atom_expression");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(adaptor, "rule expression");
        RewriteRuleSubtreeStream stream_argument_list = new RewriteRuleSubtreeStream(adaptor, "rule argument_list");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:263:5: ( (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:263:7: (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )*
            {
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:263:7: (expr1= atom_expression -> $expr1)
                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:263:8: expr1= atom_expression
                {
                    pushFollow(FOLLOW_atom_expression_in_postfix_expression2318);
                    expr1 = atom_expression();
                    state._fsp--;

                    stream_atom_expression.add(expr1.getTree());
                    // AST REWRITE
                    // elements: expr1
                    // token labels: 
                    // rule labels: retval, expr1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                    RewriteRuleSubtreeStream stream_expr1 = new RewriteRuleSubtreeStream(adaptor, "rule expr1", expr1 != null ? expr1.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 263:30: -> $expr1
                    {
                        adaptor.addChild(root_0, stream_expr1.nextTree());
                    }


                    retval.tree = root_0;

                }

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:264:7: ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )*
                loop45:
                while (true) {
                    int alt45 = 3;
                    int LA45_0 = input.LA(1);
                    if ((LA45_0 == LSBRACKET)) {
                        alt45 = 1;
                    } else if ((LA45_0 == LPAREN)) {
                        alt45 = 2;
                    }

                    switch (alt45) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:264:9: LSBRACKET expr2= expression RSBRACKET
                        {
                            LSBRACKET101 = (Token) match(input, LSBRACKET, FOLLOW_LSBRACKET_in_postfix_expression2334);
                            stream_LSBRACKET.add(LSBRACKET101);

                            pushFollow(FOLLOW_expression_in_postfix_expression2338);
                            expr2 = expression();
                            state._fsp--;

                            stream_expression.add(expr2.getTree());
                            RSBRACKET102 = (Token) match(input, RSBRACKET, FOLLOW_RSBRACKET_in_postfix_expression2340);
                            stream_RSBRACKET.add(RSBRACKET102);

                            // AST REWRITE
                            // elements: postfix_expression, expr2
                            // token labels: 
                            // rule labels: retval, expr2
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
                            RewriteRuleSubtreeStream stream_expr2 = new RewriteRuleSubtreeStream(adaptor, "rule expr2", expr2 != null ? expr2.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 265:9: -> ^( T_OPERATOR_INDEX $postfix_expression $expr2)
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:265:12: ^( T_OPERATOR_INDEX $postfix_expression $expr2)
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_INDEX, "T_OPERATOR_INDEX"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    adaptor.addChild(root_1, stream_expr2.nextTree());
                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;
                        case 2:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:266:9: LPAREN ( argument_list )? RPAREN
                        {
                            LPAREN103 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_postfix_expression2370);
                            stream_LPAREN.add(LPAREN103);

                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:266:16: ( argument_list )?
                            int alt44 = 2;
                            int LA44_0 = input.LA(1);
                            if ((LA44_0 == ASTERISK || (LA44_0 >= FALSE && LA44_0 <= FLOAT) || LA44_0 == ID || LA44_0 == INTEGER || (LA44_0 >= LPAREN && LA44_0 <= LSBRACKET) || LA44_0 == MINUS || LA44_0 == NULL || LA44_0 == PLUS || LA44_0 == STRING || LA44_0 == TRUE)) {
                                alt44 = 1;
                            }
                            switch (alt44) {
                                case 1:
                                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:266:16: argument_list
                                {
                                    pushFollow(FOLLOW_argument_list_in_postfix_expression2372);
                                    argument_list104 = argument_list();
                                    state._fsp--;

                                    stream_argument_list.add(argument_list104.getTree());
                                }
                                break;

                            }

                            RPAREN105 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_postfix_expression2375);
                            stream_RPAREN.add(RPAREN105);

                            // AST REWRITE
                            // elements: postfix_expression, argument_list
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                            root_0 = (Object) adaptor.nil();
                            // 267:9: -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? )
                            {
                                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:267:12: ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? )
                                {
                                    Object root_1 = (Object) adaptor.nil();
                                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_OPERATOR_CALL, "T_OPERATOR_CALL"), root_1);
                                    adaptor.addChild(root_1, stream_retval.nextTree());
                                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:267:50: ( argument_list )?
                                    if (stream_argument_list.hasNext()) {
                                        adaptor.addChild(root_1, stream_argument_list.nextTree());
                                    }
                                    stream_argument_list.reset();

                                    adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                        }
                        break;

                        default:
                            break loop45;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class atom_expression_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "atom_expression"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:271:1: atom_expression : ( literal | LSBRACKET ( argument_list )? RSBRACKET -> ^( T_LIST ( argument_list )? ) | LPAREN ! expression RPAREN !);
    public final CqlParser.atom_expression_return atom_expression() throws RecognitionException {
        CqlParser.atom_expression_return retval = new CqlParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LSBRACKET107 = null;
        Token RSBRACKET109 = null;
        Token LPAREN110 = null;
        Token RPAREN112 = null;
        ParserRuleReturnScope literal106 = null;
        ParserRuleReturnScope argument_list108 = null;
        ParserRuleReturnScope expression111 = null;

        Object LSBRACKET107_tree = null;
        Object RSBRACKET109_tree = null;
        Object LPAREN110_tree = null;
        Object RPAREN112_tree = null;
        RewriteRuleTokenStream stream_LSBRACKET = new RewriteRuleTokenStream(adaptor, "token LSBRACKET");
        RewriteRuleTokenStream stream_RSBRACKET = new RewriteRuleTokenStream(adaptor, "token RSBRACKET");
        RewriteRuleSubtreeStream stream_argument_list = new RewriteRuleSubtreeStream(adaptor, "rule argument_list");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:272:5: ( literal | LSBRACKET ( argument_list )? RSBRACKET -> ^( T_LIST ( argument_list )? ) | LPAREN ! expression RPAREN !)
            int alt47 = 3;
            switch (input.LA(1)) {
                case ASTERISK:
                case FALSE:
                case FLOAT:
                case ID:
                case INTEGER:
                case NULL:
                case STRING:
                case TRUE: {
                    alt47 = 1;
                }
                break;
                case LSBRACKET: {
                    alt47 = 2;
                }
                break;
                case LPAREN: {
                    alt47 = 3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);
                    throw nvae;
            }
            switch (alt47) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:272:7: literal
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_literal_in_atom_expression2421);
                    literal106 = literal();
                    state._fsp--;

                    adaptor.addChild(root_0, literal106.getTree());

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:273:7: LSBRACKET ( argument_list )? RSBRACKET
                {
                    LSBRACKET107 = (Token) match(input, LSBRACKET, FOLLOW_LSBRACKET_in_atom_expression2429);
                    stream_LSBRACKET.add(LSBRACKET107);

                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:273:17: ( argument_list )?
                    int alt46 = 2;
                    int LA46_0 = input.LA(1);
                    if ((LA46_0 == ASTERISK || (LA46_0 >= FALSE && LA46_0 <= FLOAT) || LA46_0 == ID || LA46_0 == INTEGER || (LA46_0 >= LPAREN && LA46_0 <= LSBRACKET) || LA46_0 == MINUS || LA46_0 == NULL || LA46_0 == PLUS || LA46_0 == STRING || LA46_0 == TRUE)) {
                        alt46 = 1;
                    }
                    switch (alt46) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:273:17: argument_list
                        {
                            pushFollow(FOLLOW_argument_list_in_atom_expression2431);
                            argument_list108 = argument_list();
                            state._fsp--;

                            stream_argument_list.add(argument_list108.getTree());
                        }
                        break;

                    }

                    RSBRACKET109 = (Token) match(input, RSBRACKET, FOLLOW_RSBRACKET_in_atom_expression2434);
                    stream_RSBRACKET.add(RSBRACKET109);

                    // AST REWRITE
                    // elements: argument_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 274:7: -> ^( T_LIST ( argument_list )? )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:274:10: ^( T_LIST ( argument_list )? )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_LIST, "T_LIST"), root_1);
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:274:19: ( argument_list )?
                            if (stream_argument_list.hasNext()) {
                                adaptor.addChild(root_1, stream_argument_list.nextTree());
                            }
                            stream_argument_list.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:275:7: LPAREN ! expression RPAREN !
                {
                    root_0 = (Object) adaptor.nil();


                    LPAREN110 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_atom_expression2457);
                    pushFollow(FOLLOW_expression_in_atom_expression2460);
                    expression111 = expression();
                    state._fsp--;

                    adaptor.addChild(root_0, expression111.getTree());

                    RPAREN112 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_atom_expression2462);
                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom_expression"


    public static class argument_list_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "argument_list"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:278:1: argument_list : expression ( COMMA ! expression )* ;
    public final CqlParser.argument_list_return argument_list() throws RecognitionException {
        CqlParser.argument_list_return retval = new CqlParser.argument_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA114 = null;
        ParserRuleReturnScope expression113 = null;
        ParserRuleReturnScope expression115 = null;

        Object COMMA114_tree = null;

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:279:5: ( expression ( COMMA ! expression )* )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:279:7: expression ( COMMA ! expression )*
            {
                root_0 = (Object) adaptor.nil();


                pushFollow(FOLLOW_expression_in_argument_list2480);
                expression113 = expression();
                state._fsp--;

                adaptor.addChild(root_0, expression113.getTree());

                // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:279:18: ( COMMA ! expression )*
                loop48:
                while (true) {
                    int alt48 = 2;
                    int LA48_0 = input.LA(1);
                    if ((LA48_0 == COMMA)) {
                        alt48 = 1;
                    }

                    switch (alt48) {
                        case 1:
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:279:19: COMMA ! expression
                        {
                            COMMA114 = (Token) match(input, COMMA, FOLLOW_COMMA_in_argument_list2483);
                            pushFollow(FOLLOW_expression_in_argument_list2486);
                            expression115 = expression();
                            state._fsp--;

                            adaptor.addChild(root_0, expression115.getTree());

                        }
                        break;

                        default:
                            break loop48;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument_list"


    public static class numeric_literal_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "numeric_literal"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:282:1: numeric_literal : ( INTEGER | FLOAT );
    public final CqlParser.numeric_literal_return numeric_literal() throws RecognitionException {
        CqlParser.numeric_literal_return retval = new CqlParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set116 = null;

        Object set116_tree = null;

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:283:5: ( INTEGER | FLOAT )
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:
            {
                root_0 = (Object) adaptor.nil();


                set116 = input.LT(1);
                if (input.LA(1) == FLOAT || input.LA(1) == INTEGER) {
                    input.consume();
                    adaptor.addChild(root_0, (Object) adaptor.create(set116));
                    state.errorRecovery = false;
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    throw mse;
                }
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numeric_literal"


    public static class value_literal_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "value_literal"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:287:1: value_literal : ( TRUE | FALSE | STRING | numeric_literal | NULL );
    public final CqlParser.value_literal_return value_literal() throws RecognitionException {
        CqlParser.value_literal_return retval = new CqlParser.value_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE117 = null;
        Token FALSE118 = null;
        Token STRING119 = null;
        Token NULL121 = null;
        ParserRuleReturnScope numeric_literal120 = null;

        Object TRUE117_tree = null;
        Object FALSE118_tree = null;
        Object STRING119_tree = null;
        Object NULL121_tree = null;

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:288:5: ( TRUE | FALSE | STRING | numeric_literal | NULL )
            int alt49 = 5;
            switch (input.LA(1)) {
                case TRUE: {
                    alt49 = 1;
                }
                break;
                case FALSE: {
                    alt49 = 2;
                }
                break;
                case STRING: {
                    alt49 = 3;
                }
                break;
                case FLOAT:
                case INTEGER: {
                    alt49 = 4;
                }
                break;
                case NULL: {
                    alt49 = 5;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);
                    throw nvae;
            }
            switch (alt49) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:288:7: TRUE
                {
                    root_0 = (Object) adaptor.nil();


                    TRUE117 = (Token) match(input, TRUE, FOLLOW_TRUE_in_value_literal2530);
                    TRUE117_tree = (Object) adaptor.create(TRUE117);
                    adaptor.addChild(root_0, TRUE117_tree);

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:289:7: FALSE
                {
                    root_0 = (Object) adaptor.nil();


                    FALSE118 = (Token) match(input, FALSE, FOLLOW_FALSE_in_value_literal2538);
                    FALSE118_tree = (Object) adaptor.create(FALSE118);
                    adaptor.addChild(root_0, FALSE118_tree);

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:290:7: STRING
                {
                    root_0 = (Object) adaptor.nil();


                    STRING119 = (Token) match(input, STRING, FOLLOW_STRING_in_value_literal2546);
                    STRING119_tree = (Object) adaptor.create(STRING119);
                    adaptor.addChild(root_0, STRING119_tree);

                }
                break;
                case 4:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:291:7: numeric_literal
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_numeric_literal_in_value_literal2554);
                    numeric_literal120 = numeric_literal();
                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal120.getTree());

                }
                break;
                case 5:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:292:7: NULL
                {
                    root_0 = (Object) adaptor.nil();


                    NULL121 = (Token) match(input, NULL, FOLLOW_NULL_in_value_literal2562);
                    NULL121_tree = (Object) adaptor.create(NULL121);
                    adaptor.addChild(root_0, NULL121_tree);

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value_literal"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "literal"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:295:1: literal : ( ID | ASTERISK | value_literal );
    public final CqlParser.literal_return literal() throws RecognitionException {
        CqlParser.literal_return retval = new CqlParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID122 = null;
        Token ASTERISK123 = null;
        ParserRuleReturnScope value_literal124 = null;

        Object ID122_tree = null;
        Object ASTERISK123_tree = null;

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:296:5: ( ID | ASTERISK | value_literal )
            int alt50 = 3;
            switch (input.LA(1)) {
                case ID: {
                    alt50 = 1;
                }
                break;
                case ASTERISK: {
                    alt50 = 2;
                }
                break;
                case FALSE:
                case FLOAT:
                case INTEGER:
                case NULL:
                case STRING:
                case TRUE: {
                    alt50 = 3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);
                    throw nvae;
            }
            switch (alt50) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:296:7: ID
                {
                    root_0 = (Object) adaptor.nil();


                    ID122 = (Token) match(input, ID, FOLLOW_ID_in_literal2579);
                    ID122_tree = (Object) adaptor.create(ID122);
                    adaptor.addChild(root_0, ID122_tree);

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:297:7: ASTERISK
                {
                    root_0 = (Object) adaptor.nil();


                    ASTERISK123 = (Token) match(input, ASTERISK, FOLLOW_ASTERISK_in_literal2587);
                    ASTERISK123_tree = (Object) adaptor.create(ASTERISK123);
                    adaptor.addChild(root_0, ASTERISK123_tree);

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:298:7: value_literal
                {
                    root_0 = (Object) adaptor.nil();


                    pushFollow(FOLLOW_value_literal_in_literal2595);
                    value_literal124 = value_literal();
                    state._fsp--;

                    adaptor.addChild(root_0, value_literal124.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class unary_operator_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "unary_operator"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:301:1: unary_operator : ( PLUS -> T_OPERATOR_PLUS | MINUS -> T_OPERATOR_MINUS );
    public final CqlParser.unary_operator_return unary_operator() throws RecognitionException {
        CqlParser.unary_operator_return retval = new CqlParser.unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS125 = null;
        Token MINUS126 = null;

        Object PLUS125_tree = null;
        Object MINUS126_tree = null;
        RewriteRuleTokenStream stream_PLUS = new RewriteRuleTokenStream(adaptor, "token PLUS");
        RewriteRuleTokenStream stream_MINUS = new RewriteRuleTokenStream(adaptor, "token MINUS");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:302:5: ( PLUS -> T_OPERATOR_PLUS | MINUS -> T_OPERATOR_MINUS )
            int alt51 = 2;
            int LA51_0 = input.LA(1);
            if ((LA51_0 == PLUS)) {
                alt51 = 1;
            } else if ((LA51_0 == MINUS)) {
                alt51 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 51, 0, input);
                throw nvae;
            }

            switch (alt51) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:302:7: PLUS
                {
                    PLUS125 = (Token) match(input, PLUS, FOLLOW_PLUS_in_unary_operator2612);
                    stream_PLUS.add(PLUS125);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 302:12: -> T_OPERATOR_PLUS
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_PLUS, "T_OPERATOR_PLUS"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:303:7: MINUS
                {
                    MINUS126 = (Token) match(input, MINUS, FOLLOW_MINUS_in_unary_operator2624);
                    stream_MINUS.add(MINUS126);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 303:13: -> T_OPERATOR_MINUS
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_MINUS, "T_OPERATOR_MINUS"));
                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_operator"


    public static class add_operator_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "add_operator"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:306:1: add_operator : ( PLUS -> T_OPERATOR_ADD | MINUS -> T_OPERATOR_SUBTRACT );
    public final CqlParser.add_operator_return add_operator() throws RecognitionException {
        CqlParser.add_operator_return retval = new CqlParser.add_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS127 = null;
        Token MINUS128 = null;

        Object PLUS127_tree = null;
        Object MINUS128_tree = null;
        RewriteRuleTokenStream stream_PLUS = new RewriteRuleTokenStream(adaptor, "token PLUS");
        RewriteRuleTokenStream stream_MINUS = new RewriteRuleTokenStream(adaptor, "token MINUS");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:307:5: ( PLUS -> T_OPERATOR_ADD | MINUS -> T_OPERATOR_SUBTRACT )
            int alt52 = 2;
            int LA52_0 = input.LA(1);
            if ((LA52_0 == PLUS)) {
                alt52 = 1;
            } else if ((LA52_0 == MINUS)) {
                alt52 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 52, 0, input);
                throw nvae;
            }

            switch (alt52) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:307:7: PLUS
                {
                    PLUS127 = (Token) match(input, PLUS, FOLLOW_PLUS_in_add_operator2645);
                    stream_PLUS.add(PLUS127);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 307:12: -> T_OPERATOR_ADD
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_ADD, "T_OPERATOR_ADD"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:308:7: MINUS
                {
                    MINUS128 = (Token) match(input, MINUS, FOLLOW_MINUS_in_add_operator2657);
                    stream_MINUS.add(MINUS128);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 308:13: -> T_OPERATOR_SUBTRACT
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_SUBTRACT, "T_OPERATOR_SUBTRACT"));
                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_operator"


    public static class mul_operator_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "mul_operator"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:311:1: mul_operator : ( ASTERISK -> T_OPERATOR_MULTIPLY | SLASH -> T_OPERATOR_DIVIDE );
    public final CqlParser.mul_operator_return mul_operator() throws RecognitionException {
        CqlParser.mul_operator_return retval = new CqlParser.mul_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK129 = null;
        Token SLASH130 = null;

        Object ASTERISK129_tree = null;
        Object SLASH130_tree = null;
        RewriteRuleTokenStream stream_SLASH = new RewriteRuleTokenStream(adaptor, "token SLASH");
        RewriteRuleTokenStream stream_ASTERISK = new RewriteRuleTokenStream(adaptor, "token ASTERISK");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:312:5: ( ASTERISK -> T_OPERATOR_MULTIPLY | SLASH -> T_OPERATOR_DIVIDE )
            int alt53 = 2;
            int LA53_0 = input.LA(1);
            if ((LA53_0 == ASTERISK)) {
                alt53 = 1;
            } else if ((LA53_0 == SLASH)) {
                alt53 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 53, 0, input);
                throw nvae;
            }

            switch (alt53) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:312:7: ASTERISK
                {
                    ASTERISK129 = (Token) match(input, ASTERISK, FOLLOW_ASTERISK_in_mul_operator2678);
                    stream_ASTERISK.add(ASTERISK129);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 312:16: -> T_OPERATOR_MULTIPLY
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_MULTIPLY, "T_OPERATOR_MULTIPLY"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:313:7: SLASH
                {
                    SLASH130 = (Token) match(input, SLASH, FOLLOW_SLASH_in_mul_operator2690);
                    stream_SLASH.add(SLASH130);

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 313:13: -> T_OPERATOR_DIVIDE
                    {
                        adaptor.addChild(root_0, (Object) adaptor.create(T_OPERATOR_DIVIDE, "T_OPERATOR_DIVIDE"));
                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_operator"


    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;

        @Override
        public Object getTree() {
            return tree;
        }
    }

    ;


    // $ANTLR start "ordering_term"
    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:316:1: ordering_term : ( ID ASC -> ^( T_ORDERING ^( T_ASC ID ) ) | ID DESC -> ^( T_ORDERING ^( T_DESC ID ) ) | ID -> ^( T_ORDERING ^( T_ASC ID ) ) );
    public final CqlParser.ordering_term_return ordering_term() throws RecognitionException {
        CqlParser.ordering_term_return retval = new CqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID131 = null;
        Token ASC132 = null;
        Token ID133 = null;
        Token DESC134 = null;
        Token ID135 = null;

        Object ID131_tree = null;
        Object ASC132_tree = null;
        Object ID133_tree = null;
        Object DESC134_tree = null;
        Object ID135_tree = null;
        RewriteRuleTokenStream stream_DESC = new RewriteRuleTokenStream(adaptor, "token DESC");
        RewriteRuleTokenStream stream_ASC = new RewriteRuleTokenStream(adaptor, "token ASC");
        RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

        try {
            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:317:5: ( ID ASC -> ^( T_ORDERING ^( T_ASC ID ) ) | ID DESC -> ^( T_ORDERING ^( T_DESC ID ) ) | ID -> ^( T_ORDERING ^( T_ASC ID ) ) )
            int alt54 = 3;
            int LA54_0 = input.LA(1);
            if ((LA54_0 == ID)) {
                switch (input.LA(2)) {
                    case ASC: {
                        alt54 = 1;
                    }
                    break;
                    case DESC: {
                        alt54 = 2;
                    }
                    break;
                    case COMMA:
                    case LIMIT:
                    case SEMICOLON: {
                        alt54 = 3;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae =
                                    new NoViableAltException("", 54, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("", 54, 0, input);
                throw nvae;
            }

            switch (alt54) {
                case 1:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:317:7: ID ASC
                {
                    ID131 = (Token) match(input, ID, FOLLOW_ID_in_ordering_term2711);
                    stream_ID.add(ID131);

                    ASC132 = (Token) match(input, ASC, FOLLOW_ASC_in_ordering_term2713);
                    stream_ASC.add(ASC132);

                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 317:14: -> ^( T_ORDERING ^( T_ASC ID ) )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:317:17: ^( T_ORDERING ^( T_ASC ID ) )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ORDERING, "T_ORDERING"), root_1);
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:317:30: ^( T_ASC ID )
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ASC, "T_ASC"), root_2);
                                adaptor.addChild(root_2, stream_ID.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:318:7: ID DESC
                {
                    ID133 = (Token) match(input, ID, FOLLOW_ID_in_ordering_term2733);
                    stream_ID.add(ID133);

                    DESC134 = (Token) match(input, DESC, FOLLOW_DESC_in_ordering_term2735);
                    stream_DESC.add(DESC134);

                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 318:15: -> ^( T_ORDERING ^( T_DESC ID ) )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:318:18: ^( T_ORDERING ^( T_DESC ID ) )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ORDERING, "T_ORDERING"), root_1);
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:318:31: ^( T_DESC ID )
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_DESC, "T_DESC"), root_2);
                                adaptor.addChild(root_2, stream_ID.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 3:
                    // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:319:7: ID
                {
                    ID135 = (Token) match(input, ID, FOLLOW_ID_in_ordering_term2755);
                    stream_ID.add(ID135);

                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);

                    root_0 = (Object) adaptor.nil();
                    // 319:10: -> ^( T_ORDERING ^( T_ASC ID ) )
                    {
                        // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:319:13: ^( T_ORDERING ^( T_ASC ID ) )
                        {
                            Object root_1 = (Object) adaptor.nil();
                            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ORDERING, "T_ORDERING"), root_1);
                            // F:\\�ҵ��ĵ�\\�ٶ���\\�ҵĴ���\\personal\\antlr\\cql.g:319:26: ^( T_ASC ID )
                            {
                                Object root_2 = (Object) adaptor.nil();
                                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(T_ASC, "T_ASC"), root_2);
                                adaptor.addChild(root_2, stream_ID.nextNode());
                                adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
            throw e;
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ordering_term"

    // Delegated rules


    public static final BitSet FOLLOW_stmt_core_in_stmt_list423 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_SEMICOLON_in_stmt_list425 = new BitSet(new long[]{0x0000020000090000L, 0x0000000000004402L, 0x0000000000002000L});
    public static final BitSet FOLLOW_EOF_in_stmt_list430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_stmt_core448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_stmt_core456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_stmt_core464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_stmt_in_stmt_core472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_stmt_core480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_stmt_core488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimize_stmt_in_stmt_core496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIMIZE_in_optimize_stmt513 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_optimize_stmt515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt564 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_rollback_stmt566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_stmt615 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_commit_stmt617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_stmt666 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_STRING_in_use_stmt670 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_use_stmt673 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_use_stmt677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt739 = new BitSet(new long[]{0x4000000020000002L, 0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt742 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_delete_stmt746 = new BitSet(new long[]{0x4000000000000002L, 0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_where_clause_in_delete_stmt750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt807 = new BitSet(new long[]{0x0004080000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt810 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt814 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt818 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt822 = new BitSet(new long[]{0x0000000000008000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt825 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt829 = new BitSet(new long[]{0x0000000000008000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt833 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L, 0x0000000000008000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt843 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt845 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_expression_in_insert_stmt847 = new BitSet(new long[]{0x0000000000008000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt850 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_expression_in_insert_stmt852 = new BitSet(new long[]{0x0000000000008000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_stmt946 = new BitSet(new long[]{0x0002000000000002L, 0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt949 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BY_in_select_stmt951 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt953 = new BitSet(new long[]{0x0002000000008002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt956 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt958 = new BitSet(new long[]{0x0002000000008002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt971 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt975 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000001L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt978 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1055 = new BitSet(new long[]{0x21AC040818020300L, 0x0000000005020020L});
    public static final BitSet FOLLOW_result_field_in_select_core1057 = new BitSet(new long[]{0x4000000020008002L, 0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1060 = new BitSet(new long[]{0x21AC040818020300L, 0x0000000005020020L});
    public static final BitSet FOLLOW_result_field_in_select_core1062 = new BitSet(new long[]{0x4000000020008002L, 0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_select_core1067 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_select_core1071 = new BitSet(new long[]{0x4000000000000002L, 0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_where_clause_in_select_core1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause1139 = new BitSet(new long[]{0x2104040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_expression_in_where_clause1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NWHERE_in_where_clause1165 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_STRING_in_where_clause1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_result_field1198 = new BitSet(new long[]{0x0000000800000042L});
    public static final BitSet FOLLOW_AS_in_result_field1201 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_result_field1236 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_result_field1238 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1242 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_result_field1244 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_result_field1247 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_result_field1288 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_result_field1290 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_ID_in_result_field1295 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_ASTERISK_in_result_field1297 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_result_field1300 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_result_field1303 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_result_field1344 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_result_field1346 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1351 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_result_field1354 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_result_field1357 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_result_field1398 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_result_field1400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1405 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_result_field1408 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_result_field1411 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_result_field1452 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_result_field1454 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1459 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_result_field1462 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AS_in_result_field1465 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_result_field1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_and_expression_in_where_expression1516 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_where_expression1531 = new BitSet(new long[]{0x2104040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_and_expression_in_where_expression1535 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000004L});
    public static final BitSet FOLLOW_and_expression_in_expression1569 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_expression1584 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_and_expression_in_expression1588 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000004L});
    public static final BitSet FOLLOW_where_not_expression_in_where_and_expression1622 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_where_and_expression1637 = new BitSet(new long[]{0x2104040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_not_expression_in_where_and_expression1641 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_not_expression_in_and_expression1675 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_and_expression1690 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_not_expression_in_and_expression1694 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_where_cmp_expression_in_where_not_expression1728 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_NOT_in_where_not_expression1743 = new BitSet(new long[]{0x2104040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_cmp_expression_in_where_not_expression1747 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_cmp_expression_in_not_expression1781 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_NOT_in_not_expression1796 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_cmp_expression_in_not_expression1800 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_where_unary_expression_in_where_cmp_expression1833 = new BitSet(new long[]{0x1801800181800000L});
    public static final BitSet FOLLOW_where_cmp_operator_in_where_cmp_expression1835 = new BitSet(new long[]{0x2100040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_unary_expression_in_where_cmp_expression1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_where_cmp_expression1865 = new BitSet(new long[]{0x2104040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_where_expression_in_where_cmp_expression1868 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_where_cmp_expression1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expression_in_cmp_expression1891 = new BitSet(new long[]{0x1001800181000002L});
    public static final BitSet FOLLOW_cmp_operator_in_cmp_expression1906 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_add_expression_in_cmp_expression1910 = new BitSet(new long[]{0x1001800181000002L});
    public static final BitSet FOLLOW_EQUAL_TO_SINGLE_in_where_cmp_operator1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_TO_DOUBLE_in_where_cmp_operator1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_SINGLE_in_where_cmp_operator1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_DOUBLE_in_where_cmp_operator1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_where_cmp_operator1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUAL_TO_in_where_cmp_operator2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_where_cmp_operator2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_where_cmp_operator2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_TO_SINGLE_in_cmp_operator2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_SINGLE_in_cmp_operator2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_cmp_operator2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUAL_TO_in_cmp_operator2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_cmp_operator2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_cmp_operator2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expression_in_add_expression2130 = new BitSet(new long[]{0x0100000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_add_operator_in_add_expression2145 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_mul_expression_in_add_expression2149 = new BitSet(new long[]{0x0100000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_unary_expression_in_mul_expression2183 = new BitSet(new long[]{0x0000000000000102L, 0x0000000000010000L});
    public static final BitSet FOLLOW_mul_operator_in_mul_expression2198 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_unary_expression_in_mul_expression2202 = new BitSet(new long[]{0x0000000000000102L, 0x0000000000010000L});
    public static final BitSet FOLLOW_literal_in_where_unary_expression2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_where_unary_expression2241 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_numeric_literal_in_where_unary_expression2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression2282 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_postfix_expression2318 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_LSBRACKET_in_postfix_expression2334 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_expression_in_postfix_expression2338 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000001000L});
    public static final BitSet FOLLOW_RSBRACKET_in_postfix_expression2340 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2370 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020820L});
    public static final BitSet FOLLOW_argument_list_in_postfix_expression2372 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2375 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_literal_in_atom_expression2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSBRACKET_in_atom_expression2429 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004021020L});
    public static final BitSet FOLLOW_argument_list_in_atom_expression2431 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000001000L});
    public static final BitSet FOLLOW_RSBRACKET_in_atom_expression2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expression2457 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_expression_in_atom_expression2460 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expression2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argument_list2480 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list2483 = new BitSet(new long[]{0x210C040818000100L, 0x0000000004020020L});
    public static final BitSet FOLLOW_expression_in_argument_list2486 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_TRUE_in_value_literal2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value_literal2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value_literal2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_value_literal2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value_literal2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_literal2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_literal2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_literal_in_literal2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_operator2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_add_operator2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_add_operator2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_operator2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_mul_operator2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2711 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASC_in_ordering_term2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DESC_in_ordering_term2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2755 = new BitSet(new long[]{0x0000000000000002L});
}
