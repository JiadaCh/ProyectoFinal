package Clases;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author jiada
 */
public class Conectar {
    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectofinal","jiada","1234");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ex.getMessage());
        } 
        
        return conectar;
    }
}
