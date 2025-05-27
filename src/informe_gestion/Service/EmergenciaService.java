package informe_gestion.Service;

import informe_gestion.Dto.EmergenciaDto;
import informe_gestion.Repository.EmergenciaRepository;
import informe_gestion.model.EmergenciaEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}
