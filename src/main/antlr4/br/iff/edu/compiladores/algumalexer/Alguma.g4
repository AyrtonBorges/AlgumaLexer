grammar Alguma;            

PALAVRAS_CHAVES: 'CRIARPAGINA' | 'FIM' | 'CABECA' | 'MENU' | 'LINK' | 'FIM' | 'SELO' | 'FIM' | 'CORPO' | 'IMAGEM' | 'TEXTO' | 'TITULO' | 'PARAGROFO' | 'FIM' | 'FIM' | 'PERNAS' | 'ICONE' | 'PARAGRAFO' | 'FIM'| 'preto';

TAMANHO: 'p'|'m'|'g';

POSICAO: '1'|'2'|'3';

IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* | ('a'..'z')
;
DELIM: ':'
;
VIRGULA: ','
;
CADEIA: '"' ~('"'|'\n')* '"'
;
NUM_INT: ('0'..'9')+
;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?
;

fragment
ESC_SEQ	: '\\\''
;
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();}
;
WS : ( ' ' | '\t' | '\r' | '\n') {skip();}
;
CADEIA_ERR: '"' ~('"'|'\n')* '\n'
;
COMENTARIO_ERR:   '{' ~('\n'|'}'|'\r')* '\n'
;
ERRO: .
;

page: 'CRIARPAGINA''('')'
        header
        corpo
        pernas
      'FIM'EOF;

header: 'CABECA''('')'
        (funcoes)*
        'FIM';

menu: 'MENU''('')'

      'FIM';

corpo: 'CORPO''('')' 
        (funcoes)*
       'FIM';

pernas: 'PERNAS''('')' 
        (funcoes)*
        'FIM';

funcoes: selo|image|texto|valor_texto;

texto:  'TEXTO''('')'
            valor_texto*
        'FIM';

valor_texto: titulo|paragrafo;

titulo: 'TITULO''('string')';

paragrafo: 'PARAGRAFO''('string')';
    
string: CADEIA;

selo: 'SELO''('url','POSICAO')';

image:  'IMAGE''('url','TAMANHO')';

url:CADEIA;

tema:CADEIA;