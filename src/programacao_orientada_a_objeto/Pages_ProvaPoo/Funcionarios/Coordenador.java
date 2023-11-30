package programacao_orientada_a_objeto.Pages_ProvaPoo.Funcionarios;

import programacao_orientada_a_objeto.Pages_ProvaPoo.Abstratas.Funcionario;
import programacao_orientada_a_objeto.Pages_ProvaPoo.Interfaces.Diretoria;

public class Coordenador implements Diretoria extends Funcionario {

    public Coordenador(String nome){
        super(nome);
    }

    public void reunião() {
        System.out.println("O(a) coodenador(a) com o nome "+ super.getNome() + "");
    };

    public void reuniãoGeral(ArrayList<Funcionario> funcionarios) {
        System.out.println("O(a) coodenador(a) "+ super .getNome() + " Entrou na reuniao com \n");

        for(Funcionario f:funcionarios){
            System.out.println("\t - "+ f.getNome() + ": " + f.getClass().toString() + ";\n");
        }
    };

    
}