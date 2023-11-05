package Exercicos_Da_linguagem;

import java.security.SecureRandom;

public class MatrizDeArrays {
    public static void main(String[] args) {

        // este programa estaremos usado a ideia de array para estrutura dados de interios para que eles possam fica organizados 
        
        final int linha = 6;
        final int coluna = 6;

        int[][] numero = new int[linha][coluna];

        // usamos SecureRandom no caso ai para que ele gere números aleatórios considerados seguros e resistentes a ataques de forma que possa funcionar em nosso sistema de geração de matriz

        for(int w = 0 ; w < linha ; w++){
            for(int q = 0; q < coluna ; q++){
                numero[w][q] = new SecureRandom().nextInt(100);
            }
        }

        for(int d = 0 ; d < linha ; d++){
            for(int b = 0; b < coluna ; b++){
                System.out.printf(" %d | ",numero[d][b]);
            }
            System.out.print("\n");
        }
    }




}
