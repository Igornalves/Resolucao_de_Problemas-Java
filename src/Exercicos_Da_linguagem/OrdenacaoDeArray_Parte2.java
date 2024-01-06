package Exercicos_Da_linguagem;

import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
// import java.util.Random;

public class OrdenacaoDeArray_Parte2 {

    //fazendo ordenação de array do tipo de inteiros
    
    public static void main(String[] args) {
        
        int[] numero = {1,5,7,3,4,9,8,2,0,6};

        Integer[] numerosDois = {1,5,7,3,4,9,8,2,0,6};

        // Random gerador = new Random();

        System.out.println("numeros antes da ordenacao: ");
        System.out.print("\n");

        for (int r = 0; r < 10 ; r++){
            // numero[r] = gerador.nextInt(25);
            System.out.print(numero[r]+" ");
        }

        System.out.print("\n");
        System.out.print("\n");
        
        Arrays.sort(numero);
        
        System.out.println("numero depois da ordenação crescente: ");
        System.out.print("\n");
        
        for(int r: numero){
            System.out.print(r + " ");
        }
        
        System.out.print("\n");
        System.out.print("\n");
        
        // for(int e = 0; e < 10; e++){
        //     System.out.print(numerosDois[e]+ " ");
        // }
        
        Arrays.sort(numerosDois,Collections.reverseOrder());
        
        System.out.println("numero depois da ordenação Decresente: ");
        System.out.print("\n");
        
        for(int e:numerosDois){
            System.out.print(e+" ");
        }

        System.out.print("\n");
        System.out.print("\n");
        
    }
}