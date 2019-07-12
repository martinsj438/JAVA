
package desenhao;


public class Figura {
	
	private int linha;
	private String cor;
	
	public void pinta(String cor){
		System.out.println("Pintou figura genérica com a cor " + cor);
	}
	
	public void desenha(int linha){
		System.out.println("Desenhou figura genérica com a linha " + linha);
	}	


    public class Circulo extends Figura{
	
	public void pinta(String cor){
		System.out.println("Pintou circulo com a cor " + cor);
	}
	
	public void desenha(int linha){
		System.out.println("Desenhou circulo com a linha " + linha);
	}
        public class Triangulo extends Figura {
	
	public void pinta(String cor){
		System.out.println("Pintou triangulo com a cor " + cor);
	}
	
	public void desenha(int linha){
		System.out.println("Desenhou triangulo com a linha " + linha);
	}
         
    public class MeuPaint {

	public static void main(String[] args) {

		Figura fig = new Figura();
		
		fig.desenha(2);
		fig.pinta("Amarelo");

		
		fig = new Triangulo();
		fig.desenha(7);
		fig.pinta("Vermelho");
		
		fig = new Circulo();
		fig.desenha(2);
		
	}

}

}
}
}



