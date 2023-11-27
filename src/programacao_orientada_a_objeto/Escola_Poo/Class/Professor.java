package programacao_orientada_a_objeto.Escola_Poo.Class;

import java.util.ArrayList;

public class Professor extends Pessoa {
    // Colocando os atributos da classe
    private String formacaoAcademica;
    private double salario;

    private ArrayList<Disciplina> disciplinas;

    private ArrayList<Turma> turmasQueEnsina;

    public Professor() {
        disciplinas = new ArrayList<Disciplina>();
        turmasQueEnsina = new ArrayList<Turma>();
    }

    public Professor(String nome, int matricula) {
        super(nome, matricula);
    }

    public void adcionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int quantidadeDeDisciplinas() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public void adcionarTurmas(Turma turmas) {
        turmasQueEnsina.add(turmas);
    }

    public void removerTurmas(Turma turmas) {
        turmasQueEnsina.remove(turmas);
    }

    public int quantidadeDeTurma() {
        return turmasQueEnsina.size();
    }

    public Turma getTurmaQueEnsina(int posicao) {
        return turmasQueEnsina.get(posicao);
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAvalicao() {

    }
}
