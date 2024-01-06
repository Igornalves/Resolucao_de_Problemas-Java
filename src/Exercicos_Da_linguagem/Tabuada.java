package Exercicos_Da_linguagem;

import java.util.Scanner;

public class Tabuada {
    
    // Escreva um programa que imprima a tabuada de multiplicação de um número específico (por exemplo, 7).

    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);

        int num;
        int f =0;
        int resultado;

        System.out.println("com base no numero que vc digitar a gente vai mostra a tabuada dele para vc ok \n");
        System.out.print("vc poderia digita um numero: ");
        num = ler.nextInt();

        System.out.print("\n\n");

        System.out.println("A tabuada do numero " + num + " de multiplicaçao é : ");

        System.out.print("\n");

        // for (int f = 0; f <= 10; f++) {
        //     resultado = num + f;
        //     System.out.println(num + " + " + f + " = " + resultado + "\n");
        // }

        while (f <= 10) {
            resultado = num + f;
            System.out.println(num + " + " + f + " = " + resultado + "\n");

            try {
                Thread.sleep(600);
            } catch (Exception e) {
                e.printStackTrace();
            }

            f++;
        }
    }
}
