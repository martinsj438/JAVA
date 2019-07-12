
package atividade9;

import java.util.Scanner;

public class Atividade9 {

   
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int temp; 
    System.out.print("Digite o valor da temperatura: "); 
    temp = teclado.nextInt(); 
    if (temp <= 18) { 
    System.out.println("Clima frio");
    }else{ 
    if ((temp > 18) && (temp <= 23)) {
    System.out.println("Clima agradável"); 
    }else{ 
    if ((temp > 23) && (temp <= 35)) { 
    System.out.println("Clima quente"); 
    }else{ 
    System.out.println("Clima muito quente"); 
    } 
    } 
    }    
}  
}
