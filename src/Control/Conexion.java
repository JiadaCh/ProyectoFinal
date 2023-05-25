package Control;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author jiada
 */
public class Conexion {
    
    static final String url = "jdbc:mysql://localhost:3306/proyectofinal";
    static String user = "jiada";
    static String password = "1234";
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static Connection conexion = null;
    
    public Conexion(){
        
    }
    
    public static Connection conectar(){
        
        try{
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ex.getMessage());
        } 
        
        return conexion;
    }
    
    public static void desconectar(){
        try{
            conexion.close();
        } catch (IOException ex){
            Logger.getLogger(ex.getMessage());
        }
    }
    

    
}
