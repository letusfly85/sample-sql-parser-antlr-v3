// $ANTLR 3.4 MySelect.g 2015-03-15 18:40:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "COMMA", "EQ", "FROM", "ID", "INT", "NEWLINE", "SELECT", "SEMI", "WHERE", "WS", "AND_SYM", "COLUMN_LIST", "COLUMN_NAME", "EQ_SYM", "FROM_ALIAS", "FROM_LIST", "FROM_TABLE", "NOT_SYM", "OR_SYM", "SELECT_STATEMENT", "VARDEF", "WHERE_CLAUSE", "WHERE_CLAUSES", "38"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int COMMA=5;
    public static final int EQ=6;
    public static final int FROM=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int NEWLINE=10;
    public static final int SELECT=11;
    public static final int SEMI=12;
    public static final int WHERE=13;
    public static final int WS=14;
    public static final int AND_SYM=16;
    public static final int COLUMN_LIST=17;
    public static final int COLUMN_NAME=18;
    public static final int EQ_SYM=21;
    public static final int FROM_ALIAS=23;
    public static final int FROM_LIST=24;
    public static final int FROM_TABLE=25;
    public static final int NOT_SYM=29;
    public static final int OR_SYM=30;
    public static final int SELECT_STATEMENT=32;
    public static final int VARDEF=34;
    public static final int WHERE_CLAUSE=36;
    public static final int WHERE_CLAUSES=37;

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
    // MySelect.g:26:1: stat : ( select_clause )+ ;
    public final MySelectParser.stat_return stat() throws RecognitionException {
        MySelectParser.stat_return retval = new MySelectParser.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelectParser.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:26:5: ( ( select_clause )+ )
            // MySelect.g:27:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:27:3: ( select_clause )+
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
            	    // MySelect.g:27:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat91);
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
    // MySelect.g:30:1: select_clause : select_key column_list_clause ( from_clause )? ( where_clauses )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* ) ;
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
            // MySelect.g:30:14: ( select_key column_list_clause ( from_clause )? ( where_clauses )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* ) )
            // MySelect.g:31:3: select_key column_list_clause ( from_clause )? ( where_clauses )?
            {
            pushFollow(FOLLOW_select_key_in_select_clause103);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_column_list_clause_in_select_clause107);
            column_list_clause3=column_list_clause();

            state._fsp--;

            stream_column_list_clause.add(column_list_clause3.getTree());

            // MySelect.g:33:3: ( from_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FROM) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySelect.g:33:4: from_clause
                    {
                    pushFollow(FOLLOW_from_clause_in_select_clause112);
                    from_clause4=from_clause();

                    state._fsp--;

                    stream_from_clause.add(from_clause4.getTree());

                    }
                    break;

            }


            // MySelect.g:34:3: ( where_clauses )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySelect.g:34:4: where_clauses
                    {
                    pushFollow(FOLLOW_where_clauses_in_select_clause119);
                    where_clauses5=where_clauses();

                    state._fsp--;

                    stream_where_clauses.add(where_clauses5.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: where_clauses, from_clause, column_list_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* )
            {
                // MySelect.g:36:3: ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSES where_clauses ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:37:4: ^( COLUMN_LIST column_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_column_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MySelect.g:38:4: ( ^( FROM_LIST from_clause ) )*
                while ( stream_from_clause.hasNext() ) {
                    // MySelect.g:38:4: ^( FROM_LIST from_clause )
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

                // MySelect.g:39:4: ( ^( WHERE_CLAUSES where_clauses ) )*
                while ( stream_where_clauses.hasNext() ) {
                    // MySelect.g:39:4: ^( WHERE_CLAUSES where_clauses )
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


    public static class column_list_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_list_clause"
    // MySelect.g:43:1: column_list_clause : ID ( COMMA ID )* -> ( COLUMN_NAME ID )* ;
    public final MySelectParser.column_list_clause_return column_list_clause() throws RecognitionException {
        MySelectParser.column_list_clause_return retval = new MySelectParser.column_list_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID6=null;
        Token COMMA7=null;
        Token ID8=null;

        Object ID6_tree=null;
        Object COMMA7_tree=null;
        Object ID8_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // MySelect.g:43:19: ( ID ( COMMA ID )* -> ( COLUMN_NAME ID )* )
            // MySelect.g:44:3: ID ( COMMA ID )*
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_column_list_clause175);  
            stream_ID.add(ID6);


            // MySelect.g:44:6: ( COMMA ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MySelect.g:44:7: COMMA ID
            	    {
            	    COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_list_clause178);  
            	    stream_COMMA.add(COMMA7);


            	    ID8=(Token)match(input,ID,FOLLOW_ID_in_column_list_clause180);  
            	    stream_ID.add(ID8);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:18: -> ( COLUMN_NAME ID )*
            {
                // MySelect.g:44:21: ( COLUMN_NAME ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(COLUMN_NAME, "COLUMN_NAME")
                    );

                    adaptor.addChild(root_0, 
                    stream_ID.nextNode()
                    );

                }
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
    // $ANTLR end "column_list_clause"


    public static class from_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "from_clause"
    // MySelect.g:47:1: from_clause : FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* ;
    public final MySelectParser.from_clause_return from_clause() throws RecognitionException {
        MySelectParser.from_clause_return retval = new MySelectParser.from_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FROM9=null;
        Token ID10=null;
        Token COMMA11=null;
        Token ID12=null;

        Object FROM9_tree=null;
        Object ID10_tree=null;
        Object COMMA11_tree=null;
        Object ID12_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // MySelect.g:47:12: ( FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* )
            // MySelect.g:48:3: FROM ID ( COMMA ID )*
            {
            FROM9=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause203);  
            stream_FROM.add(FROM9);


            ID10=(Token)match(input,ID,FOLLOW_ID_in_from_clause205);  
            stream_ID.add(ID10);


            // MySelect.g:48:11: ( COMMA ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MySelect.g:48:12: COMMA ID
            	    {
            	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause208);  
            	    stream_COMMA.add(COMMA11);


            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_from_clause210);  
            	    stream_ID.add(ID12);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:23: -> ( FROM_TABLE ID )*
            {
                // MySelect.g:48:26: ( FROM_TABLE ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(FROM_TABLE, "FROM_TABLE")
                    );

                    adaptor.addChild(root_0, 
                    stream_ID.nextNode()
                    );

                }
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
    // $ANTLR end "from_clause"


    public static class select_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_key"
    // MySelect.g:51:1: select_key : SELECT ;
    public final MySelectParser.select_key_return select_key() throws RecognitionException {
        MySelectParser.select_key_return retval = new MySelectParser.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT13=null;

        Object SELECT13_tree=null;

        try {
            // MySelect.g:51:11: ( SELECT )
            // MySelect.g:52:3: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT13=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key235); 
            SELECT13_tree = 
            (Object)adaptor.create(SELECT13)
            ;
            adaptor.addChild(root_0, SELECT13_tree);


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
    // MySelect.g:55:1: relational_op : EQ ;
    public final MySelectParser.relational_op_return relational_op() throws RecognitionException {
        MySelectParser.relational_op_return retval = new MySelectParser.relational_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQ14=null;

        Object EQ14_tree=null;

        try {
            // MySelect.g:55:14: ( EQ )
            // MySelect.g:56:3: EQ
            {
            root_0 = (Object)adaptor.nil();


            EQ14=(Token)match(input,EQ,FOLLOW_EQ_in_relational_op248); 
            EQ14_tree = 
            (Object)adaptor.create(EQ14)
            ;
            adaptor.addChild(root_0, EQ14_tree);


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


    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // MySelect.g:58:1: where_clause : ID relational_op INT -> ( VARDEF ^( ID INT ) )* ;
    public final MySelectParser.where_clause_return where_clause() throws RecognitionException {
        MySelectParser.where_clause_return retval = new MySelectParser.where_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID15=null;
        Token INT17=null;
        MySelectParser.relational_op_return relational_op16 =null;


        Object ID15_tree=null;
        Object INT17_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        try {
            // MySelect.g:58:13: ( ID relational_op INT -> ( VARDEF ^( ID INT ) )* )
            // MySelect.g:61:3: ID relational_op INT
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_where_clause265);  
            stream_ID.add(ID15);


            pushFollow(FOLLOW_relational_op_in_where_clause267);
            relational_op16=relational_op();

            state._fsp--;

            stream_relational_op.add(relational_op16.getTree());

            INT17=(Token)match(input,INT,FOLLOW_INT_in_where_clause269);  
            stream_INT.add(INT17);


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
            // 61:24: -> ( VARDEF ^( ID INT ) )*
            {
                // MySelect.g:61:27: ( VARDEF ^( ID INT ) )*
                while ( stream_INT.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_0, 
                    (Object)adaptor.create(VARDEF, "VARDEF")
                    );

                    // MySelect.g:61:35: ^( ID INT )
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


    public static class where_clauses_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clauses"
    // MySelect.g:64:1: where_clauses : WHERE where_clause ( AND where_clause )* -> ( WHERE_CLAUSE where_clause )* ;
    public final MySelectParser.where_clauses_return where_clauses() throws RecognitionException {
        MySelectParser.where_clauses_return retval = new MySelectParser.where_clauses_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE18=null;
        Token AND20=null;
        MySelectParser.where_clause_return where_clause19 =null;

        MySelectParser.where_clause_return where_clause21 =null;


        Object WHERE18_tree=null;
        Object AND20_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        try {
            // MySelect.g:64:14: ( WHERE where_clause ( AND where_clause )* -> ( WHERE_CLAUSE where_clause )* )
            // MySelect.g:65:3: WHERE where_clause ( AND where_clause )*
            {
            WHERE18=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clauses294);  
            stream_WHERE.add(WHERE18);


            pushFollow(FOLLOW_where_clause_in_where_clauses299);
            where_clause19=where_clause();

            state._fsp--;

            stream_where_clause.add(where_clause19.getTree());

            // MySelect.g:66:17: ( AND where_clause )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AND) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MySelect.g:66:18: AND where_clause
            	    {
            	    AND20=(Token)match(input,AND,FOLLOW_AND_in_where_clauses302);  
            	    stream_AND.add(AND20);


            	    pushFollow(FOLLOW_where_clause_in_where_clauses304);
            	    where_clause21=where_clause();

            	    state._fsp--;

            	    stream_where_clause.add(where_clause21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // 67:3: -> ( WHERE_CLAUSE where_clause )*
            {
                // MySelect.g:67:6: ( WHERE_CLAUSE where_clause )*
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

    // Delegated rules


 

    public static final BitSet FOLLOW_select_clause_in_stat91 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_select_key_in_select_clause103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_column_list_clause_in_select_clause107 = new BitSet(new long[]{0x0000000000002082L});
    public static final BitSet FOLLOW_from_clause_in_select_clause112 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_where_clauses_in_select_clause119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list_clause175 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_column_list_clause178 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_column_list_clause180 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_FROM_in_from_clause203 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_from_clause205 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_from_clause208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_from_clause210 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_SELECT_in_select_key235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_relational_op248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_where_clause265 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_relational_op_in_where_clause267 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_where_clause269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clauses294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_where_clause_in_where_clauses299 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_where_clauses302 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_where_clause_in_where_clauses304 = new BitSet(new long[]{0x0000000000000012L});

}