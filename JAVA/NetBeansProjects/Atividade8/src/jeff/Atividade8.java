
package jeff;

import java.util.Scanner;

public class Atividade8 {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        int x, y, z; 
        System.out.print("Digite o valor de x: "); 
        x = teclado.nextInt(); 
        if (x % 5 == 0){ 
        System.out.print("O número "+ x+ " é múltiplo de 5"); 
        }else{ 
	System.out.print("O número "+ x+ " NÃO é múltiplo de 5");
        }   
    } 
}
