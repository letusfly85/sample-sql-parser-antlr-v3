lexer grammar MyLexer;

SELECT: 'select';
FROM: 'from';
WHERE: 'where';
AND: 'and';
EQ: '=';
LTH: '<';
GTH: '>';
NOT_EQ: '!=';
LET: '<=';
GET: '>=';

SEMI: ';';

ID: ('a'..'z' | 'A' .. 'Z' | '_')+ ;

INT: '0'..'9'+ ;

NEWLINE: '\r' ? '\n';

COMMA: ',';

WS: (' ' | '\t' | '\n' | '\r')+ { $channel = HIDDEN; };

USER_VAR:
	'@' (USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4)
;

DOT: '.';

fragment USER_VAR_SUBFIX1:	(  '`' (~'`' )+ '`'  ) ;
fragment USER_VAR_SUBFIX2:	( '\'' (~'\'')+ '\'' ) ;
fragment USER_VAR_SUBFIX3:	( '\"' (~'\"')+ '\"' ) ;
fragment USER_VAR_SUBFIX4:	( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' | DOT )+ ;
