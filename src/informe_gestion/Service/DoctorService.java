package informe_gestion.Service;

import informe_gestion.Repository.DoctorRepository;
import informe_gestion.model.DoctorEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private DoctorRepository repository = new DoctorRepository();

    public List<DoctorEntity> obtenerDoctores() {
        try {
            return repository.listarDoctores();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Retorna lista vacía si ocurre error
        }
    }
}
