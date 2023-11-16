package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

import java.util.ArrayList;

public class Biblioteca extends Livro {
    
    private ArrayList<Livro> livroDaEstante = new ArrayList<>();

    public Biblioteca(String novoTitulo, String novoAutor, short novoAno, int novoCodigo, boolean novaDisponibilidade){
        super(novoTitulo, novoAutor, novoAno, novoCodigo, novaDisponibilidade);
    }

    public void totalLivros(){
        for(int e =0 ; e < livroDaEstante.size(); e++){
            System.out.println(e+". "+livroDaEstante.get(e));
        }
    }

    public void addLivro(String novoTitulo, String novoAutor, short novoAno, int novoCodigo, boolean novaDisponibilidade){
        livroDaEstante.add(new Livro(novoTitulo, novoAutor, novoAno, novoCodigo, novaDisponibilidade));
    }

    public void removeLivro(String novoTitulo, String novoAutor, short novoAno,int novoCodigo, boolean novaDisponibilidade){
        livroDaEstante.remove(novoCodigo);
    }
}
