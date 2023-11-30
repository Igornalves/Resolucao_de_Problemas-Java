package programacao_orientada_a_objeto.Pages_ProvaPoo;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas.PessoaFisica;

public class Aluno extends PessoaFisica {

    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

}
