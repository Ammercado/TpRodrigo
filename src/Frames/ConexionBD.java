package Frames;
import java.sql.*;

public class ConexionBD {
    Connection cn;
    public Connection conexion(){
       try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        System.out.println("Conexion exitosa");
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("no soportado");
    }
    
}
