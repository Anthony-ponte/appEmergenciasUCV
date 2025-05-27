package informe_gestion.Vista;

public class Perfil_Usuario extends javax.swing.JFrame {
    public Perfil_Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtResultadoEmail = new javax.swing.JTextField();
        txtResultadoNombrePerfil = new javax.swing.JTextField();
        txtResultadoUsuarioPerfil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNacimientoPerfil = new javax.swing.JTextField();
        txtEmailPefil = new javax.swing.JTextField();
        txtNombrePerfil = new javax.swing.JTextField();
        txtContraseñaPerfil = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnIrPerfil = new javax.swing.JButton();
        btnIrRegistrarEmergencia = new javax.swing.JButton();
        btnIrReportes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnIrSeguimiento = new javax.swing.JButton();
        jbtnGuardarPerfil = new javax.swing.JButton();
        jcbxUsuarioPerfil = new javax.swing.JComboBox<>();
        jbtnLimpiarPerfil = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/CR7 (2).png"))); // NOI18N
        jLabel4.setText(" LKN KLNCDSKC ");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/LOGOUSUARIO (1).png"))); // NOI18N

        txtResultadoEmail.setEditable(false);
        txtResultadoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtResultadoNombrePerfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtResultadoUsuarioPerfil.setEditable(false);
        txtResultadoUsuarioPerfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoEmail)
                            .addComponent(txtResultadoUsuarioPerfil))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtResultadoNombrePerfil)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(txtResultadoUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(290, Short.MAX_VALUE)
                    .addComponent(txtResultadoNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe_gestion/Vista/LOGOEMER1 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Siemens Sans Black", 1, 24)); // NOI18N
        jLabel1.setText("PERFIL ");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TIPO DE USUARIO");

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        txtNacimientoPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA DE NACIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtNacimientoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacimientoPerfilActionPerformed(evt);
            }
        });

        txtEmailPefil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtNombrePerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE Y APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtContraseñaPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNacimientoPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(txtNombrePerfil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailPefil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraseñaPerfil))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNacimientoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEmailPefil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtContraseñaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        btnIrPerfil.setText("PERFIL ");
        btnIrPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPerfilActionPerformed(evt);
            }
        });

        btnIrRegistrarEmergencia.setText("REGISTRO DE  EMERGENCIAS");
        btnIrRegistrarEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrRegistrarEmergenciaActionPerformed(evt);
            }
        });

        btnIrReportes.setText(" REPORTES E HISTORIALES ");
        btnIrReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrReportesActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnIrSeguimiento.setText("SEGUIMIENTO ");
        btnIrSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrSeguimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIrPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIrRegistrarEmergencia, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
            .addComponent(btnIrSeguimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIrReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnIrPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrRegistrarEmergencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnIrSeguimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarSesion)
                .addGap(15, 15, 15))
        );

        jbtnGuardarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnGuardarPerfil.setText("GUARDAR ");
        jbtnGuardarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarPerfilActionPerformed(evt);
            }
        });

        jcbxUsuarioPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbxUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESOR", "PERSONAL" }));
        jcbxUsuarioPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxUsuarioPerfilActionPerformed(evt);
            }
        });

        jbtnLimpiarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnLimpiarPerfil.setText("LIMPIAR");
        jbtnLimpiarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarPerfilActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("REGISTRAR EMERGENCIA ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbxUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnGuardarPerfil)
                                .addGap(27, 27, 27)
                                .addComponent(jbtnLimpiarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnLimpiarPerfil)
                            .addComponent(jbtnGuardarPerfil)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNacimientoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacimientoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacimientoPerfilActionPerformed

    private void jbtnGuardarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarPerfilActionPerformed
      // Obtener datos del formulario
    String nombre = txtNombrePerfil.getText();
    String nacimiento = txtNacimientoPerfil.getText();
    String email = txtEmailPefil.getText();
    String contraseña = txtContraseñaPerfil.getText();
    String tipoUsuario = (String) jcbxUsuarioPerfil.getSelectedItem();

    // Validar que la contraseña no esté vacía
    if (contraseña == null || contraseña.trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese la contraseña antes de guardar.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;  // No continuar con el guardado
    }

    // Mostrar resultados en los campos de "resultado"
    txtResultadoNombrePerfil.setText(nombre);
    txtResultadoEmail.setText(email);
    txtResultadoUsuarioPerfil.setText(tipoUsuario);

    // Mensaje de confirmación
    javax.swing.JOptionPane.showMessageDialog(this, "Datos del perfil guardados correctamente");

    // Limpiar todos los campos del formulario después de guardar
    txtNombrePerfil.setText("");
    txtNacimientoPerfil.setText("");
    txtEmailPefil.setText("");
    txtContraseñaPerfil.setText("");
    jcbxUsuarioPerfil.setSelectedIndex(0); 

    }//GEN-LAST:event_jbtnGuardarPerfilActionPerformed

    private void jcbxUsuarioPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxUsuarioPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxUsuarioPerfilActionPerformed

    private void jbtnLimpiarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarPerfilActionPerformed
     // Limpiar solo los campos de entrada del formulario
    txtNombrePerfil.setText("");
    txtNacimientoPerfil.setText("");
    txtEmailPefil.setText("");
    txtContraseñaPerfil.setText("");
    jcbxUsuarioPerfil.setSelectedIndex(0); // Selecciona la primera opción del combo
    }//GEN-LAST:event_jbtnLimpiarPerfilActionPerformed

    private void btnIrRegistrarEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrRegistrarEmergenciaActionPerformed
    Registro_Emergencias ventanaEmergencia = new Registro_Emergencias(); // Crear instancia de la nueva ventana
    ventanaEmergencia.setVisible(true); // Mostrar la nueva ventana
    this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnIrRegistrarEmergenciaActionPerformed

    private void btnIrReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrReportesActionPerformed
        Reportes ventanaReportes = new Reportes();
    ventanaReportes.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnIrReportesActionPerformed

    private void btnIrPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPerfilActionPerformed
       Perfil_Usuario ventanaperfil= new Perfil_Usuario();
       ventanaperfil.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnIrPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnIrSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrSeguimientoActionPerformed
       Seguimiento ventanaSeguimiento= new Seguimiento();
       ventanaSeguimiento.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnIrSeguimientoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Registro_Emergencias ventanaEmergencia = new Registro_Emergencias(); // Crear instancia de la nueva ventana
    ventanaEmergencia.setVisible(true); // Mostrar la nueva ventana
    this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIrPerfil;
    private javax.swing.JButton btnIrRegistrarEmergencia;
    private javax.swing.JButton btnIrReportes;
    private javax.swing.JButton btnIrSeguimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGuardarPerfil;
    private javax.swing.JButton jbtnLimpiarPerfil;
    private javax.swing.JComboBox<String> jcbxUsuarioPerfil;
    private javax.swing.JPasswordField txtContraseñaPerfil;
    private javax.swing.JTextField txtEmailPefil;
    private javax.swing.JTextField txtNacimientoPerfil;
    private javax.swing.JTextField txtNombrePerfil;
    private javax.swing.JTextField txtResultadoEmail;
    private javax.swing.JTextField txtResultadoNombrePerfil;
    private javax.swing.JTextField txtResultadoUsuarioPerfil;
    // End of variables declaration//GEN-END:variables
}
