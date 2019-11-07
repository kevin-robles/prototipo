package gestordocumental.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    static Connection contacto = null;
    
    public static Connection getConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(ClassNotFoundException e){
        
            System.out.println(e);
        }
        try{
            String  url = "jdbc:sqlserver://localhost:1433;databaseName=GestorDocumental";
            contacto = DriverManager.getConnection(url,"sa","123");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return contacto;
    }
}
