
package atividade20;

import javax.swing.JOptionPane;
public class Adivinha {

    
    public static void main(String[] args) {
    int rndNr = (int) Math.ceil(Math.random()*6);
    Object[] opcoes = {"1", "2", "3", "4" ,"5" , "6"};
    String resposta;
    while (true){
     resposta = (String) JOptionPane.showInputDialog(null,
                    "Em que número estou pensando?", "Jogo de Advinhar",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
    if (resposta == null){
        JOptionPane.showMessageDialog(null, "Game Over!\nVocê desistiu do jogo!");
        break;
        }
        if (Integer.valueOf(resposta) > rndNr){
         JOptionPane.showMessageDialog(null, "Errado!\nO numero que eu passei e menor.");  
        
        }else if(Integer.valueOf(resposta) < rndNr){
          JOptionPane.showMessageDialog(null, "Errado!\nO numero que eu passei e maior.");  
        
        }else{
        JOptionPane.showMessageDialog(null, "Parabens!\nVocê adivinhou!\n" + "Eu realmente pensei no numero" + rndNr);
        break;
        }
    }
     System.exit(0);
    }
    
}

