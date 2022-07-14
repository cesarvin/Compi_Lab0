grammar YAPL;


/*
 * Consideraciones Léxicas
 */

// enteros
INT: [0-9]+;

// letras
LETTER : [a-z]+ | [A-Z]+ ;

// identificador
ID: LETTER (LETTER | INT )*;

// palabras reservadas
CLASS:    'class' | 'CLASS';
ELSE:     'else' | 'ELSE';
FI:       'fi' | 'FI';
IF:       'if' | 'IF';
IN:       'in' | 'IN';
INHERITS: 'inherits' | 'INHERITS';
ISVOID:   'isvoid' | 'ISVOID';
LOOP:     'loop' | 'LOOP';
POOL:     'pool' | 'POOL';
THEN:     'then' | 'THEN';
WHILE:    'while' | 'WHILE';
NEW:      'new' | 'NEW';
NOT:      'not' | 'NOT';

// reservadas constantes
FALSE:    'false';
TRUE:     'true';
 
// cadenas  
STRING:         '"' ( '\\' [btnfr"'\\] | ~[\0\b\t\f\r\n\\"] )* '"';
ILLEGAL_ESCAPE: '"' ('\\' ~[btnfr"'\\] | ~'\\')*;

// comentarios 
COMMENT:      '--' .*? '--' -> skip; 
COMMENTBLOCK: '(*' .*? '*)' -> skip; 

// espacios en blanco
NEWLINE		: ('\r'? '\n' | '\r')+ -> skip;
WHITESPACE: [ \n\f\r\t\v]+ -> skip ; 

