package programacao_orientada_a_objeto.sistema_bancario.Classes;

public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String genero, int dataDeNascimento, String cep, String email, String telefone,
            String cnpj,
            String nomeFantasia, String razaoSocial) {
                
        super(nome, genero, dataDeNascimento, cep, email, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
