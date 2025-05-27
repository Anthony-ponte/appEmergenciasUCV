package informe_gestion.Repository;

import informe_gestion.config.ConexionMySQL;
import informe_gestion.model.TipoEmergenciaEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoEmergenciaRepository {
    public List<TipoEmergenciaEntity> obtenerTodos() {
        List<TipoEmergenciaEntity> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, descripcion, activo, fecha_creacion, fecha_actualizacion FROM tipo_emergencia";

        try (Connection con = ConexionMySQL.getConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                TipoEmergenciaEntity te = new TipoEmergenciaEntity();
                te.setId(rs.getInt("id"));
                te.setNombre(rs.getString("nombre"));
                te.setDescripcion(rs.getString("descripcion"));

                lista.add(te);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
