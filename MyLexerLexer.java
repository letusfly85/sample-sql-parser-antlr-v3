// $ANTLR 3.4 MyLexer.g 2015-03-15 17:59:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyLexerLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MyLexerLexer() {} 
    public MyLexerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyLexerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MyLexer.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:2:7: ( '(' )
            // MyLexer.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:3:7: ( ')' )
            // MyLexer.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:4:7: ( '*' )
            // MyLexer.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:5:7: ( '+' )
            // MyLexer.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:6:7: ( '-' )
            // MyLexer.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:7:7: ( '=' )
            // MyLexer.g:7:9: '='
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
    // $ANTLR end "T__18"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:8:7: ( 'select' )
            // MyLexer.g:8:9: 'select'
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
            // MyLexer.g:9:5: ( 'from' )
            // MyLexer.g:9:7: 'from'
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
            // MyLexer.g:10:6: ( 'where' )
            // MyLexer.g:10:8: 'where'
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

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:12:5: ( ';' )
            // MyLexer.g:12:7: ';'
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
            // MyLexer.g:14:3: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // MyLexer.g:14:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // MyLexer.g:14:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            // MyLexer.g:16:4: ( ( '0' .. '9' )+ )
            // MyLexer.g:16:6: ( '0' .. '9' )+
            {
            // MyLexer.g:16:6: ( '0' .. '9' )+
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
            // MyLexer.g:18:8: ( ( '\\r' )? '\\n' )
            // MyLexer.g:18:10: ( '\\r' )? '\\n'
            {
            // MyLexer.g:18:10: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MyLexer.g:18:10: '\\r'
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
            // MyLexer.g:20:6: ( ',' )
            // MyLexer.g:20:8: ','
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
            // MyLexer.g:22:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MyLexer.g:22:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MyLexer.g:22:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
        // MyLexer.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | SELECT | FROM | WHERE | SEMI | ID | INT | NEWLINE | COMMA | WS )
        int alt5=15;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt5=1;
            }
            break;
        case ')':
            {
            alt5=2;
            }
            break;
        case '*':
            {
            alt5=3;
            }
            break;
        case '+':
            {
            alt5=4;
            }
            break;
        case '-':
            {
            alt5=5;
            }
            break;
        case '=':
            {
            alt5=6;
            }
            break;
        case 's':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='e') ) {
                int LA5_17 = input.LA(3);

                if ( (LA5_17=='l') ) {
                    int LA5_21 = input.LA(4);

                    if ( (LA5_21=='e') ) {
                        int LA5_24 = input.LA(5);

                        if ( (LA5_24=='c') ) {
                            int LA5_27 = input.LA(6);

                            if ( (LA5_27=='t') ) {
                                int LA5_30 = input.LA(7);

                                if ( ((LA5_30 >= 'A' && LA5_30 <= 'Z')||(LA5_30 >= 'a' && LA5_30 <= 'z')) ) {
                                    alt5=11;
                                }
                                else {
                                    alt5=7;
                                }
                            }
                            else {
                                alt5=11;
                            }
                        }
                        else {
                            alt5=11;
                        }
                    }
                    else {
                        alt5=11;
                    }
                }
                else {
                    alt5=11;
                }
            }
            else {
                alt5=11;
            }
            }
            break;
        case 'f':
            {
            int LA5_8 = input.LA(2);

            if ( (LA5_8=='r') ) {
                int LA5_18 = input.LA(3);

                if ( (LA5_18=='o') ) {
                    int LA5_22 = input.LA(4);

                    if ( (LA5_22=='m') ) {
                        int LA5_25 = input.LA(5);

                        if ( ((LA5_25 >= 'A' && LA5_25 <= 'Z')||(LA5_25 >= 'a' && LA5_25 <= 'z')) ) {
                            alt5=11;
                        }
                        else {
                            alt5=8;
                        }
                    }
                    else {
                        alt5=11;
                    }
                }
                else {
                    alt5=11;
                }
            }
            else {
                alt5=11;
            }
            }
            break;
        case 'w':
            {
            int LA5_9 = input.LA(2);

            if ( (LA5_9=='h') ) {
                int LA5_19 = input.LA(3);

                if ( (LA5_19=='e') ) {
                    int LA5_23 = input.LA(4);

                    if ( (LA5_23=='r') ) {
                        int LA5_26 = input.LA(5);

                        if ( (LA5_26=='e') ) {
                            int LA5_29 = input.LA(6);

                            if ( ((LA5_29 >= 'A' && LA5_29 <= 'Z')||(LA5_29 >= 'a' && LA5_29 <= 'z')) ) {
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
                    else {
                        alt5=11;
                    }
                }
                else {
                    alt5=11;
                }
            }
            else {
                alt5=11;
            }
            }
            break;
        case ';':
            {
            alt5=10;
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
        case 'a':
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
            alt5=11;
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
            alt5=12;
            }
            break;
        case '\r':
            {
            int LA5_13 = input.LA(2);

            if ( (LA5_13=='\n') ) {
                int LA5_14 = input.LA(3);

                if ( ((LA5_14 >= '\t' && LA5_14 <= '\n')||LA5_14=='\r'||LA5_14==' ') ) {
                    alt5=15;
                }
                else {
                    alt5=13;
                }
            }
            else {
                alt5=15;
            }
            }
            break;
        case '\n':
            {
            int LA5_14 = input.LA(2);

            if ( ((LA5_14 >= '\t' && LA5_14 <= '\n')||LA5_14=='\r'||LA5_14==' ') ) {
                alt5=15;
            }
            else {
                alt5=13;
            }
            }
            break;
        case ',':
            {
            alt5=14;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=15;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // MyLexer.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // MyLexer.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // MyLexer.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // MyLexer.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // MyLexer.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // MyLexer.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // MyLexer.g:1:46: SELECT
                {
                mSELECT(); 


                }
                break;
            case 8 :
                // MyLexer.g:1:53: FROM
                {
                mFROM(); 


                }
                break;
            case 9 :
                // MyLexer.g:1:58: WHERE
                {
                mWHERE(); 


                }
                break;
            case 10 :
                // MyLexer.g:1:64: SEMI
                {
                mSEMI(); 


                }
                break;
            case 11 :
                // MyLexer.g:1:69: ID
                {
                mID(); 


                }
                break;
            case 12 :
                // MyLexer.g:1:72: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // MyLexer.g:1:76: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 14 :
                // MyLexer.g:1:84: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 15 :
                // MyLexer.g:1:90: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}