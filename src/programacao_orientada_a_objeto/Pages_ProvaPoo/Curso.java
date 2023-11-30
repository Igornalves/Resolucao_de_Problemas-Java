package programacao_orientada_a_objeto.Pages_ProvaPoo;

import java.util.ArrayList;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Coordenador;

public class Curso {
    private String nome;
    private Coordenador coordenador;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        disciplinas = new ArrayList<Disciplina>();
    }

    public addDisciplina(Disciplina novaDisciplina){
        disciplinas.add(novaDisciplina);
    }

    public removerDisciplina(Disciplina novaDisciplina){
        disciplinas.remove(novaDisciplina);
    }

    public int quantidadeDeDisciplinas(){
        return disciplinas.size();
    }

    public Curso getTotalDeCurso(int posicao){
        disciplinas.get(posicao);
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

}
