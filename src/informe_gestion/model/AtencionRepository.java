package informe_gestion.model;

import informe_gestion.config.ConexionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtencionRepository {

    public void guardar(AtencionEntity atencion) {
        String sql = "INSERT INTO atencion (emergencia_id, doctor_id, observaciones, traslado, destino_traslado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, atencion.getEmergenciaId());
            stmt.setInt(2, atencion.getDoctorId());
            stmt.setString(3, atencion.getObservaciones());
            stmt.setBoolean(4, atencion.isTraslado());
            stmt.setString(5, atencion.getDestinoTraslado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar atención: " + e.getMessage(), e);
        }
    }
}
