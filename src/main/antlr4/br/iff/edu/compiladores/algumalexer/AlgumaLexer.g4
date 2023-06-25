lexer grammar AlgumaLexer;

PALAVRAS_CHAVES: 'criarPagina' | 'fimPagina' | 'criarBotao' | 'criarTexto';

NUMINT: ('+'|'-')? ('0'..'9')+;

NUMREAL: ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;

VARIAVEL: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA: '\'' (ESC_SEQ | ~('\''|'\\'))* '\'';

fragment
ESC_SEQ: '\\\'';

OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';

DELIM: ':';

ABREPAR: '(';

FECHAPAR: ')';

WS: (' ' | '\t' | '\r' | '\n') -> skip;