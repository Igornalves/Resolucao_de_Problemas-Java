package Exercicos_Da_linguagem;

public class ContagemRegressiva {
    public static void main(String[] args) {

        // Escreva um programa que faça uma contagem regressiva a partir de 10 até 1 e
        // depois imprima "Fogo!".

        System.out.println("contagem regressiva começa em: \n");

        // Use um loop for para a contagem regressiva
        for (int inicial = 10; inicial >= 1; inicial--) {
            System.out.println(inicial + "\n");
            // Adiciona um atraso de 1 segundo (1000 milissegundos) para tornar a contagem mais visível:
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fogo!!!\n");
    }
}
