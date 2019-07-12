
package figura;


public class Figura {

    private int linha;
    private String cor;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public class TesteFigura {
    }    
    
    public class Circulo {

    private int pintar;
    private String desenho;

        public int getPintar() {
            return pintar;
        }

        public void setPintar(int pintar) {
            this.pintar = pintar;
        }

        public String getDesenho() {
            return desenho;
        }

        public void setDesenho(String desenho) {
            this.desenho = desenho;
        }
    }
    
    public class Triangulo {

        public int getPintar() {
            return pintar;
        }

        public void setPintar(int pintar) {
            this.pintar = pintar;
        }

        public String getDesenho() {
            return desenho;
        }

        public void setDesenho(String desenho) {
            this.desenho = desenho;
        }
    }    
    private int pintar;
    private String desenho;
    
    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.setLinha(2);
        figura.setCor("5");
        
        System.out.println(figura.getLinha());
        System.out.println(figura.getCor());
    }
    
  
        
    
}

