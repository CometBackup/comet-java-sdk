package com.cometbackup.demos.adminportal;

import com.cometbackup.CometAPI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;

class DevicesPanel extends JPanel {
    JTable userTable;
    DefaultTableModel model;

    public DevicesPanel(CometAPI cometAPI) throws Exception {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        var userLabel = new JLabel("Devices");
        userLabel.setBorder(new EmptyBorder(16, 16, 16, 16));
        userLabel.setFont(userLabel.getFont().deriveFont(18.0f));

        var data = getDevicesData(cometAPI);

        String[] columnNames = {"Status", "Username", "Device", "Version", "Timezone"};

        model = new DefaultTableModel(data, columnNames) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        userTable = new JTable(model);

        var renderer = new FocusedTableRenderer(1);

        userTable.setFont(userTable.getFont().deriveFont(13f));
        userTable.setDefaultRenderer(Object.class, renderer);
        userTable.setRowHeight(userTable.getRowHeight() + 16);

        resizeColumnWidth(userTable, 250);

        var userTableScrollPane = new JScrollPane(userTable);

        add(userLabel, BorderLayout.NORTH);
        add(userTableScrollPane, BorderLayout.CENTER);
    }

    private class Row {
        String friendlyName;
        String type;
        String username;
        String deviceId;
        String reportedVersion;
        String deviceTimeZone;
    }

    private Object[][] getDevicesData(CometAPI cometAPI) throws Exception {
        var users = cometAPI.AdminListUsersFullAsync();
        var liveConnections = cometAPI.AdminDispatcherListActiveAsync(null);
        //var lobbyConnections = cometAPI.AdminInstallationListActiveAsync();

        var combinedFuture = CompletableFuture.allOf(users, liveConnections /*, lobbyConnections */);

        combinedFuture.join();

        var userMap = users.get();
        var rows = new LinkedHashMap<String, Row>();

        // Online Registered Connections
        for(var entry : liveConnections.get().entrySet()){
            var connId = entry.getKey();
            var lc = entry.getValue();
            var id = lc.Username + "\u0000" + lc.DeviceID;

            var row = new Row();
            row.type = "Online"; // lc.ReportedVersion !== state.lastServerVersion => "ONLINE-OUTDATED"
            row.username = lc.Username;
            row.deviceId = lc.DeviceID;

            row.friendlyName = userMap.get(lc.Username).Devices.get(lc.DeviceID).FriendlyName;

            row.reportedVersion = lc.ReportedVersion;
            row.deviceTimeZone = lc.DeviceTimeZone;
            rows.put(id, row);
        }

        // NOT DOING LOBBY DEVICES

        // Offline Connections
        for(var userEntry : users.get().entrySet()){
            var userId = userEntry.getKey();
            var userPC = userEntry.getValue();

            for(var deviceEntry : userPC.Devices.entrySet()){
                var deviceId = deviceEntry.getKey();
                var dv = deviceEntry.getValue();
                var id = userPC.Username + "\u0000" + deviceId;
                if(rows.containsKey(id)){
                    continue; // Skip known online devices
                }

                var row = new Row();
                row.deviceId = deviceId;
                row.friendlyName = dv.FriendlyName;
                row.username = userPC.Username;
                row.deviceTimeZone = dv.DeviceTimezone;
                row.type = "Offline";
                rows.put(id, row);
            }
        }

        if(rows.isEmpty()) return null;

        var objectArray = new Object[rows.size()][];

        int idx = 0;
        for(var row : rows.values()){
            objectArray[idx++] = new Object[]{
                row.type,  row.username, row.friendlyName, row.reportedVersion, row.deviceTimeZone
            };
        }
        return objectArray;
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
