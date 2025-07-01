package informe_gestion.Vista;

import informe_gestion.Controller.AtencionService;
import informe_gestion.Controller.DoctorService;
import informe_gestion.Controller.EmergenciaService;
import informe_gestion.model.DoctorEntity;
import informe_gestion.model.EmergenciaEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.Collections;
import java.util.List;


class PanelAccionesEditor extends AbstractCellEditor implements TableCellEditor {
    private JPanel panel;
    private JTable table;

    public PanelAccionesEditor(JTable table) {
        this.table = table;
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton btnVer = new JButton("Ver");
        JButton btnEditar = new JButton("Seguimiento");
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnEliminar = new JButton("Eliminar");
        btnVer.addActionListener(e -> {
            int row = table.getSelectedRow();
            Object id = table.getValueAt(row, 0);
            JOptionPane.showMessageDialog(table, "Ver emergencia ID: " + id);
            fireEditingStopped();
        });

        btnEditar.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(table, "Seleccione una fila primero.");
                return;
            }

            // Obtén el ID de emergencia de la fila seleccionada
            Object idObj = table.getValueAt(row, 0);
            if (idObj == null) {
                JOptionPane.showMessageDialog(table, "ID inválido.");
                return;
            }
            int emergenciaId = Integer.parseInt(idObj.toString());

            EmergenciaService ems = new EmergenciaService();
            // Aquí debes obtener la emergencia completa para pasarla al formulario
            EmergenciaEntity emergencia = ems.obtenerEmergenciaPorId(emergenciaId);
            if (emergencia == null) {
                JOptionPane.showMessageDialog(table, "Emergencia no encontrada.");
                return;
            }

            DoctorService ds = new DoctorService();
            // Obtener lista de doctores para el ComboBox
            List<DoctorEntity> listaDoctores = ds.obtenerDoctores();

            // Crear instancia del formulario, pasar emergencia y lista de doctores
            AtencionService atencionService = new AtencionService();
            Atencion formulario = new Atencion(
                    Collections.singletonList(emergencia) 
            );

            formulario.setVisible(true);
            fireEditingStopped();
        });

        btnCancelar.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return; // Ninguna fila seleccionada

            Object idObj = table.getValueAt(row, 0);
            Long id = Long.valueOf(idObj.toString());

            int confirm = JOptionPane.showConfirmDialog(table,
                    "¿Cancelar la emergencia: " + id + "?",
                    "Confirmar la cancelación",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar de base de datos
                    EmergenciaService ems = new EmergenciaService();
                    ems.CancelarEmergenciaPorId(id);

                   

                    JOptionPane.showMessageDialog(table, "Emergencia cancelada.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(table,
                            "Error al cancelar emergencia: " + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            fireEditingStopped();
        });
        
        btnEliminar.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return; // Ninguna fila seleccionada

            Object idObj = table.getValueAt(row, 0);
            Long id = Long.valueOf(idObj.toString());

            int confirm = JOptionPane.showConfirmDialog(table,
                    "¿Eliminar emergencia ID: " + id + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar de base de datos
                    EmergenciaService ems = new EmergenciaService();
                    ems.eliminarEmergenciaPorId(id);

                    // Eliminar de la tabla
                    ((DefaultTableModel) table.getModel()).removeRow(row);

                    JOptionPane.showMessageDialog(table, "Emergencia eliminada correctamente.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(table,
                            "Error al eliminar emergencia: " + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            fireEditingStopped();
        });

        panel.add(btnVer);
        panel.add(btnEditar);
        panel.add(btnEliminar);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        return panel;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}

