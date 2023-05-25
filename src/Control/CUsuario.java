package Control;

import Ventanas.Login;
import Ventanas.MenuModulos;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiada
 */
public class CUsuario {

    Control.CConexion cx = new Control.CConexion();

    public void validarLogin(JTextField usuario, JPasswordField contra) {
        if (cx != null) {
            try {
                ResultSet rs = null;
                PreparedStatement ps = null;

                String consulta = "select * from usuario where nombre='" + usuario + "' and contrasena='" + contra + "'";
                ps = cx.getConexion().prepareStatement(consulta);

                ps.setString(1, usuario.getText());
                ps.setString(2, String.valueOf(contra.getPassword()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    MenuModulos menu = new MenuModulos();
                    menu.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecto");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "DB no conectado");
        }

    }

    public void validarRegistro(JTextField usuario, JPasswordField contra, JTextField email) {

        if (cx != null) {

            try {

                PreparedStatement ps = null;

                String consulta = "Insert into usuario values(?,?,?)";
                ps = cx.getConexion().prepareStatement(consulta);

                ps.setString(1, usuario.getText());
                ps.setString(2, String.valueOf(contra.getPassword()));
                ps.setString(3, String.valueOf(email.getText()));
                int rs = ps.executeUpdate();

                Login log = new Login();
                log.setVisible(true);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "DB no conectado");
        }
    }

    public boolean buscar(String id) {
        try {
            PreparedStatement ps = cx.conectar().prepareStatement("select * from usuario where nombre='" + id+"'");

            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

}
