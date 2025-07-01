package informe_gestion.Controller;

import informe_gestion.model.EmergenciaDetalleDTO;
import informe_gestion.model.EmergenciaRepository;
import informe_gestion.model.EmergenciaEntity;
import java.sql.Date;

import java.util.List;
import java.util.Optional;

public class EmergenciaService {
    private EmergenciaRepository emergenciaRepository;

    public EmergenciaService() {
        this.emergenciaRepository = new EmergenciaRepository();
    }

    public boolean registrarEmergencia(EmergenciaDto emergenciaDto){
        EmergenciaEntity emergenciaEntity= new EmergenciaEntity();
        emergenciaEntity.setNombre_apellidos(emergenciaDto.getNombre_apellidos());
        emergenciaEntity.setTipo_emergencia(emergenciaDto.getTipo_emergencia());
        emergenciaEntity.setUbicacion(emergenciaDto.getUbicacion());
        emergenciaEntity.setDescripcion(emergenciaDto.getDescripcion());

        return emergenciaRepository.registrarEmergencia(emergenciaEntity);
    }
    public List<EmergenciaEntity> obtenerEmergencias() {
        return emergenciaRepository.listarEmergencias();
    }
    public void eliminarEmergenciaPorId(Long id) {
        if (!emergenciaRepository.existePorId(id)) {
            throw new IllegalArgumentException("No se encontró la emergencia con ID: " + id);
        }

        emergenciaRepository.eliminarPorId(id);
    }

    public void CancelarEmergenciaPorId( Long id) {
        if (!emergenciaRepository.existePorId(id)) {
            throw new IllegalArgumentException("No se encontró la emergencia con ID: " + id);
        }

        emergenciaRepository.CancelarPorId(id);
    }

    public EmergenciaEntity obtenerEmergenciaPorId(int id) {
        return emergenciaRepository.obtenerEmergenciaPorId(id);
    }
    
    public EmergenciaDetalleDTO obtenerDetalleEmergencia(int idEmergencia) {
        Optional<EmergenciaDetalleDTO> optional = emergenciaRepository.obtenerDetalleEmergenciaPorId(idEmergencia);
        return optional.orElse(null);
    }
    
     public List<EmergenciaDetalleDTO> obtenerEmergenciasPorFechas(Date fechaInicio, Date fechaFin) {
        return emergenciaRepository.listarPorRangoFechas(fechaInicio, fechaFin);
    }
}
