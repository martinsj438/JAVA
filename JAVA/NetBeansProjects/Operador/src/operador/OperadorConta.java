
package operador;

import javax.swing.JOptionPane;

public class OperadorConta {

   
    public static void main(String[] args) {	  
	   String a, b, escolha;  
	   int es;     
	   float c, d, e;  
	  
	  
	//DEFINIÇÃO DAS VARIAVEIS  
	     
	   escolha = JOptionPane.showInputDialog ("Digite 0 para soma, \n Digite 1 para subtraçao, \n Digite 2 para divisao, \n Digite 3 para multiplicacao");  
	   es = Integer.parseInt(escolha);  
	   a = JOptionPane.showInputDialog ("Digite o primeiro numero");  
	   c = Float.parseFloat(a);  
	   b = JOptionPane.showInputDialog ("Digite o segundo numero");  
	   d = Float.parseFloat(b);  
	     
	     
	     
	//SWITCH CASE  
	        
	   switch (es)     
	       {  
	   case 0:   
	    e = c + d;  
	    JOptionPane.showMessageDialog(null, "Resultado da soma: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
	  
	   case 1:   
            e = c - d;  
	     JOptionPane.showMessageDialog(null, "Resultado da subtracao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
	  
	   case 2:   
	    e = c / d;  
	    JOptionPane.showMessageDialog(null, "Resultado da divisao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
	  
	   case 3:   
	    e = c * d;  
	    JOptionPane.showMessageDialog(null, "Resultado da multiplicacao: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );break;  
	  
	}  
	System.exit(0);  
    }  
} 
    
    

