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
        turma1.adcionarAluno(aluno1);
        turma1.adcionarAluno(aluno2);
        turma1.adcionarAluno(aluno3);
        turma1.adcionarProfessor(professor1);
        turma1.adcionarProfessor(professor2);
        turma1.adcionarProfessor(professor3);
        turma1.adcionarDisciplina(disciplina1);
        turma1.adcionarDisciplina(disciplina2);
        turma1.adcionarDisciplina(disciplina3);

        turma2.setAno(1);
        turma2.setSigla("Ensino Medio");
        turma2.adcionarAluno(aluno4);
        turma2.adcionarAluno(aluno5);
        turma2.adcionarAluno(aluno6);
        turma2.adcionarProfessor(professor1);
        turma2.adcionarProfessor(professor2);
        turma2.adcionarProfessor(professor3);
        turma2.adcionarDisciplina(disciplina1);
        turma2.adcionarDisciplina(disciplina2);
        turma2.adcionarDisciplina(disciplina3);

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
        disciplina1.setCargaHoraria(80);
        disciplina1.adcionarProfessor(professor1);
        disciplina1.adcionarProfessor(professor2);
        disciplina1.adcionarTurmas(turma1);
        disciplina1.adcionarTurmas(turma2);

        disciplina2.setNomeDisciplina("Portugues");
        disciplina2.setCargaHoraria(80);
        disciplina2.adcionarProfessor(professor2);
        disciplina2.adcionarTurmas(turma2);
        disciplina2.adcionarTurmas(turma1);

        disciplina3.setNomeDisciplina("Educação Fisica");
        disciplina3.setCargaHoraria(80);
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

        System.out.println(
                "Estas são todas as materias que a turma " + turma1.getAno() + " " + turma1.getSigla() + " vão ter: ");

        for (int r = 0; r < turma1.quantidadeDeDisciplinas(); r++) {
            System.out.println("\n" + r + " - " + turma1.getDisciplina(r).getNomeDisciplina());
        }

        System.out.print("\n");

        System.out.println(
                "Estas são todas as materias que a turma " + turma2.getAno() + " " + turma2.getSigla() + " vão ter: ");

        for (int r = 0; r < turma2.quantidadeDeDisciplinas(); r++) {
            System.out.println("\n" + r + " - " + turma2.getDisciplina(r).getNomeDisciplina());
        }

        System.out.print("\n");

        System.out.println("Estes são todos os alunos da turma do " + turma1.getAno() + " " + turma1.getSigla());

        for (int s = 0; s < turma1.quantidadeDeAlunos(); s++) {
            System.out.println("\n" + s + " - " + turma1.getAluno(s).getNome());
        }

        System.out.print("\n");

        System.out.println("Estes são todos os alunos da turma do " + turma2.getAno() + " " + turma2.getSigla());

        for (int s = 0; s < turma2.quantidadeDeAlunos(); s++) {
            System.out.println("\n" + s + " - " + turma2.getAluno(s).getNome());
        }

        System.out.print("\n");

        System.out.println("O professor que da a disciplina: "+ professor1.getDisciplina(0).getNomeDisciplina()+ "\no nome do professor: "+ professor1.getNome()+ "\nmatricula do professor: "+ professor1.getMatricula()+ "\nFormacao academica do professor: "+ professor1.getFormacaoAcademica()+ "\nsalario do professor: "+professor1.getSalario());

        System.out.print("\n");

        System.out.print("\n");

        System.out.println("O professor que da a disciplina: "+ professor2.getDisciplina(0).getNomeDisciplina()+ "\no nome do professor: "+ professor2.getNome()+ "\nmatricula do professor: "+ professor2.getMatricula()+ "\nFormacao academica do professor: "+ professor2.getFormacaoAcademica()+ "\nsalario do professor: "+professor2.getSalario());

        System.out.print("\n");

        System.out.print("\n");

        System.out.println("O professor que da a disciplina: "+ professor3.getDisciplina(0).getNomeDisciplina()+ "\no nome do professor: "+ professor3.getNome()+ "\nmatricula do professor: "+ professor3.getMatricula()+ "\nFormacao academica do professor: "+ professor3.getFormacaoAcademica()+ "\nsalario do professor: "+professor3.getSalario());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno1.getTurma().getAno() + " " +
                aluno1.getTurma().getSigla() + "\nnome de: " + aluno1.getNome() +
                "\nmatricula " + aluno1.getMatricula() + "\ndata de nascimento: "
                + aluno1.getDataDeNascimento());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno2.getTurma().getAno() + " " +
                aluno2.getTurma().getSigla() + "\nnome de: " + aluno2.getNome() +
                "\nmatricula " + aluno2.getMatricula() + "\ndata de nascimento: "
                + aluno2.getDataDeNascimento());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno3.getTurma().getAno() + " " +
                aluno3.getTurma().getSigla() + "\nnome de: " + aluno3.getNome() +
                "\nmatricula " + aluno3.getMatricula() + "\ndata de nascimento: "
                + aluno3.getDataDeNascimento());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno4.getTurma().getAno() + " " +
                aluno4.getTurma().getSigla() + "\nnome de: " + aluno4.getNome() +
                "\nmatricula " + aluno4.getMatricula() + "\ndata de nascimento: "
                + aluno4.getDataDeNascimento());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno5.getTurma().getAno() + " " +
                aluno5.getTurma().getSigla() + "\nnome de: " + aluno5.getNome() +
                "\nmatricula " + aluno5.getMatricula() + "\ndata de nascimento: "
                + aluno5.getDataDeNascimento());

        System.out.print("\n");

        System.out.println("O aluno da turma do " + aluno6.getTurma().getAno() + " " +
                aluno6.getTurma().getSigla() + "\nnome de: " + aluno6.getNome() +
                "\nmatricula " + aluno6.getMatricula() + "\ndata de nascimento: "
                + aluno6.getDataDeNascimento());

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
