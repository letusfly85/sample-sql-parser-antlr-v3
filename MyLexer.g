lexer grammar MyLexer;

SELECT: 'select';
FROM: 'from';
WHERE: 'where';
AND: 'and';
EQ: '=';

SEMI: ';';

ID: ('a'..'z' | 'A' .. 'Z')+ ;

INT: '0'..'9'+ ;

NEWLINE: '\r' ? '\n';

COMMA: ',';

WS: (' ' | '\t' | '\n' | '\r')+ { $channel = HIDDEN; };

/*
expr:	multExpr (('+'^|'-'^) multExpr)*
	;

multExpr
	:	atom ('*' ^ atom)*
	;

atom:	INT
	|	ID
	|	'('! expr ')'!
	;

prog:	( stat {System.out.println($stat.tree.toStringTree());} )+ ;

stat:	expr NEWLINE		-> expr
	|	ID '=' expr NEWLINE -> ^('=' ID expr)
	|	NEWLINE				->
	;
*/
