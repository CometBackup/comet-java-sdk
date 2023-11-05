package com.cometbackup.demos.adminportal;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class FlatButton extends JButton {
    static class SolidColorButtonUI extends BasicButtonUI {
        public void paint(Graphics g, JComponent c) {
            AbstractButton b = (AbstractButton) c;
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
            g2.setColor(b.getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, b.getWidth(), b.getHeight(), 20, 20));
            g2.setColor(b.getForeground());
            g2.drawString(b.getText(), 10, 20);
            g2.dispose();
        }
    }

    public FlatButton(String text, Color background, Color foreground, Color selectedBackground, Color selectedForeground){
        setText(text);
        setBorderPainted(false);
        setBackground(background);
        setForeground(foreground);
        setBorder(new EmptyBorder(10,10,10,10));
        setUI(new SolidColorButtonUI());
        var sz = getPreferredSize();
        sz.width = 180;
        setSize(sz);

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setBackground(selectedBackground);
                setForeground(selectedForeground);
                repaint();
            }
            public void mouseExited(MouseEvent e){
                setBackground(background);
                setForeground(foreground);
                repaint();
            }
        });
    }
}
