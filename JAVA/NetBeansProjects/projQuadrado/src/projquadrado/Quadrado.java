
package projquadrado;


public class Quadrado {
    
    float lado;
    
    public void mudarLado(float lado){
        if (lado > 0){
        this.lado = lado;
        }
    }
    
    public float retornarLado(){
        return lado;
    }    
    
    public float calcularArea(){
        return lado*lado;
    }

    float tamanhoLado() {
        return lado;
    }
}