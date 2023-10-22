package programacao_orientada_a_objeto.sistema_bancario.Classes;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String genero, int dataDeNascimento, String cep, String email, String telefone,
            String cpf, String rg) {
                
        super(nome, genero, dataDeNascimento, cep, email, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
