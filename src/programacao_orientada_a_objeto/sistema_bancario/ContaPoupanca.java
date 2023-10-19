package programacao_orientada_a_objeto.sistema_bancario;

public class ContaPoupanca extends ContaBancaria {

    private float saldoPoupanca;
    private Float juros;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, double limite, float extrato, double numeroDaAgencia, float saldoPoupanca,
            float juros) {

        super(saldoPoupanca, limite, extrato, numeroDaAgencia);
        this.saldoPoupanca = saldoPoupanca;
        this.juros = juros;
    }

    public void setJuros(Float juros) {
        this.juros = juros;
    }

    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public Float getJuros() {
        return juros;
    }

    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }

}
