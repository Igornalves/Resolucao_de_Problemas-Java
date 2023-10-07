package programacao_orientada_a_objeto.EmpresaSistema;

public class Funcionario extends Pessoa {

    String SetorDeTrabalho;
    int QuantidadesDeFuncionarios;
    int HorarioDeEntrada;

    public Funcionario() {
    }

    public Funcionario(int idade, String nome, double altura, double peso, String SetorDeTrabalho,int QuantidadesDeFuncionarios, int HorarioDeEntrada){

        super(idade, nome, altura, peso);

        this.HorarioDeEntrada = HorarioDeEntrada;
        this.QuantidadesDeFuncionarios = QuantidadesDeFuncionarios;
        this.HorarioDeEntrada = HorarioDeEntrada;
    }

    public void setHorarioDeEntrada(int horarioDeEntrada) {
        this.HorarioDeEntrada = horarioDeEntrada;
    }

    public void setQuantidadesDeFuncionarios(int quantidadesDeFuncionarios) {
        this.QuantidadesDeFuncionarios = quantidadesDeFuncionarios;
    }

    public void setSetorDeTrabalho(String setorDeTrabalho) {
        this.SetorDeTrabalho = setorDeTrabalho;
    }

    public int getHorarioDeEntrada() {
        return HorarioDeEntrada;
    }

    public int getQuantidadesDeFuncionarios() {
        return QuantidadesDeFuncionarios;
    }

    public String getSetorDeTrabalho() {
        return SetorDeTrabalho;
    }

}
