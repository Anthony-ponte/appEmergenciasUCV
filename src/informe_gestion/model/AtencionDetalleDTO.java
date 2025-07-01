/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informe_gestion.model;

import java.sql.Timestamp;

public class AtencionDetalleDTO {
    

    private int idAtencion;
    private String nombreDoctor;
    private String apellidoDoctor;
    private String especialidad;
    private Timestamp fechaAtencion;
    private String observaciones;
    private boolean traslado;
    private String destinoTraslado;

    public AtencionDetalleDTO() {
    }

    public AtencionDetalleDTO(int idAtencion, String nombreDoctor, String apellidoDoctor, String especialidad, Timestamp fechaAtencion, String observaciones, boolean traslado, String destinoTraslado) {
        this.idAtencion = idAtencion;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.especialidad = especialidad;
        this.fechaAtencion = fechaAtencion;
        this.observaciones = observaciones;
        this.traslado = traslado;
        this.destinoTraslado = destinoTraslado;
    }

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Timestamp getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Timestamp fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isTraslado() {
        return traslado;
    }

    public void setTraslado(boolean traslado) {
        this.traslado = traslado;
    }

    public String getDestinoTraslado() {
        return destinoTraslado;
    }

    public void setDestinoTraslado(String destinoTraslado) {
        this.destinoTraslado = destinoTraslado;
    }

    
}
