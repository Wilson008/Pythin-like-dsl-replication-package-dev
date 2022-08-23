package org.xtext.demo.mydsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int Val=47;
    public static final int LessThanSignGreaterThanSign=62;
    public static final int RULE_HEX=98;
    public static final int Import=22;
    public static final int EqualsSignGreaterThanSign=64;
    public static final int Var=48;
    public static final int Node=33;
    public static final int False=28;
    public static final int Hardwarecomponent=4;
    public static final int LessThanSign=87;
    public static final int InputVoltage=9;
    public static final int LeftParenthesis=77;
    public static final int Throw=31;
    public static final int Extends=19;
    public static final int ExclamationMark=73;
    public static final int ExclamationMarkEqualsSignEqualsSign=40;
    public static final int GreaterThanSign=89;
    public static final int Root=34;
    public static final int RULE_ID=101;
    public static final int AllocatedTo=11;
    public static final int Out=45;
    public static final int GreaterThanSignEqualsSign=65;
    public static final int ColonColon=61;
    public static final int EqualsSignEqualsSign=63;
    public static final int Switch=25;
    public static final int VerticalLine=94;
    public static final int PlusSign=80;
    public static final int RULE_INT=99;
    public static final int RULE_ML_COMMENT=103;
    public static final int LeftSquareBracket=91;
    public static final int If=70;
    public static final int Finally=20;
    public static final int In=71;
    public static final int Catch=27;
    public static final int VerticalLineVerticalLine=72;
    public static final int Direction=15;
    public static final int Case=36;
    public static final int QuestionMarkFullStop=66;
    public static final int Comma=81;
    public static final int As=68;
    public static final int HyphenMinus=82;
    public static final int Synchronized=10;
    public static final int QuestionMarkColon=67;
    public static final int Solidus=84;
    public static final int RightCurlyBracket=95;
    public static final int PercentSignEqualsSign=50;
    public static final int FullStop=83;
    public static final int Default=18;
    public static final int Semicolon=86;
    public static final int PlusSignPlusSign=54;
    public static final int QuestionMark=90;
    public static final int Else=37;
    public static final int ExclamationMarkEqualsSign=49;
    public static final int HyphenMinusGreaterThanSign=58;
    public static final int HyphenMinusHyphenMinus=56;
    public static final int New=44;
    public static final int Null=38;
    public static final int RULE_BEGIN=96;
    public static final int Typeof=26;
    public static final int SolidusEqualsSign=60;
    public static final int True=39;
    public static final int PercentSign=75;
    public static final int Super=30;
    public static final int FullStopFullStop=59;
    public static final int Try=46;
    public static final int Ampersand=76;
    public static final int AsteriskEqualsSign=53;
    public static final int UUID=35;
    public static final int RightSquareBracket=92;
    public static final int For=43;
    public static final int RightParenthesis=78;
    public static final int FunctionPort=8;
    public static final int Do=69;
    public static final int EqualsSignEqualsSignEqualsSign=42;
    public static final int PortConnector=7;
    public static final int RULE_DECIMAL=100;
    public static final int NumberSign=74;
    public static final int AsteriskAsterisk=52;
    public static final int Static=24;
    public static final int Sensor=21;
    public static final int RULE_END=97;
    public static final int Softwarecomponent=5;
    public static final int PortGroup=13;
    public static final int RULE_STRING=102;
    public static final int RULE_SL_COMMENT=104;
    public static final int Inout=29;
    public static final int EqualsSign=88;
    public static final int AmpersandAmpersand=51;
    public static final int PowerPort=14;
    public static final int Instanceof=12;
    public static final int GroupConnector=6;
    public static final int HyphenMinusEqualsSign=57;
    public static final int Colon=85;
    public static final int EOF=-1;
    public static final int Asterisk=79;
    public static final int PlusSignEqualsSign=55;
    public static final int Actuator=17;
    public static final int Return=23;
    public static final int RULE_WS=105;
    public static final int LeftCurlyBracket=93;
    public static final int While=32;
    public static final int RULE_ANY_OTHER=106;
    public static final int Extension=16;
    public static final int FullStopFullStopLessThanSign=41;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDslLexer.g"; }

    // $ANTLR start "Hardwarecomponent"
    public final void mHardwarecomponent() throws RecognitionException {
        try {
            int _type = Hardwarecomponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:14:19: ( 'hardwarecomponent' )
            // InternalMyDslLexer.g:14:21: 'hardwarecomponent'
            {
            match("hardwarecomponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hardwarecomponent"

    // $ANTLR start "Softwarecomponent"
    public final void mSoftwarecomponent() throws RecognitionException {
        try {
            int _type = Softwarecomponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:16:19: ( 'softwarecomponent' )
            // InternalMyDslLexer.g:16:21: 'softwarecomponent'
            {
            match("softwarecomponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Softwarecomponent"

    // $ANTLR start "GroupConnector"
    public final void mGroupConnector() throws RecognitionException {
        try {
            int _type = GroupConnector;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:18:16: ( 'GroupConnector' )
            // InternalMyDslLexer.g:18:18: 'GroupConnector'
            {
            match("GroupConnector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GroupConnector"

    // $ANTLR start "PortConnector"
    public final void mPortConnector() throws RecognitionException {
        try {
            int _type = PortConnector;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:20:15: ( 'PortConnector' )
            // InternalMyDslLexer.g:20:17: 'PortConnector'
            {
            match("PortConnector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PortConnector"

    // $ANTLR start "FunctionPort"
    public final void mFunctionPort() throws RecognitionException {
        try {
            int _type = FunctionPort;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:22:14: ( 'FunctionPort' )
            // InternalMyDslLexer.g:22:16: 'FunctionPort'
            {
            match("FunctionPort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FunctionPort"

    // $ANTLR start "InputVoltage"
    public final void mInputVoltage() throws RecognitionException {
        try {
            int _type = InputVoltage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:24:14: ( 'inputVoltage' )
            // InternalMyDslLexer.g:24:16: 'inputVoltage'
            {
            match("inputVoltage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InputVoltage"

    // $ANTLR start "Synchronized"
    public final void mSynchronized() throws RecognitionException {
        try {
            int _type = Synchronized;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:26:14: ( 'synchronized' )
            // InternalMyDslLexer.g:26:16: 'synchronized'
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

    // $ANTLR start "AllocatedTo"
    public final void mAllocatedTo() throws RecognitionException {
        try {
            int _type = AllocatedTo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:28:13: ( 'allocatedTo' )
            // InternalMyDslLexer.g:28:15: 'allocatedTo'
            {
            match("allocatedTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AllocatedTo"

    // $ANTLR start "Instanceof"
    public final void mInstanceof() throws RecognitionException {
        try {
            int _type = Instanceof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:30:12: ( 'instanceof' )
            // InternalMyDslLexer.g:30:14: 'instanceof'
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

    // $ANTLR start "PortGroup"
    public final void mPortGroup() throws RecognitionException {
        try {
            int _type = PortGroup;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:32:11: ( 'PortGroup' )
            // InternalMyDslLexer.g:32:13: 'PortGroup'
            {
            match("PortGroup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PortGroup"

    // $ANTLR start "PowerPort"
    public final void mPowerPort() throws RecognitionException {
        try {
            int _type = PowerPort;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:34:11: ( 'PowerPort' )
            // InternalMyDslLexer.g:34:13: 'PowerPort'
            {
            match("PowerPort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PowerPort"

    // $ANTLR start "Direction"
    public final void mDirection() throws RecognitionException {
        try {
            int _type = Direction;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:36:11: ( 'direction' )
            // InternalMyDslLexer.g:36:13: 'direction'
            {
            match("direction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Direction"

    // $ANTLR start "Extension"
    public final void mExtension() throws RecognitionException {
        try {
            int _type = Extension;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:38:11: ( 'extension' )
            // InternalMyDslLexer.g:38:13: 'extension'
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

    // $ANTLR start "Actuator"
    public final void mActuator() throws RecognitionException {
        try {
            int _type = Actuator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:40:10: ( 'Actuator' )
            // InternalMyDslLexer.g:40:12: 'Actuator'
            {
            match("Actuator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actuator"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:42:9: ( 'default' )
            // InternalMyDslLexer.g:42:11: 'default'
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
            // InternalMyDslLexer.g:44:9: ( 'extends' )
            // InternalMyDslLexer.g:44:11: 'extends'
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
            // InternalMyDslLexer.g:46:9: ( 'finally' )
            // InternalMyDslLexer.g:46:11: 'finally'
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

    // $ANTLR start "Sensor"
    public final void mSensor() throws RecognitionException {
        try {
            int _type = Sensor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:48:8: ( 'Sensor' )
            // InternalMyDslLexer.g:48:10: 'Sensor'
            {
            match("Sensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sensor"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:50:8: ( 'import' )
            // InternalMyDslLexer.g:50:10: 'import'
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
            // InternalMyDslLexer.g:52:8: ( 'return' )
            // InternalMyDslLexer.g:52:10: 'return'
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
            // InternalMyDslLexer.g:54:8: ( 'static' )
            // InternalMyDslLexer.g:54:10: 'static'
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
            // InternalMyDslLexer.g:56:8: ( 'switch' )
            // InternalMyDslLexer.g:56:10: 'switch'
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
            // InternalMyDslLexer.g:58:8: ( 'typeof' )
            // InternalMyDslLexer.g:58:10: 'typeof'
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

    // $ANTLR start "Catch"
    public final void mCatch() throws RecognitionException {
        try {
            int _type = Catch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:60:7: ( 'catch' )
            // InternalMyDslLexer.g:60:9: 'catch'
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
            // InternalMyDslLexer.g:62:7: ( 'false' )
            // InternalMyDslLexer.g:62:9: 'false'
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

    // $ANTLR start "Inout"
    public final void mInout() throws RecognitionException {
        try {
            int _type = Inout;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:64:7: ( 'inout' )
            // InternalMyDslLexer.g:64:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inout"

    // $ANTLR start "Super"
    public final void mSuper() throws RecognitionException {
        try {
            int _type = Super;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:66:7: ( 'super' )
            // InternalMyDslLexer.g:66:9: 'super'
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
            // InternalMyDslLexer.g:68:7: ( 'throw' )
            // InternalMyDslLexer.g:68:9: 'throw'
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
            // InternalMyDslLexer.g:70:7: ( 'while' )
            // InternalMyDslLexer.g:70:9: 'while'
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

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:72:6: ( 'Node' )
            // InternalMyDslLexer.g:72:8: 'Node'
            {
            match("Node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node"

    // $ANTLR start "Root"
    public final void mRoot() throws RecognitionException {
        try {
            int _type = Root;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:74:6: ( 'Root' )
            // InternalMyDslLexer.g:74:8: 'Root'
            {
            match("Root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Root"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:76:6: ( 'UUID' )
            // InternalMyDslLexer.g:76:8: 'UUID'
            {
            match("UUID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:78:6: ( 'case' )
            // InternalMyDslLexer.g:78:8: 'case'
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
            // InternalMyDslLexer.g:80:6: ( 'else' )
            // InternalMyDslLexer.g:80:8: 'else'
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
            // InternalMyDslLexer.g:82:6: ( 'null' )
            // InternalMyDslLexer.g:82:8: 'null'
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

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:84:6: ( 'true' )
            // InternalMyDslLexer.g:84:8: 'true'
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
            // InternalMyDslLexer.g:86:37: ( '!==' )
            // InternalMyDslLexer.g:86:39: '!=='
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
            // InternalMyDslLexer.g:88:30: ( '..<' )
            // InternalMyDslLexer.g:88:32: '..<'
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
            // InternalMyDslLexer.g:90:32: ( '===' )
            // InternalMyDslLexer.g:90:34: '==='
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

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:92:5: ( 'for' )
            // InternalMyDslLexer.g:92:7: 'for'
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
            // InternalMyDslLexer.g:94:5: ( 'new' )
            // InternalMyDslLexer.g:94:7: 'new'
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

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:96:5: ( 'out' )
            // InternalMyDslLexer.g:96:7: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Out"

    // $ANTLR start "Try"
    public final void mTry() throws RecognitionException {
        try {
            int _type = Try;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:98:5: ( 'try' )
            // InternalMyDslLexer.g:98:7: 'try'
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
            // InternalMyDslLexer.g:100:5: ( 'val' )
            // InternalMyDslLexer.g:100:7: 'val'
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
            // InternalMyDslLexer.g:102:5: ( 'var' )
            // InternalMyDslLexer.g:102:7: 'var'
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
            // InternalMyDslLexer.g:104:27: ( '!=' )
            // InternalMyDslLexer.g:104:29: '!='
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
            // InternalMyDslLexer.g:106:23: ( '%=' )
            // InternalMyDslLexer.g:106:25: '%='
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
            // InternalMyDslLexer.g:108:20: ( '&&' )
            // InternalMyDslLexer.g:108:22: '&&'
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
            // InternalMyDslLexer.g:110:18: ( '**' )
            // InternalMyDslLexer.g:110:20: '**'
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
            // InternalMyDslLexer.g:112:20: ( '*=' )
            // InternalMyDslLexer.g:112:22: '*='
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
            // InternalMyDslLexer.g:114:18: ( '++' )
            // InternalMyDslLexer.g:114:20: '++'
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
            // InternalMyDslLexer.g:116:20: ( '+=' )
            // InternalMyDslLexer.g:116:22: '+='
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
            // InternalMyDslLexer.g:118:24: ( '--' )
            // InternalMyDslLexer.g:118:26: '--'
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
            // InternalMyDslLexer.g:120:23: ( '-=' )
            // InternalMyDslLexer.g:120:25: '-='
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
            // InternalMyDslLexer.g:122:28: ( '->' )
            // InternalMyDslLexer.g:122:30: '->'
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
            // InternalMyDslLexer.g:124:18: ( '..' )
            // InternalMyDslLexer.g:124:20: '..'
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
            // InternalMyDslLexer.g:126:19: ( '/=' )
            // InternalMyDslLexer.g:126:21: '/='
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
            // InternalMyDslLexer.g:128:12: ( '::' )
            // InternalMyDslLexer.g:128:14: '::'
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
            // InternalMyDslLexer.g:130:29: ( '<>' )
            // InternalMyDslLexer.g:130:31: '<>'
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
            // InternalMyDslLexer.g:132:22: ( '==' )
            // InternalMyDslLexer.g:132:24: '=='
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
            // InternalMyDslLexer.g:134:27: ( '=>' )
            // InternalMyDslLexer.g:134:29: '=>'
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
            // InternalMyDslLexer.g:136:27: ( '>=' )
            // InternalMyDslLexer.g:136:29: '>='
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
            // InternalMyDslLexer.g:138:22: ( '?.' )
            // InternalMyDslLexer.g:138:24: '?.'
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
            // InternalMyDslLexer.g:140:19: ( '?:' )
            // InternalMyDslLexer.g:140:21: '?:'
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
            // InternalMyDslLexer.g:142:4: ( 'as' )
            // InternalMyDslLexer.g:142:6: 'as'
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
            // InternalMyDslLexer.g:144:4: ( 'do' )
            // InternalMyDslLexer.g:144:6: 'do'
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
            // InternalMyDslLexer.g:146:4: ( 'if' )
            // InternalMyDslLexer.g:146:6: 'if'
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

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:148:4: ( 'in' )
            // InternalMyDslLexer.g:148:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:150:26: ( '||' )
            // InternalMyDslLexer.g:150:28: '||'
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
            // InternalMyDslLexer.g:152:17: ( '!' )
            // InternalMyDslLexer.g:152:19: '!'
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
            // InternalMyDslLexer.g:154:12: ( '#' )
            // InternalMyDslLexer.g:154:14: '#'
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
            // InternalMyDslLexer.g:156:13: ( '%' )
            // InternalMyDslLexer.g:156:15: '%'
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
            // InternalMyDslLexer.g:158:11: ( '&' )
            // InternalMyDslLexer.g:158:13: '&'
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
            // InternalMyDslLexer.g:160:17: ( '(' )
            // InternalMyDslLexer.g:160:19: '('
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
            // InternalMyDslLexer.g:162:18: ( ')' )
            // InternalMyDslLexer.g:162:20: ')'
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
            // InternalMyDslLexer.g:164:10: ( '*' )
            // InternalMyDslLexer.g:164:12: '*'
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
            // InternalMyDslLexer.g:166:10: ( '+' )
            // InternalMyDslLexer.g:166:12: '+'
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
            // InternalMyDslLexer.g:168:7: ( ',' )
            // InternalMyDslLexer.g:168:9: ','
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
            // InternalMyDslLexer.g:170:13: ( '-' )
            // InternalMyDslLexer.g:170:15: '-'
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
            // InternalMyDslLexer.g:172:10: ( '.' )
            // InternalMyDslLexer.g:172:12: '.'
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
            // InternalMyDslLexer.g:174:9: ( '/' )
            // InternalMyDslLexer.g:174:11: '/'
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
            // InternalMyDslLexer.g:176:7: ( ':' )
            // InternalMyDslLexer.g:176:9: ':'
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
            // InternalMyDslLexer.g:178:11: ( ';' )
            // InternalMyDslLexer.g:178:13: ';'
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
            // InternalMyDslLexer.g:180:14: ( '<' )
            // InternalMyDslLexer.g:180:16: '<'
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
            // InternalMyDslLexer.g:182:12: ( '=' )
            // InternalMyDslLexer.g:182:14: '='
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
            // InternalMyDslLexer.g:184:17: ( '>' )
            // InternalMyDslLexer.g:184:19: '>'
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
            // InternalMyDslLexer.g:186:14: ( '?' )
            // InternalMyDslLexer.g:186:16: '?'
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
            // InternalMyDslLexer.g:188:19: ( '[' )
            // InternalMyDslLexer.g:188:21: '['
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
            // InternalMyDslLexer.g:190:20: ( ']' )
            // InternalMyDslLexer.g:190:22: ']'
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
            // InternalMyDslLexer.g:192:18: ( '{' )
            // InternalMyDslLexer.g:192:20: '{'
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
            // InternalMyDslLexer.g:194:14: ( '|' )
            // InternalMyDslLexer.g:194:16: '|'
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
            // InternalMyDslLexer.g:196:19: ( '}' )
            // InternalMyDslLexer.g:196:21: '}'
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
            // InternalMyDslLexer.g:198:21: ()
            // InternalMyDslLexer.g:198:23: 
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
            // InternalMyDslLexer.g:200:19: ()
            // InternalMyDslLexer.g:200:21: 
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
            // InternalMyDslLexer.g:202:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalMyDslLexer.g:202:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalMyDslLexer.g:202:12: ( '0x' | '0X' )
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
                    // InternalMyDslLexer.g:202:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:202:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalMyDslLexer.g:202:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
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
            	    // InternalMyDslLexer.g:
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

            // InternalMyDslLexer.g:202:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDslLexer.g:202:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalMyDslLexer.g:202:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
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
                            // InternalMyDslLexer.g:202:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // InternalMyDslLexer.g:202:84: ( 'l' | 'L' )
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
            // InternalMyDslLexer.g:204:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalMyDslLexer.g:204:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalMyDslLexer.g:204:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDslLexer.g:
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
            // InternalMyDslLexer.g:206:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalMyDslLexer.g:206:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalMyDslLexer.g:206:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDslLexer.g:206:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDslLexer.g:206:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDslLexer.g:
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

            // InternalMyDslLexer.g:206:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
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
                    // InternalMyDslLexer.g:206:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // InternalMyDslLexer.g:206:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // InternalMyDslLexer.g:208:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalMyDslLexer.g:208:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalMyDslLexer.g:208:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDslLexer.g:208:11: '^'
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

            // InternalMyDslLexer.g:208:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDslLexer.g:
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
            // InternalMyDslLexer.g:210:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalMyDslLexer.g:210:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalMyDslLexer.g:210:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
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
                    // InternalMyDslLexer.g:210:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalMyDslLexer.g:210:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDslLexer.g:210:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:210:28: ~ ( ( '\\\\' | '\"' ) )
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

                    // InternalMyDslLexer.g:210:44: ( '\"' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\"') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDslLexer.g:210:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:210:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalMyDslLexer.g:210:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDslLexer.g:210:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:210:62: ~ ( ( '\\\\' | '\\'' ) )
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

                    // InternalMyDslLexer.g:210:79: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDslLexer.g:210:79: '\\''
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
            // InternalMyDslLexer.g:212:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDslLexer.g:212:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDslLexer.g:212:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDslLexer.g:212:52: .
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
            // InternalMyDslLexer.g:214:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDslLexer.g:214:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDslLexer.g:214:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDslLexer.g:214:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDslLexer.g:214:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDslLexer.g:214:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDslLexer.g:214:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDslLexer.g:214:41: '\\r'
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
            // InternalMyDslLexer.g:216:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDslLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDslLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyDslLexer.g:
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
            // InternalMyDslLexer.g:218:16: ( . )
            // InternalMyDslLexer.g:218:18: .
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
        // InternalMyDslLexer.g:1:8: ( Hardwarecomponent | Softwarecomponent | GroupConnector | PortConnector | FunctionPort | InputVoltage | Synchronized | AllocatedTo | Instanceof | PortGroup | PowerPort | Direction | Extension | Actuator | Default | Extends | Finally | Sensor | Import | Return | Static | Switch | Typeof | Catch | False | Inout | Super | Throw | While | Node | Root | UUID | Case | Else | Null | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | For | New | Out | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | In | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=101;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMyDslLexer.g:1:10: Hardwarecomponent
                {
                mHardwarecomponent(); 

                }
                break;
            case 2 :
                // InternalMyDslLexer.g:1:28: Softwarecomponent
                {
                mSoftwarecomponent(); 

                }
                break;
            case 3 :
                // InternalMyDslLexer.g:1:46: GroupConnector
                {
                mGroupConnector(); 

                }
                break;
            case 4 :
                // InternalMyDslLexer.g:1:61: PortConnector
                {
                mPortConnector(); 

                }
                break;
            case 5 :
                // InternalMyDslLexer.g:1:75: FunctionPort
                {
                mFunctionPort(); 

                }
                break;
            case 6 :
                // InternalMyDslLexer.g:1:88: InputVoltage
                {
                mInputVoltage(); 

                }
                break;
            case 7 :
                // InternalMyDslLexer.g:1:101: Synchronized
                {
                mSynchronized(); 

                }
                break;
            case 8 :
                // InternalMyDslLexer.g:1:114: AllocatedTo
                {
                mAllocatedTo(); 

                }
                break;
            case 9 :
                // InternalMyDslLexer.g:1:126: Instanceof
                {
                mInstanceof(); 

                }
                break;
            case 10 :
                // InternalMyDslLexer.g:1:137: PortGroup
                {
                mPortGroup(); 

                }
                break;
            case 11 :
                // InternalMyDslLexer.g:1:147: PowerPort
                {
                mPowerPort(); 

                }
                break;
            case 12 :
                // InternalMyDslLexer.g:1:157: Direction
                {
                mDirection(); 

                }
                break;
            case 13 :
                // InternalMyDslLexer.g:1:167: Extension
                {
                mExtension(); 

                }
                break;
            case 14 :
                // InternalMyDslLexer.g:1:177: Actuator
                {
                mActuator(); 

                }
                break;
            case 15 :
                // InternalMyDslLexer.g:1:186: Default
                {
                mDefault(); 

                }
                break;
            case 16 :
                // InternalMyDslLexer.g:1:194: Extends
                {
                mExtends(); 

                }
                break;
            case 17 :
                // InternalMyDslLexer.g:1:202: Finally
                {
                mFinally(); 

                }
                break;
            case 18 :
                // InternalMyDslLexer.g:1:210: Sensor
                {
                mSensor(); 

                }
                break;
            case 19 :
                // InternalMyDslLexer.g:1:217: Import
                {
                mImport(); 

                }
                break;
            case 20 :
                // InternalMyDslLexer.g:1:224: Return
                {
                mReturn(); 

                }
                break;
            case 21 :
                // InternalMyDslLexer.g:1:231: Static
                {
                mStatic(); 

                }
                break;
            case 22 :
                // InternalMyDslLexer.g:1:238: Switch
                {
                mSwitch(); 

                }
                break;
            case 23 :
                // InternalMyDslLexer.g:1:245: Typeof
                {
                mTypeof(); 

                }
                break;
            case 24 :
                // InternalMyDslLexer.g:1:252: Catch
                {
                mCatch(); 

                }
                break;
            case 25 :
                // InternalMyDslLexer.g:1:258: False
                {
                mFalse(); 

                }
                break;
            case 26 :
                // InternalMyDslLexer.g:1:264: Inout
                {
                mInout(); 

                }
                break;
            case 27 :
                // InternalMyDslLexer.g:1:270: Super
                {
                mSuper(); 

                }
                break;
            case 28 :
                // InternalMyDslLexer.g:1:276: Throw
                {
                mThrow(); 

                }
                break;
            case 29 :
                // InternalMyDslLexer.g:1:282: While
                {
                mWhile(); 

                }
                break;
            case 30 :
                // InternalMyDslLexer.g:1:288: Node
                {
                mNode(); 

                }
                break;
            case 31 :
                // InternalMyDslLexer.g:1:293: Root
                {
                mRoot(); 

                }
                break;
            case 32 :
                // InternalMyDslLexer.g:1:298: UUID
                {
                mUUID(); 

                }
                break;
            case 33 :
                // InternalMyDslLexer.g:1:303: Case
                {
                mCase(); 

                }
                break;
            case 34 :
                // InternalMyDslLexer.g:1:308: Else
                {
                mElse(); 

                }
                break;
            case 35 :
                // InternalMyDslLexer.g:1:313: Null
                {
                mNull(); 

                }
                break;
            case 36 :
                // InternalMyDslLexer.g:1:318: True
                {
                mTrue(); 

                }
                break;
            case 37 :
                // InternalMyDslLexer.g:1:323: ExclamationMarkEqualsSignEqualsSign
                {
                mExclamationMarkEqualsSignEqualsSign(); 

                }
                break;
            case 38 :
                // InternalMyDslLexer.g:1:359: FullStopFullStopLessThanSign
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
            case 39 :
                // InternalMyDslLexer.g:1:388: EqualsSignEqualsSignEqualsSign
                {
                mEqualsSignEqualsSignEqualsSign(); 

                }
                break;
            case 40 :
                // InternalMyDslLexer.g:1:419: For
                {
                mFor(); 

                }
                break;
            case 41 :
                // InternalMyDslLexer.g:1:423: New
                {
                mNew(); 

                }
                break;
            case 42 :
                // InternalMyDslLexer.g:1:427: Out
                {
                mOut(); 

                }
                break;
            case 43 :
                // InternalMyDslLexer.g:1:431: Try
                {
                mTry(); 

                }
                break;
            case 44 :
                // InternalMyDslLexer.g:1:435: Val
                {
                mVal(); 

                }
                break;
            case 45 :
                // InternalMyDslLexer.g:1:439: Var
                {
                mVar(); 

                }
                break;
            case 46 :
                // InternalMyDslLexer.g:1:443: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 47 :
                // InternalMyDslLexer.g:1:469: PercentSignEqualsSign
                {
                mPercentSignEqualsSign(); 

                }
                break;
            case 48 :
                // InternalMyDslLexer.g:1:491: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 49 :
                // InternalMyDslLexer.g:1:510: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 50 :
                // InternalMyDslLexer.g:1:527: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 51 :
                // InternalMyDslLexer.g:1:546: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 52 :
                // InternalMyDslLexer.g:1:563: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 53 :
                // InternalMyDslLexer.g:1:582: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 54 :
                // InternalMyDslLexer.g:1:605: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 55 :
                // InternalMyDslLexer.g:1:627: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 56 :
                // InternalMyDslLexer.g:1:654: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 57 :
                // InternalMyDslLexer.g:1:671: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 58 :
                // InternalMyDslLexer.g:1:689: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 59 :
                // InternalMyDslLexer.g:1:700: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 60 :
                // InternalMyDslLexer.g:1:728: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 61 :
                // InternalMyDslLexer.g:1:749: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 62 :
                // InternalMyDslLexer.g:1:775: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 63 :
                // InternalMyDslLexer.g:1:801: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 64 :
                // InternalMyDslLexer.g:1:822: QuestionMarkColon
                {
                mQuestionMarkColon(); 

                }
                break;
            case 65 :
                // InternalMyDslLexer.g:1:840: As
                {
                mAs(); 

                }
                break;
            case 66 :
                // InternalMyDslLexer.g:1:843: Do
                {
                mDo(); 

                }
                break;
            case 67 :
                // InternalMyDslLexer.g:1:846: If
                {
                mIf(); 

                }
                break;
            case 68 :
                // InternalMyDslLexer.g:1:849: In
                {
                mIn(); 

                }
                break;
            case 69 :
                // InternalMyDslLexer.g:1:852: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 70 :
                // InternalMyDslLexer.g:1:877: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 71 :
                // InternalMyDslLexer.g:1:893: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 72 :
                // InternalMyDslLexer.g:1:904: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 73 :
                // InternalMyDslLexer.g:1:916: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 74 :
                // InternalMyDslLexer.g:1:926: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 75 :
                // InternalMyDslLexer.g:1:942: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 76 :
                // InternalMyDslLexer.g:1:959: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 77 :
                // InternalMyDslLexer.g:1:968: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 78 :
                // InternalMyDslLexer.g:1:977: Comma
                {
                mComma(); 

                }
                break;
            case 79 :
                // InternalMyDslLexer.g:1:983: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 80 :
                // InternalMyDslLexer.g:1:995: FullStop
                {
                mFullStop(); 

                }
                break;
            case 81 :
                // InternalMyDslLexer.g:1:1004: Solidus
                {
                mSolidus(); 

                }
                break;
            case 82 :
                // InternalMyDslLexer.g:1:1012: Colon
                {
                mColon(); 

                }
                break;
            case 83 :
                // InternalMyDslLexer.g:1:1018: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 84 :
                // InternalMyDslLexer.g:1:1028: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 85 :
                // InternalMyDslLexer.g:1:1041: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 86 :
                // InternalMyDslLexer.g:1:1052: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 87 :
                // InternalMyDslLexer.g:1:1068: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 88 :
                // InternalMyDslLexer.g:1:1081: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 89 :
                // InternalMyDslLexer.g:1:1099: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 90 :
                // InternalMyDslLexer.g:1:1118: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 91 :
                // InternalMyDslLexer.g:1:1135: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 92 :
                // InternalMyDslLexer.g:1:1148: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 93 :
                // InternalMyDslLexer.g:1:1166: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 94 :
                // InternalMyDslLexer.g:1:1175: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 95 :
                // InternalMyDslLexer.g:1:1184: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 96 :
                // InternalMyDslLexer.g:1:1197: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 97 :
                // InternalMyDslLexer.g:1:1205: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // InternalMyDslLexer.g:1:1217: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 99 :
                // InternalMyDslLexer.g:1:1233: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 100 :
                // InternalMyDslLexer.g:1:1249: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 101 :
                // InternalMyDslLexer.g:1:1257: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\24\67\1\133\1\135\1\140\2\67\1\144\1\146\1\151\1\154\1\160\1\164\1\166\1\170\1\172\1\175\1\177\11\uffff\2\u008b\1\65\5\uffff\1\67\1\uffff\10\67\1\u009c\1\67\1\u009e\1\67\1\u00a0\2\67\1\u00a3\22\67\1\u00b9\1\uffff\1\u00bb\1\uffff\1\u00bd\2\uffff\2\67\47\uffff\1\u008b\4\uffff\15\67\1\uffff\1\67\1\uffff\1\67\1\uffff\2\67\1\uffff\5\67\1\u00d7\5\67\1\u00dd\7\67\1\u00e5\6\uffff\1\u00e6\1\u00e7\1\u00e8\22\67\1\u00fc\3\67\1\uffff\4\67\1\u0104\1\uffff\1\67\1\u0106\1\67\1\u0108\1\u0109\1\u010a\1\u010b\4\uffff\5\67\1\u0111\7\67\1\u0119\5\67\1\uffff\2\67\1\u0122\3\67\1\u0126\1\uffff\1\u0127\1\uffff\1\u0128\4\uffff\3\67\1\u012c\1\u012d\1\uffff\7\67\1\uffff\1\u0135\7\67\1\uffff\1\u013d\1\u013e\1\u013f\3\uffff\3\67\2\uffff\7\67\1\uffff\2\67\1\u014c\1\67\1\u014e\1\67\1\u0150\3\uffff\14\67\1\uffff\1\67\1\uffff\1\u015e\1\uffff\5\67\1\u0164\1\u0165\4\67\1\u016a\1\u016b\1\uffff\5\67\2\uffff\2\67\1\u0173\1\67\2\uffff\7\67\1\uffff\1\u017c\2\67\1\u017f\2\67\1\u0182\1\u0183\1\uffff\2\67\1\uffff\1\67\1\u0187\2\uffff\2\67\1\u018a\1\uffff\2\67\1\uffff\2\67\1\u018f\1\u0190\2\uffff";
    static final String DFA21_eofS =
        "\u0191\uffff";
    static final String DFA21_minS =
        "\1\0\1\141\1\157\1\162\1\157\1\165\1\146\1\154\1\145\1\154\1\143\1\141\2\145\1\150\1\141\1\150\2\157\1\125\1\145\1\75\1\56\1\75\1\165\1\141\1\75\1\46\1\52\1\53\1\55\1\52\1\72\1\76\1\75\1\56\1\174\11\uffff\2\60\1\44\5\uffff\1\162\1\uffff\1\146\1\156\1\141\1\151\1\160\1\157\1\162\1\156\1\44\1\160\1\44\1\154\1\44\1\162\1\146\1\44\1\164\1\163\1\164\1\156\1\154\1\162\1\156\1\164\1\160\1\162\1\165\1\163\1\151\1\144\1\157\1\111\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\164\1\154\47\uffff\1\60\4\uffff\1\144\1\164\1\143\2\164\1\145\1\165\1\164\1\145\1\143\1\165\1\164\1\165\1\uffff\1\157\1\uffff\1\157\1\uffff\1\145\1\141\1\uffff\2\145\1\165\1\141\1\163\1\44\1\163\1\165\1\145\1\157\1\145\1\44\1\143\1\145\1\154\1\145\1\164\1\104\1\154\1\44\6\uffff\3\44\2\167\1\150\1\151\1\143\1\162\1\160\1\103\1\162\2\164\1\141\1\164\1\162\2\143\1\165\1\156\1\44\1\141\1\154\1\145\1\uffff\1\157\1\162\1\157\1\167\1\44\1\uffff\1\150\1\44\1\145\4\44\4\uffff\2\141\1\162\1\143\1\150\1\44\1\103\1\157\1\162\1\120\1\151\1\126\1\156\1\44\1\164\1\141\1\164\1\154\1\144\1\uffff\1\164\1\154\1\44\1\162\1\156\1\146\1\44\1\uffff\1\44\1\uffff\1\44\4\uffff\2\162\1\157\2\44\1\uffff\1\157\1\156\4\157\1\143\1\uffff\1\44\1\164\1\151\1\164\1\151\1\163\1\157\1\171\1\uffff\3\44\3\uffff\2\145\1\156\2\uffff\2\156\1\165\1\162\1\156\1\154\1\145\1\uffff\1\145\1\157\1\44\1\157\1\44\1\162\1\44\3\uffff\2\143\1\151\1\156\1\145\1\160\1\164\1\120\1\164\1\157\1\144\1\156\1\uffff\1\156\1\uffff\1\44\1\uffff\2\157\1\172\1\145\1\143\2\44\1\157\1\141\1\146\1\124\2\44\1\uffff\2\155\1\145\1\143\1\164\2\uffff\1\162\1\147\1\44\1\157\2\uffff\2\160\1\144\1\164\1\157\1\164\1\145\1\uffff\1\44\2\157\1\44\1\157\1\162\2\44\1\uffff\2\156\1\uffff\1\162\1\44\2\uffff\2\145\1\44\1\uffff\2\156\1\uffff\2\164\2\44\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\141\1\171\1\162\1\157\1\165\1\156\1\163\1\157\1\170\1\143\1\157\2\145\1\171\1\141\1\150\2\157\1\125\1\165\1\75\1\56\1\76\1\165\1\141\1\75\1\46\2\75\1\76\1\75\1\72\1\76\1\75\1\72\1\174\11\uffff\1\170\1\154\1\172\5\uffff\1\162\1\uffff\1\146\1\156\1\141\1\151\1\160\1\157\1\167\1\156\1\172\1\160\1\172\1\154\1\172\1\162\1\146\1\172\1\164\1\163\1\164\1\156\1\154\1\162\1\156\1\164\1\160\1\162\1\171\1\164\1\151\1\144\1\157\1\111\1\154\1\167\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\164\1\162\47\uffff\1\154\4\uffff\1\144\1\164\1\143\2\164\1\145\1\165\1\164\1\145\1\143\1\165\1\164\1\165\1\uffff\1\157\1\uffff\1\157\1\uffff\1\145\1\141\1\uffff\2\145\1\165\1\141\1\163\1\172\1\163\1\165\1\145\1\157\1\145\1\172\1\143\1\145\1\154\1\145\1\164\1\104\1\154\1\172\6\uffff\3\172\2\167\1\150\1\151\1\143\1\162\1\160\1\107\1\162\2\164\1\141\1\164\1\162\2\143\1\165\1\156\1\172\1\141\1\154\1\145\1\uffff\1\157\1\162\1\157\1\167\1\172\1\uffff\1\150\1\172\1\145\4\172\4\uffff\2\141\1\162\1\143\1\150\1\172\1\103\1\157\1\162\1\120\1\151\1\126\1\156\1\172\1\164\1\141\1\164\1\154\1\163\1\uffff\1\164\1\154\1\172\1\162\1\156\1\146\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff\2\162\1\157\2\172\1\uffff\1\157\1\156\4\157\1\143\1\uffff\1\172\1\164\1\151\1\164\1\151\1\163\1\157\1\171\1\uffff\3\172\3\uffff\2\145\1\156\2\uffff\2\156\1\165\1\162\1\156\1\154\1\145\1\uffff\1\145\1\157\1\172\1\157\1\172\1\162\1\172\3\uffff\2\143\1\151\1\156\1\145\1\160\1\164\1\120\1\164\1\157\1\144\1\156\1\uffff\1\156\1\uffff\1\172\1\uffff\2\157\1\172\1\145\1\143\2\172\1\157\1\141\1\146\1\124\2\172\1\uffff\2\155\1\145\1\143\1\164\2\uffff\1\162\1\147\1\172\1\157\2\uffff\2\160\1\144\1\164\1\157\1\164\1\145\1\uffff\1\172\2\157\1\172\1\157\1\162\2\172\1\uffff\2\156\1\uffff\1\162\1\172\2\uffff\2\145\1\172\1\uffff\2\156\1\uffff\2\164\2\172\2\uffff";
    static final String DFA21_acceptS =
        "\45\uffff\1\107\1\112\1\113\1\116\1\123\1\130\1\131\1\132\1\134\3\uffff\1\140\2\141\1\144\1\145\1\uffff\1\140\43\uffff\1\106\1\uffff\1\120\1\uffff\1\75\1\125\2\uffff\1\57\1\110\1\60\1\111\1\61\1\62\1\114\1\63\1\64\1\115\1\65\1\66\1\67\1\117\1\71\1\142\1\143\1\121\1\72\1\122\1\73\1\124\1\76\1\126\1\77\1\100\1\127\1\105\1\133\1\107\1\112\1\113\1\116\1\123\1\130\1\131\1\132\1\134\1\135\1\uffff\1\136\1\137\1\141\1\144\15\uffff\1\104\1\uffff\1\103\1\uffff\1\101\2\uffff\1\102\24\uffff\1\45\1\56\1\46\1\70\1\47\1\74\31\uffff\1\50\5\uffff\1\53\7\uffff\1\51\1\52\1\54\1\55\23\uffff\1\42\7\uffff\1\44\1\uffff\1\41\1\uffff\1\36\1\37\1\40\1\43\5\uffff\1\33\7\uffff\1\32\10\uffff\1\31\3\uffff\1\34\1\30\1\35\3\uffff\1\25\1\26\7\uffff\1\23\7\uffff\1\22\1\24\1\27\14\uffff\1\17\1\uffff\1\20\1\uffff\1\21\15\uffff\1\16\5\uffff\1\12\1\13\4\uffff\1\14\1\15\7\uffff\1\11\10\uffff\1\10\2\uffff\1\7\2\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\1\0\u0190\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\25\1\62\1\45\1\61\1\32\1\33\1\63\1\46\1\47\1\34\1\35\1\50\1\36\1\26\1\37\1\56\11\57\1\40\1\51\1\41\1\27\1\42\1\43\1\65\1\12\4\61\1\5\1\3\6\61\1\21\1\61\1\4\1\61\1\22\1\14\1\61\1\23\5\61\1\52\1\65\1\53\1\60\1\61\1\65\1\7\1\61\1\17\1\10\1\11\1\13\1\61\1\1\1\6\4\61\1\24\1\30\2\61\1\15\1\2\1\16\1\61\1\31\1\20\3\61\1\54\1\44\1\55\uff82\65",
            "\1\66",
            "\1\70\4\uffff\1\72\1\74\1\uffff\1\73\1\uffff\1\71",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\102\6\uffff\1\101\1\100",
            "\1\103\6\uffff\1\104",
            "\1\106\3\uffff\1\105\5\uffff\1\107",
            "\1\111\13\uffff\1\110",
            "\1\112",
            "\1\114\7\uffff\1\113\5\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\121\11\uffff\1\122\6\uffff\1\120",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\17\uffff\1\130",
            "\1\132",
            "\1\134",
            "\1\136\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\145",
            "\1\147\22\uffff\1\150",
            "\1\152\21\uffff\1\153",
            "\1\155\17\uffff\1\156\1\157",
            "\1\162\4\uffff\1\163\15\uffff\1\161",
            "\1\165",
            "\1\167",
            "\1\171",
            "\1\173\13\uffff\1\174",
            "\1\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u008a\10\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c\13\uffff\1\u0089\6\uffff\1\u008a\2\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c\13\uffff\1\u0089",
            "\12\u008a\10\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c\22\uffff\1\u008a\2\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c",
            "\1\67\34\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\4\uffff\1\u0097",
            "\1\u0098",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\u009b\1\u0099\2\67\1\u009a\7\67",
            "\1\u009d",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009f",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a1",
            "\1\u00a2",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\3\uffff\1\u00af",
            "\1\u00b1\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00ba",
            "",
            "\1\u00bc",
            "",
            "",
            "\1\u00be",
            "\1\u00bf\5\uffff\1\u00c0",
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
            "\12\u008a\10\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c\22\uffff\1\u008a\2\uffff\1\u008c\1\uffff\3\u008c\5\uffff\1\u008c",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0\3\uffff\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0105",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0107",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011f\16\uffff\1\u011e",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u014d",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u014f",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0174",
            "",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u017d",
            "\1\u017e",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0180",
            "\1\u0181",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u018b",
            "\1\u018c",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\67\13\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
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
            return "1:1: Tokens : ( Hardwarecomponent | Softwarecomponent | GroupConnector | PortConnector | FunctionPort | InputVoltage | Synchronized | AllocatedTo | Instanceof | PortGroup | PowerPort | Direction | Extension | Actuator | Default | Extends | Finally | Sensor | Import | Return | Static | Switch | Typeof | Catch | False | Inout | Super | Throw | While | Node | Root | UUID | Case | Else | Null | True | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | For | New | Out | Try | Val | Var | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AsteriskAsterisk | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | SolidusEqualsSign | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | QuestionMarkColon | As | Do | If | In | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='h') ) {s = 1;}

                        else if ( (LA21_0=='s') ) {s = 2;}

                        else if ( (LA21_0=='G') ) {s = 3;}

                        else if ( (LA21_0=='P') ) {s = 4;}

                        else if ( (LA21_0=='F') ) {s = 5;}

                        else if ( (LA21_0=='i') ) {s = 6;}

                        else if ( (LA21_0=='a') ) {s = 7;}

                        else if ( (LA21_0=='d') ) {s = 8;}

                        else if ( (LA21_0=='e') ) {s = 9;}

                        else if ( (LA21_0=='A') ) {s = 10;}

                        else if ( (LA21_0=='f') ) {s = 11;}

                        else if ( (LA21_0=='S') ) {s = 12;}

                        else if ( (LA21_0=='r') ) {s = 13;}

                        else if ( (LA21_0=='t') ) {s = 14;}

                        else if ( (LA21_0=='c') ) {s = 15;}

                        else if ( (LA21_0=='w') ) {s = 16;}

                        else if ( (LA21_0=='N') ) {s = 17;}

                        else if ( (LA21_0=='R') ) {s = 18;}

                        else if ( (LA21_0=='U') ) {s = 19;}

                        else if ( (LA21_0=='n') ) {s = 20;}

                        else if ( (LA21_0=='!') ) {s = 21;}

                        else if ( (LA21_0=='.') ) {s = 22;}

                        else if ( (LA21_0=='=') ) {s = 23;}

                        else if ( (LA21_0=='o') ) {s = 24;}

                        else if ( (LA21_0=='v') ) {s = 25;}

                        else if ( (LA21_0=='%') ) {s = 26;}

                        else if ( (LA21_0=='&') ) {s = 27;}

                        else if ( (LA21_0=='*') ) {s = 28;}

                        else if ( (LA21_0=='+') ) {s = 29;}

                        else if ( (LA21_0=='-') ) {s = 30;}

                        else if ( (LA21_0=='/') ) {s = 31;}

                        else if ( (LA21_0==':') ) {s = 32;}

                        else if ( (LA21_0=='<') ) {s = 33;}

                        else if ( (LA21_0=='>') ) {s = 34;}

                        else if ( (LA21_0=='?') ) {s = 35;}

                        else if ( (LA21_0=='|') ) {s = 36;}

                        else if ( (LA21_0=='#') ) {s = 37;}

                        else if ( (LA21_0=='(') ) {s = 38;}

                        else if ( (LA21_0==')') ) {s = 39;}

                        else if ( (LA21_0==',') ) {s = 40;}

                        else if ( (LA21_0==';') ) {s = 41;}

                        else if ( (LA21_0=='[') ) {s = 42;}

                        else if ( (LA21_0==']') ) {s = 43;}

                        else if ( (LA21_0=='{') ) {s = 44;}

                        else if ( (LA21_0=='}') ) {s = 45;}

                        else if ( (LA21_0=='0') ) {s = 46;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 47;}

                        else if ( (LA21_0=='^') ) {s = 48;}

                        else if ( (LA21_0=='$'||(LA21_0>='B' && LA21_0<='E')||(LA21_0>='H' && LA21_0<='M')||LA21_0=='O'||LA21_0=='Q'||LA21_0=='T'||(LA21_0>='V' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='b'||LA21_0=='g'||(LA21_0>='j' && LA21_0<='m')||(LA21_0>='p' && LA21_0<='q')||LA21_0=='u'||(LA21_0>='x' && LA21_0<='z')) ) {s = 49;}

                        else if ( (LA21_0=='\"') ) {s = 50;}

                        else if ( (LA21_0=='\'') ) {s = 51;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 52;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='@'||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 53;}

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