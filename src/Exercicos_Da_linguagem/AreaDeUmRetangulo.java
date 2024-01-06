package Exercicos_Da_linguagem;

import java.util.Scanner;

public class AreaDeUmRetangulo {
    
    // crie um codigo que faça o calculo da Area de um retangulo com precisao.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base = 0;
        int altura = 0;

        System.out.println("");
        System.out.print("Digite o valor do base da area que vc quer calcular: ");
        base = input.nextInt();

        System.out.println("");
        System.out.print("Digite o valor do altura da area que vc quer calcular: ");
        altura = input.nextInt();

        System.out.println("\n");
        System.out.println("| os valor da base é " + base + " já o da altura é de " + altura + " |");

        if (base < 0 && altura > 0) {

            System.out.println("");
            System.out.println("-------------------------------------------------------");
            System.out.println("ERRO ERRO ERRO a Base devem ser positiva ERRO ERRO ERRO");
            System.out.println("-------------------------------------------------------");
            System.out.println("");

        } else if (base < 0 && altura < 0) {

            System.out.println("");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("ERRO ERRO ERRO A Altura e a Base devem ser positivos ERRO ERRO ERRO");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("");

        } else if (base > 0 && altura < 0) {

            System.out.println("");
            System.out.println("---------------------------------------------------------");
            System.out.println("ERRO ERRO ERRO a Altura devem ser positiva ERRO ERRO ERRO");
            System.out.println("---------------------------------------------------------");
            System.out.println("");

        }

        else {

            int resultado = base * altura;

            System.out.println("");
            System.out.println("O resultado da area no qual vc tem é de: " + resultado + " metros");

            System.out.println("");

        }
    }
}
