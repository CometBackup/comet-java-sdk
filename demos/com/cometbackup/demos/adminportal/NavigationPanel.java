package com.cometbackup.demos.adminportal;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

class NavigationPanel extends JPanel {
    final AdminPortal portal;

    class NavBtn extends FlatButton {
        public NavBtn(String text, Runnable r) {
            super(text, AdminPortal.DARK_BACKGROUND, Color.WHITE, AdminPortal.SELECTED_BACKGROUND, Color.BLACK);
            setFont(getFont().deriveFont(13f));
            addActionListener(e -> r.run());
        }
    }

    public NavigationPanel(AdminPortal portal) {
        this.portal = portal;

        setBackground(AdminPortal.DARK_BACKGROUND);
        setPreferredSize(new Dimension(200, 200));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(makeLogo());
        add(new NavBtn("Users", portal::showUsersPanel));
        add(new NavBtn("Devices", portal::showDevicesPanel));
    }

    private JLabel makeLogo() {
        var label = new JLabel();
        try {
            var file = new File("demos/com/cometbackup/demos/adminportal/resources/logo.png");
            Image image = ImageIO.read(file);
            ImageIcon icon = new ImageIcon(image);
            label.setIcon(icon);
        } catch (Exception e) {
            AdminPortal.handleException(e);
        }
        return label;
    }
}
