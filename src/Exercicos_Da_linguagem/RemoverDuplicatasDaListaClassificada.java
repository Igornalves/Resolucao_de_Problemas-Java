package Exercicos_Da_linguagem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoverDuplicatasDaListaClassificada {

    // Dada a existência headde uma lista vinculada classificada, exclua todas as
    // duplicatas de forma que cada elemento apareça apenas uma vez . Retorne a
    // lista vinculada classificada também .

    // Exemplo 1:
    // Entrada: cabeça = [1,1,2]
    // Saída: [1,2]

    // Exemplo 2:
    // Entrada: cabeça = [1,1,2,3,3]
    // Saída: [1,2,3]

    // Restrições:

    // O número de nós na lista está no intervalo [0, 300].
    // -100 <= Node.val <= 100
    // É garantido que a lista seja classificada em ordem crescente.

    public static void main(String[] args) {

        int[] num1 = new int[10];

        num1[0] = 30;
        num1[1] = 20;
        num1[2] = 15;
        num1[3] = 9;
        num1[4] = 25;
        num1[5] = 25;
        num1[6] = 9;
        num1[7] = 15;
        num1[8] = 20;
        num1[9] = 30;

        System.out.print("\n");

        removerDuplicatasEOrdenando(num1);

        System.out.print("\n");
    }

    private static void removerDuplicatasEOrdenando(int[] array) {

        int remocaoElemento = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    remocaoElemento = array[j];
                    System.out.println("Elemento " + array[j] + " foi removido com sucesso !!!");
                    break;
                }
            }
        }

        System.out.print("\n");

        if (remocaoElemento != -1) {

            Set<Integer> set = new HashSet<>();
            for (int i : array) {
                set.add(i);
            }

            int[] novoArray = new int[set.size()];
            int novoIndice = 0;

            for (int i : set) {
                novoArray[novoIndice] = i;
                novoIndice++;
            }

            System.out.println("Array original com duplicatas : " + Arrays.toString(array));

            int posicao_menor;
            int aux;
            for (int h = 0; h < array.length; h++) {
                posicao_menor = h;
                for (int j = h + 1; j < array.length; j++) {
                    if (array[j] < array[posicao_menor]) {
                        posicao_menor = j;
                    }
                }
                aux = array[posicao_menor];
                array[posicao_menor] = array[h];
                array[h] = aux;
            }

            System.out.println("Array original com duplicatas ordenado : " + Arrays.toString(array));

            System.out.print("\n");

            System.out.println("Array original sem duplicatas e sem ordenacao: " + Arrays.toString(novoArray));

            System.out.print("\n");

            for (int h = 0; h < novoArray.length; h++) {
                posicao_menor = h;
                for (int j = h + 1; j < novoArray.length; j++) {
                    if (novoArray[j] < novoArray[posicao_menor]) {
                        posicao_menor = j;
                    }
                }
                aux = novoArray[posicao_menor];
                novoArray[posicao_menor] = novoArray[h];
                novoArray[h] = aux;
            }

            System.out.println("Array ordenando sem duplicatas: " + Arrays.toString(novoArray));
        }
    }
}
