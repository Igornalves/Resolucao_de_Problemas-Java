package basico_de_sintaxe;

import javax.swing.JOptionPane;

public class CaixaInterativa {
    public static void main(String[] args) {

        // caixas graficas de maior interatividade para o usuario de forma que ele tenha
        // maior conforto ou olha para tela

        JOptionPane.showMessageDialog(null, "Bem vindo a caixa de mensagem", "caixa de mensagem", 1);

        JOptionPane.showConfirmDialog(null, "Nessa caixa vc pode confirmar o que deeseja de acordo com a pergunta",
                "caixa de decisão", 0);

        JOptionPane.showInputDialog(null, "caixa para digitação de texto para o usuario", "caixa de Input", 2);

        // nesta caixa de baixo tenho que fazer uma conversão de variavel pois a caixa
        // grafica por padrão só recebe valor String não inteiro, desta forma consigo
        // receber numeros inteiros dentro da caixa

        Integer.parseInt(
                JOptionPane.showInputDialog(null, "caixa de digitação que so recebe numeros inteiros Digite um numero",
                        "caixa de input para inteiros", 0));

        JOptionPane.showConfirmDialog(null, "caixa de desicao para ser usada desta forma", "caixa de confirmação",
                JOptionPane.YES_NO_OPTION, 1);

    }

}
