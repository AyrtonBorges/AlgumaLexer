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

page: 'CRIARPAGINA''('')' // Feito
        (header)?
        (corpo)?
        (pernas)?
      'FIM'EOF;

header: 'CABECA''('')' // Feito
        menu?
        (funcoes)*
        'FIM';

corpo: 'CORPO''('')' // Feito
        (funcoes)*
       'FIM';

pernas: 'PERNAS''('')' // Feito
        (pequenas_ocasioes)*
        'FIM';

funcoes: (selo|image|texto|valor_texto|link|formulario|link|pularlinha);

pequenas_ocasioes: (selo|botao|paragrafo|titulo);

menu: 'MENU''('')' // Feito
        (pequenas_ocasioes)*
      'FIM';

botao: 'BOTAO''('url','string')';

formulario: 'FORMULARIO''('string','string','string')' // Feito
                (formulario_entrada)*
                (botao_corpo)*
            'FIM'; 

formulario_entrada: (entrada_texto|entrada|pularlinha);

entrada_texto: 'ROTULO''('string')'; // Feito

pularlinha: 'PULARLINHA()'; // Feito

botao_corpo: 'BOTAO''('string')'; // Feito
    
entrada:'ENTRADA''('string','string')'; // Feito

link: 'LINK''('url','string')'; // Feito

texto:  'TEXTO''('')'
            (valor_texto)*
        'FIM';

valor_texto: (titulo|paragrafo|pularlinha);

titulo: 'TITULO''('string')';

paragrafo: 'PARAGRAFO''('string')';
    
string: CADEIA;

selo: 'SELO''('url','POSICAO')';

image:  'IMAGEM''('url','string','string')';

url:CADEIA;

tema:CADEIA;