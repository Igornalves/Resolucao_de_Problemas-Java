package programacao_orientada_a_objeto.Sistema_Biblioteca.Classes;

public class Autor {

    private String nomeAutor;
    private int dataDeNascimento;

    public Autor(String nomeAutor, int dataDeNascimento) {

        this.dataDeNascimento = dataDeNascimento;
        this.nomeAutor = nomeAutor;

    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;

        if (this.nomeAutor == "") {

            System.out.println("Cadastro de autor vazio");

        } else {
            System.out.println("cadastro de autor Concluido com Sucesso ");
        }
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

}
