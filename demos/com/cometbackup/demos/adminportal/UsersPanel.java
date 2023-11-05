package com.cometbackup.demos.adminportal;

import com.cometbackup.CometAPI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;
import java.awt.*;
import java.util.ArrayList;

class UsersPanel extends JPanel {
    JTable userTable;
    DefaultTableModel model;

    public UsersPanel(CometAPI cometAPI) throws Exception {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        var userLabel = new JLabel("Users");
        userLabel.setBorder(new EmptyBorder(16, 16, 16, 16));
        userLabel.setFont(userLabel.getFont().deriveFont(18.0f));

        var data = getUserData(cometAPI);

        String[] columnNames = {"Username", "Account Name", "Devices", "Email Addresses", "Email Reports", "Protected Items Quota"};

        model = new DefaultTableModel(data, columnNames) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        userTable = new JTable(model); //UserTable(model);

        var renderer = new FocusedTableRenderer(0);

        userTable.setFont(userTable.getFont().deriveFont(13f));
        userTable.setDefaultRenderer(Object.class, renderer);
        userTable.setRowHeight(userTable.getRowHeight() + 16);

        resizeColumnWidth(userTable, 250);

        var userTableScrollPane = new JScrollPane(userTable);

        add(userLabel, BorderLayout.NORTH);
        add(userTableScrollPane, BorderLayout.CENTER);
    }

    private Object[][] getUserData(CometAPI cometAPI) throws Exception {
        var userData = cometAPI.AdminListUsersFull();

        var rows = new ArrayList<Object[]>();
        for(var entry : userData.entrySet()){
            var pc = entry.getValue();
            rows.add(new Object[] {
                    entry.getKey(), pc.AccountName, pc.Devices.size(), String.join(", ", pc.Emails),
                    pc.SendEmailReports ? "Enabled" : "Disabled",
                    pc.AllProtectedItemsQuotaEnabled ? String.format("%d byte(s)", pc.AllProtectedItemsQuotaBytes) : "None"
            });
        }
        if(rows.isEmpty()) return null;

        var objectArray = new Object[rows.size()][];
        return rows.toArray(objectArray);
    }

    public void resizeColumnWidth(JTable table, int maxWidth) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > maxWidth)
                width=maxWidth;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}
