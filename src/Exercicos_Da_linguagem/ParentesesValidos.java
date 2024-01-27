package Exercicos_Da_linguagem;

public class ParentesesValidos {

    // Dada uma string scontendo apenas os caracteres '(', ')', '{', e , determine
    // '}'se a string de entrada é válida.'['']'

    // Uma string de entrada é válida se:

    // Os colchetes abertos devem ser fechados pelo mesmo tipo de colchetes.
    // Os colchetes abertos devem ser fechados na ordem correta.
    // ada colchete fechado possui um colchete aberto correspondente do mesmo tipo.

    // Exemplo 1:

    // Entrada:s="()"Saída:
    // verdadeiro

    // Exemplo 2:

    // Entrada:s="()[]{}"Saída:
    // verdadeiro

    // Exemplo 3:

    // Entrada:s="(]"Saída:falso

    public static void main(String[] args) {

        String objeto1 = "(";
        String objeto2 = ")";
        String objeto3 = "[";
        String objeto4 = "]";
        String objeto5 = "{";
        String objeto6 = "}";

        juntandoCaracteres(objeto5, objeto6);
        juntandoCaracteres(objeto1, objeto6);
        juntandoCaracteres(objeto1, objeto2);
        juntandoCaracteres(objeto3, objeto4);

        System.out.println("\n");
        
        juntandoCaracteresDeFormaMelhor(objeto5, objeto6);
        juntandoCaracteresDeFormaMelhor(objeto3, objeto4);
        juntandoCaracteresDeFormaMelhor(objeto6, objeto2);
        juntandoCaracteresDeFormaMelhor(objeto1, objeto2);
        
        System.out.println("\n");
    }

    private static void juntandoCaracteres(String caractere1, String caractere2) {
        boolean verificacao = false;

        if (caractere1 == "(" && caractere2 == ")") {
            verificacao = true;
            String mesclandoCaractere = caractere1 + caractere2;
            System.out.println("output: " + mesclandoCaractere);
        } else if (caractere1 == "[" && caractere2 == "]") {
            verificacao = true;
            String mesclandoCaractere = caractere1 + caractere2;
            System.out.println("output: " + mesclandoCaractere);
        } else if (caractere1 == "{" && caractere2 == "}") {
            verificacao = true;
            String mesclandoCaractere = caractere1 + caractere2;
            System.out.println("output: " + mesclandoCaractere);
        } else {
            verificacao = false;
            System.out.println("infelizmente não os caracteres são diferentes");
        }
    }

    private static void juntandoCaracteresDeFormaMelhor(String caractere1, String caractere2) {

        boolean verificacao = false;

        switch (caractere1) {
            case "[":
                if (caractere2.equals("]")) {
                    verificacao = true;
                    String mescandoString = caractere1 + caractere2;
                    System.out.println("output: " + mescandoString);
                }
                break;
            case "{":
                if (caractere2.equals("}")) {
                    verificacao = true;
                    String mescandoString = caractere1 + caractere2;
                    System.out.println("output: " + mescandoString);
                }
                break;
            case "(":
                if (caractere2.equals(")")) {
                    verificacao = true;
                    String mescandoString = caractere1 + caractere2;
                    System.out.println("output: " + mescandoString);
                }
                break;
            default:
                    verificacao = false;
                    System.out.println("Infelizmente os caracteres são diferentes um do outro");
                break;
        }
    }
}
