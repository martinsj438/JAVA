
package Principal;
import aula.Carro;

public class Execucao {
    public static void main(String[] args){
      
       Carro a1 = new Carro();
       Carro a2 = new Carro();
       
       a1.modelo = "Uno Fiat";
       a1.ano = 2006;
       a1.cor = "preto";
       a1.preco1 = 2.500;
       
       a2.modelo = "Palio Chevrolet";
       a2.ano = 2007;
       a2.cor = "Branco";
       a2.preco1 = 2.000;
       
       System.out.println("Modelo.: " + a1.modelo);
       System.out.println("Ano: " + a1.ano);
       System.out.println("Cor.: " + a1.cor);
       System.out.println("Preco1.: " + a1.preco1);
       System.out.println("Preto1.: " + a1.calcularMedia());
       a1.verificarSituacao(a1.calcularMedia());
       
       System.out.println();
       
       System.out.println("Modelo.: " + a2.modelo);
       System.out.println("Ano: " + a2.ano);
       System.out.println("Cor.: " + a2.cor);
       System.out.println("Preco1.: " + a2.preco1);
       System.out.println("preco1.: " + a2.calcularMedia());
       a1.verificarSituacao(a2.calcularMedia());
    }
}


