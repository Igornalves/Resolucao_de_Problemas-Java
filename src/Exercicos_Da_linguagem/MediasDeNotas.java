package Exercicos_Da_linguagem;

import java.util.Scanner;

public class MediasDeNotas {

    // Escreva um programa que calcule a média de notas de um aluno em um conjunto
    // de disciplinas.
    
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, nota5;
        double resultadoDaMedia;
        double somaMediaSemestral;
        double media = 5.5;

        System.out.print("---------------------------------------------------\n");
        System.out.println("|| Seja Bem Vindo Ao Sistema de Notas Semestrais ||");
        System.out.print("---------------------------------------------------\n");

        System.out.println(
                "\nAqui abaixo vc poderia digitar cada nota do aluno na qual fez a materia do mes para que possa ser feito o calculo !!!");

        System.out.print("\ndigite sua Primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("\ndigite sua Segundo nota: ");
        nota2 = input.nextDouble();

        System.out.print("\ndigite sua Terceira nota: ");
        nota3 = input.nextDouble();

        System.out.print("\ndigite sua Quarta nota: ");
        nota4 = input.nextDouble();

        System.out.print("\ndigite sua Quarta nota: ");
        nota5 = input.nextDouble();

        somaMediaSemestral = nota1 + nota2 + nota3 + nota4 + nota5;

        resultadoDaMedia = somaMediaSemestral / 5;

        if (resultadoDaMedia >= media) {
            System.out.print("\n\n------------------------------------------");
            System.out.println("\n\nAluno Aprovado Com Sucesso !!!\n");
            System.out.print("------------------------------------------\n\n");

        } else {
            System.out.print("\n\n----------------------------------------------");
            System.out.println("\n\nAluno Não Aprovado no Semestre !!!\n");
            System.out.print("----------------------------------------------\n\n");
        }
    }
}
