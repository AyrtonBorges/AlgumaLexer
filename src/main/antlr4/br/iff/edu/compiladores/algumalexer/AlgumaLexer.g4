lexer grammar AlgumaLexer;            

PALAVRAS_CHAVES: 'CRIARPAGINA' | 'FIMPAGINA' | 'CABECA' | 'MENU' | 'LINK' | 'FIM_MENU' | 'SELO' | 'FIM_CABECA' | 'CORPO' | 'IMAGEM' | 'TEXTO' | 'TITULO' | 'PARAGROFO' | 'FIM_TEXTO' | 'FIM_CORPO' | 'PERNAS' | 'ICONE' | 'PARAGRAFO' | 'FIM_PERNAS'| 'preto';

CARACTERE: ('a'..'z'|'A'..'Z'|'0'..'9' | '!' | '@' | '#' | '$' | '%' | '&' | '*' | ',' | '.');

STRING: '“'CARACTERE+'”';    
    
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

page: 'CRIARPAGINA''('')'
        header
        corpo
        pernas
      'FIM_PAGINA'EOF;

header: 'CABECA''('STRING')'
            
        'FIM_CABECA';

corpo: 'CORPO''('STRING')'
    
        'FIM_CORPO';

pernas: 'PERNAS''('STRING')'

        'FIM_PERNAS';

menu: 'MENU''('NUMINT')'
        (link)
      'FIM_MENU';

cabeca_funcao: PALAVRAS_CHAVES ABREPAR atributo (',' atributo)* FECHAPAR

               PALAVRAS_CHAVES;

atributo: STRING | NUMINT ;

link: 'LINK''('STRING','STRING')';