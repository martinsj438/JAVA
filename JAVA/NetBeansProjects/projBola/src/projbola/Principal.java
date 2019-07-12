
package projbola;

import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Bola bola = new Bola();
        
        Bola bola2 = new Bola();
        Bola bola3 = new Bola();
        Bola bola4 = new Bola();
        
        System.out.print("Nova cor: ");
        bola.trocarcor(x.next());
        
        System.out.print("Circunferencia: ");
        bola.circunferencia = x.nextFloat();
        
        System.out.print("Material: ");
        bola.material = x.next();
           
        
        System.out.println("" 
                + "Cor: " + bola.mostraCor() +"\n"
                + "Circunferencia: " + bola.circunferencia +"\n"
                + "Material: " + bola.material + "\n");
    }
    
}
