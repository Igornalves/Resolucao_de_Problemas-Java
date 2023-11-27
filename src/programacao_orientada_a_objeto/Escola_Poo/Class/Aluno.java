package programacao_orientada_a_objeto.Escola_Poo.Class;

import java.util.Date;

public class Aluno extends Pessoa {
    // Colocando os atributos na classe
    private Date dataDeNascimento;

    private Turma turma;

    public Aluno() {
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void fazerAvaliacao() {

    }
}
