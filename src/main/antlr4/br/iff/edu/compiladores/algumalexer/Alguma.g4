grammar Alguma;            

PALAVRAS_CHAVES: 'CRIARPAGINA' | 'FIMPAGINA' | 'CABECA' | 'MENU' | 'LINK' | 'FIM_MENU' | 'SELO' | 'FIM_CABECA' | 'CORPO' | 'IMAGEM' | 'TEXTO' | 'TITULO' | 'PARAGROFO' | 'FIM_TEXTO' | 'FIM_CORPO' | 'PERNAS' | 'ICONE' | 'PARAGRAFO' | 'FIM_PERNAS'| 'preto';

NUMINT: ('0'..'9')+;

NUMREAL: ('0'..'9')+ ('.' ('0'..'9')+)?;
	
VARIAVEL: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\'';
	
OP_ARIT1: '+' | '-';

OP_ARIT2: '*' | '/';

OP_BOOL: 'E' | 'OU';

fragment
ESC_SEQ: '\\\'';

OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';

COMENTARIO: '%' ~('\n'|'\r')* '\r'? '\n' {skip();};

WS: ( ' ' |'\t' | '\r' | '\n') {skip();};

page: 'CRIARPAGINA''('temas')'
        bloco_pagina
      'FIM'EOF;

temas: CADEIA;

bloco_pagina: header? corpo? pernas?;

header: 'CABECA'  '('')'
        
        'FIM';

menu: 'MENU';

corpo: 'CORPO' '('')' 
        
       'FIM';

pernas: 'PERNAS' '('')' 
        
        'FIM';
