
package heranca;


public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaBonificacao(){
        return this.salario * 0.1;
    }
    
    public class Gerente extends Funcionario {
         
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }
    
    public class Secretaria extends Funcionario {
        private int ramal;
        
    public void setRamal(int ramal) {
            this.ramal = ramal;
    }
        
    public int getRamal() {
        return ramal;
    }
    
    public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;
    
    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
       this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public class TestaFuncionario {
        
       public static void main(String[] args) {
            
            Gerente gerente = new Gerente();
            gerente.setNome("Carlos Vieira");
            gerente.setSalario(3000.58);
            gerente.setUsuario("carlos.vieira");
            gerente.setSenha("5523");
            
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Pedro Castelo");
            funcionario.setSalario(1500);
            
            Telefonista telefonista = new Telefonista();
            telefonista.setNome("Luana Brana");
            telefonista.setSalario(1300.00);
            telefonista.setEstacaoDeTrabalho(20);
            
            Secretaria secretaria = new Secretaria();
            secretaria.setNome("Maria Ribeiro");
            secretaria.setSalario(1125.25);
            secretaria.setRamal(5);
            
            System.out.println("##### Gerente #####");
            System.out.println("Nome.: "+gerente.getNome());
            System.out.println("Salário.: "+gerente.getSalario());
            System.out.println("Usuário.: "+gerente.getUsuario());
            System.out.println("Senha.: "+gerente.getSenha());
            System.out.println("Bonificação.:
            "+gerente.calculaBonificacao());
            System.out.println();
            
            System.out.println("##### Funcionário #####");
            System.out.println("Nome.: "+funcionario.getNome());
            System.out.println("Salário.:
            "+funcionario.getSalario());
            System.out.println("Bonificação.:
            "+funcionario.calculaBonificacao());
            System.out.println();
            
            System.out.println("##### Telefonista #####");
            System.out.println("Nome.: "+telefonista.getNome());
            System.out.println("Salário.:
            "+telefonista.getSalario());
            System.out.println("Estação de Trabalho.:
            "+telefonista.getEstacaoDeTrabalho());
            System.out.println("Bonificação.:
            "+telefonista.calculaBonificacao());
            System.out.println();
            
            System.out.println("##### Secretária #####");
            System.out.println("Nome.: "+secretaria.getNome());
            System.out.println("Salário.:
            "+secretaria.getSalario());
            System.out.println("Ramal.: "+secretaria.getRamal());
            System.out.println("Bonificação.:
            "+secretaria.calculaBonificacao());
            System.out.println();
            }
        }    
    }
    
}
}
}


