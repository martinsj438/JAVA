
package jeffer;

import java.util.Scanner;

public class Atividade6 {
    
    public static void main(String[] args) {        
     //Declaração das variáveis   
    int x, y, trocar; 
    //Entrada de dados
    Scanner valor = new Scanner(System.in);
    System.out.println("Digite o valor de x");
        x = valor.nextInt();
    System.out.println("Digite o valor de y");
        y = valor.nextInt();      
    System.out.println("O valor de x é; " + x );     
    System.out.println("O valor de y é; " + y );      
      //Processamento      
    trocar = x;     
    x = y;     
    y = trocar;     
      //Saída      
    System.out.println("O valor de x é; " + x );    
    System.out.println("O valor de y é; " + y );    
    }
 
}
    
   
