
package informe_gestion.Controller;


import informe_gestion.model.PerfilUsuarioEntity;
import informe_gestion.model.PerfilUsuarioRepository;


import java.sql.Date;

public class PerfilUsuarioService {

    private PerfilUsuarioRepository repository;

    public PerfilUsuarioService() {
        this.repository = new PerfilUsuarioRepository();
    }

    public boolean registrarPerfil(String nombre, String nacimientoTexto, String email, String contraseña, String tipoUsuario) {
        try {
            // Convertir texto a java.sql.Date (asegúrate que venga en formato yyyy-MM-dd)
            Date fechaNacimiento = Date.valueOf(nacimientoTexto);

            PerfilUsuarioEntity perfil = new PerfilUsuarioEntity(nombre, fechaNacimiento, email, contraseña, tipoUsuario);

            return repository.guardarPerfil(perfil);

        } catch (IllegalArgumentException e) {
            System.err.println("Fecha inválida: " + nacimientoTexto);
            return false;
        } catch (Exception e) {
            System.err.println("Error en el servicio al registrar perfil: " + e.getMessage());
            return false;
        }
    }
    
    public PerfilUsuarioEntity login(String email, String contraseña) {
        return repository.buscarPorCredenciales(email, contraseña);
    }
}
