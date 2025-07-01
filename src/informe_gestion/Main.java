
package informe_gestion;

import informe_gestion.Vista.Login;

public class Main {
    public static void main(String[] args) {
        // Abrir la ventana Reportes
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Login().setVisible(true);
            }
        });
    }
}






    
   
    
    

