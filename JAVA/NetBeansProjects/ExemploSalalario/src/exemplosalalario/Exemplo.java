
package exemplosalalario;

import javax.swing.JOptionPane;

public class Exemplo {

   
    public static void main(String[] args) {
       /*int quantidadeFuncionarios = 0;
        float salarioFuncionario = 0;
        float totalSalarios = 0;
        float mediaSalarial = 0;
       
        int contadora = 0;
         
        quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários","Número de funcionários",JOptionPane.QUESTION_MESSAGE));
         
        while (contadora < quantidadeFuncionarios){
            contadora++;
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário","Salário",JOptionPane.QUESTION_MESSAGE));
            totalSalarios = totalSalarios + salarioFuncionario;
        }
         
        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("Média Salarial = " + mediaSalarial);
 
        System.exit(0);*/
       int pedido ;  
  
        System.out.println( "========== Barraca de Lanches ==========" ) ;  
        System.out.println( "Menu de lanches: " ) ;  
        System.out.println( "1 - X-Bacon" ) ;  
        System.out.println( "2 - X-Salada" ) ;  
        System.out.println( "3 - X-Picanha" ) ;  
        System.out.println( "4 - X-Tudo: Preço" ) ;  
  
        Scanner captura = new Scanner( System.in );  
        System.out.println( "Digite o número do seu lanche: " ) ;  
        pedido = captura.nextInt( ) ;  
  
        switch ( pedido ) {  
            case 1:  
                System.out.println( "Você escolheu X-Bacon" ) ;  
                System.out.println( "O preço do X-Bacon é: R$ 20" ) ;  
                break ;  
            case 2:  
                System.out.println( "Você escolheu X-Salada" ) ;  
                System.out.println( "O preço do X-Salada é: R$ 15" ) ;  
                break ;  
            case 3:  
                System.out.println( "Você escolheu X-Picanha" ) ;  
                System.out.println( "O preço do X-Picanha é: R$ 22" ) ;  
                break ;  
            case 4:  
                System.out.println( "Você escolheu X-Tudo" ) ;  
                System.out.println( "O preço do X-Tudo é: R$ 30" ) ;  
                break ;  
            default:  
                System.out.println( "Erro! Número não existe no menu!" ) ;  
                break ;  
        }  
    }  
  
}  
    
    
    

