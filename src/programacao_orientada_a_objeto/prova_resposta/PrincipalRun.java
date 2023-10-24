package programacao_orientada_a_objeto.prova_resposta;

import programacao_orientada_a_objeto.prova_resposta.Classes.Nascimento;

public class PrincipalRun {
    public static void main(String[] args) {

        //instanciado e trazendo já os dados inclusos nele 

        Nascimento n1 = new Nascimento("João", 10, 2, 2001, 12, 30);

        Nascimento n2 = new Nascimento("Maria", 10, 2, 2001, 12, 45);

        System.out.println("\n" + n1.getNome() + " é mais velho que " + n2.getNome() + " por " + (n2.getMinuto()-n1.getMinuto()) + " minutos."+"\n");
    }
}
