
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
         JOptionPane.showMessageDialog(null,"Voçê não respondeu a pergunta.");
        }
        }
        JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + nome);
        JOptionPane.showMessageDialog(null, "Crie sua bola!");
          
      
        String cor = null;
        while (cor == null || nome.equals("")) {   
           
        cor = JOptionPane.showInputDialog(null,"Cor: ");
        
        String circunferencia = null;
        while (circunferencia == null || nome.equals("")) {   
        circunferencia = JOptionPane.showInputDialog(null,"Circunferencia: ");
      
        String material = null;
        while (material == null || nome.equals("")) {   
        material = JOptionPane.showInputDialog(null,"Material: ");
       
        
        JOptionPane.showMessageDialog(null,""  
                + "Cor: " + cor +"\n"
                + "Circunferencia: " + circunferencia +"\n"
                + "Material: " + material + "\n");
        }
        
        Object[] opcoes = { "sim", "não" };
        Object resposta;
        do {
        resposta = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "FinalizaÃ§Ã£o",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                opcoes,
                                "nÃ£o");
        } while (resposta == null || resposta.equals("nÃ£o"));
    } 
}
}
}    
    
