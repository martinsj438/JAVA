
package encaps;


public class Colegio {
    
    private String nome;
    private String nivelacademico;
    private double horario;
    private String freqsemanal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelacademico() {
        return nivelacademico;
    }

    public void setNivelacademico(String nivelacademico) {
        this.nivelacademico = nivelacademico;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public String getFreqsemanal() {
        return freqsemanal;
    }

    public void setFreqsemanal(String freqsemanal) {
        this.freqsemanal = freqsemanal;
    }

    
 
     public class TesteColegio {
    }
 
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        colegio.setNome("Fernando");
        colegio.setHorario(5);
        colegio.setNivelacademico("1");
        colegio.setFreqsemanal("5");
                
            
        System.out.println(colegio.getNome());
        System.out.println(colegio.getHorario());
        System.out.println(colegio.getNivelacademico());
        System.out.println(colegio.getFreqsemanal());
                    
   }  
    
}
