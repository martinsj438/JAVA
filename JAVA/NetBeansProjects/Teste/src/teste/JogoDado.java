package teste;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class JogoDado {

    
    public static void main(String[] args) {
    String nome = null;
    
    while (nome == null || nome.equals("")) {   
    nome = JOptionPane.showInputDialog("Qual o seu nome?");
    if (nome == null || nome.equals("")) {
    JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
    }
    }
    JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + nome);
    JOptionPane.showMessageDialog(null, "Vamos Jogar!");
    JOptionPane.showMessageDialog(null, "Cenário do jogo!!"
             + "O jogo se trata sobre o jogador lançar o dado"
             + "tentar adivinhar em que numero o dado vai cair, "
             + "se no caso do jogador errar poderá¡ tentar outra vez ou se não "
             + "quiser tem a opção de sair.");
       
    char opcao='s';

    Scanner teclado = new Scanner(System.in);
       
    while (opcao=='s'){ 
    Object[] opcoes = {"1", "2", "3", "4" ,"5" , "6"};
    JOptionPane.showInputDialog("Deseja lançar o dado?(s/n)");
    JOptionPane.showMessageDialog(null, "Lançamento Do Dado......");
       int dado = (int)(Math.random()*6 + 1); 
       JOptionPane.showMessageDialog(null, "Numero: " + dado);
       JOptionPane.showInputDialog("Deseja lançar o dado novamente?(s/n)");
    String resposta;
    while (true){
     resposta = (String) JOptionPane.showInputDialog(null,
                    "Em que número estou pensando?", "Jogo de Advinhar",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
    if (resposta == null){
        JOptionPane.showMessageDialog(null, "Game Over!\nVocê desistiu do jogo!");
      
    }
    if (opcoes == null){
        JOptionPane.showMessageDialog(null, "Parabens!\nVocê adivinhou!\n" + "Numero" + nome);
    
    }else if (resposta ==  null){
          JOptionPane.showMessageDialog(null, "Errado!");
    }      
       while (opcao=='n'){   
       JOptionPane.showInputDialog("Você esta certo disso!(s/n)");
       

       while (opcao=='s'){
       JOptionPane.showMessageDialog(null, "SOME DAQUI MEU!!");
       opcao=teclado.next().charAt(0);
       }
       }
    }
    }
}
}

   

    
    

