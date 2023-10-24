package basico_de_sintaxe;

public class ArraysEmJavaParte1 {
    public static void main(String[] args) {

        /*
         * aqui são algums exemplos de arrays que podem ser feitos no java de forma que
         * vc define o tanto de espaços de memoria que eles vão ter ok
         */

        int[] numero = new int[5];

        // inserindo dados direto

        String[] nomes = { "maria", "joao", "jose", "carlos", "vinicius" };

        // aqui tambem outro estilo de array que pode ser feito ok

        String[] nomeArquivo;

        // usando o new para instancia uma string que tera 3 posições no espaço de
        // memoria

        String[] posicao = new String[3];

        // inserindo dados em uma array

        posicao[0] = "na primeira posição";
        posicao[1] = "na segunda posição";
        posicao[2] = "na terceira posição";

        System.out.printf("\n as posicões que tem no array são: " + "\n\n " + posicao[0] + "\n " + posicao[1] + "\n "
                + posicao[2] + "\n\n");

        numero[0] = 21;
        numero[1] = 55;
        numero[2] = 90;
        numero[3] = 10;
        numero[4] = 20;

        System.out.printf("\n Estes são os numeros de uma array: " + "" + numero[0] + " " + numero[1] + " " + numero[2]
                + " " + numero[3] + " " + numero[4] + "\n\n");

        // Para descobrir quantos elementos um array possui, use a length propriedade:

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        System.out.println("\n Quantidade total que tem no Array cars: " + cars.length + "\n\n");

        // outro metodo que vc pode usar para acessar um array seria usando um loop For
        // que vc pode usar para acessar todos os casos acima

        for (int e = 0; e < cars.length; e++) {

            System.out.println("acessando o array cars atravez de um loop:  " + cars[e] + "\n");

        }

        // usando este print para separa os for um dos outro para ficar organzados

        System.out.println("\n");

        for (int w = 0; w < posicao.length; w++) {

            System.out.println("usando o for para ver o array: " + posicao[w] + "\n");
        }

        System.out.println("\n");

        for (int q = 0; q < nomes.length; q++) {

            System.out.println("Aluno chamando de: " + nomes[q] + "\n");

        }

        System.out.println("\n");
    }
}