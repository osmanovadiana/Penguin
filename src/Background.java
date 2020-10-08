

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Background extends JComponent {
    void background(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        Color с = new Color(173, 216, 230);
        g2d.setColor(с);
        g2d.fillRect(0, 0, 600, 900);
    }
}