
package jeffe;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        double dolar, cotacao, real;
            Scanner converter = new Scanner(System.in);
            System.out.println("Digite o valor em dolar");
            dolar  = converter.nextFloat(); 
            cotacao = 4.14;
            real =  dolar * cotacao;
            System.out.println ("O valor em Real é " + real);      
     }
}
  