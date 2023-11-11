package programacao_orientada_a_objeto.Sistema_Biblioteca;

import java.util.Scanner;

import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Livro;
import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Autor;
import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Biblioteca;
import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Cliente;

public class PrincipalRun {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // instanciando os objetos na principal para roda tudo no programa

        Autor autor = new Autor(null, 0);
        Livro livro = new Livro(null, null, null, null);
        Cliente cliente = new Cliente(null, null);
        Biblioteca biblioteca = new Biblioteca(null);


        System.out.print("-------------------------------------------------\n");
        System.out.println("||  Bem vindo ao Sistema Vitual de Biblioteca  ||");
        System.out.print("-------------------------------------------------\n\n");

        System.out.println("vamos começar fazendo um cadastro para vc (usuario do sistema)\n");

        System.out.println("");

        // switch (biblioteca) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }
    }
}
