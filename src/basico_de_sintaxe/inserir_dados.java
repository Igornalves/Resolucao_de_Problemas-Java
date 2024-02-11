package basico_de_sintaxe;

import java.util.Scanner;

public class inserir_dados {
    public static void main(String[] args){

        // Aqui se faz o instanciamento para que possa ser feito a leitura via prompt de comando 
        
        @SuppressWarnings("resource")
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("digite um valor: ");
        int valor = leitor.nextInt();

        System.out.print("\ndados do usuario string: " + nome + " \nvariavel int: " + valor + "\n\n");

    }
}