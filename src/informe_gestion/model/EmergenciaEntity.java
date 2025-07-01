package informe_gestion.model;

public class EmergenciaEntity {
    private int id_emergencia;
    private String nombre_apellidos;
    private int tipo_emergencia;
    private String ubicacion;
    private String descripcion;
    private String fechaRegistro;
    private int estado;

    public EmergenciaEntity() {
    }

    public EmergenciaEntity(int id_emergencia, String nombre_apellidos, int tipo_emergencia, String ubicacion, String descripcion, String fechaRegistro, int estado) {
        this.id_emergencia = id_emergencia;
        this.nombre_apellidos = nombre_apellidos;
        this.tipo_emergencia = tipo_emergencia;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public int getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(int id_emergencia) {
        this.id_emergencia = id_emergencia;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
