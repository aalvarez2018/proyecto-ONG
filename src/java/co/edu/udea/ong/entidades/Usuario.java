/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.ong.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ?
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Column
    private String nombre;
    @Column
    private String correo;
    @Id
    @Column
    private String cedula;
    @Column
    private String profesion;
    @Column
    private boolean esDonante;

    public Usuario(String nombre, String correo, String cedula, String profesion, boolean esDonante) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.profesion = profesion;
        this.esDonante = esDonante;
    }

    public Usuario(){}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public boolean isEsDonante() {
        return esDonante;
    }

    public void setEsDonante(boolean esDonante) {
        this.esDonante = esDonante;
    }
    
        
}
