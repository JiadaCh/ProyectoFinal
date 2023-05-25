package Control;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.persistence.*;

/**
 *
 * @author jiada
 */
public class Conexion {
    
    String url = "jdbc:mysql://localhost:3306/proyectofinal";
    String user = "jiada";
    String password = "1234";
    String driver = "";
    Connection conectar = null;
    
    public Conexion(){
        
    }
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ex.getMessage());
        } 
        
        return conectar;
    }
    
    public void desconectar(){
        try{
            conectar.close();
        } catch (IOException ex){
            Logger.getLogger(ex.getMessage());
        }
    }
    
}
