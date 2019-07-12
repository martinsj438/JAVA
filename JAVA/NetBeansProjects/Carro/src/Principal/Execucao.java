
package Principal;
import Principal.Execucao;

public class Execucao {
   public static void main(String[] args) {
		
		Carro c = new carro();
		
		// Atribuir valores ao objeto.
		c.setModelo("FOrd FUsioN");
		c.setAno(2008);
		c.setCor("         Prata      ");
		c.setPreco(30000);

		// Obter valores do objeto.
		System.out.println("Modelo: " + c.getModelo());
		System.out.println("Ano: " + c.getAno());
		System.out.println("Cor: " + c.getCor());
 
}
}
