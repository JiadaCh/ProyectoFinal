package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author jiada
 */
@Entity
public class Cliente implements Serializable {
    @Id
    protected String id;

    @Basic
    protected String nombre;
    
    @Basic
    protected String apellidos;
    
    @Basic
    protected String direccion;
    
    @Temporal (TemporalType.TIMESTAMP)
    protected Date fechaNac;
    
    @Basic
    protected String email;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
