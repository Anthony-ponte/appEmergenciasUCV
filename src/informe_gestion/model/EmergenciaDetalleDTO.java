/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informe_gestion.model;
import java.sql.Timestamp;



/**
 *
 * @author kenyp
 */
public class EmergenciaDetalleDTO {
    private int idEmergencia;
    private String nombresApellidos;
    private String ubicacion;
    private String descripcion;
    private String tipoEmergencia;
    private Timestamp fechaRegistro;

    public EmergenciaDetalleDTO() {
    }

    public EmergenciaDetalleDTO(int idEmergencia, String nombresApellidos, String ubicacion, String descripcion, String tipoEmergencia, Timestamp fechaRegistro) {
        this.idEmergencia = idEmergencia;
        this.nombresApellidos = nombresApellidos;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipoEmergencia = tipoEmergencia;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(int idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
