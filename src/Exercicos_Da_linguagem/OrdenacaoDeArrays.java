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

        System.out.println("\n");
        
        for(int h =0 ; h < Listascores.size() ; h++){
            Collections.sort(Listascores);
            System.out.println("cor de numero "+h+": "+Listascores.get(h));
        }
        
        // System.out.println("nome da cor numero 1: "+Listascores.get(0));
        // System.out.println("nome da cor numero 2: "+Listascores.get(1));
        // System.out.println("nome da cor numero 3: "+Listascores.get(2));
        // System.out.println("nome da cor numero 4: "+Listascores.get(3));

        System.out.println("\n");
    }
}
