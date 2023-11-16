package basico_de_sintaxe;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysEmJavaParte3 {
    public static void main(String[] args) {

        // vamos aprender sobre ArrayList

        // A ArrayList é uma classe e tambem um array redimensionável , que pode ser
        // encontrado no java.utilpacote.

        // A diferença entre um array integrado e um array ArrayListem Java é que o
        // tamanho de um array não pode ser modificado (se você quiser adicionar ou
        // remover elementos de/para um array, você terá que criar um novo).

        // Embora os elementos possam ser adicionados e removidos ArrayListsempre que
        // você quiser.

        // veremos a Sintaxe agora:

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Para acessar um elemento no ArrayList, use o get()método e consulte o número do índice:

        cars.get(0);

        // Para modificar um elemento, use o set()método e consulte o número do índice:

        cars.set(2, "Opel");

        // Para remover um elemento, use o remove()método e consulte o número do índice:

        cars.remove(0);

        // Para remover todos os elementos do ArrayList, use o clear()método:

        cars.clear();

        // Para descobrir quantos elementos um ArrayList possui, use o sizemétodo:

        cars.size();

        //Exemplo para poder usar o size no loop

        for(int e = 0;e < cars.size();e++){
            System.out.println(cars.get(e));
        }

        // Outra classe útil no java.utilpacote é a Collectionsclasse, que inclui o sort()método para classificar listas em ordem alfabética ou numérica:

        // Classifique um ArrayList de Strings:
        Collections.sort(cars);

        // Classifique um ArrayList de inteiros:
        
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        Collections.sort(myNumbers);
    }
}
