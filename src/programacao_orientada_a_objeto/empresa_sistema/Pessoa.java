package programacao_orientada_a_objeto.empresa_sistema;

public class Pessoa {

    private int idade;
    private String nome;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome, double altura, double peso) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }


}
