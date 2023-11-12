package programacao_orientada_a_objeto.Garagem;

import java.util.Scanner;

import programacao_orientada_a_objeto.Garagem.Classes.Carros;

public class Principal {
    public static void main(String[] args) {

        // instanciando o objeto na principal para roda o programa como o objeto Carros
        // e Scanner

        Scanner leitura = new Scanner(System.in);

        Carros carro = new Carros();

        // mostrando o que o usuarios vao ver no console
        System.out.print("-------------------------------------\n");
        System.out.println("||  Bem vindo ao Sistema de Carro  ||");
        System.out.print("-------------------------------------\n\n");

        System.out.print("------------------------------------------------------\n");
        System.out.println("||  Digite Abaixo sobre as informações do seu carro ||");
        System.out.print("------------------------------------------------------\n\n");

        System.out.print("\n\nPoderia me informa qual seria o modelo de seu carro: ");
        carro.setModelo(leitura.nextLine());

        System.out.print("\n\nQueria que vc informasse a marcar de um dos seus carros: ");
        carro.setMarca(leitura.nextLine());

        System.out.print("\n\npoderia me informa qual é o ano de seu carro: ");
        carro.setAno(leitura.nextInt());

        System.out.print("\n\nPoderia me informar quantos carros vc tem em sua garagem no total: ");
        carro.setQuantidade(leitura.nextInt());

        System.out.print("\n\n---------------------------------------\n");
        System.out.println("||  Informações sobre seu carro  ||");
        System.out.print("---------------------------------------\n");

        System.out.println("\n\nO modelo de seu carro é: " + carro.getModelo() + "\n\njá a marca de seu carro é "
                + carro.getMarca() + "\n\no ano de seu carro é: " + carro.getAno() +
                "\n\nvc tem essa quantidade de carros em sua garragem: " + carro.getQuantidade() + "\n\n");

        System.out.print("---------------------------------------\n");
        System.out.println("||  Final Do programa de garagem  ||");
        System.out.print("---------------------------------------\n\n");
    }
}
