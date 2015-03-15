// $ANTLR 3.4 MySelect.g 2015-03-15 20:30:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "COMMA", "DOT", "EQ", "FROM", "GET", "GTH", "ID", "INT", "LET", "LTH", "NEWLINE", "NOT_EQ", "SELECT", "SEMI", "USER_VAR", "USER_VAR_SUBFIX1", "USER_VAR_SUBFIX2", "USER_VAR_SUBFIX3", "USER_VAR_SUBFIX4", "WHERE", "WS", "ALIAS_NAME", "AND_SYM", "COLUMN_ALIAS", "COLUMN_CLAUSE", "COLUMN_LIST", "COLUMN_NAME", "EQ_SYM", "FROM_ALIAS", "FROM_LIST", "FROM_TABLE", "NOT_SYM", "OR_SYM", "SELECT_STATEMENT", "VARDEF", "WHERE_CLAUSE", "WHERE_CLAUSES", "63"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int COMMA=5;
    public static final int DOT=6;
    public static final int EQ=7;
    public static final int FROM=8;
    public static final int GET=9;
    public static final int GTH=10;
    public static final int ID=11;
    public static final int INT=12;
    public static final int LET=13;
    public static final int LTH=14;
    public static final int NEWLINE=15;
    public static final int NOT_EQ=16;
    public static final int SELECT=17;
    public static final int SEMI=18;
    public static final int USER_VAR=19;
    public static final int USER_VAR_SUBFIX1=20;
    public static final int USER_VAR_SUBFIX2=21;
    public static final int USER_VAR_SUBFIX3=22;
    public static final int USER_VAR_SUBFIX4=23;
    public static final int WHERE=24;
    public static final int WS=25;
    public static final int ALIAS_NAME=26;
    public static final int AND_SYM=28;
    public static final int COLUMN_ALIAS=29;
    public static final int COLUMN_CLAUSE=30;
    public static final int COLUMN_LIST=31;
    public static final int COLUMN_NAME=32;
    public static final int EQ_SYM=36;
    public static final int FROM_ALIAS=38;
    public static final int FROM_LIST=39;
    public static final int FROM_TABLE=40;
    public static final int NOT_SYM=49;
    public static final int OR_SYM=50;
    public static final int SELECT_STATEMENT=52;
    public static final int VARDEF=59;
    public static final int WHERE_CLAUSE=61;
    public static final int WHERE_CLAUSES=62;

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
    // MySelect.g:29:1: stat : ( select_clause )+ ;
    public final MySelectParser.stat_return stat() throws RecognitionException {
        MySelectParser.stat_return retval = new MySelectParser.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:29:5: ( ( select_clause )+ )
            // MySelect.g:30:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:30:3: ( select_clause )+
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
            	    // MySelect.g:30:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat103);
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
    // MySelect.g:33:1: select_clause : select_key column_list_clause ( from_clause )? ( where_clauses )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* ) ;
    public final MySelectParser.select_clause_return select_clause() throws RecognitionException {
        MySelectParser.select_clause_return retval = new MySelectParser.select_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.select_key_return select_key2 =null;

        MySelectParser.column_list_clause_return column_list_clause3 =null;

        MySelectParser.from_clause_return from_clause4 =null;

        MySelectParser.where_clauses_return where_clauses5 =null;


        RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
        RewriteRuleSubtreeStream stream_column_list_clause=new RewriteRuleSubtreeStream(adaptor,"rule column_list_clause");
        RewriteRuleSubtreeStream stream_select_key=new RewriteRuleSubtreeStream(adaptor,"rule select_key");
        RewriteRuleSubtreeStream stream_where_clauses=new RewriteRuleSubtreeStream(adaptor,"rule where_clauses");
        try {
            // MySelect.g:33:14: ( select_key column_list_clause ( from_clause )? ( where_clauses )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* ) )
            // MySelect.g:34:3: select_key column_list_clause ( from_clause )? ( where_clauses )?
            {
            pushFollow(FOLLOW_select_key_in_select_clause115);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_column_list_clause_in_select_clause119);
            column_list_clause3=column_list_clause();

            state._fsp--;

            stream_column_list_clause.add(column_list_clause3.getTree());

            // MySelect.g:36:3: ( from_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FROM) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySelect.g:36:4: from_clause
                    {
                    pushFollow(FOLLOW_from_clause_in_select_clause124);
                    from_clause4=from_clause();

                    state._fsp--;

                    stream_from_clause.add(from_clause4.getTree());

                    }
                    break;

            }


            // MySelect.g:37:3: ( where_clauses )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySelect.g:37:4: where_clauses
                    {
                    pushFollow(FOLLOW_where_clauses_in_select_clause131);
                    where_clauses5=where_clauses();

                    state._fsp--;

                    stream_where_clauses.add(where_clauses5.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_list_clause, from_clause, where_clauses
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* )
            {
                // MySelect.g:39:3: ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:40:4: ^( COLUMN_LIST column_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_column_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MySelect.g:41:4: ( ^( FROM_LIST from_clause ) )*
                while ( stream_from_clause.hasNext() ) {
                    // MySelect.g:41:4: ^( FROM_LIST from_clause )
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

                // MySelect.g:42:4: ( ^( WHERE_CLAUSES where_clauses ) )*
                while ( stream_where_clauses.hasNext() ) {
                    // MySelect.g:42:4: ^( WHERE_CLAUSES where_clauses )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(WHERE_CLAUSES, "WHERE_CLAUSES")
                    , root_2);

                    adaptor.addChild(root_2, stream_where_clauses.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_clauses.reset();

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
    // MySelect.g:46:1: table_name : ID ;
    public final MySelectParser.table_name_return table_name() throws RecognitionException {
        MySelectParser.table_name_return retval = new MySelectParser.table_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID6=null;

        Object ID6_tree=null;

        try {
            // MySelect.g:46:11: ( ID )
            // MySelect.g:47:2: ID
            {
            root_0 = (Object)adaptor.nil();


            ID6=(Token)match(input,ID,FOLLOW_ID_in_table_name186); 
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
    // MySelect.g:50:1: column_name : ( USER_VAR | ID );
    public final MySelectParser.column_name_return column_name() throws RecognitionException {
        MySelectParser.column_name_return retval = new MySelectParser.column_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set7=null;

        Object set7_tree=null;

        try {
            // MySelect.g:50:12: ( USER_VAR | ID )
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
    // MySelect.g:54:1: column_name_alias : ID ;
    public final MySelectParser.column_name_alias_return column_name_alias() throws RecognitionException {
        MySelectParser.column_name_alias_return retval = new MySelectParser.column_name_alias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;

        Object ID8_tree=null;

        try {
            // MySelect.g:54:18: ( ID )
            // MySelect.g:55:2: ID
            {
            root_0 = (Object)adaptor.nil();


            ID8=(Token)match(input,ID,FOLLOW_ID_in_column_name_alias210); 
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
    // MySelect.g:58:1: column_clause : ( column_name column_name_alias -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )* | column_name -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )* );
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
            // MySelect.g:58:14: ( column_name column_name_alias -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )* | column_name -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )* )
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
                    // MySelect.g:59:3: column_name column_name_alias
                    {
                    pushFollow(FOLLOW_column_name_in_column_clause221);
                    column_name9=column_name();

                    state._fsp--;

                    stream_column_name.add(column_name9.getTree());

                    pushFollow(FOLLOW_column_name_alias_in_column_clause224);
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
                    // 60:2: -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )*
                    {
                        // MySelect.g:60:5: ( COLUMN_CLAUSE ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias ) )*
                        while ( stream_column_name.hasNext()||stream_column_name_alias.hasNext() ) {
                            adaptor.addChild(root_0, 
                            (Object)adaptor.create(COLUMN_CLAUSE, "COLUMN_CLAUSE")
                            );

                            // MySelect.g:60:20: ^( COLUMN_NAME column_name COLUMN_ALIAS column_name_alias )
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
                    // MySelect.g:62:3: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_column_clause250);
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
                    // 63:2: -> ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )*
                    {
                        // MySelect.g:63:5: ( COLUMN_CLAUSE ^( COLUMN_NAME column_name ) )*
                        while ( stream_column_name.hasNext() ) {
                            adaptor.addChild(root_0, 
                            (Object)adaptor.create(COLUMN_CLAUSE, "COLUMN_CLAUSE")
                            );

                            // MySelect.g:63:20: ^( COLUMN_NAME column_name )
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
    // MySelect.g:66:1: column_list_clause : column_clause ( COMMA column_clause )* ( NEWLINE )? -> ( column_clause )* ;
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
            // MySelect.g:66:19: ( column_clause ( COMMA column_clause )* ( NEWLINE )? -> ( column_clause )* )
            // MySelect.g:67:3: column_clause ( COMMA column_clause )* ( NEWLINE )?
            {
            pushFollow(FOLLOW_column_clause_in_column_list_clause276);
            column_clause12=column_clause();

            state._fsp--;

            stream_column_clause.add(column_clause12.getTree());

            // MySelect.g:67:17: ( COMMA column_clause )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MySelect.g:67:18: COMMA column_clause
            	    {
            	    COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_list_clause279);  
            	    stream_COMMA.add(COMMA13);


            	    pushFollow(FOLLOW_column_clause_in_column_list_clause281);
            	    column_clause14=column_clause();

            	    state._fsp--;

            	    stream_column_clause.add(column_clause14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // MySelect.g:67:40: ( NEWLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NEWLINE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // MySelect.g:67:41: NEWLINE
                    {
                    NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_column_list_clause286);  
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
            // 68:2: -> ( column_clause )*
            {
                // MySelect.g:68:5: ( column_clause )*
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
    // MySelect.g:71:1: from_clause : FROM table_name ( COMMA table_name )* ( NEWLINE )? -> ( FROM_TABLE table_name )* ;
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
            // MySelect.g:71:12: ( FROM table_name ( COMMA table_name )* ( NEWLINE )? -> ( FROM_TABLE table_name )* )
            // MySelect.g:72:3: FROM table_name ( COMMA table_name )* ( NEWLINE )?
            {
            FROM16=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause307);  
            stream_FROM.add(FROM16);


            pushFollow(FOLLOW_table_name_in_from_clause309);
            table_name17=table_name();

            state._fsp--;

            stream_table_name.add(table_name17.getTree());

            // MySelect.g:72:19: ( COMMA table_name )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MySelect.g:72:20: COMMA table_name
            	    {
            	    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause312);  
            	    stream_COMMA.add(COMMA18);


            	    pushFollow(FOLLOW_table_name_in_from_clause314);
            	    table_name19=table_name();

            	    state._fsp--;

            	    stream_table_name.add(table_name19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // MySelect.g:72:39: ( NEWLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NEWLINE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // MySelect.g:72:40: NEWLINE
                    {
                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_from_clause319);  
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
            // 73:2: -> ( FROM_TABLE table_name )*
            {
                // MySelect.g:73:5: ( FROM_TABLE table_name )*
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
    // MySelect.g:76:1: select_key : SELECT ;
    public final MySelectParser.select_key_return select_key() throws RecognitionException {
        MySelectParser.select_key_return retval = new MySelectParser.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT21=null;

        Object SELECT21_tree=null;

        try {
            // MySelect.g:76:11: ( SELECT )
            // MySelect.g:77:3: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT21=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key344); 
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


    public static class relational_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_op"
    // MySelect.g:80:1: relational_op : ( EQ | LTH | GTH | NOT_EQ | LET | GET );
    public final MySelectParser.relational_op_return relational_op() throws RecognitionException {
        MySelectParser.relational_op_return retval = new MySelectParser.relational_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set22=null;

        Object set22_tree=null;

        try {
            // MySelect.g:80:14: ( EQ | LTH | GTH | NOT_EQ | LET | GET )
            // MySelect.g:
            {
            root_0 = (Object)adaptor.nil();


            set22=(Token)input.LT(1);

            if ( input.LA(1)==EQ||(input.LA(1) >= GET && input.LA(1) <= GTH)||(input.LA(1) >= LET && input.LA(1) <= LTH)||input.LA(1)==NOT_EQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set22)
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


    public static class where_clauses_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clauses"
    // MySelect.g:83:1: where_clauses : WHERE where_clause ( AND where_clause )* -> ( WHERE_CLAUSE where_clause )* ;
    public final MySelectParser.where_clauses_return where_clauses() throws RecognitionException {
        MySelectParser.where_clauses_return retval = new MySelectParser.where_clauses_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE23=null;
        Token AND25=null;
        MySelectParser.where_clause_return where_clause24 =null;

        MySelectParser.where_clause_return where_clause26 =null;


        Object WHERE23_tree=null;
        Object AND25_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        try {
            // MySelect.g:83:14: ( WHERE where_clause ( AND where_clause )* -> ( WHERE_CLAUSE where_clause )* )
            // MySelect.g:84:3: WHERE where_clause ( AND where_clause )*
            {
            WHERE23=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clauses387);  
            stream_WHERE.add(WHERE23);


            pushFollow(FOLLOW_where_clause_in_where_clauses392);
            where_clause24=where_clause();

            state._fsp--;

            stream_where_clause.add(where_clause24.getTree());

            // MySelect.g:85:17: ( AND where_clause )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MySelect.g:85:18: AND where_clause
            	    {
            	    AND25=(Token)match(input,AND,FOLLOW_AND_in_where_clauses395);  
            	    stream_AND.add(AND25);


            	    pushFollow(FOLLOW_where_clause_in_where_clauses397);
            	    where_clause26=where_clause();

            	    state._fsp--;

            	    stream_where_clause.add(where_clause26.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // AST REWRITE
            // elements: where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:3: -> ( WHERE_CLAUSE where_clause )*
            {
                // MySelect.g:86:6: ( WHERE_CLAUSE where_clause )*
                while ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE")
                    );

                    adaptor.addChild(root_0, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

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
    // $ANTLR end "where_clauses"


    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // MySelect.g:89:1: where_clause : ID relational_op INT ( NEWLINE )? -> ( VARDEF ^( ID INT ) )* ;
    public final MySelectParser.where_clause_return where_clause() throws RecognitionException {
        MySelectParser.where_clause_return retval = new MySelectParser.where_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID27=null;
        Token INT29=null;
        Token NEWLINE30=null;
        MySelectParser.relational_op_return relational_op28 =null;


        Object ID27_tree=null;
        Object INT29_tree=null;
        Object NEWLINE30_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        try {
            // MySelect.g:89:13: ( ID relational_op INT ( NEWLINE )? -> ( VARDEF ^( ID INT ) )* )
            // MySelect.g:91:3: ID relational_op INT ( NEWLINE )?
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_where_clause425);  
            stream_ID.add(ID27);


            pushFollow(FOLLOW_relational_op_in_where_clause427);
            relational_op28=relational_op();

            state._fsp--;

            stream_relational_op.add(relational_op28.getTree());

            INT29=(Token)match(input,INT,FOLLOW_INT_in_where_clause429);  
            stream_INT.add(INT29);


            // MySelect.g:91:24: ( NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // MySelect.g:91:25: NEWLINE
                    {
                    NEWLINE30=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_where_clause432);  
                    stream_NEWLINE.add(NEWLINE30);


                    }
                    break;

            }


            // AST REWRITE
            // elements: INT, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:2: -> ( VARDEF ^( ID INT ) )*
            {
                // MySelect.g:92:5: ( VARDEF ^( ID INT ) )*
                while ( stream_INT.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(VARDEF, "VARDEF")
                    );

                    // MySelect.g:92:13: ^( ID INT )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    stream_ID.nextNode()
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_INT.reset();
                stream_ID.reset();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_select_clause_in_stat103 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_select_key_in_select_clause115 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_column_list_clause_in_select_clause119 = new BitSet(new long[]{0x0000000001000102L});
    public static final BitSet FOLLOW_from_clause_in_select_clause124 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_where_clauses_in_select_clause131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_name186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_name_alias210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_column_clause221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_column_name_alias_in_column_clause224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_column_clause250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_clause_in_column_list_clause276 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_COMMA_in_column_list_clause279 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_column_clause_in_column_list_clause281 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_NEWLINE_in_column_list_clause286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from_clause307 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_table_name_in_from_clause309 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_COMMA_in_from_clause312 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_table_name_in_from_clause314 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_NEWLINE_in_from_clause319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_key344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clauses387 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_where_clause_in_where_clauses392 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_where_clauses395 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_where_clause_in_where_clauses397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_where_clause425 = new BitSet(new long[]{0x0000000000016680L});
    public static final BitSet FOLLOW_relational_op_in_where_clause427 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_where_clause429 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_NEWLINE_in_where_clause432 = new BitSet(new long[]{0x0000000000000002L});

}