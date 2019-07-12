
package je;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in); 
	int x, sucessor; 
	System.out.println("Digite o número: "); 
	x = teclado.nextInt(); 
	sucessor = x + 1; 
	System.out.println("O sucessor de x é: " + sucessor); 
    }
}
  
