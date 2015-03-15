// $ANTLR 3.4 MyLexer.g 2015-03-15 19:50:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyLexer extends Lexer {
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

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MyLexer() {} 
    public MyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MyLexer.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:3:7: ( 'select' )
            // MyLexer.g:3:9: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:4:5: ( 'from' )
            // MyLexer.g:4:7: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:5:6: ( 'where' )
            // MyLexer.g:5:8: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:6:4: ( 'and' )
            // MyLexer.g:6:6: 'and'
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
    // $ANTLR end "AND"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:7:3: ( '=' )
            // MyLexer.g:7:5: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:9:5: ( ';' )
            // MyLexer.g:9:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:11:3: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // MyLexer.g:11:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // MyLexer.g:11:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:13:4: ( ( '0' .. '9' )+ )
            // MyLexer.g:13:6: ( '0' .. '9' )+
            {
            // MyLexer.g:13:6: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:15:8: ( ( '\\r' )? '\\n' )
            // MyLexer.g:15:10: ( '\\r' )? '\\n'
            {
            // MyLexer.g:15:10: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MyLexer.g:15:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:17:6: ( ',' )
            // MyLexer.g:17:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:19:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MyLexer.g:19:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MyLexer.g:19:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // MyLexer.g:1:8: ( SELECT | FROM | WHERE | AND | EQ | SEMI | ID | INT | NEWLINE | COMMA | WS )
        int alt5=11;
        switch ( input.LA(1) ) {
        case 's':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='e') ) {
                int LA5_13 = input.LA(3);

                if ( (LA5_13=='l') ) {
                    int LA5_18 = input.LA(4);

                    if ( (LA5_18=='e') ) {
                        int LA5_22 = input.LA(5);

                        if ( (LA5_22=='c') ) {
                            int LA5_26 = input.LA(6);

                            if ( (LA5_26=='t') ) {
                                int LA5_29 = input.LA(7);

                                if ( ((LA5_29 >= 'A' && LA5_29 <= 'Z')||(LA5_29 >= 'a' && LA5_29 <= 'z')) ) {
                                    alt5=7;
                                }
                                else {
                                    alt5=1;
                                }
                            }
                            else {
                                alt5=7;
                            }
                        }
                        else {
                            alt5=7;
                        }
                    }
                    else {
                        alt5=7;
                    }
                }
                else {
                    alt5=7;
                }
            }
            else {
                alt5=7;
            }
            }
            break;
        case 'f':
            {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='r') ) {
                int LA5_14 = input.LA(3);

                if ( (LA5_14=='o') ) {
                    int LA5_19 = input.LA(4);

                    if ( (LA5_19=='m') ) {
                        int LA5_23 = input.LA(5);

                        if ( ((LA5_23 >= 'A' && LA5_23 <= 'Z')||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
                            alt5=7;
                        }
                        else {
                            alt5=2;
                        }
                    }
                    else {
                        alt5=7;
                    }
                }
                else {
                    alt5=7;
                }
            }
            else {
                alt5=7;
            }
            }
            break;
        case 'w':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='h') ) {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='e') ) {
                    int LA5_20 = input.LA(4);

                    if ( (LA5_20=='r') ) {
                        int LA5_24 = input.LA(5);

                        if ( (LA5_24=='e') ) {
                            int LA5_28 = input.LA(6);

                            if ( ((LA5_28 >= 'A' && LA5_28 <= 'Z')||(LA5_28 >= 'a' && LA5_28 <= 'z')) ) {
                                alt5=7;
                            }
                            else {
                                alt5=3;
                            }
                        }
                        else {
                            alt5=7;
                        }
                    }
                    else {
                        alt5=7;
                    }
                }
                else {
                    alt5=7;
                }
            }
            else {
                alt5=7;
            }
            }
            break;
        case 'a':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='n') ) {
                int LA5_16 = input.LA(3);

                if ( (LA5_16=='d') ) {
                    int LA5_21 = input.LA(4);

                    if ( ((LA5_21 >= 'A' && LA5_21 <= 'Z')||(LA5_21 >= 'a' && LA5_21 <= 'z')) ) {
                        alt5=7;
                    }
                    else {
                        alt5=4;
                    }
                }
                else {
                    alt5=7;
                }
            }
            else {
                alt5=7;
            }
            }
            break;
        case '=':
            {
            alt5=5;
            }
            break;
        case ';':
            {
            alt5=6;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=7;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=8;
            }
            break;
        case '\r':
            {
            int LA5_9 = input.LA(2);

            if ( (LA5_9=='\n') ) {
                int LA5_10 = input.LA(3);

                if ( ((LA5_10 >= '\t' && LA5_10 <= '\n')||LA5_10=='\r'||LA5_10==' ') ) {
                    alt5=11;
                }
                else {
                    alt5=9;
                }
            }
            else {
                alt5=11;
            }
            }
            break;
        case '\n':
            {
            int LA5_10 = input.LA(2);

            if ( ((LA5_10 >= '\t' && LA5_10 <= '\n')||LA5_10=='\r'||LA5_10==' ') ) {
                alt5=11;
            }
            else {
                alt5=9;
            }
            }
            break;
        case ',':
            {
            alt5=10;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // MyLexer.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // MyLexer.g:1:17: FROM
                {
                mFROM(); 


                }
                break;
            case 3 :
                // MyLexer.g:1:22: WHERE
                {
                mWHERE(); 


                }
                break;
            case 4 :
                // MyLexer.g:1:28: AND
                {
                mAND(); 


                }
                break;
            case 5 :
                // MyLexer.g:1:32: EQ
                {
                mEQ(); 


                }
                break;
            case 6 :
                // MyLexer.g:1:35: SEMI
                {
                mSEMI(); 


                }
                break;
            case 7 :
                // MyLexer.g:1:40: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // MyLexer.g:1:43: INT
                {
                mINT(); 


                }
                break;
            case 9 :
                // MyLexer.g:1:47: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 10 :
                // MyLexer.g:1:55: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 11 :
                // MyLexer.g:1:61: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}