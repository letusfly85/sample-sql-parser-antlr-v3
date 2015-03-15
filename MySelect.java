// $ANTLR 3.4 MySelect.g 2015-03-15 17:59:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelect extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "FROM", "ID", "INT", "NEWLINE", "SELECT", "SEMI", "WHERE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='", "AND_SYM", "COLUMN_LIST", "COLUMN_NAME", "FROM_ALIAS", "FROM_LIST", "FROM_TABLE", "NOT_SYM", "OR_SYM", "SELECT_STATEMENT", "VARDEF", "WHERE_CLAUSE"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int COMMA=4;
    public static final int FROM=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int NEWLINE=8;
    public static final int SELECT=9;
    public static final int SEMI=10;
    public static final int WHERE=11;
    public static final int WS=12;
    public static final int AND_SYM=19;
    public static final int COLUMN_LIST=20;
    public static final int COLUMN_NAME=21;
    public static final int EQ_SYM=18;
    public static final int FROM_ALIAS=22;
    public static final int FROM_LIST=23;
    public static final int FROM_TABLE=24;
    public static final int NOT_SYM=25;
    public static final int OR_SYM=26;
    public static final int SELECT_STATEMENT=27;
    public static final int VARDEF=28;
    public static final int WHERE_CLAUSE=29;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MySelect(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySelect(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MySelect.tokenNames; }
    public String getGrammarFileName() { return "MySelect.g"; }


    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // MySelect.g:22:1: stat : ( select_clause )+ ;
    public final MySelect.stat_return stat() throws RecognitionException {
        MySelect.stat_return retval = new MySelect.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:22:5: ( ( select_clause )+ )
            // MySelect.g:23:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:23:3: ( select_clause )+
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
            	    // MySelect.g:23:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat83);
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
    // MySelect.g:26:1: select_clause : select_key column_list_clause ( from_clause )? ( where_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSE where_clause ) )* ) ;
    public final MySelect.select_clause_return select_clause() throws RecognitionException {
        MySelect.select_clause_return retval = new MySelect.select_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_key_return select_key2 =null;

        MySelect.column_list_clause_return column_list_clause3 =null;

        MySelect.from_clause_return from_clause4 =null;

        MySelect.where_clause_return where_clause5 =null;


        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
        RewriteRuleSubtreeStream stream_column_list_clause=new RewriteRuleSubtreeStream(adaptor,"rule column_list_clause");
        RewriteRuleSubtreeStream stream_select_key=new RewriteRuleSubtreeStream(adaptor,"rule select_key");
        try {
            // MySelect.g:26:14: ( select_key column_list_clause ( from_clause )? ( where_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSE where_clause ) )* ) )
            // MySelect.g:27:3: select_key column_list_clause ( from_clause )? ( where_clause )?
            {
            pushFollow(FOLLOW_select_key_in_select_clause95);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_column_list_clause_in_select_clause99);
            column_list_clause3=column_list_clause();

            state._fsp--;

            stream_column_list_clause.add(column_list_clause3.getTree());

            // MySelect.g:29:3: ( from_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FROM) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySelect.g:29:4: from_clause
                    {
                    pushFollow(FOLLOW_from_clause_in_select_clause104);
                    from_clause4=from_clause();

                    state._fsp--;

                    stream_from_clause.add(from_clause4.getTree());

                    }
                    break;

            }


            // MySelect.g:30:3: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MySelect.g:30:4: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_clause111);
                    where_clause5=where_clause();

                    state._fsp--;

                    stream_where_clause.add(where_clause5.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: where_clause, column_list_clause, from_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSE where_clause ) )* )
            {
                // MySelect.g:32:3: ^( SELECT_STATEMENT ^( COLUMN_LIST column_list_clause ) ( ^( FROM_LIST from_clause ) )* ( ^( WHERE_CLAUSE where_clause ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:33:4: ^( COLUMN_LIST column_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_column_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MySelect.g:34:4: ( ^( FROM_LIST from_clause ) )*
                while ( stream_from_clause.hasNext() ) {
                    // MySelect.g:34:4: ^( FROM_LIST from_clause )
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

                // MySelect.g:35:4: ( ^( WHERE_CLAUSE where_clause ) )*
                while ( stream_where_clause.hasNext() ) {
                    // MySelect.g:35:4: ^( WHERE_CLAUSE where_clause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE")
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


    public static class column_list_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_list_clause"
    // MySelect.g:39:1: column_list_clause : ID ( COMMA ID )* -> ( COLUMN_NAME ID )* ;
    public final MySelect.column_list_clause_return column_list_clause() throws RecognitionException {
        MySelect.column_list_clause_return retval = new MySelect.column_list_clause_return();
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
            // MySelect.g:39:19: ( ID ( COMMA ID )* -> ( COLUMN_NAME ID )* )
            // MySelect.g:40:3: ID ( COMMA ID )*
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_column_list_clause167);  
            stream_ID.add(ID6);


            // MySelect.g:40:6: ( COMMA ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MySelect.g:40:7: COMMA ID
            	    {
            	    COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_list_clause170);  
            	    stream_COMMA.add(COMMA7);


            	    ID8=(Token)match(input,ID,FOLLOW_ID_in_column_list_clause172);  
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
            // 40:18: -> ( COLUMN_NAME ID )*
            {
                // MySelect.g:40:21: ( COLUMN_NAME ID )*
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
    // MySelect.g:43:1: from_clause : FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* ;
    public final MySelect.from_clause_return from_clause() throws RecognitionException {
        MySelect.from_clause_return retval = new MySelect.from_clause_return();
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
            // MySelect.g:43:12: ( FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* )
            // MySelect.g:44:3: FROM ID ( COMMA ID )*
            {
            FROM9=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause195);  
            stream_FROM.add(FROM9);


            ID10=(Token)match(input,ID,FOLLOW_ID_in_from_clause197);  
            stream_ID.add(ID10);


            // MySelect.g:44:11: ( COMMA ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MySelect.g:44:12: COMMA ID
            	    {
            	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause200);  
            	    stream_COMMA.add(COMMA11);


            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_from_clause202);  
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
            // 44:23: -> ( FROM_TABLE ID )*
            {
                // MySelect.g:44:26: ( FROM_TABLE ID )*
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
    // MySelect.g:47:1: select_key : SELECT ;
    public final MySelect.select_key_return select_key() throws RecognitionException {
        MySelect.select_key_return retval = new MySelect.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT13=null;

        Object SELECT13_tree=null;

        try {
            // MySelect.g:47:11: ( SELECT )
            // MySelect.g:48:3: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT13=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key227); 
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
    // MySelect.g:51:1: relational_op : EQ_SYM ;
    public final MySelect.relational_op_return relational_op() throws RecognitionException {
        MySelect.relational_op_return retval = new MySelect.relational_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQ_SYM14=null;

        Object EQ_SYM14_tree=null;

        try {
            // MySelect.g:51:14: ( EQ_SYM )
            // MySelect.g:52:3: EQ_SYM
            {
            root_0 = (Object)adaptor.nil();


            EQ_SYM14=(Token)match(input,18,FOLLOW_18_in_relational_op240); 
            EQ_SYM14_tree = 
            (Object)adaptor.create(EQ_SYM14)
            ;
            adaptor.addChild(root_0, EQ_SYM14_tree);


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
    // MySelect.g:54:1: where_clause : WHERE ID relational_op ID -> ^( VARDEF ID ) ;
    public final MySelect.where_clause_return where_clause() throws RecognitionException {
        MySelect.where_clause_return retval = new MySelect.where_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE15=null;
        Token ID16=null;
        Token ID18=null;
        MySelect.relational_op_return relational_op17 =null;


        Object WHERE15_tree=null;
        Object ID16_tree=null;
        Object ID18_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        try {
            // MySelect.g:54:13: ( WHERE ID relational_op ID -> ^( VARDEF ID ) )
            // MySelect.g:56:3: WHERE ID relational_op ID
            {
            WHERE15=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause254);  
            stream_WHERE.add(WHERE15);


            ID16=(Token)match(input,ID,FOLLOW_ID_in_where_clause256);  
            stream_ID.add(ID16);


            pushFollow(FOLLOW_relational_op_in_where_clause258);
            relational_op17=relational_op();

            state._fsp--;

            stream_relational_op.add(relational_op17.getTree());

            ID18=(Token)match(input,ID,FOLLOW_ID_in_where_clause260);  
            stream_ID.add(ID18);


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
            // 56:30: -> ^( VARDEF ID )
            {
                // MySelect.g:56:33: ^( VARDEF ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARDEF, "VARDEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
    // $ANTLR end "where_clause"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // MySelect.g:59:1: expression : VARDEF relational_op ID -> ^( VARDEF ID ) ;
    public final MySelect.expression_return expression() throws RecognitionException {
        MySelect.expression_return retval = new MySelect.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VARDEF19=null;
        Token ID21=null;
        MySelect.relational_op_return relational_op20 =null;


        Object VARDEF19_tree=null;
        Object ID21_tree=null;
        RewriteRuleTokenStream stream_VARDEF=new RewriteRuleTokenStream(adaptor,"token VARDEF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        try {
            // MySelect.g:59:11: ( VARDEF relational_op ID -> ^( VARDEF ID ) )
            // MySelect.g:60:3: VARDEF relational_op ID
            {
            VARDEF19=(Token)match(input,VARDEF,FOLLOW_VARDEF_in_expression281);  
            stream_VARDEF.add(VARDEF19);


            pushFollow(FOLLOW_relational_op_in_expression283);
            relational_op20=relational_op();

            state._fsp--;

            stream_relational_op.add(relational_op20.getTree());

            ID21=(Token)match(input,ID,FOLLOW_ID_in_expression285);  
            stream_ID.add(ID21);


            // AST REWRITE
            // elements: ID, VARDEF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:28: -> ^( VARDEF ID )
            {
                // MySelect.g:60:31: ^( VARDEF ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_VARDEF.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_clause_in_stat83 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_select_key_in_select_clause95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_column_list_clause_in_select_clause99 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_from_clause_in_select_clause104 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_where_clause_in_select_clause111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list_clause167 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_column_list_clause170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_column_list_clause172 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_FROM_in_from_clause195 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_from_clause197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_from_clause200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_from_clause202 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SELECT_in_select_key227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_relational_op240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause254 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_where_clause256 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_relational_op_in_where_clause258 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_where_clause260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_expression281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_relational_op_in_expression283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_expression285 = new BitSet(new long[]{0x0000000000000002L});

}