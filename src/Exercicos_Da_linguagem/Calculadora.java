package Exercicos_Da_linguagem;

import java.util.Scanner;

public class Calculadora {

    // Crie um programa que funcione como uma calculadora simples para realizar
    // operações de adição, subtração, multiplicação e divisão.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Numero1;
        int Numero2;
        int Resultado;
        int Escolha = 0;

        System.out.println("------------------------------------------");
        System.out.println("||Seja bem vindo a Calculadora em Java||");
        System.out.println("------------------------------------------");

        System.out.println("\nAqui vc vai poder fazer operações Simples de matematica nesse sistema simples\n");

        System.out.print("Por favor vc poderia digitar um numero: ");
        Numero1 = input.nextInt();

        System.out.print("\nVc tambem pode digitar outro numero: ");
        Numero2 = input.nextInt();

        System.out.print(
                "\nEscolha as Operações Matematica que vc deseja realizar no sistema \n\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n\nDigite: ");
        Escolha = input.nextInt();

        switch (Escolha) {

            case 1:
                Resultado = Numero1 + Numero2;
                System.out.println("\nO resultado da operação que vc escolheu foi de: " + Resultado + "\n");
                break;

            case 2:
                Resultado = Numero1 - Numero2;
                System.out.println("\nO resultado da operação que vc escolheu foi de: " + Resultado + "\n");
                break;

            case 3:
                Resultado = Numero1 * Numero2;
                System.out.println("\nO resultado da operação que vc escolheu foi de: " + Resultado + "\n");
                break;

            case 4:
                Resultado = Numero1 / Numero2;
                System.out.println("\nO resultado da operação que vc escolheu foi de: " + Resultado + "\n");
                break;

            default:
                System.out.println("\nErro Escolha Invalida !!! \nTente novamente !!!");
                break;
        }

    }
}
