package basico_de_sintaxe;

import javax.swing.JOptionPane;

public class CaixaInterativa {

    public static void main(String[] args) {

        //caixas graficas de maior interatividade para o usuario de forma que ele tenha maior conforto ou olha para tela 

        JOptionPane.showMessageDialog(null, args, null, 0);

        JOptionPane.showConfirmDialog(null, args, null, 0);

        JOptionPane.showInputDialog(null, args, null, 0);

        Integer.parseInt(JOptionPane.showInputDialog(null, args, null, 0));

        JOptionPane.showConfirmDialog(null, args, null,JOptionPane.YES_NO_OPTION);

    }
    
}
