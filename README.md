# CSL (Create Site Language) - Compilador de Português para HTML & CSS

![[Logo da Linguagem](link_para_logo.png) (se aplicável)](https://github.com/AyrtonBorges/AlgumaLexer/blob/main/target/csl.png?raw=true)

## Introdução

O CSL (Create Site Language) é um compilador que permite a transcrição da linguagem portuguesa para HTML & CSS. Desenvolvido por Ayrton e Edivan, o objetivo principal do CSL é facilitar o processo de criação de sites, permitindo que pessoas fluentes em português possam desenvolver páginas web sem a necessidade de aprender linguagens complexas, como HTML e CSS.

Com o CSL, é possível escrever o conteúdo de um site em um formato mais próximo da linguagem cotidiana, usando palavras e estruturas familiares. O compilador traduz essas instruções para HTML e CSS, que é a linguagem padrão para a criação de páginas web. Essa abordagem torna o desenvolvimento de sites mais acessível para iniciantes e para pessoas que não possuem um conhecimento aprofundado em programação.

O CSL oferece uma camada de abstração que simplifica a criação de elementos comuns em um site, como cabeçalhos, parágrafos, listas e imagens. Com essa ferramenta inovadora, Ayrton e Edivan possibilitaram a criação de sites de forma mais intuitiva e rápida, ampliando as possibilidades para pessoas interessadas em entrar no mundo do desenvolvimento web.

## Instalação

Descreva aqui como instalar a linguagem de programação em diferentes plataformas, por exemplo:

## Documentação

# Como utilizar o compilador
O código fornecido é um exemplo de utilização do compilador CSL para criar uma página web. A linguagem utilizada no código é uma representação simplificada do CSL, demonstrando a facilidade de criação de elementos HTML utilizando o idioma português.

```CSL
CRIARPAGINA()
    CABECA()
        MENU()
            BOTAO("inicio.html", "INICIO")
            BOTAO("login.html", "LOGIN")
            BOTAO("sobre.html", "SOBRE")
        FIM
    FIM
    CORPO()
        PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() 
        TEXTO()
            TITULO("Bem-vindo ao")
        FIM
        IMAGEM("csl.png", "128", "60")
        TEXTO()
            PARAGRAFO("< O compilador para todos os brasileiros! >")
        FIM
    FIM
    PERNAS()
        PARAGRAFO("© 2023 CSL (Create Site Language). Todos os direitos reservados à Ayrton e Edivan!")
    FIM
FIM
```
Explicação do Código

CRIARPAGINA(): Tem como objetivo identificar todo o corpo do código, assim, tudo que é passando dentro dele é devidamente compilado.

O código é composto por três principais seções: CABECA(), CORPO(), e PERNAS(). Cada uma dessas seções representa partes diferentes da página web final.

CABECA(): Essa seção é responsável pela criação da parte do NavBar (MENU()), e para outras tags que ficaram no topo.

CORPO(): Aqui é definido o corpo da página, que contém outros conteúdos visíveis, como texto, imagens e outros elementos.

PERNAS(): Nesta parte, são incluídos os elementos finais da página, como rodapé, direitos autorais ou outras informações relevantes.

Dentro de cada seção, há comandos específicos do CSL representados por funções como BOTAO(), TITULO(), IMAGEM(), e PARAGRAFO(). Essas funções têm como objetivo simplificar a criação de elementos HTML complexos, ocultando a necessidade de escrever diretamente em HTML ou CSS.

Esse é apenas um exemplo básico do que o CSL é capaz de fazer. Para aprender mais sobre o compilador e como usá-lo com mais recursos, consulte a documentação oficial disponível na pasta "docs" deste repositório.

[Documentação Completa](link_para_documentação)

## Exemplos

### Início:
```
CRIARPAGINA()
	CABECA()
		MENU()
            		BOTAO("inicio.html","INICIO")
			BOTAO("login.html","LOGIN")
			BOTAO("sobre.html","SOBRE")
		FIM
	FIM
	CORPO()
		PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() PULARLINHA() 
	        TEXTO()
			TITULO("Bem-vindo ao")
		FIM
			IMAGEM("csl.png","128","60")
		TEXTO()
			PARAGRAFO("< O compilador para todos os brasileiros! >")
		FIM
	FIM
	PERNAS()
		PARAGRAFO("© 2023 CSL (Create Site Language). Todos os direitos reservados à Ayrton e Edivan!")
	FIM
FIM
```
### Login:
```
CRIARPAGINA()
	CABECA()
		MENU()
			BOTAO("inicio.html","INICIO")
			BOTAO("login.html","LOGIN")
			BOTAO("sobre.html","SOBRE")
		FIM
	FIM	
	CORPO()
        	TEXTO()
          	  	TITULO("Página de Login")
        	FIM
		FORMULARIO("SEILA","post","SEILA")
			ROTULO("Nome:")
			ENTRADA("text","nome")
            		ROTULO("Senha:")
            		ENTRADA("password","senha")
			BOTAO("Enviar") 
		FIM
	FIM
	PERNAS()
		PARAGRAFO("© 2023 CSL (Create Site Language). Todos os direitos reservados à Ayrton e Edivan!")
	FIM
FIM
```
### Sobre:
```
CRIARPAGINA()
	CABECA()
		MENU()
			BOTAO("inicio.html","INICIO")
			BOTAO("login.html","LOGIN")
			BOTAO("sobre.html","SOBRE")
		FIM
	FIM
	CORPO()
        	TEXTO()
			TITULO("Sobre o CSL")
			PARAGRAFO("O CSL (Create Site Language) é um compilador que permite a transcrição da linguagem portuguesa para HTML. Esse compilador foi desenvolvido por Ayrton e Edivan. O objetivo principal do CSL é facilitar o processo de criação de sites, permitindo que pessoas que são fluentes em português possam desenvolver páginas web sem a necessidade de aprender linguagens complexas, como HTML e CSS. Com o CSL, é possível escrever o conteúdo de um site em um formato mais próximo da linguagem cotidiana, usando palavras e estruturas familiares. O compilador traduz essas instruções para HTML e CSS, que é a linguagem padrão para a criação de páginas web. Essa abordagem torna o desenvolvimento de sites mais acessível para iniciantes e para pessoas que não possuem um conhecimento aprofundado em programação. O CSL oferece uma camada de abstração que simplifica a criação de elementos comuns em um site, como cabeçalhos, parágrafos, listas e imagens. Com o CSL, Ayrton e Edivan proporcionaram uma ferramenta inovadora que permite a criação de sites de forma mais intuitiva e rápida, ampliando as possibilidades para pessoas interessadas em entrar no mundo do desenvolvimento web.")
		FIM
	FIM
	PERNAS()
		PARAGRAFO("© 2023 CSL (Create Site Language). Todos os direitos reservados à Ayrton e Edivan!")
	FIM
FIM
```

## Contribuindo

Ficaríamos felizes em receber contribuições para a linguagem de programação [Nome da Linguagem]! Se você quiser ajudar a melhorar a linguagem, corrigir bugs ou adicionar recursos, siga as diretrizes de contribuição no arquivo CONTRIBUTING.md deste repositório.

## Problemas

Se você encontrar problemas ao usar a linguagem, por favor, reporte-os no sistema de problemas do GitHub deste repositório.

## Comunidade

Compartilhe dicas, discussões e projetos relacionados à [Nome da Linguagem] na nossa comunidade:

- [Fórum](link_para_fórum)
- [Slack](link_para_slack)
- [Reddit](link_para_reddit)

## Licença

Descreva aqui a licença sob a qual a linguagem de programação é distribuída. Por exemplo:

Este projeto está licenciado sob a [Licença XYZ](link_para_licença). Leia o arquivo LICENSE.md para obter mais detalhes.

## Autores

Liste os principais autores e desenvolvedores da linguagem de programação.

## Agradecimentos

Se você deseja agradecer a alguém ou a alguma organização que contribuiu significativamente para o desenvolvimento da linguagem, faça-o aqui.

---

Esse é apenas um modelo básico para um README de uma linguagem de programação no GitHub. Sinta-se à vontade para personalizá-lo conforme necessário para a sua linguagem, adicionando mais detalhes específicos e seções relevantes. Lembre-se de manter o README sempre atualizado, pois ele é a porta de entrada para os usuários interessados em sua linguagem de programação.
