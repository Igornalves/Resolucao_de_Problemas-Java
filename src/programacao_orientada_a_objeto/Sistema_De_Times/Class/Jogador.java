package programacao_orientada_a_objeto.Sistema_De_Times.Class;

import java.util.ArrayList;

public class Jogador {

    private int quantidadeJogadores = 11;
    private int posicoes = 10;
    ArrayList<String> nomeDoJogadores;

    public Jogador(int quantidadeJogadores, int posicoes) {
        this.posicoes = posicoes;
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public void setNomeDoJogadores(ArrayList<String> nomeDoJogadores) {
        this.nomeDoJogadores = nomeDoJogadores;
    }

    public void setPosicoes(int posicoes) {
        this.posicoes = posicoes;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public ArrayList<String> getNomeDoJogadores() {
        return nomeDoJogadores;
    }

    public int getPosicoes() {
        return posicoes;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }
}
