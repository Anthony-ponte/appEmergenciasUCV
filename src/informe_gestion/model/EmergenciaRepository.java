package informe_gestion.model;

import informe_gestion.config.ConexionMySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmergenciaRepository {

    //implementar metodo para regisitrar emergencia en base de datos
    public boolean registrarEmergencia(EmergenciaEntity emergenciaEntity) {
        String sql = "{ CALL insertar_emergencia(?, ?, ?, ?) }";

        try (Connection con = ConexionMySQL.getConexion();
             CallableStatement cs = con.prepareCall(sql)) {

            cs.setString(1, emergenciaEntity.getNombre_apellidos());
            cs.setInt(2, emergenciaEntity.getTipo_emergencia());
            cs.setString(3, emergenciaEntity.getUbicacion());
            cs.setString(4, emergenciaEntity.getDescripcion());

            int filasAfectadas = cs.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<EmergenciaEntity> listarEmergencias() {
        List<EmergenciaEntity> lista = new ArrayList<>();

        String sql = "SELECT * FROM emergencias WHERE estado <> 0";

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
                emergencia.setEstado(rs.getInt("estado"));

                lista.add(emergencia);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // O manejar con logger
        }

        return lista;
    }

    public boolean existePorId(Long id) {
        String sql = "SELECT COUNT(*) FROM emergencias WHERE id_emergencia = ?";
        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al verificar existencia: " + e.getMessage(), e);
        }
        return false;
    }

    public void eliminarPorId(Long id) {
        String sql = "update emergencias set estado=0 WHERE id_emergencia = ?";
        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            int filas = stmt.executeUpdate();
            if (filas == 0) {
                throw new RuntimeException("No se encontró emergencia con ID: " + id);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar emergencia: " + e.getMessage(), e);
        }
    }
    
     public void CancelarPorId(Long id) {
        String sql = "update emergencias set estado=3 WHERE id_emergencia = ?";
        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            int filas = stmt.executeUpdate();
            if (filas == 0) {
                throw new RuntimeException("No se encontró emergencia con ID: " + id);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar emergencia: " + e.getMessage(), e);
        }
    }

    public EmergenciaEntity obtenerEmergenciaPorId(int id) {
        String sql = "SELECT * FROM emergencias WHERE id_emergencia = ?";
        EmergenciaEntity emergencia = null;

        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                emergencia = new EmergenciaEntity();
                emergencia.setId_emergencia(rs.getInt("id_emergencia"));
                emergencia.setTipo_emergencia(rs.getInt("tipo_emergencia"));
                emergencia.setUbicacion(rs.getString("ubicacion"));
                emergencia.setDescripcion(rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener emergencia por ID: " + e.getMessage(), e);
        }

        return emergencia;
    }
    
    public Optional<EmergenciaDetalleDTO> obtenerDetalleEmergenciaPorId(int idEmergencia) {
        String sql = "{CALL sp_detalle_emergencia_por_id(?)}";

        try (Connection conn = ConexionMySQL.getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, idEmergencia);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                EmergenciaDetalleDTO dto = new EmergenciaDetalleDTO();
                dto.setIdEmergencia(rs.getInt("id_emergencia"));
                dto.setNombresApellidos(rs.getString("nombres_apellidos"));
                dto.setUbicacion(rs.getString("ubicacion"));
                dto.setDescripcion(rs.getString("descripcion"));
                dto.setTipoEmergencia(rs.getString("tipo_emergencia"));
                dto.setFechaRegistro(rs.getTimestamp("fecha_registro"));
                return Optional.of(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
    
    public List<EmergenciaDetalleDTO> listarPorRangoFechas(Date inicio, Date fin) {
        List<EmergenciaDetalleDTO> lista = new ArrayList<>();
        String sql = "{CALL reporte_emergencias_por_fecha(?, ?)}";

        try (Connection conn = ConexionMySQL.getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setDate(1, new java.sql.Date(inicio.getTime()));
            stmt.setDate(2, new java.sql.Date(fin.getTime()));

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    EmergenciaDetalleDTO dto = new EmergenciaDetalleDTO();
                    dto.setIdEmergencia(rs.getInt("id_emergencia"));
                    dto.setNombresApellidos(rs.getString("nombres_apellidos"));
                    dto.setUbicacion(rs.getString("ubicacion"));
                    dto.setDescripcion(rs.getString("descripcion"));
                    dto.setTipoEmergencia(rs.getString("tipo_emergencia"));
                    dto.setFechaRegistro(rs.getTimestamp("fecha_registro"));
                    lista.add(dto);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener emergencias por fechas: " + e.getMessage(), e);
        }

        return lista;
    }
}
