
package carro;


public class Carro {

   /*
	 * Modificadores de acesso.
	 * 
	 * public - Acesso permitido para qualquer arquivo do programa. default -
	 * Privado de pacote - Acesso permitido para qualquer arquivo do mesmo
	 * pacote. protected - Acesso permitido desde que haja herança. private -
	 * Acesso permitido somente para o próprio.
	 */

	private String modelo;
	private int ano;
	private String cor;
	private double preco;

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo.toUpperCase().trim();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 20000) {
			System.out.println("Valor não armazenado! Assumido valor minimo");
			this.preco = 20000;
		} else {
			this.preco = preco;
		}	
	}

}


    
        
    
    

