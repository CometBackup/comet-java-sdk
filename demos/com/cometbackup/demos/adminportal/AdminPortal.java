package com.cometbackup.demos.adminportal;

import com.cometbackup.CometAPI;

import javax.swing.*;
import java.awt.*;

public class AdminPortal extends JFrame {
    public static final Color DARK_BACKGROUND        = new Color(25,31,51);
    public static final Color SELECTED_BACKGROUND    = new Color(226, 164, 140);
    public static final Color TABLE_HIGHLIGHTED_TEXT = new Color(94, 128, 158);

    public final CometAPI cometAPI;

    private final Dimension contentSize = new Dimension(900,700);

    private final NavigationPanel navigation;
    private JPanel content;
    private UsersPanel usersPanel;
    private DevicesPanel devicesPanel;


    public AdminPortal(CometAPI cometAPI) {
        this.cometAPI = cometAPI;

        setTitle("Comet Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        navigation = new NavigationPanel(this);

        content = new JPanel();
        content.setPreferredSize(contentSize);

        add(navigation, BorderLayout.WEST);
        add(content, BorderLayout.CENTER);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    void showUsersPanel() {
        if (usersPanel == null) {
            try {
                usersPanel = new UsersPanel(cometAPI);
            } catch (Exception e) {
                handleException(e);
            }
        }
        setContent(usersPanel);
    }

    void showDevicesPanel() {
        if (devicesPanel == null) {
            try {
                devicesPanel = new DevicesPanel(cometAPI);
            } catch (Exception e) {
                handleException(e);
            }
        }
        setContent(devicesPanel);
    }

    private void setContent(JPanel newPanel){
        getContentPane().remove(content);
        getContentPane().add((content = newPanel), BorderLayout.CENTER);
        content.revalidate();
        repaint();
    }

    static public void handleException(Exception e) {
        e.printStackTrace(System.out);
    }
}
