package basico_de_sintaxe;

import java.util.Scanner;

public class inserir_dados_2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // outra forma de obter dados do usuario//

        String f;
        int r,d,e,t;

        int calculo;

        System.out.print("digite o seu nome: ");
        f = leitor.nextLine();

        System.out.print("digite um numero: ");
        r = leitor.nextInt();

        System.out.print("digite um numero: ");
        d = leitor.nextInt();

        System.out.print("digite um numero: ");
        e = leitor.nextInt();

        System.out.print("digite um numero: ");
        t = leitor.nextInt();

        calculo = r + d + e + t ;

        System.out.println("\nseu nome é: " + f + "\nsua idade é: " + r + "\n");
        System.out.printf("o calculo feito das variaveis é igual: "+ calculo + "\n\n\n");
    }
}