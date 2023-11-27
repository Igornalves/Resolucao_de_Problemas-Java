package programacao_orientada_a_objeto.Escola_Poo.Class;

import java.util.ArrayList;

public class Turma {
    // Colocado os atributos da classe
    private String sigla;
    private int ano;

    private ArrayList<Aluno> alunos;

    private ArrayList<Professor> TemProfessores;

    private ArrayList<Disciplina> disciplinas;

    public Turma() {
        alunos = new ArrayList<Aluno>();
        TemProfessores = new ArrayList<Professor>();
        disciplinas = new ArrayList<Disciplina>();
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public String getSigla() {
        return sigla;
    }

    public void adcionarProfessor(Professor professor) {
        TemProfessores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        TemProfessores.remove(professor);
    }

    public int quantidadeDeProfessoresQueEnsinaADisciplina() {
        return TemProfessores.size();
    }

    public Professor getTotalDeProfessores(int posicao) {
        return TemProfessores.get(posicao);
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

    public void adcionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int quantidadeDeAlunos() {
        return alunos.size();
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }

}
