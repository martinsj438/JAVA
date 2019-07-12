
package Principal;

import Aluno.Aluno;

public class Execucao {
    
    public static void main(String[] args){
      
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno();
       
       a1.nome = "Bia";
       a1.idade = 19;
       a1.nota1 = 7.5;
       a1.nota2 = 4.75;
       
       a2.nome = "Leo";
       a2.idade = 21;
       a2.nota1 = 6;
       a2.nota2 = 4.75;
       
       System.out.println("Nome.: " + a1.nome);
       System.out.println("Idade: " + a1.idade);
       System.out.println("Nota1.: " + a1.nota1);
       System.out.println("Nota2.: " + a1.nota2);
       System.out.println("Media.: " + a1.calcularMedia());
       a1.verificarSituacao(a1.calcularMedia());
       
       System.out.println();
       
       System.out.println("Nome.: " + a2.nome);
       System.out.println("Idade: " + a2.idade);
       System.out.println("Nota1.: " + a2.nota1);
       System.out.println("Nota2.: " + a2.nota2);
       System.out.println("Media.: " + a2.calcularMedia());
       a1.verificarSituacao(a2.calcularMedia());
    }
}
