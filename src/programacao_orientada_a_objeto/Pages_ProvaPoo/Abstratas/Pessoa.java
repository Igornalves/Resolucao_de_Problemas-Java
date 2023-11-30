package programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private ArrayList<Conta> conta;

    public Pessoa(){
        conta = new ArrayList<Conta>();
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void addConta(Conta minhaConta){
        conta.add(minhaConta);
    }

    public void removerConta(Conta minhaConta){
        conta.remove(minhaConta);
    }

    public int quantidadeDeContas(){
        return conta.size();
    }

    public Conta getTotalDeContas(int posicao){
        return conta.get(posicao);  
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
}