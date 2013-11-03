grammar cql;

options {
    language = Java;
    output = AST;
    //k = 4;
}

tokens {
    T_DELETE;
    T_INSERT;
    T_INTO;
    T_VALUES;
    T_FIELDS;
    T_SELECT;
    T_FROM;
    T_WHERE;
    T_NWHERE;
    T_FIELD_ALIAS;
    T_ORDER;
    T_ORDERING;
    T_LIMIT;
    T_OFFSET;
    T_ASC;
    T_DESC;
    T_USE;
    T_SERVER;
    T_AS;
    T_COMMIT;
    T_ROLLBACK;
    T_OPTIMIZE;
    T_OPERATOR_OR;
    T_OPERATOR_AND;
    T_OPERATOR_NOT;
    T_OPERATOR_EQUAL_TO_SINGLE;
    T_OPERATOR_EQUAL_TO_DOUBLE;
    T_OPERATOR_NOT_EQUAL_TO_SINGLE;
    T_OPERATOR_NOT_EQUAL_TO_DOUBLE;
    T_OPERATOR_LESS_THAN;
    T_OPERATOR_LESS_THAN_OR_EQUAL_TO;
    T_OPERATOR_GREATER_THAN;
    T_OPERATOR_GREATER_THAN_OR_EQUAL_TO;
    T_OPERATOR_PLUS;
    T_OPERATOR_MINUS;
    T_OPERATOR_ADD;
    T_OPERATOR_SUBTRACT;
    T_OPERATOR_MULTIPLY;
    T_OPERATOR_DIVIDE;
    T_OPERATOR_CALL;
    T_OPERATOR_INDEX;
    T_LIST;
    
    T_SUM;
    T_MAX;
    T_MIN;
    T_AVG;
    T_COUNT;
    T_DISTINCT;
}

@parser::header {
package net.moraleboost.flux.lang;
}

@lexer::header {
package net.moraleboost.flux.lang;
}

@members {
public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
throws RecognitionException
{
    throw new MismatchedTokenException(ttype, input);
}
}

@rulecatch {
catch (RecognitionException e) {
    throw e;
}
}

stmt_list
    : (stmt_core SEMICOLON!)* EOF!
    ;

stmt_core
    : select_stmt
    | insert_stmt
    | delete_stmt
    | use_stmt
    | commit_stmt
    | rollback_stmt
    | optimize_stmt
    ;

optimize_stmt
    : OPTIMIZE ID?
      -> ^(
        T_OPTIMIZE ID?
      )
    ;

rollback_stmt
    : ROLLBACK ID?
      -> ^(
        T_ROLLBACK ID?
      )
    ;

commit_stmt
    : COMMIT ID?
      -> ^(
        T_COMMIT ID?
      )
    ;

use_stmt
    : USE url=STRING (AS ref=ID)?
      -> ^(
        T_USE ^(T_SERVER $url) ^(T_AS $ref)?
      )
    ;

delete_stmt
    : DELETE (FROM src=ID)? where_clause?
      -> ^(
        T_DELETE ^(T_FROM $src)? where_clause?
      )
    ;

insert_stmt
    : INSERT (INTO dest=ID)? LPAREN fields+=ID (COMMA fields+=ID)* RPAREN
      ( VALUES LPAREN expression (COMMA expression)* RPAREN
      | select_stmt
      )
      -> ^(
        T_INSERT ^(T_INTO $dest)? ^(T_FIELDS $fields+) ^(T_VALUES expression+)? select_stmt?
      )
    ;

select_stmt
    : select_core (ORDER BY ordering_term (COMMA ordering_term)*)?
      (LIMIT limit=INTEGER (OFFSET offset=INTEGER)?)?
      -> ^(
        select_core ^(T_ORDER ordering_term+)? ^(T_LIMIT $limit)? ^(T_OFFSET $offset)?
      )
    ;

select_core
    : SELECT result_field (COMMA result_field)* (FROM src=ID)? where_clause?
      -> ^(
        T_SELECT ^(T_FIELDS result_field+) ^(T_FROM $src)? where_clause?
      )
    ;

where_clause
    : WHERE where_expr=where_expression
      -> ^(T_WHERE where_expression)
    | NWHERE STRING
      -> ^(T_NWHERE STRING)
    ;

