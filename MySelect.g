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
}

stat:
		select_clause+
	;

select_clause:
		select_key
		column_list_clause
		(from_clause)?
		->
		^(SELECT_STATEMENT
			^(COLUMN_LIST column_list_clause)
			^(FROM_LIST from_clause)*
		)
	;


column_list_clause:
		ID (COMMA ID)* -> (COLUMN_NAME ID)* ;

from_clause:
		FROM ID (COMMA ID)* -> (FROM_TABLE ID)* ;
		
select_key:
	SELECT
	;
