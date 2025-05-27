package informe_gestion.Repository;

import informe_gestion.Dto.EmergenciaDto;
import informe_gestion.config.ConexionMySQL;
import informe_gestion.model.EmergenciaEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmergenciaRepository {

    //implementar metodo para regisitrar emergencia en base de datos
    public boolean registrarEmergencia(EmergenciaEntity emergenciaEntity){
        String sql = "INSERT INTO emergencias (nombres_apellidos, tipo_emergencia, ubicacion, descripcion) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionMySQL.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emergenciaEntity.getNombre_apellidos());
            ps.setInt(2, emergenciaEntity.getTipo_emergencia());
            ps.setString(3, emergenciaEntity.getUbicacion());
            ps.setString(4, emergenciaEntity.getDescripcion());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<EmergenciaEntity> listarEmergencias() {
        List<EmergenciaEntity> lista = new ArrayList<>();

        String sql = "SELECT * FROM emergencias WHERE activo = true";

        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                EmergenciaEntity emergencia = new EmergenciaEntity();
                emergencia.setId_emergencia(rs.getInt("id_emergencia"));
                emergencia.setNombre_apellidos(rs.getString("nombres_apellidos"));
                emergencia.setTipo_emergencia(rs.getInt("tipo_emergencia"));
                emergencia.setUbicacion(rs.getString("ubicacion"));
                emergencia.setDescripcion(rs.getString("descripcion"));
                emergencia.setFechaRegistro(rs.getString("fecha_registro"));
                emergencia.setActivo(rs.getBoolean("activo"));

                lista.add(emergencia);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // O manejar con logger
        }

        return lista;
    }
}
