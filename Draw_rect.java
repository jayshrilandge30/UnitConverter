package learning;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;


public class Draw_rect {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        DrawingPanel draw_p = new DrawingPanel();

        draw_p.setBounds(0,0,500,300);
        
        frame.add(draw_p);
        frame.setTitle("Rect");
        frame.setBounds(600,600,500,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}

class DrawingPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawRect(20, 20, 450, 180);
        g2d.draw3DRect(30, 50, 200, 120, true);
        g2d.draw3DRect(250, 50, 200, 120, false);
    }
}
