package programacao_orientada_a_objeto.Carros.Classes;

public class Carros {
    
    private int quantidade;
    private String marca;
    private String modelo;
    private int ano;

    public Carros() {
    }

    public Carros(String marca, String modelo, int ano, int quantidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
