package programacao_orientada_a_objeto.sistema_bancario;

public class Pessoa {

    private String nome;
    private String genero;
    private int dataDeNascimento;
    private String cep;
    private String email;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String genero, int dataDeNascimento, String cep, String email, String telefone){

        this.nome = nome;
        this.cep = cep;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }
}
