# Geração de Código

A partir do exemplo de geração de código (especificação ByaccJ) disponibilizado na página da disciplina,
complementar esta especificação com as seguintes estruturas (com a respectiva geração de código). Note
que os primeiros 3 item são obrigatórios (e relativamente triviais) e obrigatórios para poder testar os casos
disponibilizados para o comando “for”.
1. transformar o “comando” de atribuição em uma “expressão” de atribuição
2. acrescentar operadores de pré e pós-incremento e atribuição por adição (+=)
3. acrescentar os comandos “break” e “continue”
4. acrescentar o comando “for”

# Execução

## Linux:
```
chmod +x ./yacc.linux
chmod +x ./run.x
```
**compile flex**
- java -jar JFlex.jar <file_name>.flex

**compile yacc**
- ./yacc.linux -tv -J <file_name>.y

**compile Parser**
- javac Parser.java
- java Parser <file_example>.cmm

Os passos anteriores podem ser subtituídos pelo Makefile disponibilizado, através do comando *Make*.

**generate binary using assembly file**
- sh run.x <file_example>.cmm
- ./<file_example>

## Testes 
Observação1: Os arquivos de teste além de sua descrição '.cmm' estarão com seu assembly '.s' e o binário '.s'. Para recompilar, basta remover os arquivos '.s' e '.o', rodando novamento o script ./run.x.

Observação2: Além dos arquivos <TESTE>.cmm também estarão disponíveis os arquivos de exemplo original do projeto na pasta 'testes'. Para rodá-los é precisa transferir pro mesmo diretório do Parser.

* **arquivo *TESTE.cmm***: este programa tem um laço aninhado com um **comando 'break'**. O objetivo é demonstrar o funcionamento do break de forma que a variável 'b' que é incrementada no laço mais de dentro deve terminar com o mesmo valor de 'a'. 'a' é uma variável incrementada no laço mais de forma.
* **arquivo *TESTE2.cmm***: este programa tem um **'for'** simples que imprime todos os valores de 'a', menos quando 'a' é igual a 2. Se a variável 'a' é igual a 2 o programa cai na **comando 'continue'** o que impede o mesmo de imprimir o valor de 'a' e assinala como 'skipped'.