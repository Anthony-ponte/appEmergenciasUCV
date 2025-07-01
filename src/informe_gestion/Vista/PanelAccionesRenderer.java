package informe_gestion.Vista;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

class PanelAccionesRenderer extends JPanel implements TableCellRenderer {
    public PanelAccionesRenderer() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("Ver"));
        add(new JButton("Seguimiento"));
        add(new JButton("Cancelar"));
        add(new JButton("Eliminar"));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }
}

