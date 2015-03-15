grammar MySelect;

options {
	tokenVocab=MyLexer;
	output=AST;
}

import MyLexer;

tokens {
	SELECT_STATEMENT;
	COLUMN_LIST;
	COLUMN_CLAUSE;
	COLUMN_NAME;
	COLUMN_ALIAS;
	ALIAS_NAME;
	FROM_LIST;
	FROM_TABLE;
	FROM_ALIAS;
	WHERE_CLAUSES;
	WHERE_CLAUSE;
	NOT_SYM;
	OR_SYM;
	XOR_SYM;
	IS_SYM;
	NULL_SYM;
	AND_SYM;
	LIKE_SYM;
	EQ_SYM;
	TRUE_SYM;
	FALSE_SYM;
	ESCAPE_SYM;
	VARDEF;
	COLLATE_SYM;
	REL;
	EXPR;
}

stat:
		select_clause+
	;

select_clause:
		select_key
		column_list_clause
		(from_clause)?
		(where_clause)?
		->
		^(SELECT_STATEMENT
			^(COLUMN_LIST column_list_clause)
			^(FROM_LIST from_clause)*
			^(WHERE_CLAUSES where_clause)*
		)
		;

table_name:
	ID
	;

column_name:
	USER_VAR | ID
	;

column_name_alias:
	ID
	;

column_clause:
		column_name  column_name_alias
	->	(COLUMN_CLAUSE ^(COLUMN_NAME column_name COLUMN_ALIAS column_name_alias))* 
	|
		column_name
	->	(COLUMN_CLAUSE ^(COLUMN_NAME column_name))* 
	;

column_list_clause:
		column_clause (COMMA column_clause)* (NEWLINE)?
	->	(column_clause)*
	;

from_clause:
		FROM table_name (COMMA table_name)* (NEWLINE)?
	->	(FROM_TABLE table_name)*
	;
		
select_key:
		SELECT
	;

where_clause:
		WHERE expression
	->	(expression)*
		;

expression:
		simple_expression (NEWLINE)? (expr_op simple_expression (NEWLINE)?)*
	-> (REL simple_expression)*
	;

element:
		USER_VAR | ID | ('|' ID '|') | INT
	;

right_element:
		element
	;

left_element:
		element
	;

target_element:
		element
	;

relational_op: 
		EQ | LTH | GTH | NOT_EQ | LET | GET  ;

expr_op:
		AND | XOR | OR | NOT;	

between_op:
		BETWEEN
	;

is_or_is_not:
		IS | IS NOT
	;

simple_expression:
		left_element relational_op right_element
	->	^(EXPR relational_op ^(left_element right_element))
	|	
		target_element between_op left_element AND right_element
	->	^(EXPR between_op ^(left_element right_element))
	|
		target_element is_or_is_not NULL
	-> 	^(EXPR is_or_is_not ^(target_element))
	;

/*
expression:	exp_factor1 ( OR exp_factor1 )* ;
exp_factor1:	exp_factor2 ( XOR exp_factor2 )* ;
exp_factor2:	exp_factor3 ( AND exp_factor3 )* ;
exp_factor3:	(NOT_EQ)? exp_factor4 ;
exp_factor4:	bool_primary ( IS (NOT_EQ)? (boolean_literal|NULL) )? ;
bool_primary:
	  ( predicate relational_op predicate ) 
	//| ( predicate relational_op ( ALL | ANY )? subquery )
	| ( (NOT)? EXISTS subquery )
	//| predicate 
;
predicate:
	  ( bit_expr (NOT)? IN (subquery | expression_list) )
	| ( bit_expr (NOT)? BETWEEN bit_expr AND predicate ) 
	//| ( bit_expr SOUNDS_SYM LIKE_SYM bit_expr ) 
	| ( bit_expr (NOT)? LIKE simple_expr (ESCAPE simple_expr)? )
	| ( bit_expr (NOT)? REGEXP bit_expr ) 
	| ( bit_expr )  
;
bit_expr:
	factor1 ( VERTBAR factor1 )? ;
factor1:
	factor2 ( BITAND factor2 )? ;
factor2:
	factor3 ( (SHIFT_LEFT|SHIFT_RIGHT) factor3 )? ;
factor3:
	factor4 ( (PLUS|MINUS) factor4 )? ;
factor4:
	factor5 ( (ASTERISK|DIVIDE|MOD|POWER_OP) factor5 )? ;
factor5:
	factor6; ( (PLUS|MINUS) interval_expr )? ;
factor6:
	(PLUS | MINUS | NEGATION | BINARY) simple_expr
	| simple_expr ;
factor7:
	simple_expr (COLLATE_SYM collation_names)?;
*/

simple_expr:
	  literal_value 
	//| column_spec
	//| function_call
	////| param_marker
	| USER_VAR
	//| expression_list
	//| (ROW_SYM expression_list)
	//| subquery
	//| EXISTS subquery
	//| {identifier expression}
	//| match_against_statement
	//| case_when_statement
	//| interval_expr
;

/*
expression_list:
	LPAREN expression ( COMMA expression )* RPAREN ;

boolean_literal:	TRUE | FALSE;

subquery:
	LPAREN select_clause RPAREN
;
*/

literal_value:
        //( string_literal | number_literal | hex_literal | boolean_literal | bit_literal | NULL_SYM ) ;
		ID;

//string_literal:		TEXT_STRING ;


/*
expression:	exp_factor1 ( OR_SYM exp_factor1 )* ;
exp_factor1:	exp_factor2 ( XOR exp_factor2 )* ;
exp_factor2:	exp_factor3 ( AND_SYM exp_factor3 )* ;
exp_factor3:	(NOT_SYM)? exp_factor4 ;
exp_factor4:	bool_primary ( IS_SYM (NOT_SYM)? (boolean_literal|NULL_SYM) )? ;
bool_primary:
	  ( predicate relational_op predicate ) 
	| ( predicate relational_op ( ALL | ANY )? subquery )
	| ( NOT_SYM? EXISTS subquery )
	| predicate 
;
predicate:
	  ( bit_expr (NOT_SYM)? IN_SYM (subquery | expression_list) )
	| ( bit_expr (NOT_SYM)? BETWEEN bit_expr AND_SYM predicate ) 
	| ( bit_expr SOUNDS_SYM LIKE_SYM bit_expr ) 
	| ( bit_expr (NOT_SYM)? LIKE_SYM simple_expr (ESCAPE_SYM simple_expr)? )
	| ( bit_expr (NOT_SYM)? REGEXP bit_expr ) 
	| ( bit_expr )  
;
bit_expr:
	factor1 ( VERTBAR factor1 )? ;
factor1:
	factor2 ( BITAND factor2 )? ;
factor2:
	factor3 ( (SHIFT_LEFT|SHIFT_RIGHT) factor3 )? ;
factor3:
	factor4 ( (PLUS|MINUS) factor4 )? ;
factor4:
	factor5 ( (ASTERISK|DIVIDE|MOD_SYM|POWER_OP) factor5 )? ;
factor5:
	factor6 ( (PLUS|MINUS) interval_expr )? ;
factor6:
	(PLUS | MINUS | NEGATION | BINARY) simple_expr
	| simple_expr ;
factor7:
	simple_expr (COLLATE_SYM collation_names)?;
simple_expr:
	literal_value 
	| column_spec
	| function_call
	//| param_marker
	| USER_VAR
	| expression_list
	| (ROW_SYM expression_list)
	| subquery
	| EXISTS subquery
	//| {identifier expression}
	| match_against_statement
	| case_when_statement
	| interval_expr
;
*/

