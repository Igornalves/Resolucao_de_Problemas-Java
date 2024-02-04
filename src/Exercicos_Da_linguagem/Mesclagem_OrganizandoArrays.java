package Exercicos_Da_linguagem;

public class Mesclagem_OrganizandoArrays {

    // Auxiliar Dada duas listas vinculadas classificadas que consistem em nós N e M  , respectivamente. A tarefa é mesclar ambas as listas (no lugar) e retornar o cabeçalho da lista mesclada.
    
    // Entrada: a: 5->10->15, b: 2->3->20
    // Saída: 2->3->5->10->15->20
    
    // Entrada: a: 1->1, b: 2->4
    // Saída: 1->1->2->4

	public static void main(String[] args) {
        
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        System.out.println("\narray de numero 1: ");

        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) (Math.random() * 50);
            System.out.print(num1[i]+" ");
        }

        System.out.println("\n\narray de numero 2: ");

        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) (Math.random() * 50);
            System.out.print(num2[i]+" ");
        }

        int[] mesclandoArray = new int[num1.length + num2.length];

        System.out.println("\n\nfazendo a mesclagem dos arrays: ");
        
        System.arraycopy(num1, 0, mesclandoArray, 0, num1.length);
        System.arraycopy(num2, 0, mesclandoArray, num1.length, num2.length);
        
        for (int t = 0; t < mesclandoArray.length; t++) {
            System.out.print(mesclandoArray[t]+" ");
        }
        
        System.out.println("\n\nfazendo a organizacao dos arrays mesclados: ");
        
        InsertSort(mesclandoArray);
        
        for (int t = 0; t < mesclandoArray.length; t++) {
            System.out.print(mesclandoArray[t]+" ");
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

