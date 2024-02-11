package Exercicos_Da_linguagem;

import java.util.Scanner;

public class TabuadaParte2 {
    
    // Exercício 2: Crie um programa que peça ao usuário um número e, em seguida,
    // imprima a tabuada desse número de 1 a 10 usando um loop for.

    public static void main(String[] args) {


        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);

        int num;
        int resultado;

        System.out.print("vc poderia digita um numero para que possamos mostra a tabuada desse numero para vc: ");
        num = ler.nextInt();

        System.out.print("\n\n");

        System.out.println("A tabuada do numero " + num + " de multiplicaçao é : ");

        System.out.print("\n");

        for (int f = 0; f <= 10; f++) {
            resultado = num * f;
            System.out.println(num + " x " + f + " = " + resultado + "\n");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.print("\n\n");

        System.out.println("A tabuada do numero " + num + " de soma é : ");

        System.out.print("\n");

        for (int q = 0; q <= 10; q++) {
            resultado = num + q;
            System.out.println(num + " + " + q + " = " + resultado + "\n");
            try {
                Thread.sleep(500);
            } catch (Exception g) {
                g.printStackTrace();
            }
        }

        System.out.print("\n\n");

        System.out.println("A tabuada do numero " + num + " de subtração é : ");

        System.out.print("\n");

        for (int e = 0; e <= 10; e++) {
            resultado = num - e;
            System.out.println(num + " - " + e + " = " + resultado + "\n");
            try {
                Thread.sleep(500);
            } catch (Exception r) {
                r.printStackTrace();
            }
        }

        // System.out.print("\n\n");

        // System.out.println("A tabuada do numero " + num + " de divisão é : ");

        // System.out.print("\n");

        // for (int g = 0; g <= 10; g++) {
        // resultado = num / g;
        // System.out.println(num + " / " + g + " = " + resultado + "\n");
        // }

    }
}
