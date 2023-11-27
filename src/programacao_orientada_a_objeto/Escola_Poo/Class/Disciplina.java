package programacao_orientada_a_objeto.Escola_Poo.Class;

import java.util.ArrayList;

public class Disciplina {
    // Colocando os atributos da classe
    private String nomeDisciplina;
    private int cargaHoraria;

    private ArrayList<Professor> TemProfessores;

    private ArrayList<Turma> turmasQueTemADisciplina;

    public Disciplina() {
        TemProfessores = new ArrayList<Professor>();
        turmasQueTemADisciplina = new ArrayList<Turma>();
    }

    public void adcionarTurmas(Turma turma) {
        turmasQueTemADisciplina.add(turma);
    }

    public void removerTurmas(Turma turma) {
        turmasQueTemADisciplina.remove(turma);
    }

    public int quantidadeDeTurmasQueTemAsDisciplinas() {
        return turmasQueTemADisciplina.size();
    }

    public Turma getTurmasQueTemAsDisciplinas(int posicao) {
        return turmasQueTemADisciplina.get(posicao);
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

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
}
