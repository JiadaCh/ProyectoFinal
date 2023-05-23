package Control;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.persistence.*;

/**
 *
 * @author jiada
 */
public class Conexion {

    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectofinal","jiada","1234");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ex.getMessage());
        } 
        
        return conectar;
    }
}
