package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

import java.util.ArrayList;

public class Biblioteca {

    // private String listaDeLivros;
    private ArrayList<String> listaDeLivros = new ArrayList<>();

    public Biblioteca(ArrayList<String> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<String> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public ArrayList<String> getListaDeLivros() {
        return listaDeLivros;
    }
}
