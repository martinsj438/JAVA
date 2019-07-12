package jogo;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Dado {
    
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
             + "O jogo se trata sobre o jogador lançar o dado e "
             + "tentar adivinhar em que lado ou numero o dado vai cair, "
             + "se no caso do jogador errar poderá¡ tentar outra vez ou se não "
             + "quiser tem a opção de sair.");
    JOptionPane.showMessageDialog(null, "Boa Sorte!");   
    
    int rndNr = (int) Math.ceil(Math.random()*6);
    Object[] opcoes = {"1", "2", "3", "4" ,"5" ,"6"};
    String resposta;
    while (true){
    resposta = (String) JOptionPane.showInputDialog(null,
                    "Em que lado o dado vai cair?", "Jogo de Advinhar",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
    char opcao='s';
       Scanner teclado = new Scanner(System.in);
       while (opcao=='s'){   
       System.out.println("Lançamento Do Dado......");       
       int dado = (int)(Math.random()*6 + 1); 
       System.out.println("Lado: " + dado);
       System.out.println("Deseja lançar o dado novamente?(s/n)");       
       
       while (opcao=='n'){   
       System.out.println("Você esta certo disso!(s/n)");
       opcao=teclado.next().charAt(0);
       
       while (opcao=='s'){
       JOptionPane.showMessageDialog(null, "SOME DAQUI MEU!!");
       opcao=teclado.next().charAt(0);
       }
       }
    }
}
}
}




        

        
