package programacao_orientada_a_objeto.Escola_Poo.APP;

import programacao_orientada_a_objeto.Escola_Poo.Class.Disciplina;

public class EscolaPoo {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();

        disciplina1.setCargaHoraria(1);
        disciplina1.setNomeDisciplina("matematica");

        System.out.println(disciplina1.getCargaHoraria() + "\n" + disciplina1.getNomeDisciplina());
    }
}