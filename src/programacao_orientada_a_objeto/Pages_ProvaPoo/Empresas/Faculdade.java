package programacao_orientada_a_objeto.Pages_ProvaPoo.Empresas;

import java.util.ArrayList;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Curso;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas.PessoaJuridica;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Diretor;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Presidente;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.SecAcademica;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.SecFinanceira;

public class Faculdade extends PessoaJuridica {

    private ArrayList<Curso> cursos;
    private ArrayList<Diretor> diretores;
    private SecAcademica secAcademica;
    private SecFinanceira secFinanceira;
    private Presidente presidente;

    public Faculdade() {
        cursos = new ArrayList<Curso>();
        diretores = new ArrayList<Diretor>();
    }

    public Faculdade(String nome, String cnpj, String nomeFantasia) {
        super(nome, cnpj, nomeFantasia);
    }

    public void addCurso(Curso novoCurso) {
        cursos.add(novoCurso);
    }

    public void removerCurso(Curso novoCurso) {
        cursos.remove(novoCurso);
    }

    public int quntidadeDeCursos() {
        return cursos.size();
    }

    public Curso getTotalDeCursos(int posicao) {
        return cursos.get(posicao);
    }

    public void addDiretor(Diretor novoDiretor) {
        diretores.add(novoDiretor);
    }

    public void removerDiretor(Diretor novoDiretor) {
        diretores.remove(novoDiretor);
    }

    public int quntidadeDeDiretores() {
        return diretores.size();
    }

    public Diretor getTotalDeDiretores(int posicao) {
        return diretores.get(posicao);
    }

    public void setSecAcademica(SecAcademica secAcademica) {
        this.secAcademica = secAcademica;
    }

    public SecAcademica getSecAcademica() {
        return secAcademica;
    }

    public void setSecFinanceira(SecFinanceira secFinanceira) {
        this.secFinanceira = secFinanceira;
    }

    public SecFinanceira getSecFinanceira() {
        return secFinanceira;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    // public void setCursos(ArrayList<Curso> cursos) {
    // this.cursos = cursos;
    // }

    // public ArrayList<Curso> getCursos() {
    // return cursos;
    // }
}
