package informe_gestion.model;

import com.mysql.cj.jdbc.CallableStatement;
import informe_gestion.config.ConexionMySQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtencionRepository {

    public void guardar(AtencionEntity atencion) {
        String sql = "{ CALL sp_guardar_atencion(?, ?, ?, ?, ?) }";

        try (Connection conn = ConexionMySQL.getConexion();
             CallableStatement stmt = (CallableStatement) conn.prepareCall(sql)) {

            stmt.setInt(1, atencion.getEmergenciaId());
            stmt.setInt(2, atencion.getDoctorId());
            stmt.setString(3, atencion.getObservaciones());
            stmt.setBoolean(4, atencion.isTraslado());
            stmt.setString(5, atencion.getDestinoTraslado());

            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar atención mediante SP: " + e.getMessage(), e);
        }
    }
     public List<AtencionDetalleDTO> obtenerHistorialPorEmergencia(int idEmergencia) {
        List<AtencionDetalleDTO> lista = new ArrayList<>();
        String sql = "{CALL sp_historial_atencion_por_emergencia(?)}";

        try (Connection conn = ConexionMySQL.getConexion();
             CallableStatement stmt = (CallableStatement) conn.prepareCall(sql)) {

            stmt.setInt(1, idEmergencia);
            var rs = stmt.executeQuery();

            while (rs.next()) {
                AtencionDetalleDTO dto = new AtencionDetalleDTO();
                dto.setIdAtencion(rs.getInt("id_atencion"));
                dto.setNombreDoctor(rs.getString("nombre_doctor"));
                dto.setApellidoDoctor(rs.getString("apellido_doctor"));
                dto.setEspecialidad(rs.getString("especialidad"));
                dto.setFechaAtencion(rs.getTimestamp("fecha_atencion"));
                dto.setObservaciones(rs.getString("observaciones"));
                dto.setTraslado(rs.getBoolean("traslado"));
                dto.setDestinoTraslado(rs.getString("destino_traslado"));
                lista.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
