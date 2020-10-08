import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent {

    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        Background background = new Background();
        background.background(g2d);


        g2d.setColor(Color.black);
        g2d.fillOval(90, 110, 200, 250);
        g2d.fillPolygon(new int[]{100, 60, 130}, new int[]{200, 260, 200}, 3);
        g2d.fillPolygon(new int[]{260, 320, 280}, new int[]{200, 260, 200}, 3);

        g2d.setPaint(Color.white);
        g2d.setStroke(new BasicStroke(3.0f));  // толщина равна 3
        g2d.fillOval(145, 200, 90, 120);//овал посередин
        g2d.fillOval(145, 140, 45, 45);  //глаза
        g2d.fillOval(195, 140, 45, 45);
        g2d.setPaint(Color.black);
        g2d.fillOval(155, 155, 25, 25);//глазницы
        g2d.fillOval(205, 155, 25, 25);
        String str = "Osmanova Diana";
        g2d.drawString(str,100,50);
        g2d.setPaint(Color.orange);
        g2d.fillPolygon(new int[]{179, 189, 199}, new int[]{185, 215, 185}, 3);
        g2d.fillOval(140, 350, 30, 35);  //глаза
        g2d.fillOval(210, 350, 30, 35);




        /* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();
    }
}