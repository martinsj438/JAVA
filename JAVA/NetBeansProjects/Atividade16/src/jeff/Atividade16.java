package jeff;

import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
        int i, qtdFuncionarios, tempoServico; 
        String nome; 
        System.out.print("Digite a quantidade de funcionários: "); 
         qtdFuncionarios = teclado.nextInt(); 
          for (i=1; i<= qtdFuncionarios; i++){ 
               System.out.println("Digite o nome do funcionario: "); 
                nome = teclado.next() + teclado.nextLine();
           System.out.println("Digite o tempo de serviço em meses: "); 
                tempoServico = teclado.nextInt(); 
                 if (tempoServico >= 12){ 
                 System.out.println(nome+ " tem direito à férias"); 
                  }else{ 
                       System.out.println(nome+ " NÃo tem direito à férias"); 
            }
        }
    }   
}
