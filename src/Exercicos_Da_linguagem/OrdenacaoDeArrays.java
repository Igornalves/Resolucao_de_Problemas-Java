package Exercicos_Da_linguagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoDeArrays {
    public static void main(String[] args) {

        // Escreva um programa que ordene um array de inteiros em ordem crescente ou
        // decrescente.

        Scanner ler = new Scanner(System.in);
        ArrayList<String> Listascores = new ArrayList<>();

        System.out.print("Digite uma cor favorita: ");
        Listascores.add(ler.nextLine());

        System.out.print("\nDigite segunda cor favorita: ");
        Listascores.add(ler.nextLine());

        System.out.print("\nDigite terceira cor favorita: ");
        Listascores.add(ler.nextLine());

        System.out.print("\nDigite quarta cor favorita: ");
        Listascores.add(ler.nextLine());

        System.out.println("\n\ntodas as cores são \n" + Listascores + "\n");

        Collections.sort(Listascores);

        for(int D = 0; D <= 4 ; D++){
            System.out.println("o nome da cor é: \n" +Listascores+ "\n");
        }
    }
}
