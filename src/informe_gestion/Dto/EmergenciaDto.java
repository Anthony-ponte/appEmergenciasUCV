package informe_gestion.Dto;

public class EmergenciaDto {

    public String nombre_apellidos;
    public int tipo_emergencia;
    public String ubicacion;
    public String descripcion;

    public EmergenciaDto() {
    }

    public EmergenciaDto(String nombre_apellidos, int tipo_emergencia, String ubicacion, String descripcion) {
        this.nombre_apellidos = nombre_apellidos;
        this.tipo_emergencia = tipo_emergencia;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

    public int getTipo_emergencia() {
        return tipo_emergencia;
    }

    public void setTipo_emergencia(int tipo_emergencia) {
        this.tipo_emergencia = tipo_emergencia;
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

    @Override
    public String toString() {
        return "EmergenciaDto{" +
                "nombre_apellidos='" + nombre_apellidos + '\'' +
                ", tipo_emergencia='" + tipo_emergencia + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

}
