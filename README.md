# Fundamentos da linguagem Java

Este repositorio tem como intuito trazer conhecimentos aprendidos sobre a ***tecnologia Java*** que é uma ***linguagem de programação*** amplamente utilizada, conhecida por sua ***sintaxe simples e robusta***. 


<div align="center" style="display: inline_block">
<img  alt="java" width="190" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
</div>
<br>

## Sintaxe do Java

A sintaxe do Java refere-se às regras e estrutura que devem ser seguidas ao escrever código nesta linguagem ou em qualquer outra. 

### Declaração de Pacotes e Importações: 

- Todo arquivo Java começa com a declaração do pacote, seguido pelas importações de outras classes que serão usadas no código.

```java
package com.exemplo.projeto;
import java.util.ArrayList;
```

### Declaração de Classes e Métodos:

As classes são a estrutura básica de um programa Java e contêm métodos que definem seu comportamento. Os métodos são blocos de código que realizam tarefas específicas.

```java
public class MinhaClasse {
    public void meuMetodo() {
        // Código do método aqui
    }
}
```

### Variáveis e Tipos de Dados:

As variáveis em Java são utilizadas para armazenar dados. Existem diferentes tipos de dados em Java, como inteiros, ponto flutuante, booleanos, entre outros.

#### Variáveis Primitivas:

- ***int:*** Representa números inteiros de 32 bits, sem casas decimais.
- ***double:*** Representa números de ponto flutuante de precisão dupla de 64 bits.
- ***boolean:*** Representa valores verdadeiro ou falso (true ou false).
- ***char:*** Representa um único caractere Unicode de 16 bits.
- ***byte:*** Representa números inteiros de 8 bits.
- ***short:*** Representa números inteiros de 16 bits.
- ***long:*** Representa números inteiros longos de 64 bits.
- ***float:*** Representa números de ponto flutuante de precisão única de 32 bits.

#### Variáveis de Referência:

- ***String:*** Representa uma sequência de caracteres.
- ***Integer:*** Representa números inteiros, permitindo operações e métodos específicos.
- ***Double:*** Representa números de ponto flutuante de precisão dupla, com operações e métodos específicos.
- ***Boolean:*** Representa valores verdadeiro ou falso, com métodos para operações lógicas.
- ***Character:*** Representa um único caractere Unicode.
- ***Byte:*** Representa números inteiros de 8 bits.
- ***Short:*** Representa números inteiros de 16 bits.
- ***Long:*** Representa números inteiros longos de 64 bits.
- ***Float:*** Representa números de ponto flutuante de precisão única.

#### Arrays:

- ***int[], double[], boolean[]***, etc.: Representam arrays de tipos primitivos.
- ***String[], Integer[], Double[]***, etc.: Representam arrays de tipos de referência.

Exemplo de como fica essas variaveis em codigo java:

```java
// Tipos primitivos
int idade = 25;
double altura = 1.75;
boolean ehAlto = true;
char genero = 'M';

// Tipos de referência
String nome = "João";
Integer anoNascimento = 1997;
Double peso = 70.5;
Boolean temCarro = false;

// Arrays
int[] numeros = {1, 2, 3, 4, 5};
String[] nomes = {"Maria", "José", "Ana"};

// Uso de tipos primitivos como referência
Integer novaIdade = idade;
Double novaAltura = altura;
Boolean novoEhAlto = ehAlto;
```

## Estruturas de Controle:

Java oferece várias estruturas de controle, como if-else, loops (for, while, do-while) e switch-case, que permitem controlar o fluxo de execução do programa.

### Estruturas de Decisão:

- ***if:*** Permite executar um bloco de código se uma condição for verdadeira. Pode ser seguido por zero ou mais blocos else if e um bloco else opcional.

- ***switch:*** Permite selecionar um dos muitos blocos de código a serem executados, com base no valor de uma expressão.

### Estruturas de Repetição:

- ***while:*** Executa um bloco de código enquanto uma condição especificada for verdadeira. 
A condição é verificada antes de cada iteração.

- ***do-while:*** Executa um bloco de código uma vez e, em seguida, repete a execução enquanto uma condição especificada for verdadeira. A condição é verificada após cada iteração.

- ***for:*** Itera sobre uma sequência de valores ou elementos. Pode ser usado para percorrer arrays ou executar um bloco de código um número específico de vezes.

- ***enhanced for (foreach):*** Fornecem uma maneira mais simples de iterar sobre elementos em arrays e coleções, sem a necessidade de manter um contador ou índice explícito.

### Estruturas de Controle de Fluxo:

- ***break:*** Termina a execução do loop atual ou switch e transfere o controle para a próxima instrução fora do loop ou switch.

- ***continue:*** Interrompe a iteração atual de um loop e continua com a próxima iteração.

- ***return:*** Termina a execução de um método e retorna um valor opcional.

- ***throw:*** Lança uma exceção manualmente em um código.

### Estruturas de Controle de Exceção:

- ***try-catch:*** Permite lidar com exceções que podem ocorrer durante a execução de um bloco de código.

- ***finally:*** Define um bloco de código que será executado independentemente de ocorrer ou não uma exceção dentro do bloco try.

Exemplo de como fica essas variaveis em codigo java:

```java
// Estrutura de Decisão (if-else)
System.out.print("Digite um número: ");
int numero = scanner.nextInt();
if (numero > 0) {
    System.out.println("O número é positivo.");
} else if (numero < 0) {
    System.out.println("O número é negativo.");
} else {
    System.out.println("O número é zero.");
}

// Estrutura de Repetição (while)
int contador = 0;
while (contador < 3) {
    System.out.println("Contador: " + contador);
    contador++;
}

// Estrutura de Repetição (do-while)
contador = 0;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 3);

// Estrutura de Repetição (for)
for (int i = 0; i < 3; i++) {
    System.out.println("Contador: " + i);
}

// Estrutura de Repetição (enhanced for)
int[] numeros = {1, 2, 3};
for (int num : numeros) {
    System.out.println("Número: " + num);
}

// Estrutura de Controle de Fluxo (break e continue)
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // Pula a iteração atual
    }
    if (i == 4) {
        break; // Sai do loop
    }
    System.out.println("Valor: " + i);
}

// Estrutura de Controle de Exceção (try-catch-finally)
try {
    int resultado = 10 / 0; // Tentativa de divisão por zero
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Erro de divisão por zero: " + e.getMessage());
} finally {
    System.out.println("Bloco finally sempre é executado.");
}
```

A sintaxe do ***Java*** é estruturada e orientada a objetos, composta por declarações de pacotes e importações, definição de ***classes e métodos***, ***uso de variáveis***e ***tipos de dados***, ***estruturas de controle***, ***tratamento de exceções*** e conceitos de ***programação orientada a objetos***. 

É uma linguagem poderosa e flexível, amplamente utilizada no desenvolvimento de uma variedade de aplicativos, desde ***aplicativos da web*** até ***aplicativos móveis*** e ***sistemas empresariais***.





