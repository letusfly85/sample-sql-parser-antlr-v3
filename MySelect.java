// $ANTLR 3.4 MySelect.g 2015-03-15 15:20:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelect extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "FROM", "ID", "INT", "NEWLINE", "SELECT", "SEMI", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='", "COLUMN_LIST", "COLUMN_NAME", "SELECT_STATEMENT"
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
    public static final int SELECT_STATEMENT=20;

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
    // MySelect.g:14:1: stat : ( select_clause )+ ;
    public final MySelect.stat_return stat() throws RecognitionException {
        MySelect.stat_return retval = new MySelect.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_clause_return select_clause1 =null;



        try {
            // MySelect.g:14:5: ( ( select_clause )+ )
            // MySelect.g:15:3: ( select_clause )+
            {
            root_0 = (Object)adaptor.nil();


            // MySelect.g:15:3: ( select_clause )+
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
            	    // MySelect.g:15:3: select_clause
            	    {
            	    pushFollow(FOLLOW_select_clause_in_stat47);
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
    // MySelect.g:18:1: select_clause : select_key colum_list_clause -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ) ;
    public final MySelect.select_clause_return select_clause() throws RecognitionException {
        MySelect.select_clause_return retval = new MySelect.select_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySelect.select_key_return select_key2 =null;

        MySelect.colum_list_clause_return colum_list_clause3 =null;


        RewriteRuleSubtreeStream stream_select_key=new RewriteRuleSubtreeStream(adaptor,"rule select_key");
        RewriteRuleSubtreeStream stream_colum_list_clause=new RewriteRuleSubtreeStream(adaptor,"rule colum_list_clause");
        try {
            // MySelect.g:18:14: ( select_key colum_list_clause -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) ) )
            // MySelect.g:19:3: select_key colum_list_clause
            {
            pushFollow(FOLLOW_select_key_in_select_clause59);
            select_key2=select_key();

            state._fsp--;

            stream_select_key.add(select_key2.getTree());

            pushFollow(FOLLOW_colum_list_clause_in_select_clause61);
            colum_list_clause3=colum_list_clause();

            state._fsp--;

            stream_colum_list_clause.add(colum_list_clause3.getTree());

            // AST REWRITE
            // elements: colum_list_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 20:3: -> ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) )
            {
                // MySelect.g:20:6: ^( SELECT_STATEMENT ^( COLUMN_LIST colum_list_clause ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_STATEMENT, "SELECT_STATEMENT")
                , root_1);

                // MySelect.g:20:25: ^( COLUMN_LIST colum_list_clause )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_colum_list_clause.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // MySelect.g:23:1: colum_list_clause : ID ( COMMA ID )* -> ( COLUMN_NAME ID )* ;
    public final MySelect.colum_list_clause_return colum_list_clause() throws RecognitionException {
        MySelect.colum_list_clause_return retval = new MySelect.colum_list_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID4=null;
        Token COMMA5=null;
        Token ID6=null;

        Object ID4_tree=null;
        Object COMMA5_tree=null;
        Object ID6_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // MySelect.g:23:18: ( ID ( COMMA ID )* -> ( COLUMN_NAME ID )* )
            // MySelect.g:25:3: ID ( COMMA ID )*
            {
            ID4=(Token)match(input,ID,FOLLOW_ID_in_colum_list_clause89);  
            stream_ID.add(ID4);


            // MySelect.g:25:6: ( COMMA ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MySelect.g:25:7: COMMA ID
            	    {
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_colum_list_clause92);  
            	    stream_COMMA.add(COMMA5);


            	    ID6=(Token)match(input,ID,FOLLOW_ID_in_colum_list_clause94);  
            	    stream_ID.add(ID6);


            	    }
            	    break;

            	default :
            	    break loop2;
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
            // 25:18: -> ( COLUMN_NAME ID )*
            {
                // MySelect.g:25:21: ( COLUMN_NAME ID )*
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


    public static class select_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_key"
    // MySelect.g:28:1: select_key : SELECT ;
    public final MySelect.select_key_return select_key() throws RecognitionException {
        MySelect.select_key_return retval = new MySelect.select_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT7=null;

        Object SELECT7_tree=null;

        try {
            // MySelect.g:28:11: ( SELECT )
            // MySelect.g:29:2: SELECT
            {
            root_0 = (Object)adaptor.nil();


            SELECT7=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_key117); 
            SELECT7_tree = 
            (Object)adaptor.create(SELECT7)
            ;
            adaptor.addChild(root_0, SELECT7_tree);


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


 

    public static final BitSet FOLLOW_select_clause_in_stat47 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_select_key_in_select_clause59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_colum_list_clause_in_select_clause61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colum_list_clause89 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_colum_list_clause92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_colum_list_clause94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SELECT_in_select_key117 = new BitSet(new long[]{0x0000000000000002L});

}