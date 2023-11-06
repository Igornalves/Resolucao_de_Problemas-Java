package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

public class Biblioteca {

    private String listaDeLivros;

    public Biblioteca(String listaDeLivros) {

        this.listaDeLivros = listaDeLivros;
    }

    public void setListaDeLivros(String listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public String getListaDeLivros() {
        return listaDeLivros;
    }
}
