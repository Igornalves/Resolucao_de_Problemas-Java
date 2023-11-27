package programacao_orientada_a_objeto.Escola_Poo.APP;

import java.util.Date;

import programacao_orientada_a_objeto.Escola_Poo.Class.Aluno;
import programacao_orientada_a_objeto.Escola_Poo.Class.Disciplina;
import programacao_orientada_a_objeto.Escola_Poo.Class.Professor;
import programacao_orientada_a_objeto.Escola_Poo.Class.Turma;

public class AssociacaoDeMuitosParaMuitos {
    public static void main(String[] args) {

        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        Aluno aluno6 = new Aluno();

        Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina3 = new Disciplina();

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Professor professor3 = new Professor();

        turma1.setAno(2);
        turma1.setSigla("Ensino Medio");

        turma2.setAno(1);
        turma2.setSigla("Ensino Medio");

        aluno1.setNome("Maycon");
        aluno1.setMatricula(24366218);
        aluno1.setDataDeNascimento(new Date());
        aluno1.setTurma(turma1);

        aluno2.setNome("Livia");
        aluno2.setMatricula(53647823);
        aluno2.setDataDeNascimento(new Date());
        aluno2.setTurma(turma1);

        aluno3.setNome("Bruno");
        aluno3.setMatricula(14236362);
        aluno3.setDataDeNascimento(new Date());
        aluno3.setTurma(turma1);

        aluno4.setNome("Gabriela");
        aluno4.setMatricula(8694633);
        aluno4.setDataDeNascimento(new Date());
        aluno4.setTurma(turma2);

        aluno5.setNome("Daniel");
        aluno5.setMatricula(635367);
        aluno5.setDataDeNascimento(new Date());
        aluno5.setTurma(turma2);

        aluno6.setNome("Junior");
        aluno6.setMatricula(2435745);
        aluno6.setDataDeNascimento(new Date());
        aluno6.setTurma(turma2);


        disciplina1.setNomeDisciplina("Matemática");
        disciplina1.setCargaHoraria(1);
        disciplina1.adcionarProfessor(professor1);
        disciplina1.adcionarProfessor(professor2);
        disciplina1.adcionarTurmas(turma1);
        disciplina1.adcionarTurmas(turma2);

        disciplina2.setNomeDisciplina("Portugues");
        disciplina2.setCargaHoraria(1);
        disciplina2.adcionarProfessor(professor2);
        disciplina2.adcionarTurmas(turma2);
        disciplina2.adcionarTurmas(turma1);

        disciplina3.setNomeDisciplina("Educação Fisica");
        disciplina3.setCargaHoraria(1);
        disciplina3.adcionarProfessor(professor3);
        disciplina3.adcionarTurmas(turma2);
        disciplina3.adcionarTurmas(turma2);

        professor1.setNome("Nataniel");
        professor1.setFormacaoAcademica("ciencias da computação");
        professor1.setMatricula(23352771);
        professor1.setSalario(2500);
        professor1.adcionarDisciplina(disciplina1);
        professor1.adcionarTurmas(turma1);

        professor2.setNome("Gabriela");
        professor2.setFormacaoAcademica("Letra e fisica");
        professor2.setMatricula(12537293);
        professor2.setSalario(2300);
        professor2.adcionarDisciplina(disciplina1);
        professor2.adcionarDisciplina(disciplina2);
        professor2.adcionarTurmas(turma2);

        professor3.setNome("Francisco");
        professor3.setFormacaoAcademica("Educacao fisica");
        professor3.setMatricula(86957886);
        professor3.setSalario(2000);
        professor3.adcionarDisciplina(disciplina3);
        professor3.adcionarTurmas(turma2);
        professor3.adcionarTurmas(turma1);

        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        System.out.println();

        System.out.println("Na disciplina de MATEMATICA tem este total de PROFESSORES: \n");

        for (int e = 0; e < disciplina1.quantidadeDeProfessoresQueEnsinaADisciplina(); e++) {
            System.out.println(e + " - " + disciplina1.getTotalDeProfessores(e).getNome());
        }

        System.out.print("\n");

        System.out.println("Na disciplina de PORTUGUES tem este total de PROFESSORES: \n");

        for (int W = 0; W < disciplina2.quantidadeDeProfessoresQueEnsinaADisciplina(); W++) {
            System.out.println(W + " - " + disciplina2.getTotalDeProfessores(W).getNome());
        }

        System.out.print("\n");

        System.out.println("Na disciplina de EDUCAÇÃO FISICA tem este total de PROFESSORES: \n");

        for (int t = 0; t < disciplina3.quantidadeDeProfessoresQueEnsinaADisciplina(); t++) {
            System.out.println(t + " - " + disciplina3.getTotalDeProfessores(t).getNome());
        }

        System.out.print("\n");
    }
}
