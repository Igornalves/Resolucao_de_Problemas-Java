package basico_de_sintaxe;

public class estrutura_de_condicao {
    public static void main(String[] args) {

        int idade1 = 50;
        int idade2 = 10;

        if (idade1 > idade2) { // leia-se "se a idade1 for maior que a idade2, ocorre o que estiver entre os
                               // blocos de chaves".
            System.out.println("A idade1 é maior que a idade2");
        }

        int idade3 = 10;
        int idade4 = 50;

        if (idade3 > idade4) { // leia-se "se a idade1 for maior que a idade2, ocorre o que estiver entre os
                               // blocos de chaves".
            System.out.println("A idade1 é maior que a idade2");
        } else { // leia-se: "senão, ocorre o que estive dentro dos blocos".
            System.out.println("A idade2 é maior que a idade1");
        }

        int idade5 = 50;
        int idade6 = 50;

        if (idade5 > idade6) { // leia-se: "se a idade1 for maior que a idade2, ocorre o que estiver entre os
                               // blocos de chaves".

            System.out.println("A idade1 é maior que a idade2");

        } else if (idade1 < idade2) { // leia-se: "se a condição do bloco anterior não foi satisfeita, E se a idade1
                                      // for menor que idade2, ocorre o que tiver dentro das chaves".

            System.out.println("A idade2 é maior que a idade1");

        }

        else { // senão, ocorre o que estive dentro dos blocos.
            System.out.println("A idade2 é igual que a idade1");
        }
    }
}
