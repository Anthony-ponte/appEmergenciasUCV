
package util;

import informe_gestion.model.PerfilUsuarioEntity;


public class SesionUsuario {

    private static PerfilUsuarioEntity usuarioActual;

    public static void iniciarSesion(PerfilUsuarioEntity usuario) {
        usuarioActual = usuario;
    }

    public static PerfilUsuarioEntity getUsuario() {
        return usuarioActual;
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }
}

