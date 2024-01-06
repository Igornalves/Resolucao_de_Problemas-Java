package Exercicos_Da_linguagem;

import java.util.ArrayList;

public class MexendoComArraylist {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("carlos eduardo");
        nomes.add("igor nascimento");
        nomes.add("vinycios barbosa");
        nomes.add("yasmin nascimento");
        nomes.add("matheus felipe");
        
        nomes.add(4,"maycon silva");

        System.out.println("\n");
        System.out.println("nome que estou imprimindo é do aluno é: "+ nomes.get(0));
        System.out.println("\n\n");
        
        for(int r =0 ; r < nomes.size() ; r++){
            System.out.println(r+". "+nomes.get(r)+"\n");
        }

        System.out.println("\n\n");
    }
}
