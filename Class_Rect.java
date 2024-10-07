package uc;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;


public class Class_Rect extends JPanel {

    Class_WidgetProperties p = new Class_WidgetProperties();
    int RECT_DIFF = 7;
    int RECT_WIDTH = p.FRAME_WIDTH - 32;
    int RECT_HEIGHT = p.FRAME_HEIGHT  - 55;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.draw3DRect(RECT_DIFF, RECT_DIFF, RECT_WIDTH, RECT_HEIGHT, true);
    }
}
