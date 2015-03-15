lexer grammar MyLexer;

SELECT: 'select';
FROM: 'from';
WHERE: 'where';
AND: 'and' | '&&';
OR: 'or' | '||';
XOR: 'xor';
IS: 'is';
NULL: 'null';
LIKE: 'like';
IN: 'in';
EXISTS: 'exists';
ALL: 'all';
ANY: 'any';
TRUE: 'true';
FALSE: 'false';
DIVIDE	: 'div' | '/' ;
MOD: 'mod' | '%' ;
BETWEEN: 'between';
REGEXP: 'regexp';
PLUS	: '+' ;
MINUS	: '-' ;
NEGATION: '~' ;
VERTBAR	: '|' ;
BITAND	: '&' ;
POWER_OP: '^' ;
BINARY: 'binary';
SHIFT_LEFT	: '<<' ;
SHIFT_RIGHT	: '>>' ;
ESCAPE: 'escape';
ASTERISK: '*' ;
RPAREN	: ')' ;
LPAREN	: '(' ;
RBRACK	: ']' ;
LBRACK	: '[' ;
COLON	: ':' ;
ALL_FIELDS	: '.*' ;
EQ: '=';
LTH: '<';
GTH: '>';
NOT_EQ: '!=';
NOT: 'not';
LET: '<=';
GET: '>=';
SEMI: ';';
COMMA: ',';
DOT: '.';
COLLATE: 'collate';


ID: ('a'..'z' | 'A' .. 'Z' | '_')+ ;
INT: '0'..'9'+ ;


NEWLINE: '\r' ? '\n';
WS: (' ' | '\t' | '\n' | '\r')+ { $channel = HIDDEN; };

USER_VAR:
	'@' (USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4)
;

fragment USER_VAR_SUBFIX1:	(  '`' (~'`' )+ '`'  ) ;
fragment USER_VAR_SUBFIX2:	( '\'' (~'\'')+ '\'' ) ;
fragment USER_VAR_SUBFIX3:	( '\"' (~'\"')+ '\"' ) ;
fragment USER_VAR_SUBFIX4:	( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' | DOT )+ ;
