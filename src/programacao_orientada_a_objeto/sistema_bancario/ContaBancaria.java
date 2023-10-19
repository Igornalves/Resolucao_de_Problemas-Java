package programacao_orientada_a_objeto.sistema_bancario;

public class ContaBancaria extends Pessoa {

    private float extrato;
    private double saldo;
    private double limite;

    public ContaBancaria(){}

    public ContaBancaria(String nome,int idade,double saldo,double limite,float extrato){
        super(nome, idade);
        this.extrato = extrato;
        this.limite = limite;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }

    public void setExtrato(float extrato) {
        this.extrato = extrato;
    }
    public float getExtrato() {
        return extrato;
    }
}
