package programacao_orientada_a_objeto.Escola_Poo.APP;

import java.util.Date;

import programacao_orientada_a_objeto.Escola_Poo.Class.Aluno;
import programacao_orientada_a_objeto.Escola_Poo.Class.Turma;

public class AssociacaoDeMuitosParaUm {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Turma turma1 = new Turma();
        
        turma1.setSigla("1A");
        turma1.setAno(1);
        turma1.adcionarAluno(aluno1);
        turma1.adcionarAluno(aluno2);

        aluno1.setNome("joao");
        aluno1.setMatricula(2343243);
        aluno1.setDataDeNascimento(new Date());
        aluno1.setTurma(turma1);

        aluno2.setNome("gabriel");
        aluno2.setMatricula(2343571);
        aluno2.setDataDeNascimento(new Date());
        aluno2.setTurma(turma1);

        System.out.println("\nEste são os dados do aluno Adcionado na turma: \n");
        System.out.println("nome do aluno é: " + aluno1.getNome());
        System.out.println("numero de matricula: " + aluno1.getMatricula());
        System.out.println("a turma que ele estar é: " + aluno1.getTurma().getSigla());
        System.out.println("o ano que este aluno estar é: " + aluno1.getTurma().getAno() + " Ano\n");

        System.out.println("nome do aluno é: " + aluno2.getNome());
        System.out.println("numero de matricula: " + aluno2.getMatricula());
        System.out.println("a turma que ele estar é: " + aluno2.getTurma().getSigla());
        System.out.println("o ano que este aluno estar é: " + aluno2.getTurma().getAno() + " Ano\n\n");

        System.out.println("Este são os alunos da turma " + turma1.getSigla() + "\n");

        for (int r = 0; r < turma1.quantidadeDeAlunos(); r++) {
            System.out.println(+r + ". " + turma1.getAluno(r).getNome());
        }

        System.out.print("\n");
    }
}