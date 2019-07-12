package jeff;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       int i, idade, idadeMaisNova; 
       String nome, nomeMaisNova; 
       System.out.println("Digite o nome:"); 
       nome = teclado.next() + teclado.nextLine(); 
       System.out.println("Digite a idade: "); 
       idade = teclado.nextInt(); 
       idadeMaisNova = idade; 
       nomeMaisNova = nome; 
       for (i=1; i<=9; i++){ 
       System.out.println("Digite o nome:"); 
       nome = teclado.next() + teclado.nextLine(); 
       System.out.println("Digite a idade: "); 
       idade = teclado.nextInt(); 
       if (idade < idadeMaisNova){ 
       nomeMaisNova = nome; 
       idadeMaisNova = idade; 
       }  } 
       System.out.println("Pessoa Mais Nova - Nome: "+ nomeMaisNova+
       "Idade:" + idadeMaisNova);
    }
    
}
