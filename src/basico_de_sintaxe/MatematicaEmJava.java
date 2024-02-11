package basico_de_sintaxe;

public class MatematicaEmJava {
    public static void main(String[] args) {

        // A classe Java Math possui muitos métodos que permitem realizar tarefas matemáticas em números.


        // O método pode ser usado para encontrar o valor mais alto de x e y
        Math.max(5, 10);

        // O método pode ser usado para encontrar o valor mais baixo de x e y :
        Math.min(5, 10);

        // O método retorna a raiz quadrada de x :
        Math.sqrt(64);

        // O método retorna o valor absoluto (positivo) de x :
        Math.abs(-4.7);

        // retorna um número aleatório entre 0,0 (inclusive) e 1,0 (exclusivo):
        Math.random();

        // Exemplo abaixo
        @SuppressWarnings("unused")
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
    }
}
