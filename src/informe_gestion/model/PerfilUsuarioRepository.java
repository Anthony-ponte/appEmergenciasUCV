
package informe_gestion.model;


import com.mysql.cj.jdbc.PreparedStatementWrapper;
import informe_gestion.config.ConexionMySQL;
import informe_gestion.model.PerfilUsuarioEntity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PerfilUsuarioRepository {

    public boolean guardarPerfil(PerfilUsuarioEntity perfil) {
        String sql = "{ CALL sp_guardar_perfil_usuario(?, ?, ?, ?, ?) }";

        try (Connection conn = ConexionMySQL.getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, perfil.getNombre());
            stmt.setDate(2, perfil.getNacimiento()); // java.sql.Date
            stmt.setString(3, perfil.getEmail());
            stmt.setString(4, perfil.getContraseña());
            stmt.setString(5, perfil.getTipoUsuario());

            stmt.execute();
            return true;

        } catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
            return false;
        }
    }
    
    public PerfilUsuarioEntity buscarPorCredenciales(String email, String contraseña) {
    String sql = "SELECT * FROM perfiles_usuarios WHERE email = ? AND contraseña = ?";

    try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, email);
        stmt.setString(2, contraseña);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Construimos y devolvemos el objeto encontrado
            return new PerfilUsuarioEntity(
                rs.getString("nombre"),
                rs.getDate("nacimiento"),
                rs.getString("email"),
                rs.getString("contraseña"),
                rs.getString("tipo_usuario")
            );
        }
    } catch (Exception e) {
        System.err.println("Error al buscar usuario: " + e.getMessage());
    }
    return null; // No encontrado
}
}