result_field
    : expression (AS? field_alias=ID)?
      -> ^(T_FIELD_ALIAS expression $field_alias?)
    | func=SUM LPAREN field_name=ID RPAREN (AS field_alias=ID)?
      ->^(T_SUM T_FIELD_ALIAS $func $field_name T_AS $field_alias?)
    | func=COUNT LPAREN field_name=(ID|ASTERISK) RPAREN (AS field_alias=ID)?
      ->^(T_COUNT T_FIELD_ALIAS $func $field_name T_AS $field_alias?)
    | func=MAX LPAREN field_name=(ID) RPAREN (AS field_alias=ID)?
      ->^(T_MAX T_FIELD_ALIAS $func $field_name T_AS $field_alias?)
    | func=MIN LPAREN field_name=(ID) RPAREN (AS field_alias=ID)?
      ->^(T_MIN T_FIELD_ALIAS $func $field_name T_AS $field_alias?)
    | func=AVG LPAREN field_name=(ID) RPAREN (AS field_alias=ID)?
      ->^(T_AVG T_FIELD_ALIAS $func $field_name T_AS $field_alias?)
    ;

where_expression
    : (expr1=where_and_expression -> $expr1)
      (OR expr2=where_and_expression -> ^(T_OPERATOR_OR $where_expression $expr2))*
    ;

expression
    : (expr1=and_expression -> $expr1)
      (OR expr2=and_expression -> ^(T_OPERATOR_OR $expression $expr2))*
    ;

where_and_expression
    : (expr1=where_not_expression -> $expr1)
      (AND expr2=where_not_expression -> ^(T_OPERATOR_AND $where_and_expression $expr2))*
    ;

and_expression
    : (expr1=not_expression -> $expr1)
      (AND expr2=not_expression -> ^(T_OPERATOR_AND $and_expression $expr2))*
    ;

where_not_expression
    : (expr1=where_cmp_expression -> $expr1)
      (NOT expr2=where_cmp_expression -> ^(T_OPERATOR_NOT $where_not_expression $expr2))*
    ;

not_expression
    : (expr1=cmp_expression -> $expr1)
      (NOT expr2=cmp_expression -> ^(T_OPERATOR_NOT $not_expression $expr2))*
    ;

where_cmp_expression
    : expr1=where_unary_expression where_cmp_operator expr2=where_unary_expression
      -> ^(where_cmp_operator $expr1 $expr2)
    | LPAREN! where_expression RPAREN!
    ;

cmp_expression
    : (expr1=add_expression -> $expr1)
      (cmp_operator expr2=add_expression -> ^(cmp_operator $cmp_expression $expr2))*
    ;

where_cmp_operator
    : EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE
    | EQUAL_TO_DOUBLE -> T_OPERATOR_EQUAL_TO_DOUBLE
    | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
    | NOT_EQUAL_TO_DOUBLE -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE
    | LESS_THAN -> T_OPERATOR_LESS_THAN
    | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
    | GREATER_THAN -> T_OPERATOR_GREATER_THAN
    | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
    ;

cmp_operator
    : EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE
    | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
    | LESS_THAN -> T_OPERATOR_LESS_THAN
    | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
    | GREATER_THAN -> T_OPERATOR_GREATER_THAN
    | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
    ;

add_expression
    : (expr1=mul_expression -> $expr1)
      (add_operator expr2=mul_expression -> ^(add_operator $add_expression $expr2))*
    ;

mul_expression
    : (expr1=unary_expression -> $expr1)
      (mul_operator expr2=unary_expression -> ^(mul_operator $mul_expression $expr2))*
    ;

where_unary_expression
    : literal
    | unary_operator numeric_literal
      -> ^(unary_operator numeric_literal)
    ;

unary_expression
    : postfix_expression
    | unary_operator unary_expression
      -> ^(unary_operator unary_expression)
    ;

postfix_expression
    : (expr1=atom_expression -> $expr1)
      ( LSBRACKET expr2=expression RSBRACKET
        -> ^(T_OPERATOR_INDEX $postfix_expression $expr2)
      | LPAREN argument_list? RPAREN
        -> ^(T_OPERATOR_CALL $postfix_expression argument_list?)
      )*
    ;

atom_expression
    : literal
    | LSBRACKET argument_list? RSBRACKET
      -> ^(T_LIST argument_list?)
    | LPAREN! expression RPAREN!
    ;

argument_list
    : expression (COMMA! expression)*
    ;

numeric_literal
    : INTEGER
    | FLOAT
    ;

value_literal
    : TRUE
    | FALSE
    | STRING
    | numeric_literal
    | NULL
    ;

literal
    : ID
    | ASTERISK
    | value_literal
    ;

unary_operator
    : PLUS -> T_OPERATOR_PLUS
    | MINUS -> T_OPERATOR_MINUS
    ;

add_operator
    : PLUS -> T_OPERATOR_ADD
    | MINUS -> T_OPERATOR_SUBTRACT
    ;

mul_operator
    : ASTERISK -> T_OPERATOR_MULTIPLY
    | SLASH -> T_OPERATOR_DIVIDE
    ;

ordering_term
    : ID ASC -> ^(T_ORDERING ^(T_ASC ID))
    | ID DESC -> ^(T_ORDERING ^(T_DESC ID))
    | ID -> ^(T_ORDERING ^(T_ASC ID))
    ;

