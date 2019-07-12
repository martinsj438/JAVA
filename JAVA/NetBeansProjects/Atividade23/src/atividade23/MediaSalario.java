
package atividade23;

import javax.swing.JOptionPane;

public class MediaSalario {

    
    public static void main(String[] args) {
       int quantidadeFuncionario = 0;
        float salarioFuncionario = 0;
        float totalSalario = 0;
        float mediaSalarial = 0;
       
        int contador = 0;
         
        quantidadeFuncionario = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários","Número de funcionários",JOptionPane.QUESTION_MESSAGE));
         
        while (contador < quantidadeFuncionario){
            contador++;
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário","Salário",JOptionPane.QUESTION_MESSAGE));
            totalSalario = totalSalario + salarioFuncionario;
        }
         
        mediaSalarial = totalSalario / quantidadeFuncionario;
        System.out.println("Média Salarial = " + mediaSalarial);
 
        System.exit(0);
    }
}
    
    

    

