package learning;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
 

 
public class Swing_frame_and_button {
    
    public static void main(String[] args)     {
    
    // FRAME
    JFrame frame = new JFrame();
    frame.setTitle("Test Window");
    frame.getContentPane().setLayout(null);
    frame.setVisible(true);
    frame.setBounds(800,400,400,400);
    
    // BUTTON
    JButton button = new JButton("Recolor frame & print");
    ActionListener button_action = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
            frame.getContentPane().setBackground(Color.CYAN);
        }
    };
    button.setBounds(100,150,200,40);
    button.addActionListener(button_action);

    
    frame.add(button);
    }
}

