
package jeff;

import java.util.Scanner;

public class Atividade13 {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i, numero, soma; 
        i = 1; 
        soma = 0; 
        while (i<=10)
        {
        System.out.println("Digite um número: "); 
        numero = teclado.nextInt();
        soma += numero; 
        i++;
        } 
        System.out.println("A soma dos números digitados é: "+soma);
    }
}      
           
    
    

