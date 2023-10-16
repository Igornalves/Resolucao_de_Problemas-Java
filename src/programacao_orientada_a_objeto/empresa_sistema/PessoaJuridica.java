package programacao_orientada_a_objeto.empresa_sistema;

public class PessoaJuridica extends Pessoa {

    private int cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(int idade, String nome, double altura, double peso, int cnpj) {

        super(idade, nome, altura, peso);

        this.cnpj = cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

}
