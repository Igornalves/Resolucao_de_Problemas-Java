package basico_de_sintaxe;

public class CastingEmJava {
    
    // A conversão de tipo ocorre quando você atribui um valor de um tipo de dados
    // primitivo a outro tipo.

    // Ampliando Casting (automaticamente) - convertendo um tipo menor em um tamanho
    // de tipo maior:
    // byte-> short-> char-> int-> long-> float->double

    // Estreitando Casting (manualmente) - convertendo um tipo maior em um tipo de
    // tamanho menor:
    // double-> float-> long-> int-> char-> short->byte

    public static void main(String[] args) {

        int myinteiro = 19;
        double segundo = myinteiro; // Automatic casting

        int myinteiro2 = 40;
        float pontoFlutuante = (float) myinteiro2; // Manual casting

        System.out.println(segundo);
        System.out.println(pontoFlutuante);

        long f = (long) myinteiro;
        byte e = (byte) myinteiro2;

        System.out.println(f);
        System.out.println(e);
    }
}
