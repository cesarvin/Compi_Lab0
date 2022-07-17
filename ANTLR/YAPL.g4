grammar YAPL;

/*
 * Consideraciones Léxicas
 */

// enteros
INT: [0-9]+;

// identificador
ID: [a-z][_A-Za-z0-9]*;
TYPE: [A-Z][_A-Za-z0-9]*;

// palabras reservadas
CLASS: 'class' | 'CLASS';
ELSE: 'else' | 'ELSE';
FI: 'fi' | 'FI';
IF: 'if' | 'IF';
IN: 'in' | 'IN';
INHERITS: 'inherits' | 'INHERITS';
IS_VOID: 'isvoid' | 'ISVOID';
LOOP: 'loop' | 'LOOP';
POOL: 'pool' | 'POOL';
THEN: 'then' | 'THEN';
WHILE: 'while' | 'WHILE';
NEW: 'new' | 'NEW';
NOT: 'not' | 'NOT';
LET: 'let' | 'LET';

// reservadas constantes
FALSE: 'false';
TRUE: 'true';

// cadenas  
STRING: '"' (ESC | ~ ["\\])* '"';
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

// comentarios 
COMMENT: '--' ~[\r\n]* -> skip;
COMMENT_BLOCK: '(*' ~[_a-zA-Z0-9\r\n\t]* '*)' -> skip;

// espacios en blanco
WHITE_SPACE: [ \t\f\r\n]+ -> skip;

// simbolos y tipos
SEMICOLON: ';';
OPEN_CURLY_BRACKETS: '{';
CLOSE_CURLY_BRACKETS: '}';
OPEN_PARENTHESES: '(';
CLOSE_PARENTHESES: ')';
COMMA: ',';
COLON: ':';
ASSING: '<-';
AT: '@';
DOT: '.';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
EQUAL: '=';
N_MARK: '~';
LOWER_THAN: '<';
LOWER_THAN_EQUAL: '<=';

/*
 * Consideraciones Semanticas
 */

program: (newclass SEMICOLON)+ EOF;

newclass:
	CLASS TYPE (INHERITS TYPE)? OPEN_CURLY_BRACKETS (
		feature SEMICOLON
	)* CLOSE_CURLY_BRACKETS;

feature: (
		ID OPEN_PARENTHESES (formal COMMA*)* CLOSE_PARENTHESES COLON TYPE OPEN_CURLY_BRACKETS expr
			CLOSE_CURLY_BRACKETS
	)
	| ID COLON TYPE (ASSING expr)?;

formal: ID COLON TYPE;

expr:
	expr OPEN_PARENTHESES (expr COMMA?)+ CLOSE_PARENTHESES
	| expr (AT TYPE)? DOT ID OPEN_PARENTHESES (
		expr (COMMA expr)*
	)* CLOSE_PARENTHESES
	| IF expr THEN expr ELSE expr FI
	| WHILE expr LOOP expr POOL
	| OPEN_CURLY_BRACKETS (expr SEMICOLON)+ CLOSE_CURLY_BRACKETS
	| LET ID COLON TYPE (ASSING expr)? (
		COMMA ID COLON TYPE ASSING expr
	)* IN expr
	| NEW TYPE
	| IS_VOID expr
	| N_MARK expr
	| expr MUL expr
	| expr DIV expr
	| expr ADD expr
	| expr SUB expr
	| expr LOWER_THAN_EQUAL expr
	| expr LOWER_THAN expr
	| expr EQUAL expr
	| NOT expr
	| OPEN_PARENTHESES expr CLOSE_PARENTHESES
	| ID ASSING expr
	| ID
	| INT
	| STRING
	| TRUE
	| FALSE;

