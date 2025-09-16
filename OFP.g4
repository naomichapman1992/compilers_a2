grammar OFP;

// Parser rules

program
  : statement* EOF
  ;

statement
  : assignment SC              # AssignStmt
  | SC                         # EmptyStmt
  ;

assignment
  : lvalue ASSIGN expression
  ;

lvalue
  : ID ('[' expression ']')*
  ;

expression
  : expression bop=OR            expression  # OrExpr
  | expression bop=AND           expression  # AndExpr
  | expression bop=(EQ|NEQ)      expression  # EqExpr
  | expression bop=(LT|LE|GE|GT) expression  # RelExpr
  | expression bop=('*'|'/')     expression  # MulDivExpr
  | expression bop=('+'|'-')     expression  # AddSubExpr
  |      uop=('!'|'-')           expression  # UnaryExpr
  | postfix                                  # PrimaryExpr
  ;

postfix
  : primary (
      '[' expression ']'
    | '.' ID
    | '(' argList? ')'
    | '.' LENGTH
    )*
  ;

primary
  : '(' expression ')'
  | INT
  | TRUE
  | FALSE
  | ID
  ;

argList
  : expression (',' expression)*
  ;

// Lexer rules

TRUE   : 'true';
FALSE  : 'false';
LENGTH : 'length';

EQ     : '==';
NEQ    : '!=';
LE     : '<=';
GE     : '>=';
AND    : '&&';
OR     : '||';
ASSIGN : '=';
LT     : '<';
GT     : '>';
SC     : ';';

ID     : [a-zA-Z]+;                // identifiers: letters only
INT    : '0' | [1-9][0-9]*;        // integer literal

WS           : [ \t\r\n]+ -> skip;
HASH_COMMENT : '#' ~[\r\n]* -> skip;   // OFP comments
