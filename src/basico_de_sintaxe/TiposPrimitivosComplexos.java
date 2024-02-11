package basico_de_sintaxe;

public class TiposPrimitivosComplexos {

    // Tipos complexos (Wrappers)

    // Primitivos:
    // boolean
    // byte
    // char
    // short
    // int
    // long
    // float
    // double

    // Wrappers:
    // Boolean
    // Byte
    // Character
    // Short
    // Integer
    // Long
    // Float
    // Double

    public static void main(String[] args) {

        // Boxing ou Autoboxing é a conversão de tipos primitivos para classes wrappers
        // correspondente.

        Boolean a = true;
        Byte b = 1;
        Character c = 'c';
        Short s = 1;
        Integer i = 1;
        Long l = 1L;
        Float f = 1.0F;
        Double d = 1.0;
        Long cpf = Long.valueOf(13264399123l);
        Float pontoFlutuante = Float.valueOf(243.23f);
        Integer numerosGrandes = Integer.valueOf(123542348);

        System.out.printf(" "+a,b,c,s,i,l,f,d,cpf,pontoFlutuante,numerosGrandes);

        // Unboxing é quando você quer converter o valor de um objeto Wrapper para o seu
        // correspondente tipo primitivo.

        boolean status = Boolean.TRUE;
        boolean status2 = Boolean.FALSE;
        char letra = Character.valueOf('e');
        int idade = Integer.valueOf(12); 
        long valor3 = Long.valueOf(27472l);

        System.out.printf(" "+status,status2,letra,idade,valor3);
    }

}
