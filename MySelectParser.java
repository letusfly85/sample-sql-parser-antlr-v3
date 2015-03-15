// $ANTLR 3.4 MySelect.g 2015-03-16 00:32:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "ALL_FIELDS", "AND", "ANY", "ASTERISK", "BETWEEN", "BINARY", "BITAND", "COLLATE", "COLON", "COMMA", "DIVIDE", "DOT", "EQ", "ESCAPE", "EXISTS", "FALSE", "FROM", "GET", "GTH", "ID", "IN", "INT", "IS", "LBRACK", "LET", "LIKE", "LPAREN", "LTH", "MINUS", "MOD", "NEGATION", "NEWLINE", "NOT", "NOT_EQ", "NULL", "OR", "PLUS", "POWER_OP", "RBRACK", "REGEXP", "RPAREN", "SELECT", "SEMI", "SHIFT_LEFT", "SHIFT_RIGHT", "TRUE", "USER_VAR", "USER_VAR_SUBFIX1", "USER_VAR_SUBFIX2", "USER_VAR_SUBFIX3", "USER_VAR_SUBFIX4", "VERTBAR", "WHERE", "WS", "XOR", "ALIAS_NAME", "AND_SYM", "COLLATE_SYM", "COLUMN_ALIAS", "COLUMN_CLAUSE", "COLUMN_LIST", "COLUMN_NAME", "EQ_SYM", "ESCAPE_SYM", "EXPR", "FALSE_SYM", "FROM_ALIAS", "FROM_LIST", "FROM_TABLE", "IS_SYM", "LIKE_SYM", "NOT_SYM", "NULL_SYM", "OR_SYM", "REL", "SELECT_STATEMENT", "TRUE_SYM", "VARDEF", "'|'", "WHERE_CLAUSE", "WHERE_CLAUSES", "XOR_SYM"
    };

    public static final int EOF=-1;
    public static final int ALL=4;
    public static final int ALL_FIELDS=5;
    public static final int AND=6;
    public static final int ANY=7;
    public static final int ASTERISK=8;
    public static final int BETWEEN=9;
    public static final int BINARY=10;
    public static final int BITAND=11;
    public static final int COLLATE=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int DIVIDE=15;
    public static final int DOT=16;
    public static final int EQ=17;
    public static final int ESCAPE=18;
    public static final int EXISTS=19;
    public static final int FALSE=20;
    public static final int FROM=21;
    public static final int GET=22;
    public static final int GTH=23;
    public static final int ID=24;
    public static final int IN=25;
    public static final int INT=26;
    public static final int IS=27;
    public static final int LBRACK=28;
    public static final int LET=29;
    public static final int LIKE=30;
    public static final int LPAREN=31;
    public static final int LTH=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int NEGATION=35;
    public static final int NEWLINE=36;
    public static final int NOT=37;
    public static final int NOT_EQ=38;
    public static final int NULL=39;
    public static final int OR=40;
    public static final int PLUS=41;
    public static final int POWER_OP=42;
    public static final int RBRACK=43;
    public static final int REGEXP=44;
    public static final int RPAREN=45;
    public static final int SELECT=46;
    public static final int SEMI=47;
    public static final int SHIFT_LEFT=48;
    public static final int SHIFT_RIGHT=49;
    public static final int TRUE=50;
    public static final int USER_VAR=51;
    public static final int USER_VAR_SUBFIX1=52;
    public static final int USER_VAR_SUBFIX2=53;
    public static final int USER_VAR_SUBFIX3=54;
    public static final int USER_VAR_SUBFIX4=55;
    public static final int VERTBAR=56;
    public static final int WHERE=57;
    public static final int WS=58;
    public static final int XOR=59;
    public static final int ALIAS_NAME=60;
    public static final int AND_SYM=64;
    public static final int COLLATE_SYM=71;
    public static final int COLUMN_ALIAS=73;
    public static final int COLUMN_CLAUSE=74;
    public static final int COLUMN_LIST=75;
    public static final int COLUMN_NAME=76;
    public static final int EQ_SYM=81;
    public static final int ESCAPE_SYM=83;
    public static final int EXPR=85;
    public static final int FALSE_SYM=87;
    public static final int FROM_ALIAS=89;
    public static final int FROM_LIST=90;
    public static final int FROM_TABLE=91;
    public static final int IS_SYM=98;
    public static final int LIKE_SYM=102;
    public static final int NOT_SYM=111;
    public static final int NULL_SYM=113;
    public static final int OR_SYM=115;
    public static final int REL=120;
    public static final int SELECT_STATEMENT=123;
    public static final int TRUE_SYM=128;
    public static final int VARDEF=134;
    public static final int WHERE_CLAUSE=137;
    public static final int WHERE_CLAUSES=138;
    public static final int XOR_SYM=141;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MySelectParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySelectParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MySelectParser.tokenNames; }
    public String getGrammarFileName() { return "MySelect.g"; }


    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // MySelect.g:39:1: stat : ( select_clause )+ ;
    public final MySelectParser.stat_return stat() throws RecognitionException {
        MySelectParser.stat_return retval = new MySelectParser.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:39:5: ( ( select_clause )+ )
            // MySelect.g:40:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:40:3: ( select_clause )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MySelect.g:40:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat143);
            	    select_clause1=select_clause();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_clause1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class select_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_clause"
    // MySelect.g:43:1: select_clause : select_key column_list_clause ( from_clause )? ( where_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clause ) )* ) ;
    public final MySelectParser.select_clause_return select_clause() throws RecognitionException {
        MySelectParser.select_clause_return retval = new MySelectParser.select_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.select_key_return select_key2 =null;

        MySelectParser.column_list_clause_return column_list_clause3 =null;

        MySelectParser.from_clause_return from_clause4 =null;

        MySelectParser.where_clause_return where_clause5 =null;


        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
        RewriteRuleSubtreeStream stream_column_list_clause=new RewriteRuleSubtreeStream(adaptor,"rule column_list_clause");
        RewriteRuleSubtreeStream stream_select_key=new RewriteRuleSubtreeStream(adaptor,"rule select_key");
        try {
            // MySelect.g:43:14: ( select_key column_list_clause ( from_clause )? ( where_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clause ) )* ) )
            // MySelect.g:44:3: select_key column_list_clause ( from_clause )? ( where_clause )?
            {
            pushFollow(FOLLOW_select_key_in_select_clause155);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_column_list_clause_in_select_clause159);
            column_list_clause3=column_list_clause();

            state._fsp--;

            stream_column_list_clause.add(column_list_clause3.getTree());

            // MySelect.g:46:3: ( from_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FROM) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySelect.g:46:4: from_clause
                    {
                    pushFollow(FOLLOW_from_clause_in_select_clause164);
                    from_clause4=from_clause();

                    state._fsp--;

                    stream_from_clause.add(from_clause4.getTree());

                    }
                    break;

            }


            // MySelect.g:47:3: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySelect.g:47:4: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_clause171);
                    where_clause5=where_clause();

                    state._fsp--;

                    stream_where_clause.add(where_clause5.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_list_clause, from_clause, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clause ) )* )
            {
                // MySelect.g:49:3: ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clause ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:50:4: ^( COLUMN_LIST column_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_column_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MySelect.g:51:4: ( ^( FROM_LIST from_clause ) )*
                while ( stream_from_clause.hasNext() ) {
                    // MySelect.g:51:4: ^( FROM_LIST from_clause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(FROM_LIST, "FROM_LIST")
                    , root_2);

                    adaptor.addChild(root_2, stream_from_clause.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_from_clause.reset();

                // MySelect.g:52:4: ( ^( WHERE_CLAUSES where_clause ) )*
                while ( stream_where_clause.hasNext() ) {
                    // MySelect.g:52:4: ^( WHERE_CLAUSES where_clause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(WHERE_CLAUSES, "WHERE_CLAUSES")
                    , root_2);

                    adaptor.addChild(root_2, stream_where_clause.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_clause"


    public static class table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_name"
    // MySelect.g:56:1: table_name : ID ;
    public final MySelectParser.table_name_return table_name() throws RecognitionException {
        MySelectParser.table_name_return retval = new MySelectParser.table_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID6=null;

        Object ID6_tree=null;

        try {
            // MySelect.g:56:11: ( ID )
            // MySelect.g:57:2: ID
            {
            root_0 = (Object)adaptor.nil();


            ID6=(Token)match(input,ID,FOLLOW_ID_in_table_name226); 
            ID6_tree = 
            (Object)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_name"


    public static class column_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_name"
    // MySelect.g:60:1: column_name : ( USER_VAR | ID );
    public final MySelectParser.column_name_return column_name() throws RecognitionException {
        MySelectParser.column_name_return retval = new MySelectParser.column_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set7=null;

        Object set7_tree=null;

        try {
            // MySelect.g:60:12: ( USER_VAR | ID )
            // MySelect.g:
            {
            root_0 = (Object)adaptor.nil();


            set7=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==USER_VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set7)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_name"


    public static class column_name_alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_name_alias"
    // MySelect.g:64:1: column_name_alias : ID ;
    public final MySelectParser.column_name_alias_return column_name_alias() throws RecognitionException {
        MySelectParser.column_name_alias_return retval = new MySelectParser.column_name_alias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;

        Object ID8_tree=null;

        try {
            // MySelect.g:64:18: ( ID )
            // MySelect.g:65:2: ID
            {
            root_0 = (Object)adaptor.nil();


            ID8=(Token)match(input,ID,FOLLOW_ID_in_column_name_alias250); 
            ID8_tree = 
            (Object)adaptor.create(ID8)
            ;
            adaptor.addChild(root_0, ID8_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_name_alias"


    public static class column_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_clause"
    // MySelect.g:68:1: column_clause : ( column_name column_name_alias -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )* | column_name -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )* );
    public final MySelectParser.column_clause_return column_clause() throws RecognitionException {
        MySelectParser.column_clause_return retval = new MySelectParser.column_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.column_name_return column_name9 =null;

        MySelectParser.column_name_alias_return column_name_alias10 =null;

        MySelectParser.column_name_return column_name11 =null;


        RewriteRuleSubtreeStream stream_column_name_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_name_alias");
        RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name");
        try {
            // MySelect.g:68:14: ( column_name column_name_alias -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )* | column_name -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==USER_VAR) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==COMMA||LA4_1==FROM||LA4_1==NEWLINE||LA4_1==SELECT||LA4_1==WHERE) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // MySelect.g:69:3: column_name column_name_alias
                    {
                    pushFollow(FOLLOW_column_name_in_column_clause261);
                    column_name9=column_name();

                    state._fsp--;

                    stream_column_name.add(column_name9.getTree());

                    pushFollow(FOLLOW_column_name_alias_in_column_clause264);
                    column_name_alias10=column_name_alias();

                    state._fsp--;

                    stream_column_name_alias.add(column_name_alias10.getTree());

                    // AST REWRITE
                    // elements: column_name, column_name_alias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:2: -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )*
                    {
                        // MySelect.g:70:5: ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )*
                        while ( stream_column_name.hasNext()||stream_column_name_alias.hasNext() ) {
                            adaptor.addChild(root_0, 
                            (Object)adaptor.create(COLUMN_CLAUSE, "COLUMN_CLAUSE")
                            );

                            // MySelect.g:70:20: ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(
                            (Object)adaptor.create(COLUMN_NAME, "COLUMN_NAME")
                            , root_1);

                            adaptor.addChild(root_1, stream_column_name.nextTree());

                            adaptor.addChild(root_1, 
                            (Object)adaptor.create(COLUMN_ALIAS, "COLUMN_ALIAS")
                            );

                            adaptor.addChild(root_1, stream_column_name_alias.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_column_name.reset();
                        stream_column_name_alias.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // MySelect.g:72:3: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_column_clause290);
                    column_name11=column_name();

                    state._fsp--;

                    stream_column_name.add(column_name11.getTree());

                    // AST REWRITE
                    // elements: column_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:2: -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )*
                    {
                        // MySelect.g:73:5: ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )*
                        while ( stream_column_name.hasNext() ) {
                            adaptor.addChild(root_0, 
                            (Object)adaptor.create(COLUMN_CLAUSE, "COLUMN_CLAUSE")
                            );

                            // MySelect.g:73:20: ^( COLUMN_NAME column_name )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(
                            (Object)adaptor.create(COLUMN_NAME, "COLUMN_NAME")
                            , root_1);

                            adaptor.addChild(root_1, stream_column_name.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_column_name.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_clause"


    public static class column_list_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_list_clause"
    // MySelect.g:76:1: column_list_clause : column_clause ( COMMA column_clause )* ( NEWLINE )? -> ( column_clause )* ;
    public final MySelectParser.column_list_clause_return column_list_clause() throws RecognitionException {
        MySelectParser.column_list_clause_return retval = new MySelectParser.column_list_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA13=null;
        Token NEWLINE15=null;
        MySelectParser.column_clause_return column_clause12 =null;

        MySelectParser.column_clause_return column_clause14 =null;


        Object COMMA13_tree=null;
        Object NEWLINE15_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_column_clause=new RewriteRuleSubtreeStream(adaptor,"rule column_clause");
        try {
            // MySelect.g:76:19: ( column_clause ( COMMA column_clause )* ( NEWLINE )? -> ( column_clause )* )
            // MySelect.g:77:3: column_clause ( COMMA column_clause )* ( NEWLINE )?
            {
            pushFollow(FOLLOW_column_clause_in_column_list_clause316);
            column_clause12=column_clause();

            state._fsp--;

            stream_column_clause.add(column_clause12.getTree());

            // MySelect.g:77:17: ( COMMA column_clause )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MySelect.g:77:18: COMMA column_clause
            	    {
            	    COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_list_clause319);  
            	    stream_COMMA.add(COMMA13);


            	    pushFollow(FOLLOW_column_clause_in_column_list_clause321);
            	    column_clause14=column_clause();

            	    state._fsp--;

            	    stream_column_clause.add(column_clause14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // MySelect.g:77:40: ( NEWLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NEWLINE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // MySelect.g:77:41: NEWLINE
                    {
                    NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_column_list_clause326);  
                    stream_NEWLINE.add(NEWLINE15);


                    }
                    break;

            }


            // AST REWRITE
            // elements: column_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:2: -> ( column_clause )*
            {
                // MySelect.g:78:5: ( column_clause )*
                while ( stream_column_clause.hasNext() ) {
                    adaptor.addChild(root_0, stream_column_clause.nextTree());

                }
                stream_column_clause.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_list_clause"


    public static class from_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "from_clause"
    // MySelect.g:81:1: from_clause : FROM table_name ( COMMA table_name )* ( NEWLINE )? -> ( FROM_TABLE table_name )* ;
    public final MySelectParser.from_clause_return from_clause() throws RecognitionException {
        MySelectParser.from_clause_return retval = new MySelectParser.from_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FROM16=null;
        Token COMMA18=null;
        Token NEWLINE20=null;
        MySelectParser.table_name_return table_name17 =null;

        MySelectParser.table_name_return table_name19 =null;


        Object FROM16_tree=null;
        Object COMMA18_tree=null;
        Object NEWLINE20_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
        try {
            // MySelect.g:81:12: ( FROM table_name ( COMMA table_name )* ( NEWLINE )? -> ( FROM_TABLE table_name )* )
            // MySelect.g:82:3: FROM table_name ( COMMA table_name )* ( NEWLINE )?
            {
            FROM16=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause347);  
            stream_FROM.add(FROM16);


            pushFollow(FOLLOW_table_name_in_from_clause349);
            table_name17=table_name();

            state._fsp--;

            stream_table_name.add(table_name17.getTree());

            // MySelect.g:82:19: ( COMMA table_name )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MySelect.g:82:20: COMMA table_name
            	    {
            	    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause352);  
            	    stream_COMMA.add(COMMA18);


            	    pushFollow(FOLLOW_table_name_in_from_clause354);
            	    table_name19=table_name();

            	    state._fsp--;

            	    stream_table_name.add(table_name19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // MySelect.g:82:39: ( NEWLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NEWLINE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // MySelect.g:82:40: NEWLINE
                    {
                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_from_clause359);  
                    stream_NEWLINE.add(NEWLINE20);


                    }
                    break;

            }


            // AST REWRITE
            // elements: table_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:2: -> ( FROM_TABLE table_name )*
            {
                // MySelect.g:83:5: ( FROM_TABLE table_name )*
                while ( stream_table_name.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(FROM_TABLE, "FROM_TABLE")
                    );

                    adaptor.addChild(root_0, stream_table_name.nextTree());

                }
                stream_table_name.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "from_clause"


    public static class select_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_key"
    // MySelect.g:86:1: select_key : SELECT ;
    public final MySelectParser.select_key_return select_key() throws RecognitionException {
        MySelectParser.select_key_return retval = new MySelectParser.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT21=null;

        Object SELECT21_tree=null;

        try {
            // MySelect.g:86:11: ( SELECT )
            // MySelect.g:87:3: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT21=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key384); 
            SELECT21_tree = 
            (Object)adaptor.create(SELECT21)
            ;
            adaptor.addChild(root_0, SELECT21_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_key"


    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // MySelect.g:90:1: where_clause : WHERE expression -> ( expression )* ;
    public final MySelectParser.where_clause_return where_clause() throws RecognitionException {
        MySelectParser.where_clause_return retval = new MySelectParser.where_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE22=null;
        MySelectParser.expression_return expression23 =null;


        Object WHERE22_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // MySelect.g:90:13: ( WHERE expression -> ( expression )* )
            // MySelect.g:91:3: WHERE expression
            {
            WHERE22=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause395);  
            stream_WHERE.add(WHERE22);


            pushFollow(FOLLOW_expression_in_where_clause397);
            expression23=expression();

            state._fsp--;

            stream_expression.add(expression23.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:2: -> ( expression )*
            {
                // MySelect.g:92:5: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_clause"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // MySelect.g:95:1: expression : simple_expression ( NEWLINE )? ( expr_op simple_expression ( NEWLINE )? )* -> ( REL simple_expression )* ;
    public final MySelectParser.expression_return expression() throws RecognitionException {
        MySelectParser.expression_return retval = new MySelectParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE25=null;
        Token NEWLINE28=null;
        MySelectParser.simple_expression_return simple_expression24 =null;

        MySelectParser.expr_op_return expr_op26 =null;

        MySelectParser.simple_expression_return simple_expression27 =null;


        Object NEWLINE25_tree=null;
        Object NEWLINE28_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_expr_op=new RewriteRuleSubtreeStream(adaptor,"rule expr_op");
        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // MySelect.g:95:11: ( simple_expression ( NEWLINE )? ( expr_op simple_expression ( NEWLINE )? )* -> ( REL simple_expression )* )
            // MySelect.g:96:3: simple_expression ( NEWLINE )? ( expr_op simple_expression ( NEWLINE )? )*
            {
            pushFollow(FOLLOW_simple_expression_in_expression417);
            simple_expression24=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression24.getTree());

            // MySelect.g:96:21: ( NEWLINE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MySelect.g:96:22: NEWLINE
                    {
                    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expression420);  
                    stream_NEWLINE.add(NEWLINE25);


                    }
                    break;

            }


            // MySelect.g:96:32: ( expr_op simple_expression ( NEWLINE )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND||LA11_0==NOT||LA11_0==OR||LA11_0==XOR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // MySelect.g:96:33: expr_op simple_expression ( NEWLINE )?
            	    {
            	    pushFollow(FOLLOW_expr_op_in_expression425);
            	    expr_op26=expr_op();

            	    state._fsp--;

            	    stream_expr_op.add(expr_op26.getTree());

            	    pushFollow(FOLLOW_simple_expression_in_expression427);
            	    simple_expression27=simple_expression();

            	    state._fsp--;

            	    stream_simple_expression.add(simple_expression27.getTree());

            	    // MySelect.g:96:59: ( NEWLINE )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==NEWLINE) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // MySelect.g:96:60: NEWLINE
            	            {
            	            NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expression430);  
            	            stream_NEWLINE.add(NEWLINE28);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: simple_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 97:2: -> ( REL simple_expression )*
            {
                // MySelect.g:97:5: ( REL simple_expression )*
                while ( stream_simple_expression.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(REL, "REL")
                    );

                    adaptor.addChild(root_0, stream_simple_expression.nextTree());

                }
                stream_simple_expression.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element"
    // MySelect.g:100:1: element : ( USER_VAR | ID | ( '|' ID '|' ) | INT );
    public final MySelectParser.element_return element() throws RecognitionException {
        MySelectParser.element_return retval = new MySelectParser.element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USER_VAR29=null;
        Token ID30=null;
        Token char_literal31=null;
        Token ID32=null;
        Token char_literal33=null;
        Token INT34=null;

        Object USER_VAR29_tree=null;
        Object ID30_tree=null;
        Object char_literal31_tree=null;
        Object ID32_tree=null;
        Object char_literal33_tree=null;
        Object INT34_tree=null;

        try {
            // MySelect.g:100:8: ( USER_VAR | ID | ( '|' ID '|' ) | INT )
            int alt12=4;
            switch ( input.LA(1) ) {
            case USER_VAR:
                {
                alt12=1;
                }
                break;
            case ID:
                {
                alt12=2;
                }
                break;
            case 135:
                {
                alt12=3;
                }
                break;
            case INT:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // MySelect.g:101:3: USER_VAR
                    {
                    root_0 = (Object)adaptor.nil();


                    USER_VAR29=(Token)match(input,USER_VAR,FOLLOW_USER_VAR_in_element455); 
                    USER_VAR29_tree = 
                    (Object)adaptor.create(USER_VAR29)
                    ;
                    adaptor.addChild(root_0, USER_VAR29_tree);


                    }
                    break;
                case 2 :
                    // MySelect.g:101:14: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID30=(Token)match(input,ID,FOLLOW_ID_in_element459); 
                    ID30_tree = 
                    (Object)adaptor.create(ID30)
                    ;
                    adaptor.addChild(root_0, ID30_tree);


                    }
                    break;
                case 3 :
                    // MySelect.g:101:19: ( '|' ID '|' )
                    {
                    root_0 = (Object)adaptor.nil();


                    // MySelect.g:101:19: ( '|' ID '|' )
                    // MySelect.g:101:20: '|' ID '|'
                    {
                    char_literal31=(Token)match(input,135,FOLLOW_135_in_element464); 
                    char_literal31_tree = 
                    (Object)adaptor.create(char_literal31)
                    ;
                    adaptor.addChild(root_0, char_literal31_tree);


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_element466); 
                    ID32_tree = 
                    (Object)adaptor.create(ID32)
                    ;
                    adaptor.addChild(root_0, ID32_tree);


                    char_literal33=(Token)match(input,135,FOLLOW_135_in_element468); 
                    char_literal33_tree = 
                    (Object)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);


                    }


                    }
                    break;
                case 4 :
                    // MySelect.g:101:34: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT34=(Token)match(input,INT,FOLLOW_INT_in_element473); 
                    INT34_tree = 
                    (Object)adaptor.create(INT34)
                    ;
                    adaptor.addChild(root_0, INT34_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "element"


    public static class right_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "right_element"
    // MySelect.g:104:1: right_element : element ;
    public final MySelectParser.right_element_return right_element() throws RecognitionException {
        MySelectParser.right_element_return retval = new MySelectParser.right_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.element_return element35 =null;



        try {
            // MySelect.g:104:14: ( element )
            // MySelect.g:105:3: element
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_element_in_right_element484);
            element35=element();

            state._fsp--;

            adaptor.addChild(root_0, element35.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "right_element"


    public static class left_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "left_element"
    // MySelect.g:108:1: left_element : element ;
    public final MySelectParser.left_element_return left_element() throws RecognitionException {
        MySelectParser.left_element_return retval = new MySelectParser.left_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.element_return element36 =null;



        try {
            // MySelect.g:108:13: ( element )
            // MySelect.g:109:3: element
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_element_in_left_element495);
            element36=element();

            state._fsp--;

            adaptor.addChild(root_0, element36.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "left_element"


    public static class target_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "target_element"
    // MySelect.g:112:1: target_element : element ;
    public final MySelectParser.target_element_return target_element() throws RecognitionException {
        MySelectParser.target_element_return retval = new MySelectParser.target_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.element_return element37 =null;



        try {
            // MySelect.g:112:15: ( element )
            // MySelect.g:113:3: element
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_element_in_target_element506);
            element37=element();

            state._fsp--;

            adaptor.addChild(root_0, element37.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "target_element"


    public static class relational_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_op"
    // MySelect.g:116:1: relational_op : ( EQ | LTH | GTH | NOT_EQ | LET | GET );
    public final MySelectParser.relational_op_return relational_op() throws RecognitionException {
        MySelectParser.relational_op_return retval = new MySelectParser.relational_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // MySelect.g:116:14: ( EQ | LTH | GTH | NOT_EQ | LET | GET )
            // MySelect.g:
            {
            root_0 = (Object)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( input.LA(1)==EQ||(input.LA(1) >= GET && input.LA(1) <= GTH)||input.LA(1)==LET||input.LA(1)==LTH||input.LA(1)==NOT_EQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set38)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_op"


    public static class expr_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_op"
    // MySelect.g:119:1: expr_op : ( AND | XOR | OR | NOT );
    public final MySelectParser.expr_op_return expr_op() throws RecognitionException {
        MySelectParser.expr_op_return retval = new MySelectParser.expr_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // MySelect.g:119:8: ( AND | XOR | OR | NOT )
            // MySelect.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( input.LA(1)==AND||input.LA(1)==NOT||input.LA(1)==OR||input.LA(1)==XOR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_op"


    public static class between_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "between_op"
    // MySelect.g:122:1: between_op : BETWEEN ;
    public final MySelectParser.between_op_return between_op() throws RecognitionException {
        MySelectParser.between_op_return retval = new MySelectParser.between_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BETWEEN40=null;

        Object BETWEEN40_tree=null;

        try {
            // MySelect.g:122:11: ( BETWEEN )
            // MySelect.g:123:3: BETWEEN
            {
            root_0 = (Object)adaptor.nil();


            BETWEEN40=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_op571); 
            BETWEEN40_tree = 
            (Object)adaptor.create(BETWEEN40)
            ;
            adaptor.addChild(root_0, BETWEEN40_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "between_op"


    public static class is_or_is_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "is_or_is_not"
    // MySelect.g:126:1: is_or_is_not : ( IS | IS NOT );
    public final MySelectParser.is_or_is_not_return is_or_is_not() throws RecognitionException {
        MySelectParser.is_or_is_not_return retval = new MySelectParser.is_or_is_not_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IS41=null;
        Token IS42=null;
        Token NOT43=null;

        Object IS41_tree=null;
        Object IS42_tree=null;
        Object NOT43_tree=null;

        try {
            // MySelect.g:126:13: ( IS | IS NOT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IS) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==NOT) ) {
                    alt13=2;
                }
                else if ( (LA13_1==NULL) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // MySelect.g:127:3: IS
                    {
                    root_0 = (Object)adaptor.nil();


                    IS41=(Token)match(input,IS,FOLLOW_IS_in_is_or_is_not582); 
                    IS41_tree = 
                    (Object)adaptor.create(IS41)
                    ;
                    adaptor.addChild(root_0, IS41_tree);


                    }
                    break;
                case 2 :
                    // MySelect.g:127:8: IS NOT
                    {
                    root_0 = (Object)adaptor.nil();


                    IS42=(Token)match(input,IS,FOLLOW_IS_in_is_or_is_not586); 
                    IS42_tree = 
                    (Object)adaptor.create(IS42)
                    ;
                    adaptor.addChild(root_0, IS42_tree);


                    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_is_or_is_not588); 
                    NOT43_tree = 
                    (Object)adaptor.create(NOT43)
                    ;
                    adaptor.addChild(root_0, NOT43_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "is_or_is_not"


    public static class simple_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expression"
    // MySelect.g:130:1: simple_expression : ( left_element relational_op right_element -> ^( EXPR relational_op ^( left_element right_element ) ) | target_element between_op left_element AND right_element -> ^( EXPR between_op ^( left_element right_element ) ) | target_element is_or_is_not NULL -> ^( EXPR is_or_is_not ^( target_element ) ) );
    public final MySelectParser.simple_expression_return simple_expression() throws RecognitionException {
        MySelectParser.simple_expression_return retval = new MySelectParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND50=null;
        Token NULL54=null;
        MySelectParser.left_element_return left_element44 =null;

        MySelectParser.relational_op_return relational_op45 =null;

        MySelectParser.right_element_return right_element46 =null;

        MySelectParser.target_element_return target_element47 =null;

        MySelectParser.between_op_return between_op48 =null;

        MySelectParser.left_element_return left_element49 =null;

        MySelectParser.right_element_return right_element51 =null;

        MySelectParser.target_element_return target_element52 =null;

        MySelectParser.is_or_is_not_return is_or_is_not53 =null;


        Object AND50_tree=null;
        Object NULL54_tree=null;
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_left_element=new RewriteRuleSubtreeStream(adaptor,"rule left_element");
        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        RewriteRuleSubtreeStream stream_right_element=new RewriteRuleSubtreeStream(adaptor,"rule right_element");
        RewriteRuleSubtreeStream stream_target_element=new RewriteRuleSubtreeStream(adaptor,"rule target_element");
        RewriteRuleSubtreeStream stream_between_op=new RewriteRuleSubtreeStream(adaptor,"rule between_op");
        RewriteRuleSubtreeStream stream_is_or_is_not=new RewriteRuleSubtreeStream(adaptor,"rule is_or_is_not");
        try {
            // MySelect.g:130:18: ( left_element relational_op right_element -> ^( EXPR relational_op ^( left_element right_element ) ) | target_element between_op left_element AND right_element -> ^( EXPR between_op ^( left_element right_element ) ) | target_element is_or_is_not NULL -> ^( EXPR is_or_is_not ^( target_element ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case USER_VAR:
                {
                switch ( input.LA(2) ) {
                case EQ:
                case GET:
                case GTH:
                case LET:
                case LTH:
                case NOT_EQ:
                    {
                    alt14=1;
                    }
                    break;
                case BETWEEN:
                    {
                    alt14=2;
                    }
                    break;
                case IS:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQ:
                case GET:
                case GTH:
                case LET:
                case LTH:
                case NOT_EQ:
                    {
                    alt14=1;
                    }
                    break;
                case BETWEEN:
                    {
                    alt14=2;
                    }
                    break;
                case IS:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }

                }
                break;
            case 135:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==ID) ) {
                    int LA14_8 = input.LA(3);

                    if ( (LA14_8==135) ) {
                        switch ( input.LA(4) ) {
                        case EQ:
                        case GET:
                        case GTH:
                        case LET:
                        case LTH:
                        case NOT_EQ:
                            {
                            alt14=1;
                            }
                            break;
                        case BETWEEN:
                            {
                            alt14=2;
                            }
                            break;
                        case IS:
                            {
                            alt14=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 9, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                switch ( input.LA(2) ) {
                case EQ:
                case GET:
                case GTH:
                case LET:
                case LTH:
                case NOT_EQ:
                    {
                    alt14=1;
                    }
                    break;
                case BETWEEN:
                    {
                    alt14=2;
                    }
                    break;
                case IS:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // MySelect.g:131:3: left_element relational_op right_element
                    {
                    pushFollow(FOLLOW_left_element_in_simple_expression599);
                    left_element44=left_element();

                    state._fsp--;

                    stream_left_element.add(left_element44.getTree());

                    pushFollow(FOLLOW_relational_op_in_simple_expression601);
                    relational_op45=relational_op();

                    state._fsp--;

                    stream_relational_op.add(relational_op45.getTree());

                    pushFollow(FOLLOW_right_element_in_simple_expression603);
                    right_element46=right_element();

                    state._fsp--;

                    stream_right_element.add(right_element46.getTree());

                    // AST REWRITE
                    // elements: left_element, right_element, relational_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:2: -> ^( EXPR relational_op ^( left_element right_element ) )
                    {
                        // MySelect.g:132:5: ^( EXPR relational_op ^( left_element right_element ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPR, "EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_relational_op.nextTree());

                        // MySelect.g:132:26: ^( left_element right_element )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_left_element.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_right_element.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // MySelect.g:134:3: target_element between_op left_element AND right_element
                    {
                    pushFollow(FOLLOW_target_element_in_simple_expression626);
                    target_element47=target_element();

                    state._fsp--;

                    stream_target_element.add(target_element47.getTree());

                    pushFollow(FOLLOW_between_op_in_simple_expression628);
                    between_op48=between_op();

                    state._fsp--;

                    stream_between_op.add(between_op48.getTree());

                    pushFollow(FOLLOW_left_element_in_simple_expression630);
                    left_element49=left_element();

                    state._fsp--;

                    stream_left_element.add(left_element49.getTree());

                    AND50=(Token)match(input,AND,FOLLOW_AND_in_simple_expression632);  
                    stream_AND.add(AND50);


                    pushFollow(FOLLOW_right_element_in_simple_expression634);
                    right_element51=right_element();

                    state._fsp--;

                    stream_right_element.add(right_element51.getTree());

                    // AST REWRITE
                    // elements: left_element, between_op, right_element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:2: -> ^( EXPR between_op ^( left_element right_element ) )
                    {
                        // MySelect.g:135:6: ^( EXPR between_op ^( left_element right_element ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPR, "EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_between_op.nextTree());

                        // MySelect.g:135:24: ^( left_element right_element )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_left_element.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_right_element.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // MySelect.g:137:3: target_element is_or_is_not NULL
                    {
                    pushFollow(FOLLOW_target_element_in_simple_expression657);
                    target_element52=target_element();

                    state._fsp--;

                    stream_target_element.add(target_element52.getTree());

                    pushFollow(FOLLOW_is_or_is_not_in_simple_expression659);
                    is_or_is_not53=is_or_is_not();

                    state._fsp--;

                    stream_is_or_is_not.add(is_or_is_not53.getTree());

                    NULL54=(Token)match(input,NULL,FOLLOW_NULL_in_simple_expression661);  
                    stream_NULL.add(NULL54);


                    // AST REWRITE
                    // elements: is_or_is_not, target_element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:2: -> ^( EXPR is_or_is_not ^( target_element ) )
                    {
                        // MySelect.g:138:6: ^( EXPR is_or_is_not ^( target_element ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPR, "EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_is_or_is_not.nextTree());

                        // MySelect.g:138:26: ^( target_element )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_target_element.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_expression"


    public static class simple_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expr"
    // MySelect.g:180:1: simple_expr : ( literal_value | USER_VAR );
    public final MySelectParser.simple_expr_return simple_expr() throws RecognitionException {
        MySelectParser.simple_expr_return retval = new MySelectParser.simple_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USER_VAR56=null;
        MySelectParser.literal_value_return literal_value55 =null;


        Object USER_VAR56_tree=null;

        try {
            // MySelect.g:180:12: ( literal_value | USER_VAR )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==USER_VAR) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // MySelect.g:181:4: literal_value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_value_in_simple_expr690);
                    literal_value55=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value55.getTree());

                    }
                    break;
                case 2 :
                    // MySelect.g:185:4: USER_VAR
                    {
                    root_0 = (Object)adaptor.nil();


                    USER_VAR56=(Token)match(input,USER_VAR,FOLLOW_USER_VAR_in_simple_expr702); 
                    USER_VAR56_tree = 
                    (Object)adaptor.create(USER_VAR56)
                    ;
                    adaptor.addChild(root_0, USER_VAR56_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_expr"


    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal_value"
    // MySelect.g:207:1: literal_value : ID ;
    public final MySelectParser.literal_value_return literal_value() throws RecognitionException {
        MySelectParser.literal_value_return retval = new MySelectParser.literal_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID57=null;

        Object ID57_tree=null;

        try {
            // MySelect.g:207:14: ( ID )
            // MySelect.g:209:3: ID
            {
            root_0 = (Object)adaptor.nil();


            ID57=(Token)match(input,ID,FOLLOW_ID_in_literal_value740); 
            ID57_tree = 
            (Object)adaptor.create(ID57)
            ;
            adaptor.addChild(root_0, ID57_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal_value"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_clause_in_stat143 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_select_key_in_select_clause155 = new BitSet(new long[]{0x0008000001000000L});
    public static final BitSet FOLLOW_column_list_clause_in_select_clause159 = new BitSet(new long[]{0x0200000000200002L});
    public static final BitSet FOLLOW_from_clause_in_select_clause164 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_clause171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_name226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_name_alias250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_column_clause261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_column_name_alias_in_column_clause264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_column_clause290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_clause_in_column_list_clause316 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_COMMA_in_column_list_clause319 = new BitSet(new long[]{0x0008000001000000L});
    public static final BitSet FOLLOW_column_clause_in_column_list_clause321 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_NEWLINE_in_column_list_clause326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from_clause347 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_name_in_from_clause349 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_COMMA_in_from_clause352 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_name_in_from_clause354 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_NEWLINE_in_from_clause359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_key384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause395 = new BitSet(new long[]{0x0008000005000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_expression_in_where_clause397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_expression417 = new BitSet(new long[]{0x0800013000000042L});
    public static final BitSet FOLLOW_NEWLINE_in_expression420 = new BitSet(new long[]{0x0800012000000042L});
    public static final BitSet FOLLOW_expr_op_in_expression425 = new BitSet(new long[]{0x0008000005000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_simple_expression_in_expression427 = new BitSet(new long[]{0x0800013000000042L});
    public static final BitSet FOLLOW_NEWLINE_in_expression430 = new BitSet(new long[]{0x0800012000000042L});
    public static final BitSet FOLLOW_USER_VAR_in_element455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_element459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_element464 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_element466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_element468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_element473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_right_element484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_left_element495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_target_element506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETWEEN_in_between_op571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_is_or_is_not582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_is_or_is_not586 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOT_in_is_or_is_not588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_element_in_simple_expression599 = new BitSet(new long[]{0x0000004120C20000L});
    public static final BitSet FOLLOW_relational_op_in_simple_expression601 = new BitSet(new long[]{0x0008000005000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_right_element_in_simple_expression603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_element_in_simple_expression626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_between_op_in_simple_expression628 = new BitSet(new long[]{0x0008000005000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_left_element_in_simple_expression630 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_simple_expression632 = new BitSet(new long[]{0x0008000005000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_right_element_in_simple_expression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_element_in_simple_expression657 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_is_or_is_not_in_simple_expression659 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NULL_in_simple_expression661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_simple_expr690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USER_VAR_in_simple_expr702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_literal_value740 = new BitSet(new long[]{0x0000000000000002L});

}