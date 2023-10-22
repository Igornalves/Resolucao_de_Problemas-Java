package programacao_orientada_a_objeto.sistema_bancario.Classes;

public class ContaBancaria {

    private PessoaFisica titular;
    private String agencia;
    private double saldo;
    private double limite;
    private float extrato;
    private double numeroDaAgencia;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, double limite, float extrato, double numeroDaAgencia) {

        this.extrato = extrato;
        this.limite = limite;
        this.saldo = saldo;
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setExtrato(float extrato) {
        this.extrato = extrato;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNumeroDaAgencia(double numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public PessoaFisica getTitular() {
        return titular;
    }

    public double getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public float getExtrato() {
        return extrato;
    }
}
