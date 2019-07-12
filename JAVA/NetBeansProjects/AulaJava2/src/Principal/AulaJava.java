
package Principal;


public class AulaJava {
    public class TestString{
       public static void main(String args[]) {
           Systen.out.printin(Character.isDigit('C'));
           Systen.out.printin(Character.isDigit('S'));
           
            Systen.out.printin(Character.isLetter('C'));
            Systen.out.printin(Character.isLetter('S'));
            
            Systen.out.printin(Character.isLetterOrDigite('C'));
            Systen.out.printin(Character.isLetterOrDigite('S'));
            
            Systen.out.printin(Character.isUpperCase('C'));
            Systen.out.printin(Character.isUpperCase('C'));
            
            Systen.out.printin(Character.isLowerCase('C'));
            Systen.out.printin(Character.isLowerCase('C'));
            
            Systen.out.printin(Character.isUpperCase(''));
           
            String a ="testejava.html";
            a = a.replaceAll("html,jsp");
            System.out.print(a);
    
}
