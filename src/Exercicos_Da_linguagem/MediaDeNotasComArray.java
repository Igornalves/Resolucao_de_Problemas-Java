package Exercicos_Da_linguagem;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeNotasComArray {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        double somaMediaSemestral;
        double resultadoDaMedia;
        double media = 7.0;

        for(int num =1 ; num <= 4 ; num++){
            System.out.print("\n");
            System.out.print("digite sua nota referente ao mes "+num+": ");
            notas.add(input.nextDouble());
        }

        System.out.println("\n");

        for(int g =1 ; g < notas.size(); g++){
            System.out.println("\nsua nota no mes "+g+ " foi de: "+notas.get(g));
        }

        somaMediaSemestral = notas.get(0)+ notas.get(1)+notas.get(2)+notas.get(3);

        resultadoDaMedia = somaMediaSemestral / 4;

        System.out.println("\n\nsua media foi no total de: "+resultadoDaMedia);

        if (resultadoDaMedia >= media) {

            System.out.println("\n\nvc esta aprovado neste semestre !!! \nmeus parabens !!!\n\n");
            
        }else if (resultadoDaMedia < media) {

            System.out.println("\n\nvc não estar aprovado neste semestre \ninfelizmente vc deve estudar mais\n\n ");
            
        }
    }
}
