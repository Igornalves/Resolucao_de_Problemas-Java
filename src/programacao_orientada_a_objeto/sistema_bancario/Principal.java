package programacao_orientada_a_objeto.sistema_bancario;

import java.util.Scanner;

import programacao_orientada_a_objeto.sistema_bancario.Classes.ContaBancaria;
import programacao_orientada_a_objeto.sistema_bancario.Classes.Funcionario;
import programacao_orientada_a_objeto.sistema_bancario.Classes.Pessoa;
import programacao_orientada_a_objeto.sistema_bancario.Classes.PessoaFisica;
import programacao_orientada_a_objeto.sistema_bancario.Classes.PessoaJuridica;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        ContaBancaria contaBancaria = new ContaBancaria();
        Funcionario funcionario = new Funcionario();

        System.out.println("\n Olá Bem vindo ao sistema Bancario feito por alunos da Uninassau \n\n ");

        boolean menu = true;
        
        System.out.println("-------- MENU --------");

        System.out.print("");

        System.out.print("\n\n vc poderia me informa seu nome: ");
        pessoa.setNome(leitura.nextLine());

        System.out.print("\n\n poderia me informa seu genero: ");
        pessoa.setGenero(leitura.nextLine());

        System.out.print("\n\n informe seu telefone: ");
        pessoa.setTelefone(leitura.nextLine());

        System.out.print("\n\n vc poderia digita seu email: ");
        pessoa.setEmail(leitura.nextLine());

        System.out.print("\n\n vc poderia digitar seu cep: ");
        pessoa.setCep(leitura.nextLine());

        System.out.print("\n\n poderia digitar sua data de nascimento: ");
        pessoa.setDataDeNascimento(leitura.nextInt());

        System.out.println("--------- Informacões sobre seu emprego -------");




        System.out.print("\n\n vc poderia me informa o seu CPF: ");
        pessoaFisica.setCpf(leitura.nextLine());

        System.out.print("\n\n vc poderia me informar seu RG: ");
        pessoaFisica.setRg(leitura.nextLine());

        
    }
}
