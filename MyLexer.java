// $ANTLR 3.4 MyLexer.g 2015-03-16 00:32:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ALL=4;
    public static final int ALL_FIELDS=5;
    public static final int AND=6;
    public static final int ANY=7;
    public static final int ASTERISK=8;
    public static final int BETWEEN=9;
    public static final int BINARY=10;
    public static final int BITAND=11;
    public static final int COLLATE=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int DIVIDE=15;
    public static final int DOT=16;
    public static final int EQ=17;
    public static final int ESCAPE=18;
    public static final int EXISTS=19;
    public static final int FALSE=20;
    public static final int FROM=21;
    public static final int GET=22;
    public static final int GTH=23;
    public static final int ID=24;
    public static final int IN=25;
    public static final int INT=26;
    public static final int IS=27;
    public static final int LBRACK=28;
    public static final int LET=29;
    public static final int LIKE=30;
    public static final int LPAREN=31;
    public static final int LTH=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int NEGATION=35;
    public static final int NEWLINE=36;
    public static final int NOT=37;
    public static final int NOT_EQ=38;
    public static final int NULL=39;
    public static final int OR=40;
    public static final int PLUS=41;
    public static final int POWER_OP=42;
    public static final int RBRACK=43;
    public static final int REGEXP=44;
    public static final int RPAREN=45;
    public static final int SELECT=46;
    public static final int SEMI=47;
    public static final int SHIFT_LEFT=48;
    public static final int SHIFT_RIGHT=49;
    public static final int TRUE=50;
    public static final int USER_VAR=51;
    public static final int USER_VAR_SUBFIX1=52;
    public static final int USER_VAR_SUBFIX2=53;
    public static final int USER_VAR_SUBFIX3=54;
    public static final int USER_VAR_SUBFIX4=55;
    public static final int VERTBAR=56;
    public static final int WHERE=57;
    public static final int WS=58;
    public static final int XOR=59;

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
            // MyLexer.g:6:4: ( 'and' | '&&' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='a') ) {
                alt1=1;
            }
            else if ( (LA1_0=='&') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // MyLexer.g:6:6: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // MyLexer.g:6:14: '&&'
                    {
                    match("&&"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:7:3: ( 'or' | '||' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='o') ) {
                alt2=1;
            }
            else if ( (LA2_0=='|') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // MyLexer.g:7:5: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 2 :
                    // MyLexer.g:7:12: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:8:4: ( 'xor' )
            // MyLexer.g:8:6: 'xor'
            {
            match("xor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:9:3: ( 'is' )
            // MyLexer.g:9:5: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:10:5: ( 'null' )
            // MyLexer.g:10:7: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:11:5: ( 'like' )
            // MyLexer.g:11:7: 'like'
            {
            match("like"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:12:3: ( 'in' )
            // MyLexer.g:12:5: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:13:7: ( 'exists' )
            // MyLexer.g:13:9: 'exists'
            {
            match("exists"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:14:4: ( 'all' )
            // MyLexer.g:14:6: 'all'
            {
            match("all"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:15:4: ( 'any' )
            // MyLexer.g:15:6: 'any'
            {
            match("any"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:16:5: ( 'true' )
            // MyLexer.g:16:7: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:17:6: ( 'false' )
            // MyLexer.g:17:8: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:18:8: ( 'div' | '/' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='d') ) {
                alt3=1;
            }
            else if ( (LA3_0=='/') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // MyLexer.g:18:10: 'div'
                    {
                    match("div"); 



                    }
                    break;
                case 2 :
                    // MyLexer.g:18:18: '/'
                    {
                    match('/'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:19:4: ( 'mod' | '%' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='m') ) {
                alt4=1;
            }
            else if ( (LA4_0=='%') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // MyLexer.g:19:6: 'mod'
                    {
                    match("mod"); 



                    }
                    break;
                case 2 :
                    // MyLexer.g:19:14: '%'
                    {
                    match('%'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:20:8: ( 'between' )
            // MyLexer.g:20:10: 'between'
            {
            match("between"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:21:7: ( 'regexp' )
            // MyLexer.g:21:9: 'regexp'
            {
            match("regexp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:22:6: ( '+' )
            // MyLexer.g:22:8: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:23:7: ( '-' )
            // MyLexer.g:23:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "NEGATION"
    public final void mNEGATION() throws RecognitionException {
        try {
            int _type = NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:24:9: ( '~' )
            // MyLexer.g:24:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEGATION"

    // $ANTLR start "VERTBAR"
    public final void mVERTBAR() throws RecognitionException {
        try {
            int _type = VERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:25:9: ( '|' )
            // MyLexer.g:25:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTBAR"

    // $ANTLR start "BITAND"
    public final void mBITAND() throws RecognitionException {
        try {
            int _type = BITAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:26:8: ( '&' )
            // MyLexer.g:26:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITAND"

    // $ANTLR start "POWER_OP"
    public final void mPOWER_OP() throws RecognitionException {
        try {
            int _type = POWER_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:27:9: ( '^' )
            // MyLexer.g:27:11: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POWER_OP"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:28:7: ( 'binary' )
            // MyLexer.g:28:9: 'binary'
            {
            match("binary"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:29:12: ( '<<' )
            // MyLexer.g:29:14: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:30:13: ( '>>' )
            // MyLexer.g:30:15: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:31:7: ( 'escape' )
            // MyLexer.g:31:9: 'escape'
            {
            match("escape"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:32:9: ( '*' )
            // MyLexer.g:32:11: '*'
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
    // $ANTLR end "ASTERISK"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:33:8: ( ')' )
            // MyLexer.g:33:10: ')'
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
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:34:8: ( '(' )
            // MyLexer.g:34:10: '('
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
    // $ANTLR end "LPAREN"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:35:8: ( ']' )
            // MyLexer.g:35:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:36:8: ( '[' )
            // MyLexer.g:36:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:37:7: ( ':' )
            // MyLexer.g:37:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ALL_FIELDS"
    public final void mALL_FIELDS() throws RecognitionException {
        try {
            int _type = ALL_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:38:12: ( '.*' )
            // MyLexer.g:38:14: '.*'
            {
            match(".*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL_FIELDS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:39:3: ( '=' )
            // MyLexer.g:39:5: '='
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
            // MyLexer.g:40:4: ( '<' )
            // MyLexer.g:40:6: '<'
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
            // MyLexer.g:41:4: ( '>' )
            // MyLexer.g:41:6: '>'
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
            // MyLexer.g:42:7: ( '!=' )
            // MyLexer.g:42:9: '!='
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:43:4: ( 'not' )
            // MyLexer.g:43:6: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:44:4: ( '<=' )
            // MyLexer.g:44:6: '<='
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
            // MyLexer.g:45:4: ( '>=' )
            // MyLexer.g:45:6: '>='
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
            // MyLexer.g:46:5: ( ';' )
            // MyLexer.g:46:7: ';'
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

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:47:6: ( ',' )
            // MyLexer.g:47:8: ','
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

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:48:4: ( '.' )
            // MyLexer.g:48:6: '.'
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

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:49:8: ( 'collate' )
            // MyLexer.g:49:10: 'collate'
            {
            match("collate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:52:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // MyLexer.g:52:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // MyLexer.g:52:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // MyLexer.g:53:4: ( ( '0' .. '9' )+ )
            // MyLexer.g:53:6: ( '0' .. '9' )+
            {
            // MyLexer.g:53:6: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // MyLexer.g:56:8: ( ( '\\r' )? '\\n' )
            // MyLexer.g:56:10: ( '\\r' )? '\\n'
            {
            // MyLexer.g:56:10: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // MyLexer.g:56:10: '\\r'
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MyLexer.g:57:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MyLexer.g:57:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MyLexer.g:57:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // MyLexer.g:59:9: ( '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 ) )
            // MyLexer.g:60:2: '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
            {
            match('@'); 

            // MyLexer.g:60:6: ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
            int alt9=4;
            switch ( input.LA(1) ) {
            case '`':
                {
                alt9=1;
                }
                break;
            case '\'':
                {
                alt9=2;
                }
                break;
            case '\"':
                {
                alt9=3;
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
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // MyLexer.g:60:7: USER_VAR_SUBFIX1
                    {
                    mUSER_VAR_SUBFIX1(); 


                    }
                    break;
                case 2 :
                    // MyLexer.g:60:26: USER_VAR_SUBFIX2
                    {
                    mUSER_VAR_SUBFIX2(); 


                    }
                    break;
                case 3 :
                    // MyLexer.g:60:45: USER_VAR_SUBFIX3
                    {
                    mUSER_VAR_SUBFIX3(); 


                    }
                    break;
                case 4 :
                    // MyLexer.g:60:64: USER_VAR_SUBFIX4
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

    // $ANTLR start "USER_VAR_SUBFIX1"
    public final void mUSER_VAR_SUBFIX1() throws RecognitionException {
        try {
            // MyLexer.g:63:26: ( ( '`' (~ '`' )+ '`' ) )
            // MyLexer.g:63:28: ( '`' (~ '`' )+ '`' )
            {
            // MyLexer.g:63:28: ( '`' (~ '`' )+ '`' )
            // MyLexer.g:63:31: '`' (~ '`' )+ '`'
            {
            match('`'); 

            // MyLexer.g:63:35: (~ '`' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\u0000' && LA10_0 <= '_')||(LA10_0 >= 'a' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // MyLexer.g:64:26: ( ( '\\'' (~ '\\'' )+ '\\'' ) )
            // MyLexer.g:64:28: ( '\\'' (~ '\\'' )+ '\\'' )
            {
            // MyLexer.g:64:28: ( '\\'' (~ '\\'' )+ '\\'' )
            // MyLexer.g:64:30: '\\'' (~ '\\'' )+ '\\''
            {
            match('\''); 

            // MyLexer.g:64:35: (~ '\\'' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // MyLexer.g:65:26: ( ( '\\\"' (~ '\\\"' )+ '\\\"' ) )
            // MyLexer.g:65:28: ( '\\\"' (~ '\\\"' )+ '\\\"' )
            {
            // MyLexer.g:65:28: ( '\\\"' (~ '\\\"' )+ '\\\"' )
            // MyLexer.g:65:30: '\\\"' (~ '\\\"' )+ '\\\"'
            {
            match('\"'); 

            // MyLexer.g:65:35: (~ '\\\"' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // MyLexer.g:66:26: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+ )
            // MyLexer.g:66:28: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
            {
            // MyLexer.g:66:28: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='$'||LA13_0=='.'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USER_VAR_SUBFIX4"

    public void mTokens() throws RecognitionException {
        // MyLexer.g:1:8: ( SELECT | FROM | WHERE | AND | OR | XOR | IS | NULL | LIKE | IN | EXISTS | ALL | ANY | TRUE | FALSE | DIVIDE | MOD | BETWEEN | REGEXP | PLUS | MINUS | NEGATION | VERTBAR | BITAND | POWER_OP | BINARY | SHIFT_LEFT | SHIFT_RIGHT | ESCAPE | ASTERISK | RPAREN | LPAREN | RBRACK | LBRACK | COLON | ALL_FIELDS | EQ | LTH | GTH | NOT_EQ | NOT | LET | GET | SEMI | COMMA | DOT | COLLATE | ID | INT | NEWLINE | WS | USER_VAR )
        int alt14=52;
        alt14 = dfa14.predict(input);
        switch (alt14) {
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
                // MyLexer.g:1:32: OR
                {
                mOR(); 


                }
                break;
            case 6 :
                // MyLexer.g:1:35: XOR
                {
                mXOR(); 


                }
                break;
            case 7 :
                // MyLexer.g:1:39: IS
                {
                mIS(); 


                }
                break;
            case 8 :
                // MyLexer.g:1:42: NULL
                {
                mNULL(); 


                }
                break;
            case 9 :
                // MyLexer.g:1:47: LIKE
                {
                mLIKE(); 


                }
                break;
            case 10 :
                // MyLexer.g:1:52: IN
                {
                mIN(); 


                }
                break;
            case 11 :
                // MyLexer.g:1:55: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 12 :
                // MyLexer.g:1:62: ALL
                {
                mALL(); 


                }
                break;
            case 13 :
                // MyLexer.g:1:66: ANY
                {
                mANY(); 


                }
                break;
            case 14 :
                // MyLexer.g:1:70: TRUE
                {
                mTRUE(); 


                }
                break;
            case 15 :
                // MyLexer.g:1:75: FALSE
                {
                mFALSE(); 


                }
                break;
            case 16 :
                // MyLexer.g:1:81: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 17 :
                // MyLexer.g:1:88: MOD
                {
                mMOD(); 


                }
                break;
            case 18 :
                // MyLexer.g:1:92: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 19 :
                // MyLexer.g:1:100: REGEXP
                {
                mREGEXP(); 


                }
                break;
            case 20 :
                // MyLexer.g:1:107: PLUS
                {
                mPLUS(); 


                }
                break;
            case 21 :
                // MyLexer.g:1:112: MINUS
                {
                mMINUS(); 


                }
                break;
            case 22 :
                // MyLexer.g:1:118: NEGATION
                {
                mNEGATION(); 


                }
                break;
            case 23 :
                // MyLexer.g:1:127: VERTBAR
                {
                mVERTBAR(); 


                }
                break;
            case 24 :
                // MyLexer.g:1:135: BITAND
                {
                mBITAND(); 


                }
                break;
            case 25 :
                // MyLexer.g:1:142: POWER_OP
                {
                mPOWER_OP(); 


                }
                break;
            case 26 :
                // MyLexer.g:1:151: BINARY
                {
                mBINARY(); 


                }
                break;
            case 27 :
                // MyLexer.g:1:158: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 


                }
                break;
            case 28 :
                // MyLexer.g:1:169: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 


                }
                break;
            case 29 :
                // MyLexer.g:1:181: ESCAPE
                {
                mESCAPE(); 


                }
                break;
            case 30 :
                // MyLexer.g:1:188: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 31 :
                // MyLexer.g:1:197: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 32 :
                // MyLexer.g:1:204: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 33 :
                // MyLexer.g:1:211: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 34 :
                // MyLexer.g:1:218: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 35 :
                // MyLexer.g:1:225: COLON
                {
                mCOLON(); 


                }
                break;
            case 36 :
                // MyLexer.g:1:231: ALL_FIELDS
                {
                mALL_FIELDS(); 


                }
                break;
            case 37 :
                // MyLexer.g:1:242: EQ
                {
                mEQ(); 


                }
                break;
            case 38 :
                // MyLexer.g:1:245: LTH
                {
                mLTH(); 


                }
                break;
            case 39 :
                // MyLexer.g:1:249: GTH
                {
                mGTH(); 


                }
                break;
            case 40 :
                // MyLexer.g:1:253: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 41 :
                // MyLexer.g:1:260: NOT
                {
                mNOT(); 


                }
                break;
            case 42 :
                // MyLexer.g:1:264: LET
                {
                mLET(); 


                }
                break;
            case 43 :
                // MyLexer.g:1:268: GET
                {
                mGET(); 


                }
                break;
            case 44 :
                // MyLexer.g:1:272: SEMI
                {
                mSEMI(); 


                }
                break;
            case 45 :
                // MyLexer.g:1:277: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 46 :
                // MyLexer.g:1:283: DOT
                {
                mDOT(); 


                }
                break;
            case 47 :
                // MyLexer.g:1:287: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 48 :
                // MyLexer.g:1:295: ID
                {
                mID(); 


                }
                break;
            case 49 :
                // MyLexer.g:1:298: INT
                {
                mINT(); 


                }
                break;
            case 50 :
                // MyLexer.g:1:302: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 51 :
                // MyLexer.g:1:310: WS
                {
                mWS(); 


                }
                break;
            case 52 :
                // MyLexer.g:1:313: USER_VAR
                {
                mUSER_VAR(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\46\1\63\1\46\1\66\7\46\1\uffff\1\46\1\uffff\2\46\4\uffff"+
        "\1\107\1\112\6\uffff\1\114\4\uffff\1\46\2\uffff\1\52\1\116\2\uffff"+
        "\6\46\2\uffff\1\65\2\uffff\1\46\1\127\1\130\13\46\10\uffff\1\46"+
        "\1\uffff\4\46\1\62\1\151\1\152\1\153\2\uffff\1\46\1\155\4\46\1\17"+
        "\1\21\5\46\1\167\2\46\3\uffff\1\172\1\uffff\1\173\2\46\1\176\5\46"+
        "\1\uffff\1\u0084\1\u0085\2\uffff\2\46\1\uffff\4\46\1\u008c\2\uffff"+
        "\1\u008d\1\u008e\1\46\1\u0090\1\u0091\1\46\3\uffff\1\u0093\2\uffff"+
        "\1\u0094\2\uffff";
    static final String DFA14_eofS =
        "\u0095\uffff";
    static final String DFA14_minS =
        "\1\11\1\145\1\141\1\150\1\154\1\46\1\162\1\174\1\157\1\156\1\157"+
        "\1\151\1\163\1\162\1\151\1\uffff\1\157\1\uffff\2\145\4\uffff\1\74"+
        "\1\75\6\uffff\1\52\4\uffff\1\157\2\uffff\1\12\1\11\2\uffff\1\154"+
        "\1\157\1\154\1\145\1\144\1\154\2\uffff\1\101\2\uffff\1\162\2\101"+
        "\1\154\1\164\1\153\1\151\1\143\1\165\1\166\1\144\1\164\1\156\1\147"+
        "\10\uffff\1\154\1\uffff\1\145\1\155\1\163\1\162\4\101\2\uffff\1"+
        "\154\1\101\1\145\1\163\1\141\1\145\2\101\1\167\1\141\1\145\1\154"+
        "\1\143\1\101\2\145\3\uffff\1\101\1\uffff\1\101\1\164\1\160\1\101"+
        "\1\145\1\162\1\170\1\141\1\164\1\uffff\2\101\2\uffff\1\163\1\145"+
        "\1\uffff\1\145\1\171\1\160\1\164\1\101\2\uffff\2\101\1\156\2\101"+
        "\1\145\3\uffff\1\101\2\uffff\1\101\2\uffff";
    static final String DFA14_maxS =
        "\1\176\1\145\1\162\1\150\1\156\1\46\1\162\1\174\1\157\1\163\1\165"+
        "\1\151\1\170\1\162\1\151\1\uffff\1\157\1\uffff\1\151\1\145\4\uffff"+
        "\1\75\1\76\6\uffff\1\52\4\uffff\1\157\2\uffff\1\12\1\40\2\uffff"+
        "\1\154\1\157\1\154\1\145\1\171\1\154\2\uffff\1\172\2\uffff\1\162"+
        "\2\172\1\154\1\164\1\153\1\151\1\143\1\165\1\166\1\144\1\164\1\156"+
        "\1\147\10\uffff\1\154\1\uffff\1\145\1\155\1\163\1\162\4\172\2\uffff"+
        "\1\154\1\172\1\145\1\163\1\141\1\145\2\172\1\167\1\141\1\145\1\154"+
        "\1\143\1\172\2\145\3\uffff\1\172\1\uffff\1\172\1\164\1\160\1\172"+
        "\1\145\1\162\1\170\1\141\1\164\1\uffff\2\172\2\uffff\1\163\1\145"+
        "\1\uffff\1\145\1\171\1\160\1\164\1\172\2\uffff\2\172\1\156\2\172"+
        "\1\145\3\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\17\uffff\1\20\1\uffff\1\21\2\uffff\1\24\1\25\1\26\1\31\2\uffff"+
        "\1\36\1\37\1\40\1\41\1\42\1\43\1\uffff\1\45\1\50\1\54\1\55\1\uffff"+
        "\1\60\1\61\2\uffff\1\63\1\64\6\uffff\1\4\1\30\1\uffff\1\5\1\27\16"+
        "\uffff\1\33\1\52\1\46\1\34\1\53\1\47\1\44\1\56\1\uffff\1\62\10\uffff"+
        "\1\7\1\12\20\uffff\1\15\1\14\1\6\1\uffff\1\51\11\uffff\1\2\2\uffff"+
        "\1\10\1\11\2\uffff\1\16\5\uffff\1\17\1\3\6\uffff\1\1\1\13\1\35\1"+
        "\uffff\1\32\1\23\1\uffff\1\22\1\57";
    static final String DFA14_specialS =
        "\u0095\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\52\1\51\2\uffff\1\50\22\uffff\1\52\1\42\3\uffff\1\21\1\5"+
            "\1\uffff\1\34\1\33\1\32\1\24\1\44\1\25\1\40\1\17\12\47\1\37"+
            "\1\43\1\30\1\41\1\31\1\uffff\1\53\32\46\1\36\1\uffff\1\35\1"+
            "\27\1\46\1\uffff\1\4\1\22\1\45\1\16\1\14\1\2\2\46\1\11\2\46"+
            "\1\13\1\20\1\12\1\6\2\46\1\23\1\1\1\15\2\46\1\3\1\10\2\46\1"+
            "\uffff\1\7\1\uffff\1\26",
            "\1\54",
            "\1\56\20\uffff\1\55",
            "\1\57",
            "\1\61\1\uffff\1\60",
            "\1\62",
            "\1\64",
            "\1\65",
            "\1\67",
            "\1\71\4\uffff\1\70",
            "\1\73\5\uffff\1\72",
            "\1\74",
            "\1\76\4\uffff\1\75",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "",
            "\1\102\3\uffff\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\105\1\106",
            "\1\111\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "\1\51",
            "\2\52\2\uffff\1\52\22\uffff\1\52",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\24\uffff\1\124",
            "\1\125",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\126",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\154",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\170",
            "\1\171",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\174",
            "\1\175",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008f",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | FROM | WHERE | AND | OR | XOR | IS | NULL | LIKE | IN | EXISTS | ALL | ANY | TRUE | FALSE | DIVIDE | MOD | BETWEEN | REGEXP | PLUS | MINUS | NEGATION | VERTBAR | BITAND | POWER_OP | BINARY | SHIFT_LEFT | SHIFT_RIGHT | ESCAPE | ASTERISK | RPAREN | LPAREN | RBRACK | LBRACK | COLON | ALL_FIELDS | EQ | LTH | GTH | NOT_EQ | NOT | LET | GET | SEMI | COMMA | DOT | COLLATE | ID | INT | NEWLINE | WS | USER_VAR );";
        }
    }
 

}