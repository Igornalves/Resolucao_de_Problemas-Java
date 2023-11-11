package Exercicos_Da_linguagem;

public class ContagemRegressiva {
    public static void main(String[] args) {

        // Escreva um programa que faça uma contagem regressiva a partir de 10 até 1 e
        // depois imprima "Fogo!".

        for (int inicial = 10; inicial >= 1; inicial--) {
            System.out.println("a contagem é de: " + inicial + "\n");
        }
        System.out.println("Fogo!!!\n");
    }
}
