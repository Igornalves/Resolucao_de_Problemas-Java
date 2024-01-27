package Exercicos_Da_linguagem;

public class PrefixoComumMaisLongo {
    public static void main(String[] args) {

        // Escreva uma função para encontrar a string de prefixo comum mais longa entre
        // uma matriz de strings.
        // Se não houver prefixo comum, retorne uma string vazia "".

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        System.out.println("array de numero 1: \n");

        for (int i = 0; i < num1.length; i++) {
            ;
            num1[i] = (int) (Math.random() * 50);
            System.out.println(num1[i]);
        }

        System.out.println("\narray de numero 2: \n");

        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) (Math.random() * 50);
            System.out.println(num2[i]);
        }

        int[] mesclandoArray = new int[num1.length + num2.length];

        System.out.println("\nfazendo a mesclagem e organização do arrays mesclado: \n");

        System.arraycopy(num1, 0, mesclandoArray, 0, num1.length);
        System.arraycopy(num2, 0, mesclandoArray, num1.length, num2.length);

        InsertSort(mesclandoArray);

        for (int t = 0; t < mesclandoArray.length; t++) {
            System.out.println(mesclandoArray[t]);
        }

        // Arrays.sort(mesclandoArray);

        // for(int t =0; t < mesclandoArray.length; t++){
        // System.out.println(mesclandoArray[t]);
        // }

        System.out.println("\n");

    }

    private static void InsertSort(int[] arrayDeEntrada) {
        int j;
        int chave;
        int i;

        for (j = 1; j < arrayDeEntrada.length; j++) {
            chave = arrayDeEntrada[j];

            for (i = j - 1; (i >= 0) && (arrayDeEntrada[i] > chave); i--) {
                arrayDeEntrada[i + 1] = arrayDeEntrada[i];
            }

            arrayDeEntrada[i + 1] = chave;
        }
    }
}
