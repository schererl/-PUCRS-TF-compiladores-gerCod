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

  