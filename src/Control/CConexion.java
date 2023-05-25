package Control;

import Ventanas.MenuCliente;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiada
 */
public class CConexion{

    final String url = "jdbc:mysql://localhost:3306/proyectofinal";
    String user = "jiada";
    String password = "1234";
    final String driver = "com.mysql.cj.jdbc.Driver";
    Connection conexion = null;

    public CConexion() {

    }

    public Connection conectar() {

        try {
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }

        return conexion;
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }

    

}
