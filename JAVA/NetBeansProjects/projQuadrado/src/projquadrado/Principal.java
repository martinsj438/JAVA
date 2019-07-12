
package projquadrado;

import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();
        Quadrado quadrado3 = new Quadrado();
        
        System.out.print("Qual comprimento do Lado lado 1:");
        quadrado1.mudarLado(s.nextFloat());
        
        System.out.print("Qual comprimento do Lado lado 2:");
        quadrado2.mudarLado(s.nextFloat());
        
        System.out.print("Qual comprimento do Lado lado 3:");
        quadrado3.mudarLado(s.nextFloat());
        
           
        
        System.out.println("" 
                + "Lado: " + quadrado1.retornarLado() +"\n"
                + "Area: " + quadrado1.calcularArea() +"\n"
        
                + "Lado: " + quadrado2.retornarLado() +"\n"
                + "Area: " + quadrado2.calcularArea() +"\n"
                
                + "Lado: " + quadrado3.retornarLado() +"\n"
                + "Area: " + quadrado3.calcularArea() +"\n");
    }
    
}
