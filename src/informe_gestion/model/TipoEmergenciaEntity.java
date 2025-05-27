package informe_gestion.model;

public class TipoEmergenciaEntity {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean activo;

    public TipoEmergenciaEntity() {
    }
    public TipoEmergenciaEntity(int id, String nombre, String descripcion, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return nombre; // Esto se mostrará en el JComboBox
    }

}
