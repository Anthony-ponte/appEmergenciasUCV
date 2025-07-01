package informe_gestion.model;

public class AtencionEntity {
    private int id;
    private int emergenciaId;
    private int doctorId;
    private String observaciones;
    private boolean traslado;
    private String destinoTraslado;

    public AtencionEntity() {
    }

    public AtencionEntity(int id, int emergenciaId, int doctorId, String observaciones, boolean traslado, String destinoTraslado) {
        this.id = id;
        this.emergenciaId = emergenciaId;
        this.doctorId = doctorId;
        this.observaciones = observaciones;
        this.traslado = traslado;
        this.destinoTraslado = destinoTraslado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmergenciaId() {
        return emergenciaId;
    }

    public void setEmergenciaId(int emergenciaId) {
        this.emergenciaId = emergenciaId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
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
