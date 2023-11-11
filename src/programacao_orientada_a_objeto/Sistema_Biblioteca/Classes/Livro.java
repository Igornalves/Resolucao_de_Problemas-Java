package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

import java.util.ArrayList;

public class Livro extends Biblioteca {

    private String[] Categoria = new String[10];
    private String titulo;
    private String numeroDePaginas;

    public Livro(ArrayList<String> listaDeLivros, String Categoria, String titulo, String numeroDePaginas) {
        super(listaDeLivros);
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
    }

    @Override
    public void setListaDeLivros(ArrayList<String> listaDeLivros) {
        // TODO Auto-generated method stub
        super.setListaDeLivros(listaDeLivros);
    }

    // public void setCategoria(String categoria) {
    //     Categoria = categoria;
    // }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
