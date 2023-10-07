package basico_de_sintaxe;

import java.util.Scanner;

public class estrutura_de_codicao_2 {
    public static void main(String[] args) {
        
        Scanner Dados = new Scanner(System.in);

        int caso = 0;

            // inicializando variável com um valor qualquer.

        System.out.println(
                "Digite 1 para mostrar o nome Paulo, 2 para mostrar o nome José, e 3 para mostrar o nome Joyce");
        caso = Dados.nextInt();

        switch (caso) {
            
            // inicia-se a estrutura com switch e colocando a variável que quer olhar na
            // frente.

            // os casos são de acordo com o que você espera da variável. é testado cada caso
            // verificando se é compativel com o que foi digitado.

            case 1:

                // caso for numero 1, entra:

                System.out.println("Paulo");
                break;

            // break é necessário para informar o fim do bloco do caso.

            case 2:

                System.out.println("José");
                break;

            case 3:

                System.out.println("Joyce");
                break;

            default:

                // caso o que foi digitado não seja nenhum dos casos que definiu o default é
                // acionado. Ele não é necessário.

                System.out.println("Valor não encontrado no menu");

                // nao é necessário break por ser o último caso.
        }
    }
}
