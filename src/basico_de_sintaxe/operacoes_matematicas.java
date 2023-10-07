package basico_de_sintaxe;

public class operacoes_matematicas {
    public static void main(String[] args) {

        // valor das variaveis//

        int n1, n2, n3, n4;

        n1 = 3;
        n2 = 6;
        n3 = 9;
        n4 = 5;

        //operaçoes matematica entre as variaveis

        int soma = n1 + n2 + n3 + n4;

        int subtração = n1 - n2 - n3 - n4;

        int divisao = n1 / n1 / n3 / n4;

        int multiplicacao = n1 * n2 * n3 * n4;

        int restoDadivisao = n1 % n2 % n3 % n4;

        //imprimindo para o usuario o resultado das operaçôes feitos cada uma anteriomente

        System.out.printf("\n\n tudos os valores de cada variavel %d, %d, %d, %d \n", n1, n2, n3, n4);

        System.out.printf("\nO resultado da soma entre variaveis de valores: %d + %d + %d + %d é igual a %d \n\n\n",n1, n2, n3, n4,soma);

        System.out.printf("\na subtracao é %d\n\n",subtração);

        // fazendo uma contatenaçao entre Strings 

        System.out.printf("\na multiplicaçao é "+ multiplicacao + "\n\n");

        System.out.printf("\no resto da divisão é %d\n\n",restoDadivisao);

        System.out.printf("\na divisao é %d\n\n\n",divisao);

    }
}
