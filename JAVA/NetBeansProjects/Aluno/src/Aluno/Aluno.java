
package Aluno;

public class Aluno {

    public String nome;
    public int idade;
    public double nota1;
    public double nota2; 

    public double calcularMedia(){
        
       double media = 0;
       media = (this.nota1 + this.nota2)/2;
       return media;
    }
    
    public void verificarSituacao(double media){
    
        if (media >= 7){
           System.out.println(nome + " - Aluno Aprovado");
        }else if (media > 6){
           System.out.println(nome + " - Aluno em Recuperação");
        }else{
           System.out.println(nome + " - Aluno em Recuperação");
        }
        
    }
    
}
