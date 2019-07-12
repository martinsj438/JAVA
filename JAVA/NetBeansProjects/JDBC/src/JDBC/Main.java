
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    private Connection con;
    private Statement stmt;

    public Main(){
    try{
   Class.forName("com.mysql.cj.jdbc.Driver");
    } catch(ClassNotFoundException e){
    System.out.println("Error: "+ e.getMessage());

    }
    String url = "jdbc:mysql://127.0.0.1:3306/banco?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String password = "";
    try{
    con = DriverManager.getConnection(url,user,password);
    stmt = con.createStatement();
    }catch(SQLException e){
    System.out.println("Error: "+ e.getMessage());
    }

    try{
    con = DriverManager.getConnection(url,user,password);
    stmt = con.createStatement();
    }catch(SQLException e){
    System.out.println("Error: "+ e.getMessage());
    }  
    insertRecord();    
    }
    public void insertRecord(){
    try{
    stmt.executeUpdate("INSERT INTO Funcionario VALUES (6,'FREDERICO','PEREIRA','433','830', 'Eng','2','BRA','678.00')");
    }catch(SQLException e){
    System.out.println("Error: "+ e.getMessage());
    }
    }
    public static void main(String[] args) {
    new Main();
    }
}