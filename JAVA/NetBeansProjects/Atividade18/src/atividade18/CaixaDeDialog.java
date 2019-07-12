
package atividade18;

import javax.swing.JOptionPane;
public class CaixaDeDialog {

    public static void main(String[] args) {
    String nome = null;
    while (nome == null || nome.equals("")){
    nome = JOptionPane.showInputDialog("Qual e o seu nome?");
    if (nome == null || nome.equals("")){
    JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta.");
    } 
    }
    JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

    } 
}
