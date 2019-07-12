
package atividade;

import java.util.Scanner; 

public class Atividadess {

  
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner (System.in); 
     String sexo; 
     System.out.print("Digite seu sexo (M - para masculino / F - para feminino):"); 
      sexo = teclado.next(); 
      if (sexo.equals("M")){ 
      System.out.print("Seja bem-vindo, Senhor!"); 
      }else{ 
       System.out.print("Seja bem-vinda, Senhora!");
 } 
 } 
  }
   
