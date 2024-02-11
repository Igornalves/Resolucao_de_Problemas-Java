package basico_de_sintaxe;

public class StringsEmJava {

    // Strings são
    // usadas para
    // armazenar texto.

    // Uma Stringvariável
    // contém uma
    // coleção de
    // caracteres entre
    // aspas duplas:

    public static void main(String[] args) {

        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("tamanho total do txt string : " + txt.length());

        String txt2String = "Hello World";
        System.out.println(txt2String.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt2String.toLowerCase()); // Outputs "hello world"

        String txt3String = " VEJA COMO LOCALIZAR UMA DETERMINADA PALAVRA !!!";
        System.out.println(txt3String.indexOf("UMA")); // Outputs 21

        // Números e strings Java:

        // Se você adicionar duas strings, o resultado será uma concatenação de strings:

        String x = "10";
        String y = "20";
        String z = x + y; // z will be 1020 (a String)
        System.out.println(z);

        // Se você adicionar um número e uma string, o resultado será uma concatenação
        // de strings:

        String x2 = "10";
        int y2 = 20;
        String z2 = x2 + y2; // z will be 1020 (a String)
        System.out.println(z2);

        // Concatenação de Strings:

        // Você também pode usar o concat() método para concatenar duas strings:

        String primeiroNome = "John ";
        String ultimoNome = "Doe";
        System.out.println(primeiroNome.concat(ultimoNome));

        // O +operador pode ser usado entre strings para combiná-las. Isso é chamado de
        // concatenação :

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

    }
}
