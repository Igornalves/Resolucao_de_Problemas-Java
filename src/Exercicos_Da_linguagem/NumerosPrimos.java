package Exercicos_Da_linguagem;

import java.util.Scanner;

public class NumerosPrimos {
    
    // Escreva um programa que determine e imprima todos os números primos no
    // intervalo de 1 a 100.

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        int m;
        int resultado, resultado2;

        System.out.print("Digite um numero: ");
        m = ler.nextInt();

        resultado = m / m;

        resultado2 = m / 1;

        if (m == resultado) {
            System.out.println("este numero é primo");
        } else if (m == resultado2) {
            System.out.println("este numero é primo");
        } else {
            System.out.println("este numero não é primo");
        }
    }

}
