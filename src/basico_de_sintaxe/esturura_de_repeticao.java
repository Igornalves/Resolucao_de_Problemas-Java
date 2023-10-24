package basico_de_sintaxe;

public class esturura_de_repeticao {
    public static void main(String[] args) {

        // estaremos aqui usando algumas estruturas dee repetição como For, While e Do
        // While

        // vamos comecar com while

        int num = 0;

        while (num <= 10) {
            System.out.printf("o valor de numero é %d \n\n", num);
            num++;
        }

        // note que o Do While tem uma estrutura semelhante e ao mesmo tempo diferente
        // do While lá de cima porem que o mesmo sentido os dois só muda a forma de sua
        // sintaxe

        int tudo = 0;

        do {
            System.out.printf("tudo tem o valor de  %d\n\n", tudo);
            tudo++;
        } while (tudo <= 5);

        // agora vamos para o for que tem o mesmo sentido porem muda sua sintaxe, nele a
        // gente declara a variavel dentro da instrução do For

        for (int i = 0; i <= 8; i++) {
            System.out.printf("valor de i é igual a %d \n\n", i);
        }
    }
}
