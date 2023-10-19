package basico_de_sintaxe;

public class ArraysEmJavaParte1 {
    public static void main(String[] args) {

        /* aqui são algums exemplos de arrays que podem ser feitos no java de forma que vc define o tanto de espaços de memoria que eles vão ter ok  */

        int [] numero = new int[5];

        //inserindo dados direto 

        String [] nomes = {"maria","joao","jose","carlos","vinicius"};

        //aqui tambem outro estilo de array que pode ser feito ok

        String [] nomeArquivo;

        //usando o new para instancia uma string que tera 3 posições no espaço de memoria

        String [] posicao = new String[3];

        //inserindo dados em uma array 

        posicao[0] = "na primeira posição";
        posicao[1] = "na segunda posição";
        posicao[2] = "na terceira posição";

        numero[0]= 21;
        numero[1]= 55;
        numero[2]= 90;
        numero[3]= 10;
        numero[4]= 20;

        System.out.printf("\n Estes são os numeros de uma array: " + "" + numero[0] +" " + numero[1] +" " + numero[2] +" " + numero[3] +" " + numero[4] +"\n\n");

    }
}