// $ANTLR 3.4 MyLexer.g 2015-03-15 20:30:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyLexer extends Lexer {
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

    // $ANTLR start "LTH"
    public final void mLTH() throws RecognitionException {
        try {
            int _type = LTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:8:4: ( '<' )
            // MyLexer.g:8:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTH"

    // $ANTLR start "GTH"
    public final void mGTH() throws RecognitionException {
        try {
            int _type = GTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:9:4: ( '>' )
            // MyLexer.g:9:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTH"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:10:7: ( '!=' )
            // MyLexer.g:10:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:11:4: ( '<=' )
            // MyLexer.g:11:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:12:4: ( '>=' )
            // MyLexer.g:12:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:14:5: ( ';' )
            // MyLexer.g:14:7: ';'
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
            // MyLexer.g:16:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // MyLexer.g:16:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // MyLexer.g:16:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            // MyLexer.g:18:4: ( ( '0' .. '9' )+ )
            // MyLexer.g:18:6: ( '0' .. '9' )+
            {
            // MyLexer.g:18:6: ( '0' .. '9' )+
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
            // MyLexer.g:20:8: ( ( '\\r' )? '\\n' )
            // MyLexer.g:20:10: ( '\\r' )? '\\n'
            {
            // MyLexer.g:20:10: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MyLexer.g:20:10: '\\r'
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
            // MyLexer.g:22:6: ( ',' )
            // MyLexer.g:22:8: ','
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
            // MyLexer.g:24:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MyLexer.g:24:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MyLexer.g:24:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

    // $ANTLR start "USER_VAR"
    public final void mUSER_VAR() throws RecognitionException {
        try {
            int _type = USER_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:26:9: ( '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 ) )
            // MyLexer.g:27:2: '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
            {
            match('@'); 

            // MyLexer.g:27:6: ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
            int alt5=4;
            switch ( input.LA(1) ) {
            case '`':
                {
                alt5=1;
                }
                break;
            case '\'':
                {
                alt5=2;
                }
                break;
            case '\"':
                {
                alt5=3;
                }
                break;
            case '$':
            case '.':
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
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
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
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // MyLexer.g:27:7: USER_VAR_SUBFIX1
                    {
                    mUSER_VAR_SUBFIX1(); 


                    }
                    break;
                case 2 :
                    // MyLexer.g:27:26: USER_VAR_SUBFIX2
                    {
                    mUSER_VAR_SUBFIX2(); 


                    }
                    break;
                case 3 :
                    // MyLexer.g:27:45: USER_VAR_SUBFIX3
                    {
                    mUSER_VAR_SUBFIX3(); 


                    }
                    break;
                case 4 :
                    // MyLexer.g:27:64: USER_VAR_SUBFIX4
                    {
                    mUSER_VAR_SUBFIX4(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:30:4: ( '.' )
            // MyLexer.g:30:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "USER_VAR_SUBFIX1"
    public final void mUSER_VAR_SUBFIX1() throws RecognitionException {
        try {
            // MyLexer.g:32:26: ( ( '`' (~ '`' )+ '`' ) )
            // MyLexer.g:32:28: ( '`' (~ '`' )+ '`' )
            {
            // MyLexer.g:32:28: ( '`' (~ '`' )+ '`' )
            // MyLexer.g:32:31: '`' (~ '`' )+ '`'
            {
            match('`'); 

            // MyLexer.g:32:35: (~ '`' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '_')||(LA6_0 >= 'a' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match('`'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR_SUBFIX1"

    // $ANTLR start "USER_VAR_SUBFIX2"
    public final void mUSER_VAR_SUBFIX2() throws RecognitionException {
        try {
            // MyLexer.g:33:26: ( ( '\\'' (~ '\\'' )+ '\\'' ) )
            // MyLexer.g:33:28: ( '\\'' (~ '\\'' )+ '\\'' )
            {
            // MyLexer.g:33:28: ( '\\'' (~ '\\'' )+ '\\'' )
            // MyLexer.g:33:30: '\\'' (~ '\\'' )+ '\\''
            {
            match('\''); 

            // MyLexer.g:33:35: (~ '\\'' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match('\''); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR_SUBFIX2"

    // $ANTLR start "USER_VAR_SUBFIX3"
    public final void mUSER_VAR_SUBFIX3() throws RecognitionException {
        try {
            // MyLexer.g:34:26: ( ( '\\\"' (~ '\\\"' )+ '\\\"' ) )
            // MyLexer.g:34:28: ( '\\\"' (~ '\\\"' )+ '\\\"' )
            {
            // MyLexer.g:34:28: ( '\\\"' (~ '\\\"' )+ '\\\"' )
            // MyLexer.g:34:30: '\\\"' (~ '\\\"' )+ '\\\"'
            {
            match('\"'); 

            // MyLexer.g:34:35: (~ '\\\"' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match('\"'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR_SUBFIX3"

    // $ANTLR start "USER_VAR_SUBFIX4"
    public final void mUSER_VAR_SUBFIX4() throws RecognitionException {
        try {
            // MyLexer.g:35:26: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+ )
            // MyLexer.g:35:28: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
            {
            // MyLexer.g:35:28: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||LA9_0=='.'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MyLexer.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR_SUBFIX4"

    public void mTokens() throws RecognitionException {
        // MyLexer.g:1:8: ( SELECT | FROM | WHERE | AND | EQ | LTH | GTH | NOT_EQ | LET | GET | SEMI | ID | INT | NEWLINE | COMMA | WS | USER_VAR | DOT )
        int alt10=18;
        switch ( input.LA(1) ) {
        case 's':
            {
            int LA10_1 = input.LA(2);

            if ( (LA10_1=='e') ) {
                int LA10_18 = input.LA(3);

                if ( (LA10_18=='l') ) {
                    int LA10_27 = input.LA(4);

                    if ( (LA10_27=='e') ) {
                        int LA10_31 = input.LA(5);

                        if ( (LA10_31=='c') ) {
                            int LA10_35 = input.LA(6);

                            if ( (LA10_35=='t') ) {
                                int LA10_38 = input.LA(7);

                                if ( ((LA10_38 >= 'A' && LA10_38 <= 'Z')||LA10_38=='_'||(LA10_38 >= 'a' && LA10_38 <= 'z')) ) {
                                    alt10=12;
                                }
                                else {
                                    alt10=1;
                                }
                            }
                            else {
                                alt10=12;
                            }
                        }
                        else {
                            alt10=12;
                        }
                    }
                    else {
                        alt10=12;
                    }
                }
                else {
                    alt10=12;
                }
            }
            else {
                alt10=12;
            }
            }
            break;
        case 'f':
            {
            int LA10_2 = input.LA(2);

            if ( (LA10_2=='r') ) {
                int LA10_19 = input.LA(3);

                if ( (LA10_19=='o') ) {
                    int LA10_28 = input.LA(4);

                    if ( (LA10_28=='m') ) {
                        int LA10_32 = input.LA(5);

                        if ( ((LA10_32 >= 'A' && LA10_32 <= 'Z')||LA10_32=='_'||(LA10_32 >= 'a' && LA10_32 <= 'z')) ) {
                            alt10=12;
                        }
                        else {
                            alt10=2;
                        }
                    }
                    else {
                        alt10=12;
                    }
                }
                else {
                    alt10=12;
                }
            }
            else {
                alt10=12;
            }
            }
            break;
        case 'w':
            {
            int LA10_3 = input.LA(2);

            if ( (LA10_3=='h') ) {
                int LA10_20 = input.LA(3);

                if ( (LA10_20=='e') ) {
                    int LA10_29 = input.LA(4);

                    if ( (LA10_29=='r') ) {
                        int LA10_33 = input.LA(5);

                        if ( (LA10_33=='e') ) {
                            int LA10_37 = input.LA(6);

                            if ( ((LA10_37 >= 'A' && LA10_37 <= 'Z')||LA10_37=='_'||(LA10_37 >= 'a' && LA10_37 <= 'z')) ) {
                                alt10=12;
                            }
                            else {
                                alt10=3;
                            }
                        }
                        else {
                            alt10=12;
                        }
                    }
                    else {
                        alt10=12;
                    }
                }
                else {
                    alt10=12;
                }
            }
            else {
                alt10=12;
            }
            }
            break;
        case 'a':
            {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='n') ) {
                int LA10_21 = input.LA(3);

                if ( (LA10_21=='d') ) {
                    int LA10_30 = input.LA(4);

                    if ( ((LA10_30 >= 'A' && LA10_30 <= 'Z')||LA10_30=='_'||(LA10_30 >= 'a' && LA10_30 <= 'z')) ) {
                        alt10=12;
                    }
                    else {
                        alt10=4;
                    }
                }
                else {
                    alt10=12;
                }
            }
            else {
                alt10=12;
            }
            }
            break;
        case '=':
            {
            alt10=5;
            }
            break;
        case '<':
            {
            int LA10_6 = input.LA(2);

            if ( (LA10_6=='=') ) {
                alt10=9;
            }
            else {
                alt10=6;
            }
            }
            break;
        case '>':
            {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='=') ) {
                alt10=10;
            }
            else {
                alt10=7;
            }
            }
            break;
        case '!':
            {
            alt10=8;
            }
            break;
        case ';':
            {
            alt10=11;
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
        case '_':
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
            alt10=12;
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
            alt10=13;
            }
            break;
        case '\r':
            {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='\n') ) {
                int LA10_13 = input.LA(3);

                if ( ((LA10_13 >= '\t' && LA10_13 <= '\n')||LA10_13=='\r'||LA10_13==' ') ) {
                    alt10=16;
                }
                else {
                    alt10=14;
                }
            }
            else {
                alt10=16;
            }
            }
            break;
        case '\n':
            {
            int LA10_13 = input.LA(2);

            if ( ((LA10_13 >= '\t' && LA10_13 <= '\n')||LA10_13=='\r'||LA10_13==' ') ) {
                alt10=16;
            }
            else {
                alt10=14;
            }
            }
            break;
        case ',':
            {
            alt10=15;
            }
            break;
        case '\t':
        case ' ':
            {
            alt10=16;
            }
            break;
        case '@':
            {
            alt10=17;
            }
            break;
        case '.':
            {
            alt10=18;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
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
                // MyLexer.g:1:35: LTH
                {
                mLTH(); 


                }
                break;
            case 7 :
                // MyLexer.g:1:39: GTH
                {
                mGTH(); 


                }
                break;
            case 8 :
                // MyLexer.g:1:43: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 9 :
                // MyLexer.g:1:50: LET
                {
                mLET(); 


                }
                break;
            case 10 :
                // MyLexer.g:1:54: GET
                {
                mGET(); 


                }
                break;
            case 11 :
                // MyLexer.g:1:58: SEMI
                {
                mSEMI(); 


                }
                break;
            case 12 :
                // MyLexer.g:1:63: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // MyLexer.g:1:66: INT
                {
                mINT(); 


                }
                break;
            case 14 :
                // MyLexer.g:1:70: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 15 :
                // MyLexer.g:1:78: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 16 :
                // MyLexer.g:1:84: WS
                {
                mWS(); 


                }
                break;
            case 17 :
                // MyLexer.g:1:87: USER_VAR
                {
                mUSER_VAR(); 


                }
                break;
            case 18 :
                // MyLexer.g:1:96: DOT
                {
                mDOT(); 


                }
                break;

        }

    }


 

}