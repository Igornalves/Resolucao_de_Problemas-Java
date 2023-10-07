package programacao_orientada_a_objeto.EmpresaSistema;

public class PessoaFisica extends Pessoa {

    int cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(int idade, String nome, double altura, double peso, int cpf) {

        super(idade, nome, altura, peso);

        this.cpf = cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

}
