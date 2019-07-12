
package avaliacao;


public class Bola {
    public String cor;
    public double circunferencia;
    public String material;
    
    public void trocarcor(String novaCor){
        if (!novaCor.equals("")){
        cor = novaCor;
        }
    }
    
    public String mostraCor(){
        return cor;
        
    }
}
