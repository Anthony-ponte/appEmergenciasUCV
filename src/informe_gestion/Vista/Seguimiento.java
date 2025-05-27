
package informe_gestion.Vista;

import informe_gestion.Service.DoctorService;
import informe_gestion.Service.EmergenciaService;
import informe_gestion.model.DoctorEntity;
import informe_gestion.model.EmergenciaEntity;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Seguimiento extends javax.swing.JFrame {
    private DoctorService doctorService = new DoctorService();
    private EmergenciaService emergenciaService = new EmergenciaService();


    public Seguimiento() {
        initComponents();
        mostrarNombresAleatorios();
        cargarTablaEmergencias();
    }

  private void mostrarNombresAleatorios() {
      List<DoctorEntity> doctores = doctorService.obtenerDoctores();

      if (doctores.size() < 2) {
          jTextField1.setText("No hay suficientes doctores para mostrar.");
          return;
      }

      int i = (int)(Math.random() * doctores.size());
      int j;
      do {
          j = (int)(Math.random() * doctores.size());
      } while (j == i);

      DoctorEntity doctor1 = doctores.get(i);
      DoctorEntity doctor2 = doctores.get(j);

      String nombreCompleto1 = doctor1.getNombre() + " " + doctor1.getApellido();
      String nombreCompleto2 = doctor2.getNombre() + " " + doctor2.getApellido();

      jTextField1.setText(nombreCompleto1 + " y " + nombreCompleto2);
    }

    private void cargarTablaEmergencias() {
        List<EmergenciaEntity> lista = emergenciaService.obtenerEmergencias();

        String[] columnas = {"ID", "Tipo", "Ubicación", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        for (EmergenciaEntity e : lista) {
            Object[] fila = {
                    e.getId_emergencia(),
                    e.getTipo_emergencia(),
                    e.getUbicacion(),
                    e.getDescripcion()
            };
            modelo.addRow(fila);
        }

        jbtlDatosSeguimiento.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbtlDatosSeguimiento = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnCancelarEmergencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIrReportesSegumiento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/LOGOEMER1 (1).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/CR7 (2).png"))); // NOI18N
        jLabel4.setText(" LKN KLNCDSKC ");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jbtlDatosSeguimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID DE EMERGENCIAS ", "UBICACION ", "REPORTADO POR ", "TIPO DE EMRGENCIA ", "ESTADO ", "HORA Y FECHA "
            }
        ));
        jScrollPane1.setViewportView(jbtlDatosSeguimiento);

        jButton2.setText("ATRAS ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MENU PRINCIPAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONAL MEDICO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnCancelarEmergencia.setText("CANCELAR EMERGENCIA ");
        btnCancelarEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmergenciaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("MAPA DE UBICACION DEL PERSONAL MEDICO ");

        btnIrReportesSegumiento.setText("IR REPORTES ");
        btnIrReportesSegumiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrReportesSegumientoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SEGUIMIENTO DE EMERGENCIA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarEmergencia)
                                .addGap(68, 68, 68)
                                .addComponent(jButton2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(80, 80, 80)
                        .addComponent(btnIrReportesSegumiento)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnCancelarEmergencia)
                    .addComponent(btnIrReportesSegumiento))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrReportesSegumientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrReportesSegumientoActionPerformed
           Reportes ventanaReportes = new Reportes();
    ventanaReportes.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_btnIrReportesSegumientoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Perfil_Usuario ventanaperfil= new Perfil_Usuario();
       ventanaperfil.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Registro_Emergencias ventanaEmergencia = new Registro_Emergencias(); // Crear instancia de la nueva ventana
    ventanaEmergencia.setVisible(true); // Mostrar la nueva ventana
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       // Lista de nombres
    String[] nombres = {"DR.Juan Pérez Ramírez",  "Dra. Sofía León Cárdenas"};
    
    // Seleccionar 2 índices al azar que no se repitan
    int i = (int)(Math.random() * nombres.length);
    int j;
    do {
        j = (int)(Math.random() * nombres.length);
    } while (j == i); // asegurarse de que no se repita

   
    jTextField1.setText(nombres[i] + " y " + nombres[j]);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnCancelarEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmergenciaActionPerformed
    int filaSeleccionada = jbtlDatosSeguimiento.getSelectedRow();

    if (filaSeleccionada != -1) {
        int confirmar = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas cancelar esta emergencia?",
                "Confirmar cancelación",
                javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            // Eliminar fila
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jbtlDatosSeguimiento.getModel();
            modelo.removeRow(filaSeleccionada);
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una fila para cancelar la emergencia.");
    }

    }//GEN-LAST:event_btnCancelarEmergenciaActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEmergencia;
    private javax.swing.JButton btnIrReportesSegumiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jbtlDatosSeguimiento;
    // End of variables declaration//GEN-END:variables
}
