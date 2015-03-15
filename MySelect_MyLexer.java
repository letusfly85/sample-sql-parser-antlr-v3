// $ANTLR 3.4 MyLexer.g 2015-03-15 18:29:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySelect_MyLexer extends Lexer {
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
    // delegators
    public MySelectLexer gMySelect;
    public MySelectLexer gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MySelect_MyLexer() {} 
    public MySelect_MyLexer(CharStream input, MySelectLexer gMySelect) {
        this(input, new RecognizerSharedState(), gMySelect);
    }
    public MySelect_MyLexer(CharStream input, RecognizerSharedState state, MySelectLexer gMySelect) {
        super(input,state);
        this.gMySelect = gMySelect;
        gParent = gMySelect;
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

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:6:3: ( '=' )
            // MyLexer.g:6:5: '='
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
            // MyLexer.g:8:5: ( ';' )
            // MyLexer.g:8:7: ';'
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
            // MyLexer.g:10:3: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // MyLexer.g:10:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // MyLexer.g:10:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            // MyLexer.g:12:4: ( ( '0' .. '9' )+ )
            // MyLexer.g:12:6: ( '0' .. '9' )+
            {
            // MyLexer.g:12:6: ( '0' .. '9' )+
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
            // MyLexer.g:14:8: ( ( '\\r' )? '\\n' )
            // MyLexer.g:14:10: ( '\\r' )? '\\n'
            {
            // MyLexer.g:14:10: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MyLexer.g:14:10: '\\r'
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
            // MyLexer.g:16:6: ( ',' )
            // MyLexer.g:16:8: ','
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
            // MyLexer.g:18:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MyLexer.g:18:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MyLexer.g:18:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
        // MyLexer.g:1:8: ( SELECT | FROM | WHERE | EQ | SEMI | ID | INT | NEWLINE | COMMA | WS )
        int alt5=10;
        switch ( input.LA(1) ) {
        case 's':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='e') ) {
                int LA5_12 = input.LA(3);

                if ( (LA5_12=='l') ) {
                    int LA5_16 = input.LA(4);

                    if ( (LA5_16=='e') ) {
                        int LA5_19 = input.LA(5);

                        if ( (LA5_19=='c') ) {
                            int LA5_22 = input.LA(6);

                            if ( (LA5_22=='t') ) {
                                int LA5_25 = input.LA(7);

                                if ( ((LA5_25 >= 'A' && LA5_25 <= 'Z')||(LA5_25 >= 'a' && LA5_25 <= 'z')) ) {
                                    alt5=6;
                                }
                                else {
                                    alt5=1;
                                }
                            }
                            else {
                                alt5=6;
                            }
                        }
                        else {
                            alt5=6;
                        }
                    }
                    else {
                        alt5=6;
                    }
                }
                else {
                    alt5=6;
                }
            }
            else {
                alt5=6;
            }
            }
            break;
        case 'f':
            {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='r') ) {
                int LA5_13 = input.LA(3);

                if ( (LA5_13=='o') ) {
                    int LA5_17 = input.LA(4);

                    if ( (LA5_17=='m') ) {
                        int LA5_20 = input.LA(5);

                        if ( ((LA5_20 >= 'A' && LA5_20 <= 'Z')||(LA5_20 >= 'a' && LA5_20 <= 'z')) ) {
                            alt5=6;
                        }
                        else {
                            alt5=2;
                        }
                    }
                    else {
                        alt5=6;
                    }
                }
                else {
                    alt5=6;
                }
            }
            else {
                alt5=6;
            }
            }
            break;
        case 'w':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='h') ) {
                int LA5_14 = input.LA(3);

                if ( (LA5_14=='e') ) {
                    int LA5_18 = input.LA(4);

                    if ( (LA5_18=='r') ) {
                        int LA5_21 = input.LA(5);

                        if ( (LA5_21=='e') ) {
                            int LA5_24 = input.LA(6);

                            if ( ((LA5_24 >= 'A' && LA5_24 <= 'Z')||(LA5_24 >= 'a' && LA5_24 <= 'z')) ) {
                                alt5=6;
                            }
                            else {
                                alt5=3;
                            }
                        }
                        else {
                            alt5=6;
                        }
                    }
                    else {
                        alt5=6;
                    }
                }
                else {
                    alt5=6;
                }
            }
            else {
                alt5=6;
            }
            }
            break;
        case '=':
            {
            alt5=4;
            }
            break;
        case ';':
            {
            alt5=5;
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
            alt5=6;
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
            alt5=7;
            }
            break;
        case '\r':
            {
            int LA5_8 = input.LA(2);

            if ( (LA5_8=='\n') ) {
                int LA5_9 = input.LA(3);

                if ( ((LA5_9 >= '\t' && LA5_9 <= '\n')||LA5_9=='\r'||LA5_9==' ') ) {
                    alt5=10;
                }
                else {
                    alt5=8;
                }
            }
            else {
                alt5=10;
            }
            }
            break;
        case '\n':
            {
            int LA5_9 = input.LA(2);

            if ( ((LA5_9 >= '\t' && LA5_9 <= '\n')||LA5_9=='\r'||LA5_9==' ') ) {
                alt5=10;
            }
            else {
                alt5=8;
            }
            }
            break;
        case ',':
            {
            alt5=9;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=10;
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
                // MyLexer.g:1:28: EQ
                {
                mEQ(); 


                }
                break;
            case 5 :
                // MyLexer.g:1:31: SEMI
                {
                mSEMI(); 


                }
                break;
            case 6 :
                // MyLexer.g:1:36: ID
                {
                mID(); 


                }
                break;
            case 7 :
                // MyLexer.g:1:39: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // MyLexer.g:1:43: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 9 :
                // MyLexer.g:1:51: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 10 :
                // MyLexer.g:1:57: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}