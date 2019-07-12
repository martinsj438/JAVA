
package jogo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JLabel; 
import javax.swing.JFrame;
import javax.swing.Icon;

public class Dado {
   
    
    public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
    char opcao='s';
    String nome = null;
    while (nome == null || nome.equals("")) {   
    nome = JOptionPane.showInputDialog("Qual o seu nome?");
    if (nome == null || nome.equals("")) {
    JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
    }
    }
    JOptionPane.showMessageDialog(null, "Bem Vindo(a)\n " + nome);
    JOptionPane.showMessageDialog(null, "Vamos Jogar!");
    JOptionPane.showMessageDialog(null, "\nCenário do jogo!!\n "
             + "O jogo se trata sobre o jogador lançar o dado e "
             + "tentar adivinhar em que numero caiu");
    JOptionPane.showMessageDialog(null, "Boa Sorte!"); 
    JOptionPane.showMessageDialog(null, "Escolha uma das opções!");   
    Object[] opcoes = {"1", "2", "3", "4" ,"5" ,"6"};
    int dado = (int)(Math.random()*6 + 1);
    String resposta;
    while (true){
    resposta = (String) JOptionPane.showInputDialog(null,
                    "Em que Numero o dado vai cair?", "Tente Advinhar",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
      
    while (opcao=='s'){   
       JOptionPane.showMessageDialog(null, "Lançamento do dado......");
       JOptionPane.showMessageDialog(null, "Numero:\n" + dado);
         
    if (resposta == null){
        JOptionPane.showMessageDialog(null, "Game Over!\nVocê desistiu do jogo!");
        break;
    }
    if (Integer.valueOf(resposta) != dado){
        JOptionPane.showMessageDialog(null, "Errou.\n" + nome);
    }
    else{
    JOptionPane.showMessageDialog(null, "Parabens!\n" + nome + "\nRealmente caiu no numero\n" + dado);
    break;
    }
    
    System.exit(0);
    }
     
     opcao=teclado.next().charAt(0);
    }
    
    
}
}



   
  
   

    
       
    

       

    
    



       


    







        

        
