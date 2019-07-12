
package aula;

public class Carro {

    public String modelo;
    public int ano;
    public String cor;
    public double preco1;
 //   public double preco2;
    
    
    public double calcularMedia(){
        
       double media = 0;
       media = (this.preco1 + this.preco1)/2;
       return media;
    }
    
    public void verificarSituacao(double preto1){
    
        if (preco1 <= 2.000){
           System.out.println(preco1 + " Valor permitido");
        }else if (preco1 >= 2.000){
           System.out.println(preco1 + " Valor não permitido");
      //}else{
        // System.out.println(nome + " - Valor permitido");
        }
        
    }
    
}
    
    

