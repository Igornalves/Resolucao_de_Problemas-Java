package programacao_orientada_a_objeto.Sistema_De_Times.Class;

public class TimesDeSports {

    private int numeroDeTimes;
    private int quantidadeDeJogadores;
    private int numeroDeCadaJogador;
    private int vidaTotalDoJogo;
    static int posicoesDeCadaJogador;

    public TimesDeSports(int numeroDeTimes) {
        this.numeroDeTimes = numeroDeTimes;
        this.quantidadeDeJogadores = 20;
        this.vidaTotalDoJogo = 3;
    }

    public void posicoes() {

        int a;
        int e;

        for (a = 1; a <= 20; a++) {
            numeroDeCadaJogador = a;
            for (e = 1; e < 15; e++) {
                posicoesDeCadaJogador = e;
            }
            System.out.println("a posição do Jogado de numero: " + numeroDeCadaJogador + "\n\n" + "é a posição: "
                    + posicoesDeCadaJogador + "\n");
        }

    }

    public void Info() {

        System.out.println("------------------------------------------------");

        System.out.println("Time de numero: " + numeroDeTimes + "\n");

        System.out.println("a quantidade de jogadores totais no time é de " + this.quantidadeDeJogadores + "\n");

        System.out.println("a vida total que o time tem na partida é de " + this.vidaTotalDoJogo + "\n");

        posicoes();

        System.out.println("------------------------------------------------");

    }
}
