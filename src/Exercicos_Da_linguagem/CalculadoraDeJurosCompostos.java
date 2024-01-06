package Exercicos_Da_linguagem;

import java.util.Scanner;

public class CalculadoraDeJurosCompostos {
    
    // Crie um programa que calcule o valor futuro de um investimento com juros
    // compostos.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double juros;
        double montante;
        double Capital;
        double TaxaDeJuros = 0;
        double valorDoCalculo;
        double resultadoDoCalculo;
        int anoTempo;
        int mesesTempo;
        double i = 0;
        int tempoDigitadoPeloUsuario;
        int anos = 2;
        int meses = 1;

        System.out.print("--------------------------------------------------------\n");
        System.out.println(" Seja bem vindo ao sistema de calculo de juros Simples ");
        System.out.print("--------------------------------------------------------\n\n");

        System.out.println("Poderia digitar o valor do capital: ");
        Capital = input.nextInt();

        System.out.println("\nvc pode digitar o valor da taxa de juros que é cobrando para vc em porcentagem: ");
        i = input.nextInt();

        System.out
                .print("\nO valor do tempo que de invertimento é de Meses ou Anos?\n\n1.meses \n2.anos\n\nDigite a Opção: ");
        tempoDigitadoPeloUsuario = input.nextInt();

        if (tempoDigitadoPeloUsuario == meses) {

            System.out.println("\nDigite o valor do tempo em meses: ");
            mesesTempo = input.nextInt();

            TaxaDeJuros = i / 100;

            // Usando Math.pow para calcular a potência
            valorDoCalculo = Math.pow(1 + TaxaDeJuros, mesesTempo);

            // Convertendo o resultado para um número inteiro
            resultadoDoCalculo = (int)valorDoCalculo;

            montante = Capital * resultadoDoCalculo;

            juros = montante - Capital;

            System.out.println("\no valor do montante é de: " + montante + "\n");

            System.out.println("valor do juros compostos em meses é de: " + juros + "\n");

        }

        else if (tempoDigitadoPeloUsuario == anos) {

            int conversaoDeMeses;

            System.out.println("\nDigite o tempo em anos: ");
            anoTempo = input.nextInt();

            conversaoDeMeses = anoTempo * 12;

            TaxaDeJuros = i / 100;

            // Usando Math.pow para calcular a potência
            valorDoCalculo = Math.pow(1 + TaxaDeJuros, conversaoDeMeses);

            // Convertendo o resultado para um número inteiro
            resultadoDoCalculo = (int)valorDoCalculo;

            montante = Capital * resultadoDoCalculo;

            juros = montante - Capital;

            System.out.println("o valor do montante é de: " + montante + "\n");

            System.out.println("valor do juros compostos em anos é de: " + juros + "\n");

        }

        System.out.println("final do Sistema de Juros Simples\n");
    }
}
