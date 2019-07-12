
package atividade17;

import javax.swing.JOptionPane;
public class Caixa {

    public static void main(String[] args) {
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual e seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "O seu nome é " + nome + "?");
        }else{
          JOptionPane.showMessageDialog(null, "O seu nome não é " + nome + "?");  
        }
    }
    
}
