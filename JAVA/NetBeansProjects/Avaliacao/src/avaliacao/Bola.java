
package avaliacao;


public class Bola {
    public String cor;
    public double circunferencia;
    public String material;
  
    
    public void cor(String novaCor){
        if (novaCor.equals("")){
        cor = null;
        }
    }
    
    
    public String mostraCor(){
        return cor;
        
    }
}
