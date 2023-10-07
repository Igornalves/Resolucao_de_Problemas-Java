package programacao_orientada_a_objeto.EmpresaSistema;

import java.util.Scanner;

public class PrincipalRun {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        Pessoa P = new Pessoa();
        PessoaFisica PF = new PessoaFisica();
        PessoaJuridica PJ = new PessoaJuridica();
        Funcionario F = new Funcionario();

        System.out.println("\n");

        System.out.print("Digite o seu nome: ");
        P.setNome(ler.nextLine());

        System.out.print("digite sua idade: ");
        P.setIdade(ler.nextInt());

        System.out.print("digite seu peso: ");
        P.setPeso(ler.nextDouble());

        System.out.print("digite sua altura: ");
        P.setAltura(ler.nextDouble());

        System.out.print("digite seu cnpj: ");
        PJ.setCnpj(ler.nextInt());

        System.out.print("digite seu cpf: ");
        PF.setCpf(ler.nextInt());

        System.out.println("\n");

        System.out.println("seu nome é " + P.getNome());
        System.out.println("sua altura é " + P.getAltura());
        System.out.println("seu peso é " + P.getPeso());
        System.out.println("seu cpf é " + PF.getCpf());
        System.out.println("seu cnpj é " + PJ.getCnpj());

        System.out.println("\n");
    }
}
