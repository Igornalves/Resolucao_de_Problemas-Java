package Exercicos_Da_linguagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoDeArrays {

    // Escreva um programa que ordene um array de inteiros em ordem crescente ou
    // decrescente.
    
    public static void main(String[] args) {


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
            System.out.println("nome da cor é "+h+": "+Listascores.get(h));
        }

        System.out.println("\n");
    }
}
