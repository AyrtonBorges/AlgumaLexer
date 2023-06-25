// Generated from br\iff\edu\compiladores\algumalexer\AlgumaLexer.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRAS_CHAVES=1, NUMINT=2, NUMREAL=3, VARIAVEL=4, CADEIA=5, OP_REL=6, 
		DELIM=7, ABREPAR=8, FECHAPAR=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRAS_CHAVES", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "ESC_SEQ", 
			"OP_REL", "DELIM", "ABREPAR", "FECHAPAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRAS_CHAVES", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "OP_REL", 
			"DELIM", "ABREPAR", "FECHAPAR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\n\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000@\b\u0000\u0001\u0001"+
		"\u0003\u0001C\b\u0001\u0001\u0001\u0004\u0001F\b\u0001\u000b\u0001\f\u0001"+
		"G\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0002\u0004\u0002N\b\u0002\u000b"+
		"\u0002\f\u0002O\u0001\u0002\u0001\u0002\u0004\u0002T\b\u0002\u000b\u0002"+
		"\f\u0002U\u0001\u0003\u0001\u0003\u0005\u0003Z\b\u0003\n\u0003\f\u0003"+
		"]\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004\n\u0004"+
		"\f\u0004e\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n"+
		"\u0001\u0000\u0005\u0002\u0000++--\u0002\u0000AZaz\u0003\u000009AZaz\u0002"+
		"\u0000\'\'\\\\\u0003\u0000\t\n\r\r  \u008e\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003B\u0001"+
		"\u0000\u0000\u0000\u0005J\u0001\u0000\u0000\u0000\u0007W\u0001\u0000\u0000"+
		"\u0000\t^\u0001\u0000\u0000\u0000\u000bh\u0001\u0000\u0000\u0000\rt\u0001"+
		"\u0000\u0000\u0000\u000fv\u0001\u0000\u0000\u0000\u0011x\u0001\u0000\u0000"+
		"\u0000\u0013z\u0001\u0000\u0000\u0000\u0015|\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005c\u0000\u0000\u0018\u0019\u0005r\u0000\u0000\u0019\u001a\u0005"+
		"i\u0000\u0000\u001a\u001b\u0005a\u0000\u0000\u001b\u001c\u0005r\u0000"+
		"\u0000\u001c\u001d\u0005P\u0000\u0000\u001d\u001e\u0005a\u0000\u0000\u001e"+
		"\u001f\u0005g\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000"+
		"!@\u0005a\u0000\u0000\"#\u0005f\u0000\u0000#$\u0005i\u0000\u0000$%\u0005"+
		"m\u0000\u0000%&\u0005P\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005g\u0000"+
		"\u0000()\u0005i\u0000\u0000)*\u0005n\u0000\u0000*@\u0005a\u0000\u0000"+
		"+,\u0005c\u0000\u0000,-\u0005r\u0000\u0000-.\u0005i\u0000\u0000./\u0005"+
		"a\u0000\u0000/0\u0005r\u0000\u000001\u0005B\u0000\u000012\u0005o\u0000"+
		"\u000023\u0005t\u0000\u000034\u0005a\u0000\u00004@\u0005o\u0000\u0000"+
		"56\u0005c\u0000\u000067\u0005r\u0000\u000078\u0005i\u0000\u000089\u0005"+
		"a\u0000\u00009:\u0005r\u0000\u0000:;\u0005T\u0000\u0000;<\u0005e\u0000"+
		"\u0000<=\u0005x\u0000\u0000=>\u0005t\u0000\u0000>@\u0005o\u0000\u0000"+
		"?\u0017\u0001\u0000\u0000\u0000?\"\u0001\u0000\u0000\u0000?+\u0001\u0000"+
		"\u0000\u0000?5\u0001\u0000\u0000\u0000@\u0002\u0001\u0000\u0000\u0000"+
		"AC\u0007\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DF\u000209\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0004\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LN\u000209\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O"+
		"M\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0005.\u0000\u0000RT\u000209\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V\u0006\u0001\u0000\u0000\u0000W[\u0007\u0001\u0000\u0000XZ\u0007"+
		"\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\b\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^c\u0005\'\u0000\u0000_b\u0003\u000b"+
		"\u0005\u0000`b\b\u0003\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fg\u0005\'\u0000\u0000g\n\u0001\u0000\u0000\u0000hi\u0005\\\u0000\u0000"+
		"ij\u0005\'\u0000\u0000j\f\u0001\u0000\u0000\u0000ku\u0005>\u0000\u0000"+
		"lm\u0005>\u0000\u0000mu\u0005=\u0000\u0000nu\u0005<\u0000\u0000op\u0005"+
		"<\u0000\u0000pu\u0005=\u0000\u0000qr\u0005<\u0000\u0000ru\u0005>\u0000"+
		"\u0000su\u0005=\u0000\u0000tk\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000"+
		"\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000tq\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\u000e\u0001\u0000\u0000\u0000"+
		"vw\u0005:\u0000\u0000w\u0010\u0001\u0000\u0000\u0000xy\u0005(\u0000\u0000"+
		"y\u0012\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{\u0014\u0001\u0000"+
		"\u0000\u0000|}\u0007\u0004\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0006\n\u0000\u0000\u007f\u0016\u0001\u0000\u0000\u0000\u000b\u0000?"+
		"BGJOU[act\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}