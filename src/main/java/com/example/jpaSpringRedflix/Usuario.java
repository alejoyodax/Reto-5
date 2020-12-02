/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringRedflix;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alejo
 */
@Entity
@Table(name="usuario")
public class Usuario {
    
    @Id
    //@GeneratedValues(strategy = GenerationType.IDENTITY)    --> si el id es un valor auto generado por mySQL
    @Column(name="usr_alias")   //nombre de la columna en la tabla de la BD
    String id;                  //tipo de dato y nombre de la variable (que guardará el dato de la tabla de la BD)
    
    @Column(name="usr_nombres")
    String nombre;

    @Column(name="usr_apellidos")
    String apellido;
    
    @Column(name="usr_email")
    String email;
    
    @Column(name="usr_celular")
    Long celular;
    
    @Column(name="usr_contraseña")
    String password;
    
    @Column(name="usr_fecha_nacimiento")
    String fecha;

    public Usuario() {
    }

        
    public Usuario(String id, String nombre, String apellido, String email, Long celular, String password, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.password = password;
        this.fecha = fecha;
    } 
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario\n"
                + "id: " + id + "\n"
                + "nombre: " + nombre + "\n"
                + "apellido: " + apellido + "\n"
                + "email: " + email + "\n"
                + "celular: " + celular + "\n"
                + "password: " + password + "\n"
                + "fecha: " + fecha;
    }

    

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
