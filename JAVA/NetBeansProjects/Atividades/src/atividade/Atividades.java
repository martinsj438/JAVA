
package atividade;

import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in); 
	 int x; 
	  System.out.print("Digite um número: "); 
	   x = teclado.nextInt(); 
	    if (x < 0){ 
		 System.out.print("O número é negativo"); 
		  }else{
            System.out.print("O número é positivo"); 
			 }  
    }
}
   
