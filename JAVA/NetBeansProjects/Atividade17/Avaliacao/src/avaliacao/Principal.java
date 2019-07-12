
package avaliacao;
    
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
 
    public static void main(String[] args) {
        
        
        String nome = null;
        Scanner x = new Scanner(System.in);
        while (nome == null || nome.equals("")) {   
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        if (nome == null || nome.equals("")) {
         JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
        }
        }
        JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + nome);
        JOptionPane.showMessageDialog(null, "Crie sua bola!");
     
        Bola bola = new Bola();
         
        Bola bola2 = new Bola();
        Bola bola3 = new Bola();
        Bola bola4 = new Bola();
        
        JOptionPane.showInputDialog(null,"Cor: ");
                   
        JOptionPane.showInputDialog(null,"Circunferencia: ");
                   
        JOptionPane.showInputDialog(null,"Material: ");
                       
        JOptionPane.showMessageDialog(null,""  
                + "Cor: " + bola.cor + "\n"
                + "Circunferencia: " + bola.circunferencia +"\n"
                + "Material: " + bola.material + "\n");
        
        Object[] opcoes = { "sim", "não" };
        Object resposta;
        do {
        resposta = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                opcoes,
                                "não");
        } while (resposta == null || resposta.equals("não"));
    } 
}
    
    
