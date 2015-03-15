// $ANTLR 3.4 MyLexer.g 2015-03-15 17:59:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyLexerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "FROM", "ID", "INT", "NEWLINE", "SELECT", "SEMI", "WHERE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MyLexerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyLexerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MyLexerParser.tokenNames; }
    public String getGrammarFileName() { return "MyLexer.g"; }


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // MyLexer.g:24:1: expr : multExpr ( ( '+' ^| '-' ^) multExpr )* ;
    public final MyLexerParser.expr_return expr() throws RecognitionException {
        MyLexerParser.expr_return retval = new MyLexerParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal3=null;
        MyLexerParser.multExpr_return multExpr1 =null;

        MyLexerParser.multExpr_return multExpr4 =null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal3_tree=null;

        try {
            // MyLexer.g:24:5: ( multExpr ( ( '+' ^| '-' ^) multExpr )* )
            // MyLexer.g:24:7: multExpr ( ( '+' ^| '-' ^) multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr126);
            multExpr1=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr1.getTree());

            // MyLexer.g:24:16: ( ( '+' ^| '-' ^) multExpr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 16 && LA2_0 <= 17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MyLexer.g:24:17: ( '+' ^| '-' ^) multExpr
            	    {
            	    // MyLexer.g:24:17: ( '+' ^| '-' ^)
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==16) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==17) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // MyLexer.g:24:18: '+' ^
            	            {
            	            char_literal2=(Token)match(input,16,FOLLOW_16_in_expr130); 
            	            char_literal2_tree = 
            	            (CommonTree)adaptor.create(char_literal2)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal2_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // MyLexer.g:24:23: '-' ^
            	            {
            	            char_literal3=(Token)match(input,17,FOLLOW_17_in_expr133); 
            	            char_literal3_tree = 
            	            (CommonTree)adaptor.create(char_literal3)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal3_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr137);
            	    multExpr4=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // MyLexer.g:27:1: multExpr : atom ( '*' ^ atom )* ;
    public final MyLexerParser.multExpr_return multExpr() throws RecognitionException {
        MyLexerParser.multExpr_return retval = new MyLexerParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal6=null;
        MyLexerParser.atom_return atom5 =null;

        MyLexerParser.atom_return atom7 =null;


        CommonTree char_literal6_tree=null;

        try {
            // MyLexer.g:28:2: ( atom ( '*' ^ atom )* )
            // MyLexer.g:28:4: atom ( '*' ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr150);
            atom5=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom5.getTree());

            // MyLexer.g:28:9: ( '*' ^ atom )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MyLexer.g:28:10: '*' ^ atom
            	    {
            	    char_literal6=(Token)match(input,15,FOLLOW_15_in_multExpr153); 
            	    char_literal6_tree = 
            	    (CommonTree)adaptor.create(char_literal6)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr157);
            	    atom7=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // MyLexer.g:31:1: atom : ( INT | ID | '(' ! expr ')' !);
    public final MyLexerParser.atom_return atom() throws RecognitionException {
        MyLexerParser.atom_return retval = new MyLexerParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT8=null;
        Token ID9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        MyLexerParser.expr_return expr11 =null;


        CommonTree INT8_tree=null;
        CommonTree ID9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;

        try {
            // MyLexer.g:31:5: ( INT | ID | '(' ! expr ')' !)
            int alt4=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // MyLexer.g:31:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT8=(Token)match(input,INT,FOLLOW_INT_in_atom168); 
                    INT8_tree = 
                    (CommonTree)adaptor.create(INT8)
                    ;
                    adaptor.addChild(root_0, INT8_tree);


                    }
                    break;
                case 2 :
                    // MyLexer.g:32:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID9=(Token)match(input,ID,FOLLOW_ID_in_atom173); 
                    ID9_tree = 
                    (CommonTree)adaptor.create(ID9)
                    ;
                    adaptor.addChild(root_0, ID9_tree);


                    }
                    break;
                case 3 :
                    // MyLexer.g:33:4: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal10=(Token)match(input,13,FOLLOW_13_in_atom178); 

                    pushFollow(FOLLOW_expr_in_atom181);
                    expr11=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr11.getTree());

                    char_literal12=(Token)match(input,14,FOLLOW_14_in_atom183); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // MyLexer.g:36:1: prog : ( stat )+ ;
    public final MyLexerParser.prog_return prog() throws RecognitionException {
        MyLexerParser.prog_return retval = new MyLexerParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MyLexerParser.stat_return stat13 =null;



        try {
            // MyLexer.g:36:5: ( ( stat )+ )
            // MyLexer.g:36:7: ( stat )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // MyLexer.g:36:7: ( stat )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= ID && LA5_0 <= NEWLINE)||LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MyLexer.g:36:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog195);
            	    stat13=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat13.getTree());

            	    System.out.println((stat13!=null?((CommonTree)stat13.tree):null).toStringTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // MyLexer.g:38:1: stat : ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->);
    public final MyLexerParser.stat_return stat() throws RecognitionException {
        MyLexerParser.stat_return retval = new MyLexerParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE15=null;
        Token ID16=null;
        Token char_literal17=null;
        Token NEWLINE19=null;
        Token NEWLINE20=null;
        MyLexerParser.expr_return expr14 =null;

        MyLexerParser.expr_return expr18 =null;


        CommonTree NEWLINE15_tree=null;
        CommonTree ID16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree NEWLINE19_tree=null;
        CommonTree NEWLINE20_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MyLexer.g:38:5: ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->)
            int alt6=3;
            switch ( input.LA(1) ) {
            case INT:
            case 13:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==18) ) {
                    alt6=2;
                }
                else if ( (LA6_2==NEWLINE||(LA6_2 >= 15 && LA6_2 <= 17)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // MyLexer.g:38:7: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat208);
                    expr14=expr();

                    state._fsp--;

                    stream_expr.add(expr14.getTree());

                    NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat210);  
                    stream_NEWLINE.add(NEWLINE15);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 38:21: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // MyLexer.g:39:4: ID '=' expr NEWLINE
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_stat220);  
                    stream_ID.add(ID16);


                    char_literal17=(Token)match(input,18,FOLLOW_18_in_stat222);  
                    stream_18.add(char_literal17);


                    pushFollow(FOLLOW_expr_in_stat224);
                    expr18=expr();

                    state._fsp--;

                    stream_expr.add(expr18.getTree());

                    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat226);  
                    stream_NEWLINE.add(NEWLINE19);


                    // AST REWRITE
                    // elements: 18, expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 39:24: -> ^( '=' ID expr )
                    {
                        // MyLexer.g:39:27: ^( '=' ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // MyLexer.g:40:4: NEWLINE
                    {
                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat241);  
                    stream_NEWLINE.add(NEWLINE20);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:15: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"

    // Delegated rules


 

    public static final BitSet FOLLOW_multExpr_in_expr126 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_expr130 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_17_in_expr133 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_multExpr_in_expr137 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_atom_in_multExpr150 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_multExpr153 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_atom_in_multExpr157 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_INT_in_atom168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom178 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_expr_in_atom181 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_prog195 = new BitSet(new long[]{0x00000000000021C2L});
    public static final BitSet FOLLOW_expr_in_stat208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_stat222 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_expr_in_stat224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat241 = new BitSet(new long[]{0x0000000000000002L});

}