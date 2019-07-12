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
             + "tentar adivinhar em que lado ou numero o dado vai cair, "
             + "se no caso do jogador errar poderá¡ tentar outra vez ou se não "
             + "quiser tem a opção de sair.");
       
    char opcao='s';
       Scanner teclado = new Scanner(System.in);
       while (opcao=='s'){   
       System.out.println("Lançamento Do Dado......");
       int dado = (int)(Math.random()*6 + 1); 
       System.out.println("Lado: " + dado);
       System.out.println("Deseja lançar o dado novamente?(s/n)");
       opcao=teclado.next().charAt(0);
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
    
    

