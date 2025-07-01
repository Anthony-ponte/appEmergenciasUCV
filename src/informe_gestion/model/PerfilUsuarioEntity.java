/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informe_gestion.model;

/**
 *
 * @author kenyp
 */
public class PerfilUsuarioEntity {
    

    private String nombre;
    private java.sql.Date nacimiento;
    private String email;
    private String contraseña;
    private String tipoUsuario;

    // Constructor
    public PerfilUsuarioEntity(String nombre, java.sql.Date nacimiento, String email, String contraseña, String tipoUsuario) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.email = email;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public java.sql.Date getNacimiento() {
        return nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(java.sql.Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
