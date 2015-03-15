// $ANTLR 3.4 MySelect__.g 2015-03-15 18:29:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelectLexer extends Lexer {
    public static final int EOF=-1;
    public static final int COMMA=4;
    public static final int EQ=5;
    public static final int FROM=6;
    public static final int ID=7;
    public static final int INT=8;
    public static final int NEWLINE=9;
    public static final int SELECT=10;
    public static final int SEMI=11;
    public static final int WHERE=12;
    public static final int WS=13;
    public static final int AND_SYM=14;
    public static final int COLUMN_LIST=15;
    public static final int COLUMN_NAME=16;
    public static final int EQ_SYM=19;
    public static final int FROM_ALIAS=21;
    public static final int FROM_LIST=22;
    public static final int FROM_TABLE=23;
    public static final int NOT_SYM=27;
    public static final int OR_SYM=28;
    public static final int SELECT_STATEMENT=30;
    public static final int VARDEF=32;
    public static final int WHERE_CLAUSE=34;
    public static final int Tokens=35;

    // delegates
    public MySelect_MyLexer gMyLexer;
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {gMyLexer};
    }

    public MySelectLexer() {} 
    public MySelectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySelectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        gMyLexer = new MySelect_MyLexer(input, state, this);
    }
    public String getGrammarFileName() { return "MySelect__.g"; }

    // $ANTLR start "AND_SYM"
    public final void mAND_SYM() throws RecognitionException {
        try {
            int _type = AND_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MySelect__.g:8:9: ( 'and' )
            // MySelect__.g:8:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND_SYM"

    public void mTokens() throws RecognitionException {
        // MySelect__.g:1:8: ( AND_SYM | MyLexer. Tokens )
        int alt1=2;
        int LA1_0 = input.LA(1);

        if ( (LA1_0=='a') ) {
            int LA1_1 = input.LA(2);

            if ( (LA1_1=='n') ) {
                int LA1_3 = input.LA(3);

                if ( (LA1_3=='d') ) {
                    int LA1_4 = input.LA(4);

                    if ( ((LA1_4 >= 'A' && LA1_4 <= 'Z')||(LA1_4 >= 'a' && LA1_4 <= 'z')) ) {
                        alt1=2;
                    }
                    else {
                        alt1=1;
                    }
                }
                else {
                    alt1=2;
                }
            }
            else {
                alt1=2;
            }
        }
        else if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' '||LA1_0==','||(LA1_0 >= '0' && LA1_0 <= '9')||LA1_0==';'||LA1_0=='='||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'b' && LA1_0 <= 'z')) ) {
            alt1=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }
        switch (alt1) {
            case 1 :
                // MySelect__.g:1:10: AND_SYM
                {
                mAND_SYM(); 


                }
                break;
            case 2 :
                // MySelect__.g:1:18: MyLexer. Tokens
                {
                gMyLexer.mTokens(); 


                }
                break;

        }

    }


 

}