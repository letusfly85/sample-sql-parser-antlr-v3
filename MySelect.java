// $ANTLR 3.4 MySelect.g 2015-03-15 15:44:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelect extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "FROM", "ID", "INT", "NEWLINE", "SELECT", "SEMI", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='", "COLUMN_LIST", "COLUMN_NAME", "FROM_ALIAS", "FROM_LIST", "FROM_TABLE", "SELECT_STATEMENT"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int COMMA=4;
    public static final int FROM=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int NEWLINE=8;
    public static final int SELECT=9;
    public static final int SEMI=10;
    public static final int WS=11;
    public static final int COLUMN_LIST=18;
    public static final int COLUMN_NAME=19;
    public static final int FROM_ALIAS=20;
    public static final int FROM_LIST=21;
    public static final int FROM_TABLE=22;
    public static final int SELECT_STATEMENT=23;

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
    // MySelect.g:17:1: stat : ( select_clause )+ ;
    public final MySelect.stat_return stat() throws RecognitionException {
        MySelect.stat_return retval = new MySelect.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:17:5: ( ( select_clause )+ )
            // MySelect.g:18:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:18:3: ( select_clause )+
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
            	    // MySelect.g:18:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat59);
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
    // MySelect.g:21:1: select_clause : select_key colum_list_clause ( from_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ( ^( FROM_LIST from_clause ) )* ) ;
    public final MySelect.select_clause_return select_clause() throws RecognitionException {
        MySelect.select_clause_return retval = new MySelect.select_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_key_return select_key2 =null;

        MySelect.colum_list_clause_return colum_list_clause3 =null;

        MySelect.from_clause_return from_clause4 =null;


        RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
        RewriteRuleSubtreeStream stream_select_key=new RewriteRuleSubtreeStream(adaptor,"rule select_key");
        RewriteRuleSubtreeStream stream_colum_list_clause=new RewriteRuleSubtreeStream(adaptor,"rule colum_list_clause");
        try {
            // MySelect.g:21:14: ( select_key colum_list_clause ( from_clause )? -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ( ^( FROM_LIST from_clause ) )* ) )
            // MySelect.g:22:3: select_key colum_list_clause ( from_clause )?
            {
            pushFollow(FOLLOW_select_key_in_select_clause71);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_colum_list_clause_in_select_clause75);
            colum_list_clause3=colum_list_clause();

            state._fsp--;

            stream_colum_list_clause.add(colum_list_clause3.getTree());

            // MySelect.g:24:3: ( from_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FROM) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MySelect.g:24:4: from_clause
                    {
                    pushFollow(FOLLOW_from_clause_in_select_clause80);
                    from_clause4=from_clause();

                    state._fsp--;

                    stream_from_clause.add(from_clause4.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: colum_list_clause, from_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ( ^( FROM_LIST from_clause ) )* )
            {
                // MySelect.g:26:3: ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ( ^( FROM_LIST from_clause ) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:27:4: ^( COLUMN_LIST colum_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_colum_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MySelect.g:28:4: ( ^( FROM_LIST from_clause ) )*
                while ( stream_from_clause.hasNext() ) {
                    // MySelect.g:28:4: ^( FROM_LIST from_clause )
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


    public static class colum_list_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colum_list_clause"
    // MySelect.g:32:1: colum_list_clause : ID ( COMMA ID )* -> ( COLUMN_NAME ID )* ;
    public final MySelect.colum_list_clause_return colum_list_clause() throws RecognitionException {
        MySelect.colum_list_clause_return retval = new MySelect.colum_list_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID5=null;
        Token COMMA6=null;
        Token ID7=null;

        Object ID5_tree=null;
        Object COMMA6_tree=null;
        Object ID7_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // MySelect.g:32:18: ( ID ( COMMA ID )* -> ( COLUMN_NAME ID )* )
            // MySelect.g:33:3: ID ( COMMA ID )*
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_colum_list_clause125);  
            stream_ID.add(ID5);


            // MySelect.g:33:6: ( COMMA ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MySelect.g:33:7: COMMA ID
            	    {
            	    COMMA6=(Token)match(input,COMMA,FOLLOW_COMMA_in_colum_list_clause128);  
            	    stream_COMMA.add(COMMA6);


            	    ID7=(Token)match(input,ID,FOLLOW_ID_in_colum_list_clause130);  
            	    stream_ID.add(ID7);


            	    }
            	    break;

            	default :
            	    break loop3;
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
            // 33:18: -> ( COLUMN_NAME ID )*
            {
                // MySelect.g:33:21: ( COLUMN_NAME ID )*
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
    // $ANTLR end "colum_list_clause"


    public static class from_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "from_clause"
    // MySelect.g:35:1: from_clause : FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* ;
    public final MySelect.from_clause_return from_clause() throws RecognitionException {
        MySelect.from_clause_return retval = new MySelect.from_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FROM8=null;
        Token ID9=null;
        Token COMMA10=null;
        Token ID11=null;

        Object FROM8_tree=null;
        Object ID9_tree=null;
        Object COMMA10_tree=null;
        Object ID11_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // MySelect.g:35:12: ( FROM ID ( COMMA ID )* -> ( FROM_TABLE ID )* )
            // MySelect.g:36:3: FROM ID ( COMMA ID )*
            {
            FROM8=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause151);  
            stream_FROM.add(FROM8);


            ID9=(Token)match(input,ID,FOLLOW_ID_in_from_clause153);  
            stream_ID.add(ID9);


            // MySelect.g:36:11: ( COMMA ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MySelect.g:36:12: COMMA ID
            	    {
            	    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause156);  
            	    stream_COMMA.add(COMMA10);


            	    ID11=(Token)match(input,ID,FOLLOW_ID_in_from_clause158);  
            	    stream_ID.add(ID11);


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
            // 36:23: -> ( FROM_TABLE ID )*
            {
                // MySelect.g:36:26: ( FROM_TABLE ID )*
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
    // MySelect.g:38:1: select_key : SELECT ;
    public final MySelect.select_key_return select_key() throws RecognitionException {
        MySelect.select_key_return retval = new MySelect.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT12=null;

        Object SELECT12_tree=null;

        try {
            // MySelect.g:38:11: ( SELECT )
            // MySelect.g:39:2: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT12=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key180); 
            SELECT12_tree = 
            (Object)adaptor.create(SELECT12)
            ;
            adaptor.addChild(root_0, SELECT12_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_select_clause_in_stat59 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_select_key_in_select_clause71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_colum_list_clause_in_select_clause75 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_from_clause_in_select_clause80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colum_list_clause125 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_colum_list_clause128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_colum_list_clause130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_FROM_in_from_clause151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_from_clause153 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_from_clause156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_from_clause158 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SELECT_in_select_key180 = new BitSet(new long[]{0x0000000000000002L});

}