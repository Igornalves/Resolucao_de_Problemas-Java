package Exercicos_Da_linguagem;

import java.util.Scanner;

public class NumerosPares {

    // Escreva um programa que calcule a soma de todos os números pares de 1 a 100.
    
    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);

        int num;
        int restoDivisão;

        System.out.print("Digite um numero: ");
        num = ler.nextInt();

        restoDivisão = num % 2;

        if (restoDivisão == 0) {

            System.out.println("\neste numero é Par !!!");

        }
        else{
            System.out.println("\nEste numero não é par !!!\n");
        }

    }
}
