parser grammar MySelect;

options {
	tokenVocab=MyLexer;
	output=AST;
}

tokens {
	SELECT_STATEMENT;
	COLUMN_LIST;
	COLUMN_NAME;
	FROM_LIST;
	FROM_TABLE;
	FROM_ALIAS;
	WHERE_CLAUSE;
	NOT_SYM;
	OR_SYM;
	AND_SYM;
	EQ_SYM = '=';
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
			^(WHERE_CLAUSE where_clause)*
		)
		;

column_list_clause:
		ID (COMMA ID)* -> (COLUMN_NAME ID)*
		;

from_clause:
		FROM ID (COMMA ID)* -> (FROM_TABLE ID)*
		;
		
select_key:
		SELECT
		;

relational_op: 
		EQ_SYM;  //| LTH | GTH | NOT_EQ | LET | GET  ;

where_clause:
		//WHERE expression -> (WHERE_CLAUSE expression)
		WHERE ID relational_op ID  -> ^(VARDEF ID)
		;

expression:
		VARDEF relational_op ID  -> ^(VARDEF ID)
		;

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

