package programacao_orientada_a_objeto.prova_resposta.Classes;

public class Nascimento {
    private String nome;
    private int dia, mes, ano, hora, minuto;

    public Nascimento(String nome, int dia, int mes, int ano, int hora, int minuto){
        this.nome = nome; this.dia = dia; this.mes = mes; this.ano = ano;
        this.hora = hora; this.minuto = minuto;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }
}
