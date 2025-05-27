package informe_gestion.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

        private static final String URL = "jdbc:mysql://localhost:3306/emergencias_ucv";
        private static final String USUARIO = "root"; // tu usuario
        private static final String CONTRASENIA = ""; // tu contraseña

        public static Connection getConexion() {
            try {
                return DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

