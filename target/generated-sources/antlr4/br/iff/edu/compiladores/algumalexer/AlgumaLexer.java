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
		PAGE=1, HEADER=2, CORPO=3, PERNAS=4, MENU=5, LINK=6, CARACTERE=7, STRING=8, 
		NUMINT=9, NUMREAL=10, VARIAVEL=11, CADEIA=12, OP_REL=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAGE", "HEADER", "CORPO", "PERNAS", "MENU", "LINK", "CARACTERE", "STRING", 
			"NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "ESC_SEQ", "OP_REL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE", "HEADER", "CORPO", "PERNAS", "MENU", "LINK", "CARACTERE", 
			"STRING", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "OP_REL", "WS"
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
		"\u0004\u0000\u000e\u00da\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u009c\b\u0007"+
		"\u000b\u0007\f\u0007\u009d\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00a3"+
		"\b\b\u0001\b\u0004\b\u00a6\b\b\u000b\b\f\b\u00a7\u0001\t\u0003\t\u00ab"+
		"\b\t\u0001\t\u0004\t\u00ae\b\t\u000b\t\f\t\u00af\u0001\t\u0001\t\u0004"+
		"\t\u00b4\b\t\u000b\t\f\t\u00b5\u0001\n\u0001\n\u0005\n\u00ba\b\n\n\n\f"+
		"\n\u00bd\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c2\b\u000b"+
		"\n\u000b\f\u000b\u00c5\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00d5\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\u0000\u001b\r\u001d\u000e\u0001\u0000\u0006\b\u0000!!#&**,,."+
		".09@Zaz\u0002\u0000++--\u0002\u0000AZaz\u0003\u000009AZaz\u0002\u0000"+
		"\'\'\\\\\u0003\u0000\t\n\r\r  \u00e6\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003=\u0001"+
		"\u0000\u0000\u0000\u0005R\u0001\u0000\u0000\u0000\u0007e\u0001\u0000\u0000"+
		"\u0000\tz\u0001\u0000\u0000\u0000\u000b\u008c\u0001\u0000\u0000\u0000"+
		"\r\u0097\u0001\u0000\u0000\u0000\u000f\u0099\u0001\u0000\u0000\u0000\u0011"+
		"\u00a2\u0001\u0000\u0000\u0000\u0013\u00aa\u0001\u0000\u0000\u0000\u0015"+
		"\u00b7\u0001\u0000\u0000\u0000\u0017\u00be\u0001\u0000\u0000\u0000\u0019"+
		"\u00c8\u0001\u0000\u0000\u0000\u001b\u00d4\u0001\u0000\u0000\u0000\u001d"+
		"\u00d6\u0001\u0000\u0000\u0000\u001f \u0005C\u0000\u0000 !\u0005R\u0000"+
		"\u0000!\"\u0005I\u0000\u0000\"#\u0005A\u0000\u0000#$\u0005R\u0000\u0000"+
		"$%\u0005P\u0000\u0000%&\u0005A\u0000\u0000&\'\u0005G\u0000\u0000\'(\u0005"+
		"I\u0000\u0000()\u0005N\u0000\u0000)*\u0005A\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0005(\u0000\u0000,-\u0005)\u0000\u0000-.\u0003\u0003\u0001"+
		"\u0000./\u0003\u0005\u0002\u0000/0\u0003\u0007\u0003\u000001\u0005F\u0000"+
		"\u000012\u0005I\u0000\u000023\u0005M\u0000\u000034\u0005_\u0000\u0000"+
		"45\u0005P\u0000\u000056\u0005A\u0000\u000067\u0005G\u0000\u000078\u0005"+
		"I\u0000\u000089\u0005N\u0000\u00009:\u0005A\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0000\u0000\u0001<\u0002\u0001\u0000\u0000\u0000"+
		"=>\u0005C\u0000\u0000>?\u0005A\u0000\u0000?@\u0005B\u0000\u0000@A\u0005"+
		"E\u0000\u0000AB\u0005C\u0000\u0000BC\u0005A\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0005(\u0000\u0000EF\u0003\u000f\u0007\u0000FG\u0005)\u0000"+
		"\u0000GH\u0005F\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005M\u0000\u0000"+
		"JK\u0005_\u0000\u0000KL\u0005C\u0000\u0000LM\u0005A\u0000\u0000MN\u0005"+
		"B\u0000\u0000NO\u0005E\u0000\u0000OP\u0005C\u0000\u0000PQ\u0005A\u0000"+
		"\u0000Q\u0004\u0001\u0000\u0000\u0000RS\u0005C\u0000\u0000ST\u0005O\u0000"+
		"\u0000TU\u0005R\u0000\u0000UV\u0005P\u0000\u0000VW\u0005O\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0005(\u0000\u0000YZ\u0003\u000f\u0007\u0000"+
		"Z[\u0005)\u0000\u0000[\\\u0005F\u0000\u0000\\]\u0005I\u0000\u0000]^\u0005"+
		"M\u0000\u0000^_\u0005_\u0000\u0000_`\u0005C\u0000\u0000`a\u0005O\u0000"+
		"\u0000ab\u0005R\u0000\u0000bc\u0005P\u0000\u0000cd\u0005O\u0000\u0000"+
		"d\u0006\u0001\u0000\u0000\u0000ef\u0005P\u0000\u0000fg\u0005E\u0000\u0000"+
		"gh\u0005R\u0000\u0000hi\u0005N\u0000\u0000ij\u0005A\u0000\u0000jk\u0005"+
		"S\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000mn\u0003\u000f"+
		"\u0007\u0000no\u0005)\u0000\u0000op\u0005F\u0000\u0000pq\u0005I\u0000"+
		"\u0000qr\u0005M\u0000\u0000rs\u0005_\u0000\u0000st\u0005P\u0000\u0000"+
		"tu\u0005E\u0000\u0000uv\u0005R\u0000\u0000vw\u0005N\u0000\u0000wx\u0005"+
		"A\u0000\u0000xy\u0005S\u0000\u0000y\b\u0001\u0000\u0000\u0000z{\u0005"+
		"M\u0000\u0000{|\u0005E\u0000\u0000|}\u0005N\u0000\u0000}~\u0005U\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005(\u0000\u0000\u0080"+
		"\u0081\u0003\u0011\b\u0000\u0081\u0082\u0005)\u0000\u0000\u0082\u0083"+
		"\u0003\u000b\u0005\u0000\u0083\u0084\u0005F\u0000\u0000\u0084\u0085\u0005"+
		"I\u0000\u0000\u0085\u0086\u0005M\u0000\u0000\u0086\u0087\u0005_\u0000"+
		"\u0000\u0087\u0088\u0005M\u0000\u0000\u0088\u0089\u0005E\u0000\u0000\u0089"+
		"\u008a\u0005N\u0000\u0000\u008a\u008b\u0005U\u0000\u0000\u008b\n\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005L\u0000\u0000\u008d\u008e\u0005I\u0000"+
		"\u0000\u008e\u008f\u0005N\u0000\u0000\u008f\u0090\u0005K\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005(\u0000\u0000\u0092\u0093"+
		"\u0003\u000f\u0007\u0000\u0093\u0094\u0005,\u0000\u0000\u0094\u0095\u0003"+
		"\u000f\u0007\u0000\u0095\u0096\u0005)\u0000\u0000\u0096\f\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0007\u0000\u0000\u0000\u0098\u000e\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0005\u201c\u0000\u0000\u009a\u009c\u0003\r\u0006"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u201d\u0000"+
		"\u0000\u00a0\u0010\u0001\u0000\u0000\u0000\u00a1\u00a3\u0007\u0001\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a6\u000209\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u0012\u0001\u0000\u0000\u0000\u00a9\u00ab\u0007\u0001\u0000\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u000209\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0005.\u0000\u0000\u00b2\u00b4\u000209"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u0014\u0001\u0000\u0000\u0000\u00b7\u00bb\u0007\u0002\u0000"+
		"\u0000\u00b8\u00ba\u0007\u0003\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u0016\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c3\u0005\'\u0000\u0000"+
		"\u00bf\u00c2\u0003\u0019\f\u0000\u00c0\u00c2\b\u0004\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\'\u0000\u0000\u00c7\u0018"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\\\u0000\u0000\u00c9\u00ca\u0005"+
		"\'\u0000\u0000\u00ca\u001a\u0001\u0000\u0000\u0000\u00cb\u00d5\u0005>"+
		"\u0000\u0000\u00cc\u00cd\u0005>\u0000\u0000\u00cd\u00d5\u0005=\u0000\u0000"+
		"\u00ce\u00d5\u0005<\u0000\u0000\u00cf\u00d0\u0005<\u0000\u0000\u00d0\u00d5"+
		"\u0005=\u0000\u0000\u00d1\u00d2\u0005<\u0000\u0000\u00d2\u00d5\u0005>"+
		"\u0000\u0000\u00d3\u00d5\u0005=\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u001c\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0007\u0005\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0006\u000e\u0000\u0000\u00d9\u001e\u0001\u0000\u0000"+
		"\u0000\u000b\u0000\u009d\u00a2\u00a7\u00aa\u00af\u00b5\u00bb\u00c1\u00c3"+
		"\u00d4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}