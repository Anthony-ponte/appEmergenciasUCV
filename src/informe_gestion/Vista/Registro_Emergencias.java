package informe_gestion.Vista;

import informe_gestion.Dto.EmergenciaDto;
import informe_gestion.Repository.EmergenciaRepository;
import informe_gestion.Repository.TipoEmergenciaRepository;
import informe_gestion.Service.EmergenciaService;
import informe_gestion.Service.TipoEmergenciaService;
import informe_gestion.model.TipoEmergenciaEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Registro_Emergencias extends javax.swing.JFrame {

    private EmergenciaService emergenciaService;
    private TipoEmergenciaService tipoEmergenciaService;

    public Registro_Emergencias(){
        this.emergenciaService = new EmergenciaService();
        this.tipoEmergenciaService = new TipoEmergenciaService();

        initComponents();
        cargarTiposEmergencia();
        agregarPlaceholder(txtUbicacionRegistro, "Pabellón/Piso/Aula");

    }
    private void cargarTiposEmergencia() {
        List<TipoEmergenciaEntity> tipos = tipoEmergenciaService.listarTiposEmergencia();
        jcbxTipoEmergenciaRegistro.removeAllItems();

        for (TipoEmergenciaEntity tipo : tipos) {
            jcbxTipoEmergenciaRegistro.addItem(tipo);
        }
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreRegistro = new javax.swing.JTextField();
        jcbxTipoEmergenciaRegistro = new javax.swing.JComboBox<>();
        txtUbicacionRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaDescripcionRegistro = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnAtrasRegistro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIrSeguimiento_Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("REGISTRO DE EMERGENCIA ");

        txtNombreRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES Y APELLIDOS"));
        txtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegistroActionPerformed(evt);
            }
        });



        txtUbicacionRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("UBICACIÓN"));
        txtUbicacionRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionRegistroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("DESCRIPCION DE LA EMERGENCIA ");

        jLabel3.setFont(new java.awt.Font("Siemens Sans Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("TIP0 DE EMERGENCIA ");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jtxaDescripcionRegistro.setColumns(20);
        jtxaDescripcionRegistro.setRows(5);
        jScrollPane1.setViewportView(jtxaDescripcionRegistro);

        btnRegistrar.setText("REGISTAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAtrasRegistro.setText("ATRAS");
        btnAtrasRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasRegistroActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/LOGOEMER1 (1).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/CR7 (2).png"))); // NOI18N
        jLabel4.setText(" LKN KLNCDSKC ");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnIrSeguimiento_Registro.setText("IR A SEGUIMIENTO");
        btnIrSeguimiento_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrSeguimiento_RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(108, 108, 108)
                        .addComponent(btnAtrasRegistro)
                        .addGap(131, 131, 131)
                        .addComponent(btnIrSeguimiento_Registro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUbicacionRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbxTipoEmergenciaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23)
                                .addComponent(txtUbicacionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jcbxTipoEmergenciaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnAtrasRegistro)
                    .addComponent(btnIrSeguimiento_Registro))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegistroActionPerformed

    private void jcbxTipoEmergenciaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxTipoEmergenciaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxTipoEmergenciaRegistroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                                                 
      try {
        // Obtener el tipo de emergencia seleccionado

        // Obtener otros datos del formulario (ejemplo)
        String nombre = txtNombreRegistro.getText().trim();
        String ubicacion = txtUbicacionRegistro.getText().trim();
        String descripcion = jtxaDescripcionRegistro.getText().trim();  // JTextArea

        // Validar que no estén vacíos (puedes ajustar según tus campos)
        if (nombre.isEmpty() || ubicacion.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          TipoEmergenciaEntity seleccionado = (TipoEmergenciaEntity) jcbxTipoEmergenciaRegistro.getSelectedItem();

              System.out.println("Tipo seleccionado: " + seleccionado.getId());

          EmergenciaDto emergenciaDto = new EmergenciaDto();
          emergenciaDto.setNombre_apellidos(nombre);
          emergenciaDto.setTipo_emergencia(seleccionado.getId());
          emergenciaDto.setUbicacion(ubicacion);
          emergenciaDto.setDescripcion(descripcion);

          this.emergenciaService.registrarEmergencia(emergenciaDto);

        // Mensaje de éxito con los datos ingresados
        JOptionPane.showMessageDialog(this, "Registro exitoso:\nTipo: " + seleccionado.getNombre()
                                    + "\nNombre: " + nombre 
                                    + "\nUbicación: " + ubicacion 
                                    + "\nDescripción: " + descripcion);

        // Limpiar campos si quieres
        txtNombreRegistro.setText("");
          agregarPlaceholder(txtUbicacionRegistro, "Pabellón/Piso/Aula");
        jtxaDescripcionRegistro.setText("");  // Limpiar JTextArea
        jcbxTipoEmergenciaRegistro.setSelectedIndex(0);
        
        
        
        
        
        
        
        
        
        

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIrSeguimiento_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrSeguimiento_RegistroActionPerformed
     Seguimiento ventanaSeguimiento= new Seguimiento();
       ventanaSeguimiento.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnIrSeguimiento_RegistroActionPerformed

    private void btnAtrasRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasRegistroActionPerformed
      Perfil_Usuario ventanaperfil= new Perfil_Usuario();
       ventanaperfil.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAtrasRegistroActionPerformed

    private void txtUbicacionRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionRegistroActionPerformed
        if(txtUbicacionRegistro.getText().equals("Pabellón/Piso/Aula")){
        txtUbicacionRegistro.setText("");
    }
    }//GEN-LAST:event_txtUbicacionRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Emergencias().setVisible(true);
            }
        });
    }
    private void agregarPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasRegistro;
    private javax.swing.JButton btnIrSeguimiento_Registro;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<TipoEmergenciaEntity> jcbxTipoEmergenciaRegistro;
    private javax.swing.JTextArea jtxaDescripcionRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextField txtUbicacionRegistro;
    // End of variables declaration//GEN-END:variables
}
