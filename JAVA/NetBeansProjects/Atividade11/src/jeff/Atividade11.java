
package jeff;

import java.util.Scanner;

public class Atividade11 {

   
    public static void main(String[] args) {
            double soma = 0;
            int contador = 0;
            
            while (contador <35) {
                double valorDLivro =59.90;
                soma = soma + valorDLivro;
                contador = contador + 1;
                
            System.out.println("O total em Estoque é "+ soma);
            
            if (soma < 150){   
            System.out.println("Seu estoque esta muito baixo!");
            }else if (soma >= 2000){
            System.out.println("Seu estoque esta muito alto");
            }else{
            System.out.println("Seu estoque esta bom");    
            }
        }
    }  
}
