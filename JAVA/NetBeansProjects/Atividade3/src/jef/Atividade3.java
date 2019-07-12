
package jef;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String [] args){
    	Scanner teclado = new Scanner (System.in);
            int x, y, resultado;
  	System.out.print("Digite o valor de x : ");
  	x = teclado.nextInt();
  	System.out.print("Digite o valor de y : ");
  	y = teclado.nextInt();
  	resultado = x * y;
  	System.out.print("O resultado de x * y é: " + resultado);
    }
}
 
