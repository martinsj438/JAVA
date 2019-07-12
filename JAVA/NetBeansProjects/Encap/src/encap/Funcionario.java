
package encap;


public class Funcionario {
    private double salario;
    private String nome;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public class TestaFuncionario {
   }  
   
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago");
        funcionario.setSalario(2500);
            
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
           
       }
   }
  

    

