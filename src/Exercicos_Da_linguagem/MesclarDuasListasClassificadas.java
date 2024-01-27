package Exercicos_Da_linguagem;

public class MesclarDuasListasClassificadas {

    // Você recebe os cabeçalhos de duas listas vinculadas classificadas list1e list2.

    // Mesclar as duas listas em uma lista classificada . A lista deve ser feita unindo os nós das duas primeiras listas.

    // Retorne o cabeçalho da lista vinculada mesclada .

    // Exemplo 1:
    //     Entrada: lista1 = [1,2,4], lista2 = [1,3,4]
    //     Saída: [1,1,2,3,4,4]

    // Exemplo 2:
    //     Entrada: lista1 = [], lista2 = []
    //     Saída: []

    // Exemplo 3:
    //     Entrada: lista1 = [], lista2 = [0]
    //     Saída: [0]

    public static void main(String[] args) {
        
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

        for (int t = 0; t < mesclandoArray.length; t++) {
            System.out.println(mesclandoArray[t]);
        }

        // Arrays.sort(mesclandoArray);

        // for(int t =0; t < mesclandoArray.length; t++){
        // System.out.println(mesclandoArray[t]);
        // }

        System.out.println("\n");

    }
}