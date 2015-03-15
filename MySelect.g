parser grammar MySelect;

options {
	tokenVocab=MyLexer;
	output=AST;
}

tokens {
	SELECT_STATEMENT;
	COLUMN_NAME;
	COLUMN_LIST;
}

stat:
		select_clause+
	;

select_clause:
		select_key colum_list_clause
		-> ^(SELECT_STATEMENT ^(COLUMN_LIST colum_list_clause))
	;

colum_list_clause:
		//ID (COMMA ID)* ;//-> (COLUMN_NAME ID)* ;
		ID (COMMA ID)* -> (COLUMN_NAME ID)* ;
		

select_key:
	SELECT
	;
