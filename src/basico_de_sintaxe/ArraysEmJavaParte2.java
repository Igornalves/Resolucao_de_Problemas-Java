package basico_de_sintaxe;

public class ArraysEmJavaParte2 {
    public static void main(String[] args) {
        // iremos fazer uma matriz de uma array aqui em nosso programa ou como queria
        // chamar de array bidimencional que vai facar assim

        String[][] nome = new String[3][3];

        // No array na primeira dimensão representa o número de linhas [3] , enquanto a
        // segunda dimensão representa o número de colunas [3]

        nome[0][0] = "Carlos";
        nome[0][1] = "maria";
        nome[0][2] = "maycon";
        nome[1][0] = "sara";
        nome[1][1] = "joao";
        nome[1][2] = "gaby";
        nome[2][0] = "matheus";
        nome[2][1] = "luiz";
        nome[2][2] = "jose";

        // podemos cria um loop que vai mostra para nos todos os itens existentes no
        // array que criamos com todos o itens

        for (int i = 0; i < nome.length; i++) {
            for (int j = 0; j < nome[i].length; j++) {
                System.out.println(nome[i][j] + "\n");
            }
        }

        // Perceba que tive que criar dois for um dentro do outro pois nesse caso existe
        // tanto linhas quanto colunas que deveram ser imprimidas para que o usuario
        // veja os nome que estão em cada posição do array bidimencional o que faz com
        // que cada um do elementos tenha que ser imprimidos um por um para facilitar o
        // processo usamos o loop For para que esta processo seja mais facil

        // já outro metodo que pode ser utilizado seria fazendo dessa forma abaixo

        int[][] meusNumeros = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        // nesse caso temos um array que tem na primeira dimensão 4 linha
        // e na segunda dimensão tem 3 colunas

        for (int i = 0; i < meusNumeros.length; i++) {
            for (int j = 0; j < meusNumeros[i].length; j++) {
                System.out.println(meusNumeros[i][j] + "\n");
            }
        }

        //dessa forma usamos o mesmo processo para acessar o numeros do array

    }
}
