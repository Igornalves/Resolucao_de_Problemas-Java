package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

public class Livro {

    private String titulo;
    private String autor;
    private short ano;
    private int codigo;
    private boolean disponibilidade;

    public Livro(String novoTitulo, String novoAutor, short novoAno, int novoCodigo, boolean novaDisponibilidade) {
        this.titulo = novoTitulo;
        this.autor = novoAutor;
        this.ano = novoAno;
        this.codigo = novoCodigo;
        this.disponibilidade = novaDisponibilidade;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }
}
