package programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas;

import java.time.LocalDateTime;

public abstract class Funcionario extends PessoaFisica {
    private String matricula;
    private LocalDateTime dataAdmissao;
    private String carteiraTrabalho;

    public Funcionario() {
    }

    public Funcionario(String nome,String cpf,String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }
}
