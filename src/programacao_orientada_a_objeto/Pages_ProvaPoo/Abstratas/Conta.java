package programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios.Gerente;

public abstract class Conta {
    private Pessoa titular;
    private Gerente gerente;
    private String numero;
    private String agencia;
    private Double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo){
        this.titular = titular;
        this.gerente = gerente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        this.saldo += saldo;
    }

    public void sacar(Double valor){
        this.saldo -= saldo;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }
}
