package programacao_orientada_a_objeto.animais_projeto;

import java.util.Scanner;

import programacao_orientada_a_objeto.animais_projeto.Classes.Animais;
import programacao_orientada_a_objeto.animais_projeto.Classes.Cachorro;
import programacao_orientada_a_objeto.animais_projeto.Classes.Gato;
import programacao_orientada_a_objeto.animais_projeto.Classes.Passaro;
import programacao_orientada_a_objeto.animais_projeto.Classes.Peixe;

public class PrincipalRun {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // instanciando os objetos na principal para roda tudo no programa

        Animais animais = new Animais();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();
        Peixe peixe = new Peixe();

    }
}
