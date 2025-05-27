package informe_gestion.Service;

import informe_gestion.Repository.TipoEmergenciaRepository;
import informe_gestion.model.TipoEmergenciaEntity;

import java.util.List;

public class TipoEmergenciaService {
    private final TipoEmergenciaRepository repository;

    public TipoEmergenciaService() {
        this.repository = new TipoEmergenciaRepository();
    }

    /**
     * Retorna la lista de tipos de emergencia obtenidos del repositorio.
     */
    public List<TipoEmergenciaEntity> listarTiposEmergencia() {
        return repository.obtenerTodos();
    }
}
