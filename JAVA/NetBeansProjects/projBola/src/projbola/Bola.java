
package projbola;


public class Bola {
    public String cor;
    public float circunferencia;
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