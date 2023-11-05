package com.cometbackup.demos.adminportal;

import com.cometbackup.CometAPI;
import com.cometbackup.SessionKeyRegeneratedResponse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
    private final JTextField url;
    private final JTextField username;
    private final JPasswordField password;

    private class LabelField extends JPanel {
        public LabelField(JLabel label, JComponent component){
            super();
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            setBorder(new EmptyBorder(10,10,4,10));
            var sz = label.getPreferredSize();
            sz.width = 100;
            label.setPreferredSize(sz);
            add(label);
            add(component);
        }
    }

    public Login() {
        setTitle("Sign in - Admin portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10,10,10,10));

        var urlLabel = new JLabel("URL:");
        url = new JTextField(20);
        url.setText("http://127.0.0.1:8060");

        var usernameLabel = new JLabel("Username:");
        username = new JTextField("admin", 20);

        var passwordLabel = new JLabel("Password:");
        password = new JPasswordField(20);

        var loginButton = new JButton("Sign in");
        loginButton.setBorder(new EmptyBorder(10,10,10,10));

        panel.add(new LabelField(urlLabel, url));
        panel.add(new LabelField(usernameLabel,username));
        panel.add(new LabelField(passwordLabel,password));
        panel.add(loginButton);

        getRootPane().setDefaultButton(loginButton);
        loginButton.addActionListener(e -> login());

        add(panel);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        password.requestFocus();
    }

    private void login() {
        var url = Login.this.url.getText();
        var username = Login.this.username.getText();
        var password = new String(Login.this.password.getPassword());

        if(url.isEmpty() || username.isEmpty() || password.isEmpty()) return;

        var cometAPI = new CometAPI(url, username, password);

        SessionKeyRegeneratedResponse resp;
        try {
            resp = cometAPI.AdminAccountSessionStart(null);
            if(resp.Status != 200){
                throw new Exception("Invalid authentication");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Couldn't log in.\nreason: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        new AdminPortal(cometAPI);
        dispose();
    }



    public static void main(String[] args){
        try {
            setLookAndFeel();
            new Login();
        } catch(Exception e){
            e.printStackTrace(System.out);
        }
    }

    static void setLookAndFeel() throws Exception {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
    }
}