// characters
SEMICOLON:      ';';
ASTERISK:       '*';
COMMA:          ',';
UNDERSCORE:     '_';
QUOTE_DOUBLE:   '"';
QUOTE_SINGLE:   '\'';
BACKSLASH:      '\\';
BACKTICK:       '`';
LPAREN:         '(';
RPAREN:         ')';
LSBRACKET:      '[';
RSBRACKET:      ']';
LESS_THAN:      '<';
LESS_THAN_OR_EQUAL_TO: '<=';
GREATER_THAN:   '>';
GREATER_THAN_OR_EQUAL_TO: '>=';
PLUS:           '+';
MINUS:          '-';
SLASH:          '/';
EQUAL_TO_SINGLE: '=';
EQUAL_TO_DOUBLE: '==';
NOT_EQUAL_TO_SINGLE: '!=';
NOT_EQUAL_TO_DOUBLE: '!==';

fragment A: ('a' | 'A');
fragment B: ('b' | 'B');
fragment C: ('c' | 'C');
fragment D: ('d' | 'D');
fragment E: ('e' | 'E');
fragment F: ('f' | 'F');
fragment G: ('g' | 'G');
fragment H: ('h' | 'H');
fragment I: ('i' | 'I');
fragment J: ('j' | 'J');
fragment K: ('k' | 'K');
fragment L: ('l' | 'L');
fragment M: ('m' | 'M');
fragment N: ('n' | 'N');
fragment O: ('o' | 'O');
fragment P: ('p' | 'P');
fragment Q: ('q' | 'Q');
fragment R: ('r' | 'R');
fragment S: ('s' | 'S');
fragment T: ('t' | 'T');
fragment U: ('u' | 'U');
fragment V: ('v' | 'V');
fragment W: ('w' | 'W');
fragment X: ('x' | 'X');
fragment Y: ('y' | 'Y');
fragment Z: ('z' | 'Z');

// keywords
DELETE:     D E L E T E;
INSERT:     I N S E R T;
INTO:       I N T O;
VALUES:     V A L U E S;
SELECT:     S E L E C T;
ORDER:      O R D E R;
BY:         B Y;
LIMIT:      L I M I T;
OFFSET:     O F F S E T;
FROM:       F R O M;
WHERE:      W H E R E;
NWHERE:     N W H E R E;
ASC:        A S C;
DESC:       D E S C;
USE:        U S E;
AS:         A S;
COMMIT:     C O M M I T;
ROLLBACK:   R O L L B A C K;
OPTIMIZE:   O P T I M I Z E;
OR:         O R;
AND:        A N D;
NOT:        N O T;
NULL:       N U L L;
TRUE:       T R U E;
FALSE:      F A L S E;
SUM:	    S U M;
MAX:	    M A X;
MIN:	    M I N;
AVG:	    A V G;
MID:	    M I D;
COUNT:	    C O U N T;
DISTICNT:   D I S T I C N T;


// basic elements
STRING:                         STRING_SINGLE | STRING_DOUBLE;
fragment STRING_DOUBLE:         QUOTE_DOUBLE STRING_CORE_DOUBLE* QUOTE_DOUBLE;
fragment STRING_SINGLE:         QUOTE_SINGLE STRING_CORE_SINGLE* QUOTE_SINGLE;
fragment STRING_CORE_DOUBLE:    STRING_CORE | QUOTE_SINGLE | STRING_ESCAPE_CORE;
fragment STRING_CORE_SINGLE:    STRING_CORE | QUOTE_DOUBLE | STRING_ESCAPE_CORE;
fragment STRING_CORE:           ~(QUOTE_SINGLE | QUOTE_DOUBLE);
fragment STRING_ESCAPE_CORE:    BACKSLASH (BACKSLASH | QUOTE_DOUBLE | QUOTE_SINGLE | 'r' | 'n' | 't');

ID:                             ID_PLAIN | ID_ESCAPE;
fragment ID_PLAIN:              ID_START ID_CORE*;
fragment ID_ESCAPE:             BACKTICK ID_ESCAPE_CORE+ BACKTICK;
fragment ID_START:              'a'..'z' | 'A'..'Z' | UNDERSCORE;
fragment ID_CORE:               ID_START | '0'..'9';
fragment ID_ESCAPE_CORE:        ~BACKTICK;

INTEGER:                        ('0'..'9')+;

FLOAT
    : ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    | '.' ('0'..'9')+ EXPONENT?
    | ('0'..'9')+ EXPONENT
    ;
fragment EXPONENT:              ('e' | 'E') ('+' | '-')? ('0'..'9')+;

WS: (' ' | '\r' | '\t' | '\n') { $channel=HIDDEN; };
