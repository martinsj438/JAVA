package teste;
import javax.swing.JOptionPane;

public class Jogo {

    
    public static void main(String[] args) {
    String nome = null;
    while (nome == null || nome.equals("")) {
    //JOptionPane.showMessageDialog(null, "Bem Vindo!");    
    nome = JOptionPane.showInputDialog("Qual o seu nome?");
    if (nome == null || nome.equals("")) {
    JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
    }
    }
    JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + nome);
    JOptionPane.showMessageDialog(null, "Vamos Jogar!");  
    }
    
}
