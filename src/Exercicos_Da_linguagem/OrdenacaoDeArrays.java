package Exercicos_Da_linguagem;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenacaoDeArrays {
    public static void main(String[] args) {

        // Escreva um programa que ordene um array de inteiros em ordem crescente ou
        // decrescente.

        Scanner ler = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        System.out.print("Digite uma cor favorita: ");
        cores.add(ler.nextLine());
        System.out.print("\nDigite segunda cor favorita: ");
        cores.add(ler.nextLine());
        System.out.print("\nDigite terceira cor favorita: ");
        cores.add(ler.nextLine());

        System.out.println("\n\ntodas as cores são \n" + cores + "\n");

        
    }
}
