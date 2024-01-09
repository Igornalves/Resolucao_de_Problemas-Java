package Exercicos_Da_linguagem;

import java.util.Scanner;

public class PesquisaDeEstadosDoBrasil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] estados = new String[10];

        String procurandoEstado;
        
        boolean pesquisa = false;

        estados[0] = "Ceara";
        estados[1] = "Amazonas";
        estados[2] = "Piaui";
        estados[3] = "Bahia";
        estados[4] = "Sao paulo";
        estados[5] = "Rio grande do norte";
        estados[6] = "Rio de Janeiro";
        estados[7] = "Mato grosso do sul";
        estados[8] = "Para";
        estados[9] = "Goias";

        System.out.print("Vc poderia informa o estado no qual vc esta procurando: ");
        procurandoEstado = input.nextLine();

        for(int E = 0; E < estados.length ; E++){

            String elemento = estados[E];

            if (elemento.equalsIgnoreCase(procurandoEstado)) {
                pesquisa = true;
                break;
            }
        }

        if (pesquisa == true) {
            System.out.println("\nencontrei o estado que vc esta procurando é: "+ procurandoEstado);
            System.out.print("\n");
        }
        else {
            System.out.println("\no estado que vc estar procurando não existe em nosso banco de dados no qual deveria estar armazenado");
            System.out.print("\n");

        }

    }
}
