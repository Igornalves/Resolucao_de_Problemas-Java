package programacao_orientada_a_objeto.Escola_Poo.Class;

public class Pessoa {
    // Colocando os atributos da Classe
    private String nome;
    private int matricula;

    public Pessoa(){}

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula >= 0) {
            this.matricula = matricula;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
