grammar AExclamated;

program: line* EOF;

line: statement | ifBlock | whileBlock;

statement: (assignment | functionCall) ';';

ifBlock: 'if' '(' expression ')' block ('else' elseIfBlock);

elseIfBlock: block | ifBlock;

block: '{' line* '}';

whileBlock: 'while' '(' expression ')' block ('else' elseIfBlock);

assignment: IDENTIFIER '=' expression;

functionCall: IDENTIFIER '(' ( expression (',' expression)* )? ')';

expression
    : constant                          # constantExpression
    | IDENTIFIER                        # identifierExpression
    | functionCall                      # functionCallExpression
    | '(' expression ')'                # parenthesizedExpression
    | '!' expression                    # notExpression
    | expression MultOp expression      # multiplicationExpression
    | expression AddOp expression       # additionExpression
    | expression CompOp expression      # comparisonExpression
    | expression BoolOp expression      # booleanExpression
    ;

constant: INTEGER | FLOAT | STRING | BOOL | NULL;

MultOp: '*' | '/' | '%';

AddOp: '+' | '-';

CompOp: '==' | '!=' | '>=' | '<=' | '>' | '<';

BoolOp: '&&' | '||' | '|!|';

WS: [ \t\r\n]+ -> skip;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

INTEGER: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]+;

STRING: ('"' ~'"'* '"') | ('\'' ~'\''* '"');

BOOL: 'TRUE' | 'FALSE';

NULL: 'NIL';