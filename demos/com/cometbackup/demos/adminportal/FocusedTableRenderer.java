package com.cometbackup.demos.adminportal;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

class FocusedTableRenderer extends DefaultTableCellRenderer {
    final int focusColumn;

    public FocusedTableRenderer(int focusColumn) {
        this.focusColumn = focusColumn;
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {

        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (column == focusColumn) {
            if (isSelected) {
                c.setForeground(Color.WHITE);
            } else {
                c.setForeground(AdminPortal.TABLE_HIGHLIGHTED_TEXT);
                c.setBackground(Color.WHITE);
            }
        } else {
            if (isSelected) {
                c.setForeground(Color.WHITE);
            } else {
                c.setForeground(Color.BLACK);
                c.setBackground(Color.WHITE);
            }
        }
        return c;
    }
}
