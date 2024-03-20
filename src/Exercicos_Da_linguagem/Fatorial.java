package Exercicos_Da_linguagem;

import java.util.Scanner;

// Escreva um programa que calcule o fatorial de um número inteiro não negativo.

// criando um metodo recursivo que faz o calculo de fatorial

public class Fatorial {

    public int fatorial(int n) {

        System.out.printf("\n" + n + "x %d", n);        

        if (n == 1) {
            return n;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Fatorial f = new Fatorial(); 

        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);

        System.out.print("digite o numero para saber seu fatorial: ");
        f.fatorial(ler.nextInt());

        System.out.println("\n\nvalor do calculo do fatorial é: " + f.fatorial(ler.nextInt())+ "\n");
    }
}
