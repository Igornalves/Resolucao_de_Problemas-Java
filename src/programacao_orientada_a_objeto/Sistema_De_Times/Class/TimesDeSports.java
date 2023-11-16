package programacao_orientada_a_objeto.Sistema_De_Times.Class;

import java.util.ArrayList;

public class TimesDeSports extends Jogador {

    private ArrayList<String> equipe; 

    public TimesDeSports(int quantidadeJogadores, int posicoes){
        super(quantidadeJogadores,posicoes);
    }

    public void setEquipe(ArrayList<String> equipe) {
        this.equipe = equipe;
    }

    public ArrayList<String> getEquipe() {
        return equipe;
    }

}
