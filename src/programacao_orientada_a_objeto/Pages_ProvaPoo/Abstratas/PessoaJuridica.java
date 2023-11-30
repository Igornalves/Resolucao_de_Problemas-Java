package programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas;

import java.util.ArrayList;

public abstract class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String nomeFantasia;
    private ArrayList<Funcionario> funcionarios;

    public PessoaJuridica() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public PessoaJuridica(String nome, String cnpj,String nomeFantasia) {
        super(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public void addFuncionario(Funcionario novoFuncionario) {
        funcionarios.add(novoFuncionario);
    }

    public void removerFuncionario(Funcionario novoFuncionario) {
        funcionarios.remove(novoFuncionario);
    }

    // public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
    //     this.funcionarios = funcionarios;
    // }

    // public ArrayList<Funcionario> getFuncionarios() {
    //     return funcionarios;
    // }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

}
