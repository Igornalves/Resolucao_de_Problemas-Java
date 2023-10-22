package programacao_orientada_a_objeto.sistema_bancario.Classes;

public class Funcionario extends Pessoa {

    private String cargo;
    private String idFuncionario;
    private String setor;
    private Funcionario chefe;
    private Funcionario subordinado;
    private PessoaJuridica empresa;

    public Funcionario() {
    }

    public Funcionario(String nome, String genero, int dataDeNascimento, String cep, String email, String telefone,
            String cargo, String idfuncionario,String setor) {

        super(nome, genero, dataDeNascimento, cep, email, telefone);
        this.cargo = cargo;
        this.idFuncionario = idfuncionario;
        this.setor = setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public void setEmpresa(PessoaJuridica empresa) {
        this.empresa = empresa;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setSubordinado(Funcionario subordinado) {
        this.subordinado = subordinado;
    }

    public String getSetor() {
        return setor;
    }

    public String getCargo() {
        return cargo;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public PessoaJuridica getEmpresa() {
        return empresa;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public Funcionario getSubordinado() {
        return subordinado;
    }
}
