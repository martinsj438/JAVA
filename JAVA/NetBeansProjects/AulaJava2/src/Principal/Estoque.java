
package estoque;

import java.util.Scanner;

    public class Estoque {
        public static void main(String[] args) {
            
            double livroJava8 = 59.90;
            double livroTDD = 59.90;
            
            double soma = livroJava8 + livroTDD;
            
  
            System.out.println("O total em Estoque é "+ soma);
            
            if (soma < 150){
                System.out.println("O total em estoque esta muito baixo"+ soma);
            }else if (soma >= 2000){
                System.out.println("Seu estoque está muito alto"+ soma);
             }else{
                System.out.println("Seu estoque está muito bom"+ soma);    
                
            }
        }
    }
    

