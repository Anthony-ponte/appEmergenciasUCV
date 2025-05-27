package informe_gestion.Repository;

import informe_gestion.config.ConexionMySQL;
import informe_gestion.model.DoctorEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepository {
    public List<DoctorEntity> listarDoctores() throws SQLException {
        List<DoctorEntity> doctores = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, especialidad, codigo_doctor, correo, telefono, activo FROM doctor";

        try (Connection conn = ConexionMySQL.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                DoctorEntity doctor = new DoctorEntity();
                doctor.setId(rs.getInt("id"));
                doctor.setNombre(rs.getString("nombre"));
                doctor.setApellido(rs.getString("apellido"));
                doctor.setEspecialidad(rs.getString("especialidad"));
                doctor.setCodigoDoctor(rs.getString("codigo_doctor"));
                doctor.setCorreo(rs.getString("correo"));
                doctor.setTelefono(rs.getString("telefono"));
                doctor.setActivo(rs.getBoolean("activo"));

                doctores.add(doctor);
            }
        }
        return doctores;
    }
}
