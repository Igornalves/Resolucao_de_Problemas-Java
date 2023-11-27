package Exercicos_Da_linguagem;

import java.util.Scanner;

public class Fatorial {

    // criando um metodo recursivo que faz o calculo de fatorial

    public int fatorial(int n) {
        System.out.printf("\n" + n + "x %d", n);
        if (n == 1) {
            return n;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {

        // Escreva um programa que calcule o fatorial de um número inteiro não negativo.

        Scanner ler = new Scanner(System.in);
        Fatorial f = new Fatorial();    

        System.out.println("digite o numero para saber seu fatorial: ");
        // f.fatorial(ler.nextInt());

        System.out.println("valor do calculo do fatorial é: " + f.fatorial(ler.nextInt()));
    }
}
