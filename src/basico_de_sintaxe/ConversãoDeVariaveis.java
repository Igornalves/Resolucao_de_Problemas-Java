package basico_de_sintaxe;

public class ConversãoDeVariaveis {
    public static void main(String[] args) {
        /*
         * usando o comando Integer vc pode converter uma String para inteiro
         * de forma que possa modificar o tipo de dado que ele estar recebendo como tipo
         * primitivo
         */

        int teste = Integer.parseInt("10");
        System.out.println("\no valor de teste é: " + teste + "\n");

        // da mesma forma usando uma tipo primitivo chamado double

        double num = Double.parseDouble("2.43");
        System.out.println("o valor de num é: " + num + "\n");

        // vc pode converter tambem um tipo Boolean

        boolean contador = Boolean.parseBoolean("true");
        System.out.println("o contador é: " + contador + "\n");

        // para fazer uma conversão de um inteiro para string a gente usa um outro
        // comando

        String palavra = String.valueOf(1);
        System.out.println("a transformação ou conversão de uma inteiro para string: " + palavra + "\n");

        // Faz uma conversão automatica, o valor int é convertido para double

        int valor = 149;
        double outroValor = valor;
        System.out.println("o valor em double é: " + outroValor + "\n");

        // As classes wrapper também oferecem uma série de métodos úteis. Por exemplo:

        int max = Integer.MAX_VALUE; // Retorna o valor máximo que um int pode ter
        int min = Integer.MIN_VALUE; // Retorna o valor mínimo que um int pode ter

        min = 275414323; // so pode no minimo 9 numeros no valor minimo de um inteiro
        max = 231458554; // aqui tambem é do mesmo jeito apenas 9 numero

        System.out.println("valor maximo de um inteiro: "+ max + "\n"); //imprimindo no console
        System.out.println("valor minimo de um inteiro: "+ min + "\n"); //imprimindo no console
    }
}
