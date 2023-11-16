package basico_de_sintaxe;

public class ExcecoesEmJava {
    public static void main(String[] args) {

        // Ao executar o código Java, podem ocorrer diversos erros: erros de codificação
        // cometidos pelo programador, erros devido a entrada errada ou outras coisas
        // imprevisíveis.

        // A try é uma instrução permite definir um bloco de código a ser testado quanto
        // a
        // erros enquanto está sendo executado.

        // A catch é uma instrução permite definir um bloco de código a ser executado,
        // caso
        // ocorra um erro no bloco try.

        // As palavras-chave try e catch vêm em pares:

        try {
            // Block of code to try
        } catch (Exception e) {
            // Block of code to handle errors
        }

        // Exemplo para entender sobre o caso

        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        // A finally instrução permite executar código, depois try...catch,
        // independentemente do resultado:

        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        // A throw instrução permite que você crie um erro personalizado.

        // A throw instrução é usada junto com um tipo de exceção .

        // Existem muitos tipos de exceção disponíveis em Java: ArithmeticException,
        // FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException,
        // etc:

        int age = 15;

        System.out.println(age);

        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }
}