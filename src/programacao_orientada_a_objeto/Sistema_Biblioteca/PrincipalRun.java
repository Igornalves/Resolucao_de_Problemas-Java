package programacao_orientada_a_objeto.Sistema_Biblioteca;

import java.util.Scanner;

import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Livro;
import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Autor;
import programacao_orientada_a_objeto.Sistema_Biblioteca.Classes.Biblioteca;

public class PrincipalRun {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // instanciando os objetos na principal para roda tudo no programa

        Autor autor = new Autor();
        Livro livro = new Livro();
        Biblioteca biblioteca = new Biblioteca();

    }
}
