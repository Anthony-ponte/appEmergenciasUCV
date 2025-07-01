package informe_gestion.Controller;


import informe_gestion.model.AtencionDetalleDTO;
import informe_gestion.model.AtencionEntity;
import informe_gestion.model.AtencionRepository;
import java.util.List;

public class AtencionService {
    private AtencionRepository atencionRepository = new AtencionRepository();

    public void guardarAtencion(AtencionEntity atencion) {
        // Aquí podrías agregar validaciones o lógica adicional
        atencionRepository.guardar(atencion);
    }
    
    public List<AtencionDetalleDTO> obtenerHistorialPorEmergencia(int idEmergencia) {
        return atencionRepository.obtenerHistorialPorEmergencia(idEmergencia);
    }
}

