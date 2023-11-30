package programacao_orientada_a_objeto.Pages_ProvaPoo.Empresas;

import java.util.ArrayList;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas.PessoaJuridica;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Diretor;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Presidente;

public class Banco extends PessoaJuridica {

    private Presidente presidente;
    private ArrayList<Diretor> diretores;

    public Banco() {
        diretores = new ArrayList<Diretor>();
    }

    public Banco(String nome, String cnpj,String nomeFantasia,Presidente presidente) {
        super(nome, cnpj, nomeFantasia);
        this.presidente = presidente;
    }

    public void addDiretor(Diretor novoDiretor) {
        diretores.add(novoDiretor);
    }

    public void removerDiretor(Diretor novoDiretor) {
        diretores.remove(novoDiretor);
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public void setDiretores(ArrayList<Diretor> diretores) {
        this.diretores = diretores;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

}