
package informe_gestion.Vista;

import informe_gestion.Controller.DoctorService;
import informe_gestion.Controller.EmergenciaService;
import informe_gestion.model.DoctorEntity;
import informe_gestion.model.EmergenciaEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.List;

public class Seguimiento extends javax.swing.JFrame {
    private DoctorService doctorService = new DoctorService();
    private EmergenciaService emergenciaService = new EmergenciaService();


    public Seguimiento() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaEmergencias();
    }

    private void cargarTablaEmergencias() {
        List<EmergenciaEntity> lista = emergenciaService.obtenerEmergencias();

        String[] columnas = {"ID", "Tipo", "Ubicación", "Descripción","Estado","Acciones"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Solo la columna "Acciones" es editable
            }
        };
        for (EmergenciaEntity e : lista) {
            String estadoTexto;
            switch (e.getEstado()) {
                case 1 -> estadoTexto = "Pendiente";
                case 2 -> estadoTexto = "Atendido";
                case 3 -> estadoTexto = "Cancelado";
                default -> estadoTexto = "Desconocido";
            }

            Object[] fila = {
                    e.getId_emergencia(),
                    e.getTipo_emergencia(),
                    e.getUbicacion(),
                    e.getDescripcion(),
                    estadoTexto,
                    "Acciones"
            };
            modelo.addRow(fila);
        }

        jbtlDatosSeguimiento.setModel(modelo);
        jbtlDatosSeguimiento.getColumn("Acciones").setCellRenderer(new PanelAccionesRenderer());
        jbtlDatosSeguimiento.getColumn("Acciones").setCellEditor(new PanelAccionesEditor(jbtlDatosSeguimiento));
        ajustarAlturaFilas(jbtlDatosSeguimiento);
        ajustarAnchoColumnas(jbtlDatosSeguimiento);


    }
    private void ajustarAlturaFilas(JTable tabla) {
        for (int row = 0; row < tabla.getRowCount(); row++) {
            int maxHeight = tabla.getRowHeight();

            for (int column = 0; column < tabla.getColumnCount(); column++) {
                TableCellRenderer cellRenderer = tabla.getCellRenderer(row, column);
                Component comp = tabla.prepareRenderer(cellRenderer, row, column);
                int height = comp.getPreferredSize().height;
                maxHeight = Math.max(maxHeight, height);
            }

            tabla.setRowHeight(row, maxHeight);
        }
    }

    private void ajustarAnchoColumnas(JTable tabla) {
        for (int col = 0; col < tabla.getColumnCount(); col++) {
            TableColumn columna = tabla.getColumnModel().getColumn(col);
            int anchoMaximo = 0;

            // Ver tamaño del header
            TableCellRenderer headerRenderer = tabla.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tabla, columna.getHeaderValue(), false, false, 0, col);
            anchoMaximo = headerComp.getPreferredSize().width;

            // Ver tamaño de las celdas
            for (int row = 0; row < tabla.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tabla.getCellRenderer(row, col);
                Component c = tabla.prepareRenderer(cellRenderer, row, col);
                int anchoCelda = c.getPreferredSize().width;
                anchoMaximo = Math.max(anchoMaximo, anchoCelda);
            }

            // Añade un pequeño margen
            columna.setPreferredWidth(anchoMaximo + 10);
        }
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
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(382, 382, 382)
                        .addComponent(btnIrReportesSegumiento)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnIrReportesSegumiento))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTable jbtlDatosSeguimiento;
    // End of variables declaration//GEN-END:variables
}
