
package informe_gestion;

import informe_gestion.Vista.Perfil_Usuario;

public class Main {
    public static void main(String[] args) {
        // Abrir la ventana Reportes
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Perfil_Usuario().setVisible(true);
            }
        });
    }
}






    
   
    
    

