package org.xtext.mycsm.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyCsmLexer extends Lexer {
    public static final int Val=61;
    public static final int LessThanSignGreaterThanSign=76;
    public static final int RULE_HEX=111;
    public static final int Import=30;
    public static final int Stop=45;
    public static final int EqualsSignGreaterThanSign=78;
    public static final int Var=62;
    public static final int False=38;
    public static final int LessThanSign=100;
    public static final int LeftParenthesis=90;
    public static final int ExternalService=5;
    public static final int Throw=40;
    public static final int Extends=25;
    public static final int ExclamationMark=86;
    public static final int ExclamationMarkEqualsSignEqualsSign=53;
    public static final int GreaterThanSign=102;
    public static final int Root=50;
    public static final int RULE_ID=114;
    public static final int GreaterThanSignEqualsSign=79;
    public static final int ColonColon=75;
    public static final int EqualsSignEqualsSign=77;
    public static final int Switch=33;
    public static final int VerticalLine=107;
    public static final int PlusSign=93;
    public static final int RULE_INT=112;
    public static final int GeneralResource=8;
    public static final int RULE_ML_COMMENT=116;
    public static final int LeftSquareBracket=104;
    public static final int If=84;
    public static final int Workload_1=21;
    public static final int Finally=26;
    public static final int Message_1=27;
    public static final int Catch=37;
    public static final int VerticalLineVerticalLine=85;
    public static final int Case=46;
    public static final int QuestionMarkFullStop=80;
    public static final int Comma=94;
    public static final int As=82;
    public static final int HyphenMinus=95;
    public static final int Synchronized=13;
    public static final int QuestionMarkColon=81;
    public static final int Solidus=97;
    public static final int RightCurlyBracket=108;
    public static final int PercentSignEqualsSign=64;
    public static final int FullStop=96;
    public static final int Join=44;
    public static final int Default=24;
    public static final int Workload=19;
    public static final int Semicolon=99;
    public static final int Merge=35;
    public static final int PlusSignPlusSign=68;
    public static final int QuestionMark=103;
    public static final int PrePath=28;
    public static final int Else=47;
    public static final int ExclamationMarkEqualsSign=63;
    public static final int HyphenMinusGreaterThanSign=72;
    public static final int HyphenMinusHyphenMinus=70;
    public static final int New=58;
    public static final int Null=48;
    public static final int Pre=59;
    public static final int RULE_BEGIN=109;
    public static final int Typeof=34;
    public static final int Start=36;
    public static final int SolidusEqualsSign=74;
    public static final int ProcessingResource=4;
    public static final int ResourceRelease_1=10;
    public static final int True=52;
    public static final int PercentSign=88;
    public static final int Super=39;
    public static final int ResourceRelease=7;
    public static final int FullStopFullStop=73;
    public static final int Try=60;
    public static final int Ampersand=89;
    public static final int AsteriskEqualsSign=67;
    public static final int RightSquareBracket=105;
    public static final int For=57;
    public static final int RightParenthesis=91;
    public static final int ResourceAcquire_1=9;
    public static final int Do=83;
    public static final int EqualsSignEqualsSignEqualsSign=55;
    public static final int RULE_DECIMAL=113;
    public static final int NumberSign=87;
    public static final int Value=41;
    public static final int AsteriskAsterisk=66;
    public static final int Static=32;
    public static final int RULE_END=110;
    public static final int Pathconnection=12;
    public static final int Fork=43;
    public static final int Message=22;
    public static final int RULE_STRING=115;
    public static final int Step=51;
    public static final int ResourceAcquire=6;
    public static final int RULE_SL_COMMENT=117;
    public static final int EqualsSign=101;
    public static final int AmpersandAmpersand=65;
    public static final int Branch=29;
    public static final int Instanceof=14;
    public static final int HyphenMinusEqualsSign=71;
    public static final int Colon=98;
    public static final int Component=15;
    public static final int CSM=56;
    public static final int EOF=-1;
    public static final int Asterisk=92;
    public static final int PlusSignEqualsSign=69;
    public static final int Return=31;
    public static final int Scenarion=16;
    public static final int RULE_WS=118;
    public static final int Post=49;
    public static final int LeftCurlyBracket=106;
    public static final int While=42;
    public static final int RULE_ANY_OTHER=119;
    public static final int Seqence=23;
    public static final int Extension=17;
    public static final int FullStopFullStopLessThanSign=54;
    public static final int PostPath=20;
    public static final int ActiveResource=11;
    public static final int Scenarion_1=18;

    // delegates
    // delegators

    public InternalMyCsmLexer() {;} 
    public InternalMyCsmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyCsmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyCsmLexer.g"; }

    // $ANTLR start "ProcessingResource"
    public final void mProcessingResource() throws RecognitionException {
        try {
            int _type = ProcessingResource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:14:20: ( 'ProcessingResource' )
            // InternalMyCsmLexer.g:14:22: 'ProcessingResource'
            {
            match("ProcessingResource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ProcessingResource"

    // $ANTLR start "ExternalService"
    public final void mExternalService() throws RecognitionException {
        try {
            int _type = ExternalService;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:16:17: ( 'ExternalService' )
            // InternalMyCsmLexer.g:16:19: 'ExternalService'
            {
            match("ExternalService"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExternalService"

    // $ANTLR start "ResourceAcquire"
    public final void mResourceAcquire() throws RecognitionException {
        try {
            int _type = ResourceAcquire;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:18:17: ( 'ResourceAcquire' )
            // InternalMyCsmLexer.g:18:19: 'ResourceAcquire'
            {
            match("ResourceAcquire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ResourceAcquire"

    // $ANTLR start "ResourceRelease"
    public final void mResourceRelease() throws RecognitionException {
        try {
            int _type = ResourceRelease;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:20:17: ( 'ResourceRelease' )
            // InternalMyCsmLexer.g:20:19: 'ResourceRelease'
            {
            match("ResourceRelease"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ResourceRelease"

    // $ANTLR start "GeneralResource"
    public final void mGeneralResource() throws RecognitionException {
        try {
            int _type = GeneralResource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:22:17: ( 'generalResource' )
            // InternalMyCsmLexer.g:22:19: 'generalResource'
            {
            match("generalResource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GeneralResource"

    // $ANTLR start "ResourceAcquire_1"
    public final void mResourceAcquire_1() throws RecognitionException {
        try {
            int _type = ResourceAcquire_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:24:19: ( 'resourceAcquire' )
            // InternalMyCsmLexer.g:24:21: 'resourceAcquire'
            {
            match("resourceAcquire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ResourceAcquire_1"

    // $ANTLR start "ResourceRelease_1"
    public final void mResourceRelease_1() throws RecognitionException {
        try {
            int _type = ResourceRelease_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:26:19: ( 'resourceRelease' )
            // InternalMyCsmLexer.g:26:21: 'resourceRelease'
            {
            match("resourceRelease"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ResourceRelease_1"

    // $ANTLR start "ActiveResource"
    public final void mActiveResource() throws RecognitionException {
        try {
            int _type = ActiveResource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:28:16: ( 'activeResource' )
            // InternalMyCsmLexer.g:28:18: 'activeResource'
            {
            match("activeResource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ActiveResource"

    // $ANTLR start "Pathconnection"
    public final void mPathconnection() throws RecognitionException {
        try {
            int _type = Pathconnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:30:16: ( 'pathconnection' )
            // InternalMyCsmLexer.g:30:18: 'pathconnection'
            {
            match("pathconnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pathconnection"

    // $ANTLR start "Synchronized"
    public final void mSynchronized() throws RecognitionException {
        try {
            int _type = Synchronized;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:32:14: ( 'synchronized' )
            // InternalMyCsmLexer.g:32:16: 'synchronized'
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

    // $ANTLR start "Instanceof"
    public final void mInstanceof() throws RecognitionException {
        try {
            int _type = Instanceof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:34:12: ( 'instanceof' )
            // InternalMyCsmLexer.g:34:14: 'instanceof'
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

    // $ANTLR start "Component"
    public final void mComponent() throws RecognitionException {
        try {
            int _type = Component;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:36:11: ( 'Component' )
            // InternalMyCsmLexer.g:36:13: 'Component'
            {
            match("Component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Component"

    // $ANTLR start "Scenarion"
    public final void mScenarion() throws RecognitionException {
        try {
            int _type = Scenarion;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:38:11: ( 'Scenarion' )
            // InternalMyCsmLexer.g:38:13: 'Scenarion'
            {
            match("Scenarion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scenarion"

    // $ANTLR start "Extension"
    public final void mExtension() throws RecognitionException {
        try {
            int _type = Extension;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:40:11: ( 'extension' )
            // InternalMyCsmLexer.g:40:13: 'extension'
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

    // $ANTLR start "Scenarion_1"
    public final void mScenarion_1() throws RecognitionException {
        try {
            int _type = Scenarion_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:42:13: ( 'scenarion' )
            // InternalMyCsmLexer.g:42:15: 'scenarion'
            {
            match("scenarion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scenarion_1"

    // $ANTLR start "Workload"
    public final void mWorkload() throws RecognitionException {
        try {
            int _type = Workload;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:44:10: ( 'Workload' )
            // InternalMyCsmLexer.g:44:12: 'Workload'
            {
            match("Workload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Workload"

    // $ANTLR start "PostPath"
    public final void mPostPath() throws RecognitionException {
        try {
            int _type = PostPath;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:46:10: ( 'postPath' )
            // InternalMyCsmLexer.g:46:12: 'postPath'
            {
            match("postPath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PostPath"

    // $ANTLR start "Workload_1"
    public final void mWorkload_1() throws RecognitionException {
        try {
            int _type = Workload_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:48:12: ( 'workload' )
            // InternalMyCsmLexer.g:48:14: 'workload'
            {
            match("workload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Workload_1"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:50:9: ( 'Message' )
            // InternalMyCsmLexer.g:50:11: 'Message'
            {
            match("Message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Seqence"
    public final void mSeqence() throws RecognitionException {
        try {
            int _type = Seqence;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:52:9: ( 'Seqence' )
            // InternalMyCsmLexer.g:52:11: 'Seqence'
            {
            match("Seqence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Seqence"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:54:9: ( 'default' )
            // InternalMyCsmLexer.g:54:11: 'default'
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
            // InternalMyCsmLexer.g:56:9: ( 'extends' )
            // InternalMyCsmLexer.g:56:11: 'extends'
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
            // InternalMyCsmLexer.g:58:9: ( 'finally' )
            // InternalMyCsmLexer.g:58:11: 'finally'
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

    // $ANTLR start "Message_1"
    public final void mMessage_1() throws RecognitionException {
        try {
            int _type = Message_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:60:11: ( 'message' )
            // InternalMyCsmLexer.g:60:13: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message_1"

    // $ANTLR start "PrePath"
    public final void mPrePath() throws RecognitionException {
        try {
            int _type = PrePath;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:62:9: ( 'prePath' )
            // InternalMyCsmLexer.g:62:11: 'prePath'
            {
            match("prePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrePath"

    // $ANTLR start "Branch"
    public final void mBranch() throws RecognitionException {
        try {
            int _type = Branch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:64:8: ( 'Branch' )
            // InternalMyCsmLexer.g:64:10: 'Branch'
            {
            match("Branch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Branch"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:66:8: ( 'import' )
            // InternalMyCsmLexer.g:66:10: 'import'
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
            // InternalMyCsmLexer.g:68:8: ( 'return' )
            // InternalMyCsmLexer.g:68:10: 'return'
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
            // InternalMyCsmLexer.g:70:8: ( 'static' )
            // InternalMyCsmLexer.g:70:10: 'static'
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
            // InternalMyCsmLexer.g:72:8: ( 'switch' )
            // InternalMyCsmLexer.g:72:10: 'switch'
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
            // InternalMyCsmLexer.g:74:8: ( 'typeof' )
            // InternalMyCsmLexer.g:74:10: 'typeof'
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

    // $ANTLR start "Merge"
    public final void mMerge() throws RecognitionException {
        try {
            int _type = Merge;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:76:7: ( 'Merge' )
            // InternalMyCsmLexer.g:76:9: 'Merge'
            {
            match("Merge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Merge"

    // $ANTLR start "Start"
    public final void mStart() throws RecognitionException {
        try {
            int _type = Start;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:78:7: ( 'Start' )
            // InternalMyCsmLexer.g:78:9: 'Start'
            {
            match("Start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Start"

    // $ANTLR start "Catch"
    public final void mCatch() throws RecognitionException {
        try {
            int _type = Catch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:80:7: ( 'catch' )
            // InternalMyCsmLexer.g:80:9: 'catch'
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
            // InternalMyCsmLexer.g:82:7: ( 'false' )
            // InternalMyCsmLexer.g:82:9: 'false'
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
            // InternalMyCsmLexer.g:84:7: ( 'super' )
            // InternalMyCsmLexer.g:84:9: 'super'
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
            // InternalMyCsmLexer.g:86:7: ( 'throw' )
            // InternalMyCsmLexer.g:86:9: 'throw'
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

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:88:7: ( 'value' )
            // InternalMyCsmLexer.g:88:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:90:7: ( 'while' )
            // InternalMyCsmLexer.g:90:9: 'while'
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

    // $ANTLR start "Fork"
    public final void mFork() throws RecognitionException {
        try {
            int _type = Fork;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:92:6: ( 'Fork' )
            // InternalMyCsmLexer.g:92:8: 'Fork'
            {
            match("Fork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fork"

    // $ANTLR start "Join"
    public final void mJoin() throws RecognitionException {
        try {
            int _type = Join;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:94:6: ( 'Join' )
            // InternalMyCsmLexer.g:94:8: 'Join'
            {
            match("Join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Join"

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:96:6: ( 'Stop' )
            // InternalMyCsmLexer.g:96:8: 'Stop'
            {
            match("Stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:98:6: ( 'case' )
            // InternalMyCsmLexer.g:98:8: 'case'
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
            // InternalMyCsmLexer.g:100:6: ( 'else' )
            // InternalMyCsmLexer.g:100:8: 'else'
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

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:102:6: ( 'null' )
            // InternalMyCsmLexer.g:102:8: 'null'
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

    // $ANTLR start "Post"
    public final void mPost() throws RecognitionException {
        try {
            int _type = Post;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:104:6: ( 'post' )
            // InternalMyCsmLexer.g:104:8: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Post"

    // $ANTLR start "Root"
    public final void mRoot() throws RecognitionException {
        try {
            int _type = Root;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:106:6: ( 'root' )
            // InternalMyCsmLexer.g:106:8: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Root"

    // $ANTLR start "Step"
    public final void mStep() throws RecognitionException {
        try {
            int _type = Step;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:108:6: ( 'step' )
            // InternalMyCsmLexer.g:108:8: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Step"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:110:6: ( 'true' )
            // InternalMyCsmLexer.g:110:8: 'true'
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
            // InternalMyCsmLexer.g:112:37: ( '!==' )
            // InternalMyCsmLexer.g:112:39: '!=='
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
            // InternalMyCsmLexer.g:114:30: ( '..<' )
            // InternalMyCsmLexer.g:114:32: '..<'
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
            // InternalMyCsmLexer.g:116:32: ( '===' )
            // InternalMyCsmLexer.g:116:34: '==='
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

    // $ANTLR start "CSM"
    public final void mCSM() throws RecognitionException {
        try {
            int _type = CSM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:118:5: ( 'CSM' )
            // InternalMyCsmLexer.g:118:7: 'CSM'
            {
            match("CSM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSM"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:120:5: ( 'for' )
            // InternalMyCsmLexer.g:120:7: 'for'
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
            // InternalMyCsmLexer.g:122:5: ( 'new' )
            // InternalMyCsmLexer.g:122:7: 'new'
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

    // $ANTLR start "Pre"
    public final void mPre() throws RecognitionException {
        try {
            int _type = Pre;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:124:5: ( 'pre' )
            // InternalMyCsmLexer.g:124:7: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pre"

    // $ANTLR start "Try"
    public final void mTry() throws RecognitionException {
        try {
            int _type = Try;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyCsmLexer.g:126:5: ( 'try' )
            // InternalMyCsmLexer.g:126:7: 'try'
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
            // InternalMyCsmLexer.g:128:5: ( 'val' )
            // InternalMyCsmLexer.g:128:7: 'val'
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
            // InternalMyCsmLexer.g:130:5: ( 'var' )
            // InternalMyCsmLexer.g:130:7: 'var'
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
            // InternalMyCsmLexer.g:132:27: ( '!=' )
            // InternalMyCsmLexer.g:132:29: '!='
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
            // InternalMyCsmLexer.g:134:23: ( '%=' )
            // InternalMyCsmLexer.g:134:25: '%='
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
            // InternalMyCsmLexer.g:136:20: ( '&&' )
            // InternalMyCsmLexer.g:136:22: '&&'
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
            // InternalMyCsmLexer.g:138:18: ( '**' )
            // InternalMyCsmLexer.g:138:20: '**'
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
            // InternalMyCsmLexer.g:140:20: ( '*=' )
            // InternalMyCsmLexer.g:140:22: '*='
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
            // InternalMyCsmLexer.g:142:18: ( '++' )
            // InternalMyCsmLexer.g:142:20: '++'
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
            // InternalMyCsmLexer.g:144:20: ( '+=' )
            // InternalMyCsmLexer.g:144:22: '+='
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
            // InternalMyCsmLexer.g:146:24: ( '--' )
            // InternalMyCsmLexer.g:146:26: '--'
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
            // InternalMyCsmLexer.g:148:23: ( '-=' )
            // InternalMyCsmLexer.g:148:25: '-='
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
            // InternalMyCsmLexer.g:150:28: ( '->' )
            // InternalMyCsmLexer.g:150:30: '->'
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
            // InternalMyCsmLexer.g:152:18: ( '..' )
            // InternalMyCsmLexer.g:152:20: '..'
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
            // InternalMyCsmLexer.g:154:19: ( '/=' )
            // InternalMyCsmLexer.g:154:21: '/='
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
            // InternalMyCsmLexer.g:156:12: ( '::' )
            // InternalMyCsmLexer.g:156:14: '::'
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
            // InternalMyCsmLexer.g:158:29: ( '<>' )
            // InternalMyCsmLexer.g:158:31: '<>'
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
            // InternalMyCsmLexer.g:160:22: ( '==' )
            // InternalMyCsmLexer.g:160:24: '=='
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
            // InternalMyCsmLexer.g:162:27: ( '=>' )
            // InternalMyCsmLexer.g:162:29: '=>'
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
            // InternalMyCsmLexer.g:164:27: ( '>=' )
            // InternalMyCsmLexer.g:164:29: '>='
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
            // InternalMyCsmLexer.g:166:22: ( '?.' )
            // InternalMyCsmLexer.g:166:24: '?.'
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
            // InternalMyCsmLexer.g:168:19: ( '?:' )
            // InternalMyCsmLexer.g:168:21: '?:'
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
            // InternalMyCsmLexer.g:170:4: ( 'as' )
            // InternalMyCsmLexer.g:170:6: 'as'
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
            // InternalMyCsmLexer.g:172:4: ( 'do' )
            // InternalMyCsmLexer.g:172:6: 'do'
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
            // InternalMyCsmLexer.g:174:4: ( 'if' )
            // InternalMyCsmLexer.g:174:6: 'if'
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
            // InternalMyCsmLexer.g:176:26: ( '||' )
            // InternalMyCsmLexer.g:176:28: '||'
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
            // InternalMyCsmLexer.g:178:17: ( '!' )
            // InternalMyCsmLexer.g:178:19: '!'
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
            // InternalMyCsmLexer.g:180:12: ( '#' )
            // InternalMyCsmLexer.g:180:14: '#'
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
            // InternalMyCsmLexer.g:182:13: ( '%' )
            // InternalMyCsmLexer.g:182:15: '%'
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
            // InternalMyCsmLexer.g:184:11: ( '&' )
            // InternalMyCsmLexer.g:184:13: '&'
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
            // InternalMyCsmLexer.g:186:17: ( '(' )
            // InternalMyCsmLexer.g:186:19: '('
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
            // InternalMyCsmLexer.g:188:18: ( ')' )
            // InternalMyCsmLexer.g:188:20: ')'
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
            // InternalMyCsmLexer.g:190:10: ( '*' )
            // InternalMyCsmLexer.g:190:12: '*'
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
            // InternalMyCsmLexer.g:192:10: ( '+' )
            // InternalMyCsmLexer.g:192:12: '+'
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
            // InternalMyCsmLexer.g:194:7: ( ',' )
            // InternalMyCsmLexer.g:194:9: ','
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
            // InternalMyCsmLexer.g:196:13: ( '-' )
            // InternalMyCsmLexer.g:196:15: '-'
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
            // InternalMyCsmLexer.g:198:10: ( '.' )
            // InternalMyCsmLexer.g:198:12: '.'
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
            // InternalMyCsmLexer.g:200:9: ( '/' )
            // InternalMyCsmLexer.g:200:11: '/'
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
            // InternalMyCsmLexer.g:202:7: ( ':' )
            // InternalMyCsmLexer.g:202:9: ':'
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
            // InternalMyCsmLexer.g:204:11: ( ';' )
            // InternalMyCsmLexer.g:204:13: ';'
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
            // InternalMyCsmLexer.g:206:14: ( '<' )
            // InternalMyCsmLexer.g:206:16: '<'
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
            // InternalMyCsmLexer.g:208:12: ( '=' )
            // InternalMyCsmLexer.g:208:14: '='
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
            // InternalMyCsmLexer.g:210:17: ( '>' )
            // InternalMyCsmLexer.g:210:19: '>'
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
            // InternalMyCsmLexer.g:212:14: ( '?' )
            // InternalMyCsmLexer.g:212:16: '?'
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
            // InternalMyCsmLexer.g:214:19: ( '[' )
            // InternalMyCsmLexer.g:214:21: '['
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
            // InternalMyCsmLexer.g:216:20: ( ']' )
            // InternalMyCsmLexer.g:216:22: ']'
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
            // InternalMyCsmLexer.g:218:18: ( '{' )
            // InternalMyCsmLexer.g:218:20: '{'
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
            // InternalMyCsmLexer.g:220:14: ( '|' )
            // InternalMyCsmLexer.g:220:16: '|'
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
            // InternalMyCsmLexer.g:222:19: ( '}' )
            // InternalMyCsmLexer.g:222:21: '}'
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
            // InternalMyCsmLexer.g:224:21: ()
            // InternalMyCsmLexer.g:224:23: 
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
            // InternalMyCsmLexer.g:226:19: ()
            // InternalMyCsmLexer.g:226:21: 
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
            // InternalMyCsmLexer.g:228:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalMyCsmLexer.g:228:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalMyCsmLexer.g:228:12: ( '0x' | '0X' )
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
                    // InternalMyCsmLexer.g:228:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMyCsmLexer.g:228:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalMyCsmLexer.g:228:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
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
            	    // InternalMyCsmLexer.g:
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

            // InternalMyCsmLexer.g:228:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyCsmLexer.g:228:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalMyCsmLexer.g:228:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
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
                            // InternalMyCsmLexer.g:228:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // InternalMyCsmLexer.g:228:84: ( 'l' | 'L' )
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
            // InternalMyCsmLexer.g:230:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalMyCsmLexer.g:230:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalMyCsmLexer.g:230:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyCsmLexer.g:
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
            // InternalMyCsmLexer.g:232:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalMyCsmLexer.g:232:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalMyCsmLexer.g:232:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyCsmLexer.g:232:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyCsmLexer.g:232:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyCsmLexer.g:
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

            // InternalMyCsmLexer.g:232:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
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
                    // InternalMyCsmLexer.g:232:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // InternalMyCsmLexer.g:232:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // InternalMyCsmLexer.g:234:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalMyCsmLexer.g:234:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalMyCsmLexer.g:234:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyCsmLexer.g:234:11: '^'
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

            // InternalMyCsmLexer.g:234:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyCsmLexer.g:
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
            // InternalMyCsmLexer.g:236:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalMyCsmLexer.g:236:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalMyCsmLexer.g:236:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
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
                    // InternalMyCsmLexer.g:236:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalMyCsmLexer.g:236:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyCsmLexer.g:236:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyCsmLexer.g:236:28: ~ ( ( '\\\\' | '\"' ) )
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

                    // InternalMyCsmLexer.g:236:44: ( '\"' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\"') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyCsmLexer.g:236:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyCsmLexer.g:236:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalMyCsmLexer.g:236:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyCsmLexer.g:236:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyCsmLexer.g:236:62: ~ ( ( '\\\\' | '\\'' ) )
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

                    // InternalMyCsmLexer.g:236:79: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyCsmLexer.g:236:79: '\\''
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
            // InternalMyCsmLexer.g:238:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyCsmLexer.g:238:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyCsmLexer.g:238:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyCsmLexer.g:238:52: .
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
            // InternalMyCsmLexer.g:240:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyCsmLexer.g:240:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyCsmLexer.g:240:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyCsmLexer.g:240:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyCsmLexer.g:240:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyCsmLexer.g:240:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyCsmLexer.g:240:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyCsmLexer.g:240:41: '\\r'
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
            // InternalMyCsmLexer.g:242:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyCsmLexer.g:242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyCsmLexer.g:242:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyCsmLexer.g:
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
            // InternalMyCsmLexer.g:244:16: ( . )
            // InternalMyCsmLexer.g:244:18: .
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
        // InternalMyCsmLexer.g:1:8: ( ProcessingResource | ExternalService | ResourceAcquire | ResourceRelease | GeneralResource | ResourceAcquire_1 | ResourceRelease_1 | ActiveResource | Pathconnection | Synchronized | Instanceof | Component | Scenarion | Extension | Scenarion_1 | Workload | PostPath | Workload_1 | Message | Seqence | Default | Extends | Finally | Message_1 | PrePath | Branch | Import | Return | Static | Switch | Typeof | Merge | Start | Catch | False | Super | Throw | Value | While | Fork | Join | Stop | Case | Else | Null | Post | Root | Step | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | CSM | For | New | Pre | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=114;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMyCsmLexer.g:1:10: ProcessingResource
                {
                mProcessingResource(); 

                }
                break;
            case 2 :
                // InternalMyCsmLexer.g:1:29: ExternalService
                {
                mExternalService(); 

                }
                break;
            case 3 :
                // InternalMyCsmLexer.g:1:45: ResourceAcquire
                {
                mResourceAcquire(); 

                }
                break;
            case 4 :
                // InternalMyCsmLexer.g:1:61: ResourceRelease
                {
                mResourceRelease(); 

                }
                break;
            case 5 :
                // InternalMyCsmLexer.g:1:77: GeneralResource
                {
                mGeneralResource(); 

                }
                break;
            case 6 :
                // InternalMyCsmLexer.g:1:93: ResourceAcquire_1
                {
                mResourceAcquire_1(); 

                }
                break;
            case 7 :
                // InternalMyCsmLexer.g:1:111: ResourceRelease_1
                {
                mResourceRelease_1(); 

                }
                break;
            case 8 :
                // InternalMyCsmLexer.g:1:129: ActiveResource
                {
                mActiveResource(); 

                }
                break;
            case 9 :
                // InternalMyCsmLexer.g:1:144: Pathconnection
                {
                mPathconnection(); 

                }
                break;
            case 10 :
                // InternalMyCsmLexer.g:1:159: Synchronized
                {
                mSynchronized(); 

                }
                break;
            case 11 :
                // InternalMyCsmLexer.g:1:172: Instanceof
                {
                mInstanceof(); 

                }
                break;
            case 12 :
                // InternalMyCsmLexer.g:1:183: Component
                {
                mComponent(); 

                }
                break;
            case 13 :
                // InternalMyCsmLexer.g:1:193: Scenarion
                {
                mScenarion(); 

                }
                break;
            case 14 :
                // InternalMyCsmLexer.g:1:203: Extension
                {
                mExtension(); 

                }
                break;
            case 15 :
                // InternalMyCsmLexer.g:1:213: Scenarion_1
                {
                mScenarion_1(); 

                }
                break;
            case 16 :
                // InternalMyCsmLexer.g:1:225: Workload
                {
                mWorkload(); 

                }
                break;
            case 17 :
                // InternalMyCsmLexer.g:1:234: PostPath
                {
                mPostPath(); 

                }
                break;
            case 18 :
                // InternalMyCsmLexer.g:1:243: Workload_1
                {
                mWorkload_1(); 

                }
                break;
            case 19 :
                // InternalMyCsmLexer.g:1:254: Message
                {
                mMessage(); 

                }
                break;
            case 20 :
                // InternalMyCsmLexer.g:1:262: Seqence
                {
                mSeqence(); 

                }
                break;
            case 21 :
                // InternalMyCsmLexer.g:1:270: Default
                {
                mDefault(); 

                }
                break;
            case 22 :
                // InternalMyCsmLexer.g:1:278: Extends
                {
                mExtends(); 

                }
                break;
            case 23 :
                // InternalMyCsmLexer.g:1:286: Finally
                {
                mFinally(); 

                }
                break;
            case 24 :
                // InternalMyCsmLexer.g:1:294: Message_1
                {
                mMessage_1(); 

                }
                break;
            case 25 :
                // InternalMyCsmLexer.g:1:304: PrePath
                {
                mPrePath(); 

                }
                break;
            case 26 :
                // InternalMyCsmLexer.g:1:312: Branch
                {
                mBranch(); 

                }
                break;
            case 27 :
                // InternalMyCsmLexer.g:1:319: Import
                {
                mImport(); 

                }
                break;
            case 28 :
                // InternalMyCsmLexer.g:1:326: Return
                {
                mReturn(); 

                }
                break;
            case 29 :
                // InternalMyCsmLexer.g:1:333: Static
                {
                mStatic(); 

                }
                break;
            case 30 :
                // InternalMyCsmLexer.g:1:340: Switch
                {
                mSwitch(); 

                }
                break;
            case 31 :
                // InternalMyCsmLexer.g:1:347: Typeof
                {
                mTypeof(); 

                }
                break;
            case 32 :
                // InternalMyCsmLexer.g:1:354: Merge
                {
                mMerge(); 

                }
                break;
            case 33 :
                // InternalMyCsmLexer.g:1:360: Start
                {
                mStart(); 

                }
                break;
            case 34 :
                // InternalMyCsmLexer.g:1:366: Catch
                {
                mCatch(); 

                }
                break;
            case 35 :
                // InternalMyCsmLexer.g:1:372: False
                {
                mFalse(); 

                }
                break;
            case 36 :
                // InternalMyCsmLexer.g:1:378: Super
                {
                mSuper(); 

                }
                break;
            case 37 :
                // InternalMyCsmLexer.g:1:384: Throw
                {
                mThrow(); 

                }
                break;
            case 38 :
                // InternalMyCsmLexer.g:1:390: Value
                {
                mValue(); 

                }
                break;
            case 39 :
                // InternalMyCsmLexer.g:1:396: While
                {
                mWhile(); 

                }
                break;
            case 40 :
                // InternalMyCsmLexer.g:1:402: Fork
                {
                mFork(); 

                }
                break;
            case 41 :
                // InternalMyCsmLexer.g:1:407: Join
                {
                mJoin(); 

                }
                break;
            case 42 :
                // InternalMyCsmLexer.g:1:412: Stop
                {
                mStop(); 

                }
                break;
            case 43 :
                // InternalMyCsmLexer.g:1:417: Case
                {
                mCase(); 

                }
                break;
            case 44 :
                // InternalMyCsmLexer.g:1:422: Else
                {
                mElse(); 

                }
                break;
            case 45 :
                // InternalMyCsmLexer.g:1:427: Null
                {
                mNull(); 

                }
                break;
            case 46 :
                // InternalMyCsmLexer.g:1:432: Post
                {
                mPost(); 

                }
                break;
            case 47 :
                // InternalMyCsmLexer.g:1:437: Root
                {
                mRoot(); 

                }
                break;
            case 48 :
                // InternalMyCsmLexer.g:1:442: Step
                {
                mStep(); 

                }
                break;
            case 49 :
                // InternalMyCsmLexer.g:1:447: True
                {
                mTrue(); 

                }
                break;
            case 50 :
                // InternalMyCsmLexer.g:1:452: ExclamationMarkEqualsSignEqualsSign
                {
                mExclamationMarkEqualsSignEqualsSign(); 

                }
                break;
            case 51 :
                // InternalMyCsmLexer.g:1:488: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 52 :
                // InternalMyCsmLexer.g:1:517: EqualsSignEqualsSignEqualsSign
                {
                mEqualsSignEqualsSignEqualsSign(); 

                }
                break;
            case 53 :
                // InternalMyCsmLexer.g:1:548: CSM
                {
                mCSM(); 

                }
                break;
            case 54 :
                // InternalMyCsmLexer.g:1:552: For
                {
                mFor(); 

                }
                break;
            case 55 :
                // InternalMyCsmLexer.g:1:556: New
                {
                mNew(); 

                }
                break;
            case 56 :
                // InternalMyCsmLexer.g:1:560: Pre
                {
                mPre(); 

                }
                break;
            case 57 :
                // InternalMyCsmLexer.g:1:564: Try
                {
                mTry(); 

                }
                break;
            case 58 :
                // InternalMyCsmLexer.g:1:568: Val
                {
                mVal(); 

                }
                break;
            case 59 :
                // InternalMyCsmLexer.g:1:572: Var
                {
                mVar(); 

                }
                break;
            case 60 :
                // InternalMyCsmLexer.g:1:576: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 61 :
                // InternalMyCsmLexer.g:1:602: PercentSignEqualsSign
                {
                mPercentSignEqualsSign(); 

                }
                break;
            case 62 :
                // InternalMyCsmLexer.g:1:624: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 63 :
                // InternalMyCsmLexer.g:1:643: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 64 :
                // InternalMyCsmLexer.g:1:660: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 65 :
                // InternalMyCsmLexer.g:1:679: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 66 :
                // InternalMyCsmLexer.g:1:696: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 67 :
                // InternalMyCsmLexer.g:1:715: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 68 :
                // InternalMyCsmLexer.g:1:738: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 69 :
                // InternalMyCsmLexer.g:1:760: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 70 :
                // InternalMyCsmLexer.g:1:787: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 71 :
                // InternalMyCsmLexer.g:1:804: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 72 :
                // InternalMyCsmLexer.g:1:822: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 73 :
                // InternalMyCsmLexer.g:1:833: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 74 :
                // InternalMyCsmLexer.g:1:861: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 75 :
                // InternalMyCsmLexer.g:1:882: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 76 :
                // InternalMyCsmLexer.g:1:908: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 77 :
                // InternalMyCsmLexer.g:1:934: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 78 :
                // InternalMyCsmLexer.g:1:955: QuestionMarkColon
                {
                mQuestionMarkColon(); 

                }
                break;
            case 79 :
                // InternalMyCsmLexer.g:1:973: As
                {
                mAs(); 

                }
                break;
            case 80 :
                // InternalMyCsmLexer.g:1:976: Do
                {
                mDo(); 

                }
                break;
            case 81 :
                // InternalMyCsmLexer.g:1:979: If
                {
                mIf(); 

                }
                break;
            case 82 :
                // InternalMyCsmLexer.g:1:982: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 83 :
                // InternalMyCsmLexer.g:1:1007: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 84 :
                // InternalMyCsmLexer.g:1:1023: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 85 :
                // InternalMyCsmLexer.g:1:1034: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 86 :
                // InternalMyCsmLexer.g:1:1046: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 87 :
                // InternalMyCsmLexer.g:1:1056: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 88 :
                // InternalMyCsmLexer.g:1:1072: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 89 :
                // InternalMyCsmLexer.g:1:1089: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 90 :
                // InternalMyCsmLexer.g:1:1098: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 91 :
                // InternalMyCsmLexer.g:1:1107: Comma
                {
                mComma(); 

                }
                break;
            case 92 :
                // InternalMyCsmLexer.g:1:1113: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 93 :
                // InternalMyCsmLexer.g:1:1125: FullStop
                {
                mFullStop(); 

                }
                break;
            case 94 :
                // InternalMyCsmLexer.g:1:1134: Solidus
                {
                mSolidus(); 

                }
                break;
            case 95 :
                // InternalMyCsmLexer.g:1:1142: Colon
                {
                mColon(); 

                }
                break;
            case 96 :
                // InternalMyCsmLexer.g:1:1148: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 97 :
                // InternalMyCsmLexer.g:1:1158: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 98 :
                // InternalMyCsmLexer.g:1:1171: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 99 :
                // InternalMyCsmLexer.g:1:1182: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 100 :
                // InternalMyCsmLexer.g:1:1198: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 101 :
                // InternalMyCsmLexer.g:1:1211: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 102 :
                // InternalMyCsmLexer.g:1:1229: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 103 :
                // InternalMyCsmLexer.g:1:1248: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 104 :
                // InternalMyCsmLexer.g:1:1265: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 105 :
                // InternalMyCsmLexer.g:1:1278: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 106 :
                // InternalMyCsmLexer.g:1:1296: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 107 :
                // InternalMyCsmLexer.g:1:1305: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 108 :
                // InternalMyCsmLexer.g:1:1314: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 109 :
                // InternalMyCsmLexer.g:1:1327: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 110 :
                // InternalMyCsmLexer.g:1:1335: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 111 :
                // InternalMyCsmLexer.g:1:1347: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 112 :
                // InternalMyCsmLexer.g:1:1363: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 113 :
                // InternalMyCsmLexer.g:1:1379: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 114 :
                // InternalMyCsmLexer.g:1:1387: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\31\72\1\151\1\153\1\156\1\160\1\162\1\165\1\170\1\174\1\u0080\1\u0082\1\u0084\1\u0086\1\u0089\1\u008b\11\uffff\2\u0097\1\70\5\uffff\1\72\1\uffff\6\72\1\u00a3\12\72\1\u00af\14\72\1\u00be\16\72\1\u00d1\1\uffff\1\u00d3\1\uffff\1\u00d5\51\uffff\1\u0097\4\uffff\10\72\1\uffff\2\72\1\u00e1\10\72\1\uffff\1\72\1\u00eb\14\72\1\uffff\2\72\1\u00fa\5\72\1\u0100\2\72\1\u0104\1\u0105\3\72\1\u0109\6\uffff\6\72\1\u0110\2\72\1\u0114\1\72\1\uffff\3\72\1\u0119\5\72\1\uffff\3\72\1\u0122\1\72\1\u0124\10\72\1\uffff\4\72\1\u0131\1\uffff\1\72\1\u0133\1\72\2\uffff\1\u0135\1\u0136\1\u0137\1\uffff\6\72\1\uffff\3\72\1\uffff\4\72\1\uffff\1\72\1\u0146\5\72\1\u014c\1\uffff\1\72\1\uffff\2\72\1\u0151\1\72\1\u0153\2\72\1\u0156\3\72\1\u015a\1\uffff\1\u015b\1\uffff\1\u015c\3\uffff\5\72\1\u0162\6\72\1\u0169\1\u016a\1\uffff\1\72\1\u016c\3\72\1\uffff\4\72\1\uffff\1\72\1\uffff\2\72\1\uffff\1\72\1\u0178\1\u0179\3\uffff\5\72\1\uffff\3\72\1\u0182\2\72\2\uffff\1\72\1\uffff\2\72\1\u0188\1\72\1\u018a\2\72\1\u018d\1\u018e\1\u018f\1\u0190\2\uffff\7\72\1\u019a\1\uffff\5\72\1\uffff\1\72\1\uffff\1\u01a1\1\u01a2\4\uffff\11\72\1\uffff\1\72\1\u01ad\1\72\1\u01af\1\u01b0\1\u01b1\2\uffff\12\72\1\uffff\1\u01bc\3\uffff\12\72\1\uffff\11\72\1\u01d0\11\72\1\uffff\7\72\1\u01e1\1\u01e2\1\72\1\u01e4\1\u01e5\1\u01e6\1\u01e7\1\u01e8\1\u01e9\2\uffff\1\72\6\uffff\1\72\1\u01ec\1\uffff";
    static final String DFA21_eofS =
        "\u01ed\uffff";
    static final String DFA21_minS =
        "\1\0\1\162\1\170\3\145\1\143\1\141\1\143\1\146\1\123\1\143\1\154\1\157\1\150\2\145\1\141\1\145\1\162\1\150\2\141\2\157\1\145\1\75\1\56\2\75\1\46\1\52\1\53\1\55\1\52\1\72\1\76\1\75\1\56\1\174\11\uffff\2\60\1\44\5\uffff\1\157\1\uffff\1\164\1\163\1\156\1\163\1\157\1\164\1\44\1\164\1\163\1\145\1\156\1\145\1\141\1\151\1\160\1\163\1\160\1\44\1\155\1\115\1\145\1\161\1\141\1\164\1\163\2\162\1\151\1\162\1\146\1\44\1\156\1\154\1\162\1\163\1\141\1\160\1\162\1\165\1\163\1\154\1\162\1\151\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\51\uffff\1\60\4\uffff\1\143\1\145\1\157\1\145\1\157\1\165\1\164\1\151\1\uffff\1\150\1\164\1\44\1\143\1\156\1\164\1\160\1\164\1\145\1\164\1\157\1\uffff\1\160\1\44\1\156\1\145\1\162\1\160\2\145\2\153\1\154\1\163\1\147\1\141\1\uffff\1\141\1\163\1\44\1\163\1\156\1\145\1\157\1\145\1\44\1\143\1\145\2\44\1\153\1\156\1\154\1\44\6\uffff\1\145\1\162\1\165\1\162\1\165\1\162\1\44\1\166\1\143\1\44\1\141\1\uffff\1\150\1\141\1\151\1\44\1\143\1\162\1\141\1\162\1\157\1\uffff\1\141\1\156\1\164\1\44\1\156\1\44\2\154\1\145\1\141\1\145\1\165\1\154\1\145\1\uffff\1\141\1\143\1\157\1\167\1\44\1\uffff\1\150\1\44\1\145\2\uffff\3\44\1\uffff\1\163\1\156\1\162\1\141\1\162\1\156\1\uffff\1\145\1\157\1\141\1\uffff\1\164\2\162\1\143\1\uffff\1\150\1\44\1\156\1\164\1\156\1\162\1\143\1\44\1\uffff\1\144\1\uffff\2\157\1\44\1\147\1\44\2\154\1\44\1\147\1\150\1\146\1\44\1\uffff\1\44\1\uffff\1\44\3\uffff\1\163\1\141\1\143\1\154\1\143\1\44\1\122\1\156\1\164\1\150\1\157\1\151\2\44\1\uffff\1\143\1\44\1\145\1\151\1\145\1\uffff\1\151\1\163\2\141\1\uffff\1\145\1\uffff\1\164\1\171\1\uffff\1\145\2\44\3\uffff\1\151\1\154\1\145\1\122\1\145\1\uffff\1\145\1\156\1\150\1\44\1\156\1\157\2\uffff\1\145\1\uffff\1\156\1\157\1\44\1\157\1\44\2\144\4\44\2\uffff\1\156\1\123\1\101\1\145\1\101\1\163\1\145\1\44\1\uffff\1\151\1\156\1\157\1\164\1\156\1\uffff\1\156\1\uffff\2\44\4\uffff\1\147\1\145\1\143\1\145\1\163\1\143\1\145\1\157\1\143\1\uffff\1\172\1\44\1\146\3\44\2\uffff\1\122\1\162\1\161\1\154\1\157\1\161\1\154\1\165\1\164\1\145\1\uffff\1\44\3\uffff\1\145\1\166\1\165\1\145\2\165\1\145\1\162\1\151\1\144\1\uffff\1\163\2\151\1\141\1\162\1\151\1\141\1\143\1\157\1\44\1\157\1\143\1\162\1\163\1\143\1\162\1\163\1\145\1\156\1\uffff\1\165\6\145\2\44\1\162\6\44\2\uffff\1\143\6\uffff\1\145\1\44\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\162\1\170\2\145\1\157\1\163\1\162\1\171\1\156\1\157\1\164\1\170\2\157\1\145\2\157\1\145\1\162\1\171\2\141\2\157\1\165\1\75\1\56\1\76\1\75\1\46\2\75\1\76\1\75\1\72\1\76\1\75\1\72\1\174\11\uffff\1\170\1\154\1\172\5\uffff\1\157\1\uffff\1\164\1\163\1\156\1\164\1\157\1\164\1\172\1\164\1\163\1\145\1\156\2\145\1\151\1\160\1\163\1\160\1\172\1\155\1\115\1\145\1\161\1\157\1\164\1\163\2\162\1\151\1\163\1\146\1\172\1\156\1\154\1\162\1\163\1\141\1\160\1\162\1\171\1\164\2\162\1\151\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\51\uffff\1\154\4\uffff\1\143\1\145\1\157\1\145\1\157\1\165\1\164\1\151\1\uffff\1\150\1\164\1\172\1\143\1\156\1\164\1\160\1\164\1\145\1\164\1\157\1\uffff\1\160\1\172\1\156\1\145\1\162\1\160\2\145\2\153\1\154\1\163\1\147\1\141\1\uffff\1\141\1\163\1\172\1\163\1\156\1\145\1\157\1\145\1\172\1\143\1\145\2\172\1\153\1\156\1\154\1\172\6\uffff\1\145\1\162\1\165\1\162\1\165\1\162\1\172\1\166\1\143\1\172\1\141\1\uffff\1\150\1\141\1\151\1\172\1\143\1\162\1\141\1\162\1\157\1\uffff\1\141\1\156\1\164\1\172\1\156\1\172\2\154\1\145\1\141\1\145\1\165\1\154\1\145\1\uffff\1\141\1\143\1\157\1\167\1\172\1\uffff\1\150\1\172\1\145\2\uffff\3\172\1\uffff\1\163\1\156\1\162\1\141\1\162\1\156\1\uffff\1\145\1\157\1\141\1\uffff\1\164\2\162\1\143\1\uffff\1\150\1\172\1\156\1\164\1\156\1\162\1\143\1\172\1\uffff\1\163\1\uffff\2\157\1\172\1\147\1\172\2\154\1\172\1\147\1\150\1\146\1\172\1\uffff\1\172\1\uffff\1\172\3\uffff\1\163\1\141\1\143\1\154\1\143\1\172\1\122\1\156\1\164\1\150\1\157\1\151\2\172\1\uffff\1\143\1\172\1\145\1\151\1\145\1\uffff\1\151\1\163\2\141\1\uffff\1\145\1\uffff\1\164\1\171\1\uffff\1\145\2\172\3\uffff\1\151\1\154\1\145\1\122\1\145\1\uffff\1\145\1\156\1\150\1\172\1\156\1\157\2\uffff\1\145\1\uffff\1\156\1\157\1\172\1\157\1\172\2\144\4\172\2\uffff\1\156\1\123\1\122\1\145\1\122\1\163\1\145\1\172\1\uffff\1\151\1\156\1\157\1\164\1\156\1\uffff\1\156\1\uffff\2\172\4\uffff\1\147\1\145\1\143\1\145\1\163\1\143\1\145\1\157\1\143\1\uffff\2\172\1\146\3\172\2\uffff\1\122\1\162\1\161\1\154\1\157\1\161\1\154\1\165\1\164\1\145\1\uffff\1\172\3\uffff\1\145\1\166\1\165\1\145\2\165\1\145\1\162\1\151\1\144\1\uffff\1\163\2\151\1\141\1\162\1\151\1\141\1\143\1\157\1\172\1\157\1\143\1\162\1\163\1\143\1\162\1\163\1\145\1\156\1\uffff\1\165\6\145\2\172\1\162\6\172\2\uffff\1\143\6\uffff\1\145\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\50\uffff\1\124\1\127\1\130\1\133\1\140\1\145\1\146\1\147\1\151\3\uffff\1\155\2\156\1\161\1\162\1\uffff\1\155\56\uffff\1\123\1\uffff\1\135\1\uffff\1\113\1\142\1\75\1\125\1\76\1\126\1\77\1\100\1\131\1\101\1\102\1\132\1\103\1\104\1\105\1\134\1\107\1\157\1\160\1\136\1\110\1\137\1\111\1\141\1\114\1\143\1\115\1\116\1\144\1\122\1\150\1\124\1\127\1\130\1\133\1\140\1\145\1\146\1\147\1\151\1\152\1\uffff\1\153\1\154\1\156\1\161\10\uffff\1\117\13\uffff\1\121\16\uffff\1\120\21\uffff\1\62\1\74\1\63\1\106\1\64\1\112\13\uffff\1\70\11\uffff\1\65\16\uffff\1\66\5\uffff\1\71\3\uffff\1\72\1\73\3\uffff\1\67\6\uffff\1\57\3\uffff\1\56\4\uffff\1\60\10\uffff\1\52\1\uffff\1\54\14\uffff\1\61\1\uffff\1\53\1\uffff\1\50\1\51\1\55\16\uffff\1\44\5\uffff\1\41\4\uffff\1\47\1\uffff\1\40\2\uffff\1\43\3\uffff\1\45\1\42\1\46\5\uffff\1\34\6\uffff\1\35\1\36\1\uffff\1\33\13\uffff\1\32\1\37\10\uffff\1\31\5\uffff\1\24\1\uffff\1\26\2\uffff\1\23\1\25\1\27\1\30\11\uffff\1\21\6\uffff\1\20\1\22\12\uffff\1\17\1\uffff\1\14\1\15\1\16\12\uffff\1\13\23\uffff\1\12\20\uffff\1\10\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\1";
    static final String DFA21_specialS =
        "\1\0\u01ec\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\70\2\67\2\70\1\67\22\70\1\67\1\32\1\65\1\50\1\64\1\35\1\36\1\66\1\51\1\52\1\37\1\40\1\53\1\41\1\33\1\42\1\61\11\62\1\43\1\54\1\44\1\34\1\45\1\46\1\70\1\64\1\23\1\12\1\64\1\2\1\27\3\64\1\30\2\64\1\17\2\64\1\1\1\64\1\3\1\13\3\64\1\15\3\64\1\55\1\70\1\56\1\63\1\64\1\70\1\6\1\64\1\25\1\20\1\14\1\21\1\4\1\64\1\11\3\64\1\22\1\31\1\64\1\7\1\64\1\5\1\10\1\24\1\64\1\26\1\16\3\64\1\57\1\47\1\60\uff82\70",
            "\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\11\uffff\1\77",
            "\1\100\17\uffff\1\101",
            "\1\102\15\uffff\1\103\2\uffff\1\104",
            "\1\106\20\uffff\1\107\1\111\1\uffff\1\110\1\uffff\1\105",
            "\1\114\6\uffff\1\113\1\112",
            "\1\116\33\uffff\1\115",
            "\1\117\1\uffff\1\120\16\uffff\1\121",
            "\1\123\13\uffff\1\122",
            "\1\124",
            "\1\126\6\uffff\1\125",
            "\1\127",
            "\1\130\11\uffff\1\131",
            "\1\133\7\uffff\1\132\5\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\140\11\uffff\1\141\6\uffff\1\137",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147\17\uffff\1\146",
            "\1\150",
            "\1\152",
            "\1\154\1\155",
            "\1\157",
            "\1\161",
            "\1\163\22\uffff\1\164",
            "\1\166\21\uffff\1\167",
            "\1\171\17\uffff\1\172\1\173",
            "\1\176\4\uffff\1\177\15\uffff\1\175",
            "\1\u0081",
            "\1\u0083",
            "\1\u0085",
            "\1\u0087\13\uffff\1\u0088",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0096\10\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098\13\uffff\1\u0095\6\uffff\1\u0096\2\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098\13\uffff\1\u0095",
            "\12\u0096\10\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098\22\uffff\1\u0096\2\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098",
            "\1\72\34\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\15\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\1\u00bb",
            "\1\u00bd",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\3\uffff\1\u00c7",
            "\1\u00c9\1\u00c8",
            "\1\u00ca\5\uffff\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d2",
            "",
            "\1\u00d4",
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
            "",
            "",
            "\12\u0096\10\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098\22\uffff\1\u0096\2\uffff\1\u0098\1\uffff\3\u0098\5\uffff\1\u0098",
            "",
            "",
            "",
            "",
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
            "\1\72\13\uffff\12\72\7\uffff\17\72\1\u00e0\12\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0101",
            "\1\u0102",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\24\72\1\u0103\5\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0111",
            "\1\u0112",
            "\1\72\13\uffff\12\72\7\uffff\17\72\1\u0113\12\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0123",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0132",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0134",
            "",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u014e\16\uffff\1\u014d",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0152",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0154",
            "\1\u0155",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u016b",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0183",
            "\1\u0184",
            "",
            "",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0189",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018b",
            "\1\u018c",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193\20\uffff\1\u0194",
            "\1\u0195",
            "\1\u0196\20\uffff\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01ae",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01e3",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u01ea",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01eb",
            "\1\72\13\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
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
            return "1:1: Tokens : ( ProcessingResource | ExternalService | ResourceAcquire | ResourceRelease | GeneralResource | ResourceAcquire_1 | ResourceRelease_1 | ActiveResource | Pathconnection | Synchronized | Instanceof | Component | Scenarion | Extension | Scenarion_1 | Workload | PostPath | Workload_1 | Message | Seqence | Default | Extends | Finally | Message_1 | PrePath | Branch | Import | Return | Static | Switch | Typeof | Merge | Start | Catch | False | Super | Throw | Value | While | Fork | Join | Stop | Case | Else | Null | Post | Root | Step | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | CSM | For | New | Pre | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='P') ) {s = 1;}

                        else if ( (LA21_0=='E') ) {s = 2;}

                        else if ( (LA21_0=='R') ) {s = 3;}

                        else if ( (LA21_0=='g') ) {s = 4;}

                        else if ( (LA21_0=='r') ) {s = 5;}

                        else if ( (LA21_0=='a') ) {s = 6;}

                        else if ( (LA21_0=='p') ) {s = 7;}

                        else if ( (LA21_0=='s') ) {s = 8;}

                        else if ( (LA21_0=='i') ) {s = 9;}

                        else if ( (LA21_0=='C') ) {s = 10;}

                        else if ( (LA21_0=='S') ) {s = 11;}

                        else if ( (LA21_0=='e') ) {s = 12;}

                        else if ( (LA21_0=='W') ) {s = 13;}

                        else if ( (LA21_0=='w') ) {s = 14;}

                        else if ( (LA21_0=='M') ) {s = 15;}

                        else if ( (LA21_0=='d') ) {s = 16;}

                        else if ( (LA21_0=='f') ) {s = 17;}

                        else if ( (LA21_0=='m') ) {s = 18;}

                        else if ( (LA21_0=='B') ) {s = 19;}

                        else if ( (LA21_0=='t') ) {s = 20;}

                        else if ( (LA21_0=='c') ) {s = 21;}

                        else if ( (LA21_0=='v') ) {s = 22;}

                        else if ( (LA21_0=='F') ) {s = 23;}

                        else if ( (LA21_0=='J') ) {s = 24;}

                        else if ( (LA21_0=='n') ) {s = 25;}

                        else if ( (LA21_0=='!') ) {s = 26;}

                        else if ( (LA21_0=='.') ) {s = 27;}

                        else if ( (LA21_0=='=') ) {s = 28;}

                        else if ( (LA21_0=='%') ) {s = 29;}

                        else if ( (LA21_0=='&') ) {s = 30;}

                        else if ( (LA21_0=='*') ) {s = 31;}

                        else if ( (LA21_0=='+') ) {s = 32;}

                        else if ( (LA21_0=='-') ) {s = 33;}

                        else if ( (LA21_0=='/') ) {s = 34;}

                        else if ( (LA21_0==':') ) {s = 35;}

                        else if ( (LA21_0=='<') ) {s = 36;}

                        else if ( (LA21_0=='>') ) {s = 37;}

                        else if ( (LA21_0=='?') ) {s = 38;}

                        else if ( (LA21_0=='|') ) {s = 39;}

                        else if ( (LA21_0=='#') ) {s = 40;}

                        else if ( (LA21_0=='(') ) {s = 41;}

                        else if ( (LA21_0==')') ) {s = 42;}

                        else if ( (LA21_0==',') ) {s = 43;}

                        else if ( (LA21_0==';') ) {s = 44;}

                        else if ( (LA21_0=='[') ) {s = 45;}

                        else if ( (LA21_0==']') ) {s = 46;}

                        else if ( (LA21_0=='{') ) {s = 47;}

                        else if ( (LA21_0=='}') ) {s = 48;}

                        else if ( (LA21_0=='0') ) {s = 49;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 50;}

                        else if ( (LA21_0=='^') ) {s = 51;}

                        else if ( (LA21_0=='$'||LA21_0=='A'||LA21_0=='D'||(LA21_0>='G' && LA21_0<='I')||(LA21_0>='K' && LA21_0<='L')||(LA21_0>='N' && LA21_0<='O')||LA21_0=='Q'||(LA21_0>='T' && LA21_0<='V')||(LA21_0>='X' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='b'||LA21_0=='h'||(LA21_0>='j' && LA21_0<='l')||LA21_0=='o'||LA21_0=='q'||LA21_0=='u'||(LA21_0>='x' && LA21_0<='z')) ) {s = 52;}

                        else if ( (LA21_0=='\"') ) {s = 53;}

                        else if ( (LA21_0=='\'') ) {s = 54;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 55;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='@'||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 56;}

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