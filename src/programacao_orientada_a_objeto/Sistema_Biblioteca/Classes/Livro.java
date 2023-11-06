package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

public class Livro extends Autor {

    private String Categoria;
    private String titulo;
    private String numeroDePaginas;

    public Livro(String nomeAutor, int dataDeNascimento, String Categoria, String titulo, String numeroDePaginas) {

        super(nomeAutor, dataDeNascimento);
        
        this.Categoria = Categoria;
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
