package org.xtext.example.myxenia.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyXeniaLexer extends Lexer {
    public static final int Val=54;
    public static final int Entity=19;
    public static final int LessThanSignGreaterThanSign=69;
    public static final int RULE_HEX=104;
    public static final int Import=21;
    public static final int EqualsSignGreaterThanSign=71;
    public static final int Var=55;
    public static final int False=28;
    public static final int LessThanSign=93;
    public static final int LeftParenthesis=83;
    public static final int Throw=30;
    public static final int InfoValue=14;
    public static final int Extends=17;
    public static final int ExclamationMark=79;
    public static final int ExclamationMarkEqualsSignEqualsSign=46;
    public static final int GreaterThanSign=95;
    public static final int RULE_ID=107;
    public static final int SiteWithModal=5;
    public static final int GreaterThanSignEqualsSign=72;
    public static final int ColonColon=68;
    public static final int EqualsSignEqualsSign=70;
    public static final int Header=20;
    public static final int Switch=24;
    public static final int VerticalLine=100;
    public static final int PlusSign=86;
    public static final int RULE_INT=105;
    public static final int RULE_ML_COMMENT=109;
    public static final int LeftSquareBracket=97;
    public static final int If=77;
    public static final int Finally=18;
    public static final int Site=35;
    public static final int Catch=27;
    public static final int VerticalLineVerticalLine=78;
    public static final int InfoProperty=6;
    public static final int Case=36;
    public static final int QuestionMarkFullStop=73;
    public static final int Comma=87;
    public static final int As=75;
    public static final int HyphenMinus=88;
    public static final int Synchronized=9;
    public static final int QuestionMarkColon=74;
    public static final int FREQ=32;
    public static final int Solidus=90;
    public static final int RightCurlyBracket=101;
    public static final int PercentSignEqualsSign=57;
    public static final int Path=42;
    public static final int FullStop=89;
    public static final int Default=16;
    public static final int Semicolon=92;
    public static final int PROD=34;
    public static final int PlusSignPlusSign=61;
    public static final int QuestionMark=96;
    public static final int Model=26;
    public static final int Else=37;
    public static final int ExclamationMarkEqualsSign=56;
    public static final int HyphenMinusGreaterThanSign=65;
    public static final int HyphenMinusHyphenMinus=63;
    public static final int New=52;
    public static final int Null=40;
    public static final int RULE_BEGIN=102;
    public static final int Typeof=25;
    public static final int SolidusEqualsSign=67;
    public static final int True=45;
    public static final int Page=41;
    public static final int PRIO=33;
    public static final int Name=39;
    public static final int Tech=44;
    public static final int PercentSign=81;
    public static final int Super=29;
    public static final int FullStopFullStop=66;
    public static final int Try=53;
    public static final int Ampersand=82;
    public static final int AsteriskEqualsSign=60;
    public static final int RightSquareBracket=98;
    public static final int For=51;
    public static final int RightParenthesis=84;
    public static final int Do=76;
    public static final int EqualsSignEqualsSignEqualsSign=48;
    public static final int RULE_DECIMAL=106;
    public static final int InfoEntity=10;
    public static final int NumberSign=80;
    public static final int AsteriskAsterisk=59;
    public static final int Static=23;
    public static final int RULE_END=103;
    public static final int RULE_STRING=108;
    public static final int AppName=15;
    public static final int RULE_SL_COMMENT=110;
    public static final int EqualsSign=94;
    public static final int AmpersandAmpersand=58;
    public static final int SuperSite=12;
    public static final int Instanceof=11;
    public static final int HyphenMinusEqualsSign=64;
    public static final int Colon=91;
    public static final int EOF=-1;
    public static final int RedirectPage=8;
    public static final int Asterisk=85;
    public static final int PlusSignEqualsSign=62;
    public static final int Return=22;
    public static final int MOD=50;
    public static final int RULE_WS=111;
    public static final int MappedEntity=7;
    public static final int Mode=38;
    public static final int LeftCurlyBracket=99;
    public static final int While=31;
    public static final int RULE_ANY_OTHER=112;
    public static final int LinkedProperty=4;
    public static final int Extension=13;
    public static final int FullStopFullStopLessThanSign=47;
    public static final int DEV=49;
    public static final int Site_1=43;

    // delegates
    // delegators

    public InternalMyXeniaLexer() {;} 
    public InternalMyXeniaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyXeniaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyXeniaLexer.g"; }

    // $ANTLR start "LinkedProperty"
    public final void mLinkedProperty() throws RecognitionException {
        try {
            int _type = LinkedProperty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:14:16: ( 'LinkedProperty' )
            // InternalMyXeniaLexer.g:14:18: 'LinkedProperty'
            {
            match("LinkedProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LinkedProperty"

    // $ANTLR start "SiteWithModal"
    public final void mSiteWithModal() throws RecognitionException {
        try {
            int _type = SiteWithModal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:16:15: ( 'SiteWithModal' )
            // InternalMyXeniaLexer.g:16:17: 'SiteWithModal'
            {
            match("SiteWithModal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SiteWithModal"

    // $ANTLR start "InfoProperty"
    public final void mInfoProperty() throws RecognitionException {
        try {
            int _type = InfoProperty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:18:14: ( 'InfoProperty' )
            // InternalMyXeniaLexer.g:18:16: 'InfoProperty'
            {
            match("InfoProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InfoProperty"

    // $ANTLR start "MappedEntity"
    public final void mMappedEntity() throws RecognitionException {
        try {
            int _type = MappedEntity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:20:14: ( 'MappedEntity' )
            // InternalMyXeniaLexer.g:20:16: 'MappedEntity'
            {
            match("MappedEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MappedEntity"

    // $ANTLR start "RedirectPage"
    public final void mRedirectPage() throws RecognitionException {
        try {
            int _type = RedirectPage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:22:14: ( 'RedirectPage' )
            // InternalMyXeniaLexer.g:22:16: 'RedirectPage'
            {
            match("RedirectPage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RedirectPage"

    // $ANTLR start "Synchronized"
    public final void mSynchronized() throws RecognitionException {
        try {
            int _type = Synchronized;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:24:14: ( 'synchronized' )
            // InternalMyXeniaLexer.g:24:16: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Synchronized"

    // $ANTLR start "InfoEntity"
    public final void mInfoEntity() throws RecognitionException {
        try {
            int _type = InfoEntity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:26:12: ( 'InfoEntity' )
            // InternalMyXeniaLexer.g:26:14: 'InfoEntity'
            {
            match("InfoEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InfoEntity"

    // $ANTLR start "Instanceof"
    public final void mInstanceof() throws RecognitionException {
        try {
            int _type = Instanceof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:28:12: ( 'instanceof' )
            // InternalMyXeniaLexer.g:28:14: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Instanceof"

    // $ANTLR start "SuperSite"
    public final void mSuperSite() throws RecognitionException {
        try {
            int _type = SuperSite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:30:11: ( 'SuperSite' )
            // InternalMyXeniaLexer.g:30:13: 'SuperSite'
            {
            match("SuperSite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SuperSite"

    // $ANTLR start "Extension"
    public final void mExtension() throws RecognitionException {
        try {
            int _type = Extension;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:32:11: ( 'extension' )
            // InternalMyXeniaLexer.g:32:13: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extension"

    // $ANTLR start "InfoValue"
    public final void mInfoValue() throws RecognitionException {
        try {
            int _type = InfoValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:34:11: ( 'infoValue' )
            // InternalMyXeniaLexer.g:34:13: 'infoValue'
            {
            match("infoValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InfoValue"

    // $ANTLR start "AppName"
    public final void mAppName() throws RecognitionException {
        try {
            int _type = AppName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:36:9: ( 'appName' )
            // InternalMyXeniaLexer.g:36:11: 'appName'
            {
            match("appName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AppName"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:38:9: ( 'default' )
            // InternalMyXeniaLexer.g:38:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:40:9: ( 'extends' )
            // InternalMyXeniaLexer.g:40:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Finally"
    public final void mFinally() throws RecognitionException {
        try {
            int _type = Finally;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:42:9: ( 'finally' )
            // InternalMyXeniaLexer.g:42:11: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Finally"

    // $ANTLR start "Entity"
    public final void mEntity() throws RecognitionException {
        try {
            int _type = Entity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:44:8: ( 'Entity' )
            // InternalMyXeniaLexer.g:44:10: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entity"

    // $ANTLR start "Header"
    public final void mHeader() throws RecognitionException {
        try {
            int _type = Header;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:46:8: ( 'Header' )
            // InternalMyXeniaLexer.g:46:10: 'Header'
            {
            match("Header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Header"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:48:8: ( 'import' )
            // InternalMyXeniaLexer.g:48:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:50:8: ( 'return' )
            // InternalMyXeniaLexer.g:50:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Static"
    public final void mStatic() throws RecognitionException {
        try {
            int _type = Static;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:52:8: ( 'static' )
            // InternalMyXeniaLexer.g:52:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Static"

    // $ANTLR start "Switch"
    public final void mSwitch() throws RecognitionException {
        try {
            int _type = Switch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:54:8: ( 'switch' )
            // InternalMyXeniaLexer.g:54:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Switch"

    // $ANTLR start "Typeof"
    public final void mTypeof() throws RecognitionException {
        try {
            int _type = Typeof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:56:8: ( 'typeof' )
            // InternalMyXeniaLexer.g:56:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Typeof"

    // $ANTLR start "Model"
    public final void mModel() throws RecognitionException {
        try {
            int _type = Model;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:58:7: ( 'Model' )
            // InternalMyXeniaLexer.g:58:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Model"

    // $ANTLR start "Catch"
    public final void mCatch() throws RecognitionException {
        try {
            int _type = Catch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:60:7: ( 'catch' )
            // InternalMyXeniaLexer.g:60:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Catch"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:62:7: ( 'false' )
            // InternalMyXeniaLexer.g:62:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Super"
    public final void mSuper() throws RecognitionException {
        try {
            int _type = Super;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:64:7: ( 'super' )
            // InternalMyXeniaLexer.g:64:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Super"

    // $ANTLR start "Throw"
    public final void mThrow() throws RecognitionException {
        try {
            int _type = Throw;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:66:7: ( 'throw' )
            // InternalMyXeniaLexer.g:66:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Throw"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:68:7: ( 'while' )
            // InternalMyXeniaLexer.g:68:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "FREQ"
    public final void mFREQ() throws RecognitionException {
        try {
            int _type = FREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:70:6: ( 'FREQ' )
            // InternalMyXeniaLexer.g:70:8: 'FREQ'
            {
            match("FREQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FREQ"

    // $ANTLR start "PRIO"
    public final void mPRIO() throws RecognitionException {
        try {
            int _type = PRIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:72:6: ( 'PRIO' )
            // InternalMyXeniaLexer.g:72:8: 'PRIO'
            {
            match("PRIO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIO"

    // $ANTLR start "PROD"
    public final void mPROD() throws RecognitionException {
        try {
            int _type = PROD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:74:6: ( 'PROD' )
            // InternalMyXeniaLexer.g:74:8: 'PROD'
            {
            match("PROD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROD"

    // $ANTLR start "Site"
    public final void mSite() throws RecognitionException {
        try {
            int _type = Site;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:76:6: ( 'Site' )
            // InternalMyXeniaLexer.g:76:8: 'Site'
            {
            match("Site"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Site"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:78:6: ( 'case' )
            // InternalMyXeniaLexer.g:78:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:80:6: ( 'else' )
            // InternalMyXeniaLexer.g:80:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Mode"
    public final void mMode() throws RecognitionException {
        try {
            int _type = Mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:82:6: ( 'mode' )
            // InternalMyXeniaLexer.g:82:8: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mode"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:84:6: ( 'name' )
            // InternalMyXeniaLexer.g:84:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:86:6: ( 'null' )
            // InternalMyXeniaLexer.g:86:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Page"
    public final void mPage() throws RecognitionException {
        try {
            int _type = Page;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:88:6: ( 'page' )
            // InternalMyXeniaLexer.g:88:8: 'page'
            {
            match("page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Page"

    // $ANTLR start "Path"
    public final void mPath() throws RecognitionException {
        try {
            int _type = Path;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:90:6: ( 'path' )
            // InternalMyXeniaLexer.g:90:8: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Path"

    // $ANTLR start "Site_1"
    public final void mSite_1() throws RecognitionException {
        try {
            int _type = Site_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:92:8: ( 'site' )
            // InternalMyXeniaLexer.g:92:10: 'site'
            {
            match("site"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Site_1"

    // $ANTLR start "Tech"
    public final void mTech() throws RecognitionException {
        try {
            int _type = Tech;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:94:6: ( 'tech' )
            // InternalMyXeniaLexer.g:94:8: 'tech'
            {
            match("tech"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tech"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:96:6: ( 'true' )
            // InternalMyXeniaLexer.g:96:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "ExclamationMarkEqualsSignEqualsSign"
    public final void mExclamationMarkEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:98:37: ( '!==' )
            // InternalMyXeniaLexer.g:98:39: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSignEqualsSign"

    // $ANTLR start "FullStopFullStopLessThanSign"
    public final void mFullStopFullStopLessThanSign() throws RecognitionException {
        try {
            int _type = FullStopFullStopLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:100:30: ( '..<' )
            // InternalMyXeniaLexer.g:100:32: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStopLessThanSign"

    // $ANTLR start "EqualsSignEqualsSignEqualsSign"
    public final void mEqualsSignEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:102:32: ( '===' )
            // InternalMyXeniaLexer.g:102:34: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSignEqualsSign"

    // $ANTLR start "DEV"
    public final void mDEV() throws RecognitionException {
        try {
            int _type = DEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:104:5: ( 'DEV' )
            // InternalMyXeniaLexer.g:104:7: 'DEV'
            {
            match("DEV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:106:5: ( 'MOD' )
            // InternalMyXeniaLexer.g:106:7: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:108:5: ( 'for' )
            // InternalMyXeniaLexer.g:108:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:110:5: ( 'new' )
            // InternalMyXeniaLexer.g:110:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Try"
    public final void mTry() throws RecognitionException {
        try {
            int _type = Try;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:112:5: ( 'try' )
            // InternalMyXeniaLexer.g:112:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Try"

    // $ANTLR start "Val"
    public final void mVal() throws RecognitionException {
        try {
            int _type = Val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:114:5: ( 'val' )
            // InternalMyXeniaLexer.g:114:7: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Val"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:116:5: ( 'var' )
            // InternalMyXeniaLexer.g:116:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:118:27: ( '!=' )
            // InternalMyXeniaLexer.g:118:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "PercentSignEqualsSign"
    public final void mPercentSignEqualsSign() throws RecognitionException {
        try {
            int _type = PercentSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:120:23: ( '%=' )
            // InternalMyXeniaLexer.g:120:25: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSignEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:122:20: ( '&&' )
            // InternalMyXeniaLexer.g:122:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:124:18: ( '**' )
            // InternalMyXeniaLexer.g:124:20: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "AsteriskEqualsSign"
    public final void mAsteriskEqualsSign() throws RecognitionException {
        try {
            int _type = AsteriskEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:126:20: ( '*=' )
            // InternalMyXeniaLexer.g:126:22: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskEqualsSign"

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:128:18: ( '++' )
            // InternalMyXeniaLexer.g:128:20: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "PlusSignEqualsSign"
    public final void mPlusSignEqualsSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:130:20: ( '+=' )
            // InternalMyXeniaLexer.g:130:22: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:132:24: ( '--' )
            // InternalMyXeniaLexer.g:132:26: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "HyphenMinusEqualsSign"
    public final void mHyphenMinusEqualsSign() throws RecognitionException {
        try {
            int _type = HyphenMinusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:134:23: ( '-=' )
            // InternalMyXeniaLexer.g:134:25: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusEqualsSign"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:136:28: ( '->' )
            // InternalMyXeniaLexer.g:136:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:138:18: ( '..' )
            // InternalMyXeniaLexer.g:138:20: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "SolidusEqualsSign"
    public final void mSolidusEqualsSign() throws RecognitionException {
        try {
            int _type = SolidusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:140:19: ( '/=' )
            // InternalMyXeniaLexer.g:140:21: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SolidusEqualsSign"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:142:12: ( '::' )
            // InternalMyXeniaLexer.g:142:14: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:144:29: ( '<>' )
            // InternalMyXeniaLexer.g:144:31: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:146:22: ( '==' )
            // InternalMyXeniaLexer.g:146:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:148:27: ( '=>' )
            // InternalMyXeniaLexer.g:148:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:150:27: ( '>=' )
            // InternalMyXeniaLexer.g:150:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "QuestionMarkFullStop"
    public final void mQuestionMarkFullStop() throws RecognitionException {
        try {
            int _type = QuestionMarkFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:152:22: ( '?.' )
            // InternalMyXeniaLexer.g:152:24: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkFullStop"

    // $ANTLR start "QuestionMarkColon"
    public final void mQuestionMarkColon() throws RecognitionException {
        try {
            int _type = QuestionMarkColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:154:19: ( '?:' )
            // InternalMyXeniaLexer.g:154:21: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkColon"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:156:4: ( 'as' )
            // InternalMyXeniaLexer.g:156:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:158:4: ( 'do' )
            // InternalMyXeniaLexer.g:158:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:160:4: ( 'if' )
            // InternalMyXeniaLexer.g:160:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:162:26: ( '||' )
            // InternalMyXeniaLexer.g:162:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:164:17: ( '!' )
            // InternalMyXeniaLexer.g:164:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:166:12: ( '#' )
            // InternalMyXeniaLexer.g:166:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:168:13: ( '%' )
            // InternalMyXeniaLexer.g:168:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:170:11: ( '&' )
            // InternalMyXeniaLexer.g:170:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:172:17: ( '(' )
            // InternalMyXeniaLexer.g:172:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:174:18: ( ')' )
            // InternalMyXeniaLexer.g:174:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:176:10: ( '*' )
            // InternalMyXeniaLexer.g:176:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:178:10: ( '+' )
            // InternalMyXeniaLexer.g:178:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:180:7: ( ',' )
            // InternalMyXeniaLexer.g:180:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:182:13: ( '-' )
            // InternalMyXeniaLexer.g:182:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:184:10: ( '.' )
            // InternalMyXeniaLexer.g:184:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:186:9: ( '/' )
            // InternalMyXeniaLexer.g:186:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:188:7: ( ':' )
            // InternalMyXeniaLexer.g:188:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:190:11: ( ';' )
            // InternalMyXeniaLexer.g:190:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:192:14: ( '<' )
            // InternalMyXeniaLexer.g:192:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:194:12: ( '=' )
            // InternalMyXeniaLexer.g:194:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:196:17: ( '>' )
            // InternalMyXeniaLexer.g:196:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:198:14: ( '?' )
            // InternalMyXeniaLexer.g:198:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:200:19: ( '[' )
            // InternalMyXeniaLexer.g:200:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:202:20: ( ']' )
            // InternalMyXeniaLexer.g:202:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:204:18: ( '{' )
            // InternalMyXeniaLexer.g:204:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:206:14: ( '|' )
            // InternalMyXeniaLexer.g:206:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:208:19: ( '}' )
            // InternalMyXeniaLexer.g:208:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalMyXeniaLexer.g:210:21: ()
            // InternalMyXeniaLexer.g:210:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalMyXeniaLexer.g:212:19: ()
            // InternalMyXeniaLexer.g:212:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:214:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalMyXeniaLexer.g:214:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalMyXeniaLexer.g:214:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyXeniaLexer.g:214:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMyXeniaLexer.g:214:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalMyXeniaLexer.g:214:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // InternalMyXeniaLexer.g:214:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyXeniaLexer.g:214:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalMyXeniaLexer.g:214:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMyXeniaLexer.g:214:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // InternalMyXeniaLexer.g:214:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:216:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalMyXeniaLexer.g:216:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalMyXeniaLexer.g:216:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:218:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalMyXeniaLexer.g:218:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalMyXeniaLexer.g:218:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyXeniaLexer.g:218:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyXeniaLexer.g:218:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyXeniaLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalMyXeniaLexer.g:218:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyXeniaLexer.g:218:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalMyXeniaLexer.g:218:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:220:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalMyXeniaLexer.g:220:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalMyXeniaLexer.g:220:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyXeniaLexer.g:220:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyXeniaLexer.g:220:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:222:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalMyXeniaLexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalMyXeniaLexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyXeniaLexer.g:222:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalMyXeniaLexer.g:222:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyXeniaLexer.g:222:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyXeniaLexer.g:222:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalMyXeniaLexer.g:222:44: ( '\"' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\"') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyXeniaLexer.g:222:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyXeniaLexer.g:222:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalMyXeniaLexer.g:222:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyXeniaLexer.g:222:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyXeniaLexer.g:222:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalMyXeniaLexer.g:222:79: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyXeniaLexer.g:222:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:224:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyXeniaLexer.g:224:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyXeniaLexer.g:224:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:224:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:226:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyXeniaLexer.g:226:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyXeniaLexer.g:226:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:226:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyXeniaLexer.g:226:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyXeniaLexer.g:226:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyXeniaLexer.g:226:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyXeniaLexer.g:226:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:228:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyXeniaLexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyXeniaLexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyXeniaLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyXeniaLexer.g:230:16: ( . )
            // InternalMyXeniaLexer.g:230:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyXeniaLexer.g:1:8: ( LinkedProperty | SiteWithModal | InfoProperty | MappedEntity | RedirectPage | Synchronized | InfoEntity | Instanceof | SuperSite | Extension | InfoValue | AppName | Default | Extends | Finally | Entity | Header | Import | Return | Static | Switch | Typeof | Model | Catch | False | Super | Throw | While | FREQ | PRIO | PROD | Site | Case | Else | Mode | Name | Null | Page | Path | Site_1 | Tech | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | DEV | MOD | For | New | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=107;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMyXeniaLexer.g:1:10: LinkedProperty
                {
                mLinkedProperty(); 

                }
                break;
            case 2 :
                // InternalMyXeniaLexer.g:1:25: SiteWithModal
                {
                mSiteWithModal(); 

                }
                break;
            case 3 :
                // InternalMyXeniaLexer.g:1:39: InfoProperty
                {
                mInfoProperty(); 

                }
                break;
            case 4 :
                // InternalMyXeniaLexer.g:1:52: MappedEntity
                {
                mMappedEntity(); 

                }
                break;
            case 5 :
                // InternalMyXeniaLexer.g:1:65: RedirectPage
                {
                mRedirectPage(); 

                }
                break;
            case 6 :
                // InternalMyXeniaLexer.g:1:78: Synchronized
                {
                mSynchronized(); 

                }
                break;
            case 7 :
                // InternalMyXeniaLexer.g:1:91: InfoEntity
                {
                mInfoEntity(); 

                }
                break;
            case 8 :
                // InternalMyXeniaLexer.g:1:102: Instanceof
                {
                mInstanceof(); 

                }
                break;
            case 9 :
                // InternalMyXeniaLexer.g:1:113: SuperSite
                {
                mSuperSite(); 

                }
                break;
            case 10 :
                // InternalMyXeniaLexer.g:1:123: Extension
                {
                mExtension(); 

                }
                break;
            case 11 :
                // InternalMyXeniaLexer.g:1:133: InfoValue
                {
                mInfoValue(); 

                }
                break;
            case 12 :
                // InternalMyXeniaLexer.g:1:143: AppName
                {
                mAppName(); 

                }
                break;
            case 13 :
                // InternalMyXeniaLexer.g:1:151: Default
                {
                mDefault(); 

                }
                break;
            case 14 :
                // InternalMyXeniaLexer.g:1:159: Extends
                {
                mExtends(); 

                }
                break;
            case 15 :
                // InternalMyXeniaLexer.g:1:167: Finally
                {
                mFinally(); 

                }
                break;
            case 16 :
                // InternalMyXeniaLexer.g:1:175: Entity
                {
                mEntity(); 

                }
                break;
            case 17 :
                // InternalMyXeniaLexer.g:1:182: Header
                {
                mHeader(); 

                }
                break;
            case 18 :
                // InternalMyXeniaLexer.g:1:189: Import
                {
                mImport(); 

                }
                break;
            case 19 :
                // InternalMyXeniaLexer.g:1:196: Return
                {
                mReturn(); 

                }
                break;
            case 20 :
                // InternalMyXeniaLexer.g:1:203: Static
                {
                mStatic(); 

                }
                break;
            case 21 :
                // InternalMyXeniaLexer.g:1:210: Switch
                {
                mSwitch(); 

                }
                break;
            case 22 :
                // InternalMyXeniaLexer.g:1:217: Typeof
                {
                mTypeof(); 

                }
                break;
            case 23 :
                // InternalMyXeniaLexer.g:1:224: Model
                {
                mModel(); 

                }
                break;
            case 24 :
                // InternalMyXeniaLexer.g:1:230: Catch
                {
                mCatch(); 

                }
                break;
            case 25 :
                // InternalMyXeniaLexer.g:1:236: False
                {
                mFalse(); 

                }
                break;
            case 26 :
                // InternalMyXeniaLexer.g:1:242: Super
                {
                mSuper(); 

                }
                break;
            case 27 :
                // InternalMyXeniaLexer.g:1:248: Throw
                {
                mThrow(); 

                }
                break;
            case 28 :
                // InternalMyXeniaLexer.g:1:254: While
                {
                mWhile(); 

                }
                break;
            case 29 :
                // InternalMyXeniaLexer.g:1:260: FREQ
                {
                mFREQ(); 

                }
                break;
            case 30 :
                // InternalMyXeniaLexer.g:1:265: PRIO
                {
                mPRIO(); 

                }
                break;
            case 31 :
                // InternalMyXeniaLexer.g:1:270: PROD
                {
                mPROD(); 

                }
                break;
            case 32 :
                // InternalMyXeniaLexer.g:1:275: Site
                {
                mSite(); 

                }
                break;
            case 33 :
                // InternalMyXeniaLexer.g:1:280: Case
                {
                mCase(); 

                }
                break;
            case 34 :
                // InternalMyXeniaLexer.g:1:285: Else
                {
                mElse(); 

                }
                break;
            case 35 :
                // InternalMyXeniaLexer.g:1:290: Mode
                {
                mMode(); 

                }
                break;
            case 36 :
                // InternalMyXeniaLexer.g:1:295: Name
                {
                mName(); 

                }
                break;
            case 37 :
                // InternalMyXeniaLexer.g:1:300: Null
                {
                mNull(); 

                }
                break;
            case 38 :
                // InternalMyXeniaLexer.g:1:305: Page
                {
                mPage(); 

                }
                break;
            case 39 :
                // InternalMyXeniaLexer.g:1:310: Path
                {
                mPath(); 

                }
                break;
            case 40 :
                // InternalMyXeniaLexer.g:1:315: Site_1
                {
                mSite_1(); 

                }
                break;
            case 41 :
                // InternalMyXeniaLexer.g:1:322: Tech
                {
                mTech(); 

                }
                break;
            case 42 :
                // InternalMyXeniaLexer.g:1:327: True
                {
                mTrue(); 

                }
                break;
            case 43 :
                // InternalMyXeniaLexer.g:1:332: ExclamationMarkEqualsSignEqualsSign
                {
                mExclamationMarkEqualsSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalMyXeniaLexer.g:1:368: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 45 :
                // InternalMyXeniaLexer.g:1:397: EqualsSignEqualsSignEqualsSign
                {
                mEqualsSignEqualsSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalMyXeniaLexer.g:1:428: DEV
                {
                mDEV(); 

                }
                break;
            case 47 :
                // InternalMyXeniaLexer.g:1:432: MOD
                {
                mMOD(); 

                }
                break;
            case 48 :
                // InternalMyXeniaLexer.g:1:436: For
                {
                mFor(); 

                }
                break;
            case 49 :
                // InternalMyXeniaLexer.g:1:440: New
                {
                mNew(); 

                }
                break;
            case 50 :
                // InternalMyXeniaLexer.g:1:444: Try
                {
                mTry(); 

                }
                break;
            case 51 :
                // InternalMyXeniaLexer.g:1:448: Val
                {
                mVal(); 

                }
                break;
            case 52 :
                // InternalMyXeniaLexer.g:1:452: Var
                {
                mVar(); 

                }
                break;
            case 53 :
                // InternalMyXeniaLexer.g:1:456: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 54 :
                // InternalMyXeniaLexer.g:1:482: PercentSignEqualsSign
                {
                mPercentSignEqualsSign(); 

                }
                break;
            case 55 :
                // InternalMyXeniaLexer.g:1:504: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 56 :
                // InternalMyXeniaLexer.g:1:523: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 57 :
                // InternalMyXeniaLexer.g:1:540: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 58 :
                // InternalMyXeniaLexer.g:1:559: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 59 :
                // InternalMyXeniaLexer.g:1:576: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 60 :
                // InternalMyXeniaLexer.g:1:595: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 61 :
                // InternalMyXeniaLexer.g:1:618: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 62 :
                // InternalMyXeniaLexer.g:1:640: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 63 :
                // InternalMyXeniaLexer.g:1:667: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 64 :
                // InternalMyXeniaLexer.g:1:684: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 65 :
                // InternalMyXeniaLexer.g:1:702: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 66 :
                // InternalMyXeniaLexer.g:1:713: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 67 :
                // InternalMyXeniaLexer.g:1:741: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 68 :
                // InternalMyXeniaLexer.g:1:762: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 69 :
                // InternalMyXeniaLexer.g:1:788: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 70 :
                // InternalMyXeniaLexer.g:1:814: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 71 :
                // InternalMyXeniaLexer.g:1:835: QuestionMarkColon
                {
                mQuestionMarkColon(); 

                }
                break;
            case 72 :
                // InternalMyXeniaLexer.g:1:853: As
                {
                mAs(); 

                }
                break;
            case 73 :
                // InternalMyXeniaLexer.g:1:856: Do
                {
                mDo(); 

                }
                break;
            case 74 :
                // InternalMyXeniaLexer.g:1:859: If
                {
                mIf(); 

                }
                break;
            case 75 :
                // InternalMyXeniaLexer.g:1:862: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 76 :
                // InternalMyXeniaLexer.g:1:887: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 77 :
                // InternalMyXeniaLexer.g:1:903: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 78 :
                // InternalMyXeniaLexer.g:1:914: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 79 :
                // InternalMyXeniaLexer.g:1:926: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 80 :
                // InternalMyXeniaLexer.g:1:936: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 81 :
                // InternalMyXeniaLexer.g:1:952: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 82 :
                // InternalMyXeniaLexer.g:1:969: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 83 :
                // InternalMyXeniaLexer.g:1:978: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 84 :
                // InternalMyXeniaLexer.g:1:987: Comma
                {
                mComma(); 

                }
                break;
            case 85 :
                // InternalMyXeniaLexer.g:1:993: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 86 :
                // InternalMyXeniaLexer.g:1:1005: FullStop
                {
                mFullStop(); 

                }
                break;
            case 87 :
                // InternalMyXeniaLexer.g:1:1014: Solidus
                {
                mSolidus(); 

                }
                break;
            case 88 :
                // InternalMyXeniaLexer.g:1:1022: Colon
                {
                mColon(); 

                }
                break;
            case 89 :
                // InternalMyXeniaLexer.g:1:1028: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 90 :
                // InternalMyXeniaLexer.g:1:1038: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 91 :
                // InternalMyXeniaLexer.g:1:1051: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 92 :
                // InternalMyXeniaLexer.g:1:1062: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 93 :
                // InternalMyXeniaLexer.g:1:1078: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 94 :
                // InternalMyXeniaLexer.g:1:1091: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 95 :
                // InternalMyXeniaLexer.g:1:1109: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 96 :
                // InternalMyXeniaLexer.g:1:1128: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 97 :
                // InternalMyXeniaLexer.g:1:1145: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 98 :
                // InternalMyXeniaLexer.g:1:1158: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 99 :
                // InternalMyXeniaLexer.g:1:1176: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 100 :
                // InternalMyXeniaLexer.g:1:1185: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 101 :
                // InternalMyXeniaLexer.g:1:1194: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 102 :
                // InternalMyXeniaLexer.g:1:1207: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 103 :
                // InternalMyXeniaLexer.g:1:1215: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 104 :
                // InternalMyXeniaLexer.g:1:1227: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 105 :
                // InternalMyXeniaLexer.g:1:1243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 106 :
                // InternalMyXeniaLexer.g:1:1259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 107 :
                // InternalMyXeniaLexer.g:1:1267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\26\71\1\143\1\145\1\150\2\71\1\154\1\156\1\161\1\164\1\170\1\174\1\176\1\u0080\1\u0082\1\u0085\1\u0087\11\uffff\2\u0093\1\67\5\uffff\1\71\1\uffff\16\71\1\u00a7\3\71\1\u00ab\1\71\1\u00ad\23\71\1\u00c6\1\uffff\1\u00c8\1\uffff\1\u00ca\2\uffff\2\71\47\uffff\1\u0093\4\uffff\6\71\1\u00d4\11\71\1\uffff\3\71\1\uffff\1\71\1\uffff\2\71\1\u00e4\7\71\1\u00ec\11\71\1\u00f6\2\71\6\uffff\1\u00f9\1\u00fa\1\u00fb\1\71\1\u00fe\4\71\1\uffff\5\71\1\u0109\4\71\1\u010e\4\71\1\uffff\5\71\1\u0118\1\u0119\1\uffff\1\71\1\u011b\1\71\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\uffff\1\u0123\1\u0124\3\uffff\2\71\1\uffff\4\71\1\u012b\4\71\1\u0130\1\uffff\4\71\1\uffff\3\71\1\u0139\4\71\1\u013e\2\uffff\1\u013f\1\uffff\1\u0140\10\uffff\6\71\1\uffff\2\71\1\u0149\1\u014a\1\uffff\2\71\1\u014d\5\71\1\uffff\1\u0153\1\u0154\1\u0155\1\u0156\3\uffff\10\71\2\uffff\2\71\1\uffff\1\71\1\u0162\1\u0163\1\u0164\1\u0165\4\uffff\13\71\4\uffff\2\71\1\u0173\6\71\1\u017a\1\u017b\2\71\1\uffff\1\71\1\u017f\3\71\1\u0183\2\uffff\3\71\1\uffff\3\71\1\uffff\2\71\1\u018c\1\u018d\1\u018e\1\u018f\1\71\1\u0191\4\uffff\1\u0192\2\uffff";
    static final String DFA21_eofS =
        "\u0193\uffff";
    static final String DFA21_minS =
        "\1\0\2\151\1\156\1\117\1\145\1\151\1\146\1\154\1\160\1\145\1\141\1\156\3\145\1\141\1\150\2\122\1\157\2\141\1\75\1\56\1\75\1\105\1\141\1\75\1\46\1\52\1\53\1\55\1\52\1\72\1\76\1\75\1\56\1\174\11\uffff\2\60\1\44\5\uffff\1\156\1\uffff\1\164\1\160\1\146\1\160\1\144\1\104\1\144\1\156\1\141\1\151\1\160\1\164\1\146\1\160\1\44\1\164\1\163\1\160\1\44\1\146\1\44\1\156\1\154\1\162\1\164\1\141\1\164\1\160\1\162\1\143\1\165\1\163\1\151\1\105\1\111\1\144\1\155\1\154\1\167\1\147\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\126\1\154\47\uffff\1\60\4\uffff\1\153\2\145\1\157\1\160\1\145\1\44\1\151\1\143\2\164\2\145\1\164\2\157\1\uffff\2\145\1\116\1\uffff\1\141\1\uffff\1\141\1\163\1\44\1\151\1\144\1\165\1\145\1\157\1\150\1\145\1\44\1\143\1\145\1\154\1\121\1\117\1\104\2\145\1\154\1\44\1\145\1\150\6\uffff\3\44\1\145\1\44\1\162\1\105\1\145\1\154\1\uffff\1\162\1\150\1\151\1\143\1\162\1\44\1\141\1\126\1\162\1\156\1\44\1\141\1\165\1\154\1\145\1\uffff\1\164\1\145\1\162\1\157\1\167\2\44\1\uffff\1\150\1\44\1\145\6\44\1\uffff\2\44\3\uffff\1\144\1\151\1\uffff\1\123\1\162\1\156\1\144\1\44\1\145\1\162\1\143\1\150\1\44\1\uffff\1\156\1\141\1\164\1\144\1\uffff\1\155\2\154\1\44\1\171\1\162\1\156\1\146\1\44\2\uffff\1\44\1\uffff\1\44\10\uffff\1\120\1\164\1\151\1\157\1\164\1\105\1\uffff\1\143\1\157\2\44\1\uffff\1\143\1\154\1\44\1\151\1\163\1\145\1\164\1\171\1\uffff\4\44\3\uffff\1\162\1\150\1\164\1\160\1\151\1\156\1\164\1\156\2\uffff\1\145\1\165\1\uffff\1\157\4\44\4\uffff\1\157\1\115\2\145\2\164\1\120\1\151\1\157\1\145\1\156\4\uffff\1\160\1\157\1\44\1\162\1\171\1\151\1\141\1\172\1\146\2\44\1\145\1\144\1\uffff\1\164\1\44\1\164\1\147\1\145\1\44\2\uffff\1\162\1\141\1\171\1\uffff\1\171\1\145\1\144\1\uffff\1\164\1\154\4\44\1\171\1\44\4\uffff\1\44\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\151\1\165\1\156\1\157\1\145\1\171\1\156\1\170\1\163\2\157\1\156\2\145\1\171\1\141\1\150\2\122\1\157\1\165\1\141\1\75\1\56\1\76\1\105\1\141\1\75\1\46\2\75\1\76\1\75\1\72\1\76\1\75\1\72\1\174\11\uffff\1\170\1\154\1\172\5\uffff\1\156\1\uffff\1\164\1\160\1\146\1\160\1\144\1\104\1\144\1\156\1\141\1\151\1\160\1\164\1\163\1\160\1\172\1\164\1\163\1\160\1\172\1\146\1\172\1\156\1\154\1\162\1\164\1\141\1\164\1\160\1\162\1\143\1\171\1\164\1\151\1\105\1\117\1\144\1\155\1\154\1\167\1\164\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\126\1\162\47\uffff\1\154\4\uffff\1\153\2\145\1\157\1\160\1\145\1\172\1\151\1\143\2\164\2\145\1\164\2\157\1\uffff\2\145\1\116\1\uffff\1\141\1\uffff\1\141\1\163\1\172\1\151\1\144\1\165\1\145\1\157\1\150\1\145\1\172\1\143\1\145\1\154\1\121\1\117\1\104\2\145\1\154\1\172\1\145\1\150\6\uffff\3\172\1\145\1\172\1\162\1\120\1\145\1\154\1\uffff\1\162\1\150\1\151\1\143\1\162\1\172\1\141\1\126\1\162\1\156\1\172\1\141\1\165\1\154\1\145\1\uffff\1\164\1\145\1\162\1\157\1\167\2\172\1\uffff\1\150\1\172\1\145\6\172\1\uffff\2\172\3\uffff\1\144\1\151\1\uffff\1\123\1\162\1\156\1\144\1\172\1\145\1\162\1\143\1\150\1\172\1\uffff\1\156\1\141\1\164\1\163\1\uffff\1\155\2\154\1\172\1\171\1\162\1\156\1\146\1\172\2\uffff\1\172\1\uffff\1\172\10\uffff\1\120\1\164\1\151\1\157\1\164\1\105\1\uffff\1\143\1\157\2\172\1\uffff\1\143\1\154\1\172\1\151\1\163\1\145\1\164\1\171\1\uffff\4\172\3\uffff\1\162\1\150\1\164\1\160\1\151\1\156\1\164\1\156\2\uffff\1\145\1\165\1\uffff\1\157\4\172\4\uffff\1\157\1\115\2\145\2\164\1\120\1\151\1\157\1\145\1\156\4\uffff\1\160\1\157\1\172\1\162\1\171\1\151\1\141\1\172\1\146\2\172\1\145\1\144\1\uffff\1\164\1\172\1\164\1\147\1\145\1\172\2\uffff\1\162\1\141\1\171\1\uffff\1\171\1\145\1\144\1\uffff\1\164\1\154\4\172\1\171\1\172\4\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\47\uffff\1\115\1\120\1\121\1\124\1\131\1\136\1\137\1\140\1\142\3\uffff\1\146\2\147\1\152\1\153\1\uffff\1\146\51\uffff\1\114\1\uffff\1\126\1\uffff\1\104\1\133\2\uffff\1\66\1\116\1\67\1\117\1\70\1\71\1\122\1\72\1\73\1\123\1\74\1\75\1\76\1\125\1\100\1\150\1\151\1\127\1\101\1\130\1\102\1\132\1\105\1\134\1\106\1\107\1\135\1\113\1\141\1\115\1\120\1\121\1\124\1\131\1\136\1\137\1\140\1\142\1\143\1\uffff\1\144\1\145\1\147\1\152\20\uffff\1\112\3\uffff\1\110\1\uffff\1\111\27\uffff\1\53\1\65\1\54\1\77\1\55\1\103\11\uffff\1\57\17\uffff\1\60\7\uffff\1\62\11\uffff\1\61\2\uffff\1\56\1\63\1\64\2\uffff\1\40\12\uffff\1\50\4\uffff\1\42\11\uffff\1\51\1\52\1\uffff\1\41\1\uffff\1\35\1\36\1\37\1\43\1\44\1\45\1\46\1\47\6\uffff\1\27\4\uffff\1\32\10\uffff\1\31\4\uffff\1\33\1\30\1\34\10\uffff\1\24\1\25\2\uffff\1\22\5\uffff\1\20\1\21\1\23\1\26\13\uffff\1\16\1\14\1\15\1\17\15\uffff\1\11\6\uffff\1\13\1\12\3\uffff\1\7\3\uffff\1\10\10\uffff\1\3\1\4\1\5\1\6\1\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\1\0\u0192\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\27\1\64\1\47\1\63\1\34\1\35\1\65\1\50\1\51\1\36\1\37\1\52\1\40\1\30\1\41\1\60\11\61\1\42\1\53\1\43\1\31\1\44\1\45\1\67\3\63\1\32\1\14\1\22\1\63\1\15\1\3\2\63\1\1\1\4\2\63\1\23\1\63\1\5\1\2\7\63\1\54\1\67\1\55\1\62\1\63\1\67\1\11\1\63\1\20\1\12\1\10\1\13\2\63\1\7\3\63\1\24\1\25\1\63\1\26\1\63\1\16\1\6\1\17\1\63\1\33\1\21\3\63\1\56\1\46\1\57\uff82\67",
            "\1\70",
            "\1\72\13\uffff\1\73",
            "\1\74",
            "\1\77\21\uffff\1\75\15\uffff\1\76",
            "\1\100",
            "\1\105\12\uffff\1\102\1\104\1\uffff\1\103\1\uffff\1\101",
            "\1\110\6\uffff\1\107\1\106",
            "\1\112\13\uffff\1\111",
            "\1\113\2\uffff\1\114",
            "\1\115\11\uffff\1\116",
            "\1\120\7\uffff\1\117\5\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\127\2\uffff\1\126\11\uffff\1\130\6\uffff\1\125",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136\3\uffff\1\140\17\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\144",
            "\1\146\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\155",
            "\1\157\22\uffff\1\160",
            "\1\162\21\uffff\1\163",
            "\1\165\17\uffff\1\166\1\167",
            "\1\172\4\uffff\1\173\15\uffff\1\171",
            "\1\175",
            "\1\177",
            "\1\u0081",
            "\1\u0083\13\uffff\1\u0084",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0092\10\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094\13\uffff\1\u0091\6\uffff\1\u0092\2\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094\13\uffff\1\u0091",
            "\12\u0092\10\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094\22\uffff\1\u0092\2\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094",
            "\1\71\34\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a5\14\uffff\1\u00a4",
            "\1\u00a6",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ac",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\3\uffff\1\u00b8",
            "\1\u00ba\1\u00b9",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\5\uffff\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\14\uffff\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c7",
            "",
            "\1\u00c9",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc\5\uffff\1\u00cd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0092\10\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094\22\uffff\1\u0092\2\uffff\1\u0094\1\uffff\3\u0094\5\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00fc",
            "\1\71\13\uffff\12\71\7\uffff\26\71\1\u00fd\3\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ff",
            "\1\u0101\12\uffff\1\u0100",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u011a",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011c",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0135\16\uffff\1\u0134",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "",
            "",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0190",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "\1\71\13\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LinkedProperty | SiteWithModal | InfoProperty | MappedEntity | RedirectPage | Synchronized | InfoEntity | Instanceof | SuperSite | Extension | InfoValue | AppName | Default | Extends | Finally | Entity | Header | Import | Return | Static | Switch | Typeof | Model | Catch | False | Super | Throw | While | FREQ | PRIO | PROD | Site | Case | Else | Mode | Name | Null | Page | Path | Site_1 | Tech | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | DEV | MOD | For | New | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='L') ) {s = 1;}

                        else if ( (LA21_0=='S') ) {s = 2;}

                        else if ( (LA21_0=='I') ) {s = 3;}

                        else if ( (LA21_0=='M') ) {s = 4;}

                        else if ( (LA21_0=='R') ) {s = 5;}

                        else if ( (LA21_0=='s') ) {s = 6;}

                        else if ( (LA21_0=='i') ) {s = 7;}

                        else if ( (LA21_0=='e') ) {s = 8;}

                        else if ( (LA21_0=='a') ) {s = 9;}

                        else if ( (LA21_0=='d') ) {s = 10;}

                        else if ( (LA21_0=='f') ) {s = 11;}

                        else if ( (LA21_0=='E') ) {s = 12;}

                        else if ( (LA21_0=='H') ) {s = 13;}

                        else if ( (LA21_0=='r') ) {s = 14;}

                        else if ( (LA21_0=='t') ) {s = 15;}

                        else if ( (LA21_0=='c') ) {s = 16;}

                        else if ( (LA21_0=='w') ) {s = 17;}

                        else if ( (LA21_0=='F') ) {s = 18;}

                        else if ( (LA21_0=='P') ) {s = 19;}

                        else if ( (LA21_0=='m') ) {s = 20;}

                        else if ( (LA21_0=='n') ) {s = 21;}

                        else if ( (LA21_0=='p') ) {s = 22;}

                        else if ( (LA21_0=='!') ) {s = 23;}

                        else if ( (LA21_0=='.') ) {s = 24;}

                        else if ( (LA21_0=='=') ) {s = 25;}

                        else if ( (LA21_0=='D') ) {s = 26;}

                        else if ( (LA21_0=='v') ) {s = 27;}

                        else if ( (LA21_0=='%') ) {s = 28;}

                        else if ( (LA21_0=='&') ) {s = 29;}

                        else if ( (LA21_0=='*') ) {s = 30;}

                        else if ( (LA21_0=='+') ) {s = 31;}

                        else if ( (LA21_0=='-') ) {s = 32;}

                        else if ( (LA21_0=='/') ) {s = 33;}

                        else if ( (LA21_0==':') ) {s = 34;}

                        else if ( (LA21_0=='<') ) {s = 35;}

                        else if ( (LA21_0=='>') ) {s = 36;}

                        else if ( (LA21_0=='?') ) {s = 37;}

                        else if ( (LA21_0=='|') ) {s = 38;}

                        else if ( (LA21_0=='#') ) {s = 39;}

                        else if ( (LA21_0=='(') ) {s = 40;}

                        else if ( (LA21_0==')') ) {s = 41;}

                        else if ( (LA21_0==',') ) {s = 42;}

                        else if ( (LA21_0==';') ) {s = 43;}

                        else if ( (LA21_0=='[') ) {s = 44;}

                        else if ( (LA21_0==']') ) {s = 45;}

                        else if ( (LA21_0=='{') ) {s = 46;}

                        else if ( (LA21_0=='}') ) {s = 47;}

                        else if ( (LA21_0=='0') ) {s = 48;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 49;}

                        else if ( (LA21_0=='^') ) {s = 50;}

                        else if ( (LA21_0=='$'||(LA21_0>='A' && LA21_0<='C')||LA21_0=='G'||(LA21_0>='J' && LA21_0<='K')||(LA21_0>='N' && LA21_0<='O')||LA21_0=='Q'||(LA21_0>='T' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='b'||(LA21_0>='g' && LA21_0<='h')||(LA21_0>='j' && LA21_0<='l')||LA21_0=='o'||LA21_0=='q'||LA21_0=='u'||(LA21_0>='x' && LA21_0<='z')) ) {s = 51;}

                        else if ( (LA21_0=='\"') ) {s = 52;}

                        else if ( (LA21_0=='\'') ) {s = 53;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 54;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='@'||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}