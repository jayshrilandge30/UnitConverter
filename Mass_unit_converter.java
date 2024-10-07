package learning;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.*;



class WidgetProperties {
    int FRAME_WIDTH = 300;
    int FRAME_HEIGHT = 300;
    int FRAME_POS_X = 800;
    int FRAME_POS_Y = 600;

    int BASE_X = 80;
    int BASE_Y = 40;
    int Y_DIFF = 30;
    int X_DIFF = 160;

    int X_DIFF_TEXT = 50;

    int WIDGET_WIDTH = 140;
    int WIDGET_HEIGHT = 25;

    int getPosY(double x) {
        double i = BASE_Y + Y_DIFF * x;
        return (int)i;
    }
}



public class Mass_unit_converter {

    static boolean field_value_validation(String field_value) {
        boolean val_pass = false;
        try {
            Double.parseDouble(field_value);
            val_pass = true;
        }
        catch (NumberFormatException e) {}
        
        return val_pass;
    }


    static double convert_value(double value, double conv_from, double conv_to) {
        double new_value = value / conv_from * conv_to;
        return new_value;
    }


    static String gen_result_to_display (double converted_value) {
        String converted_value_str;

        if ((int)converted_value < converted_value) {
            converted_value_str = String.format("%.2f", converted_value);
        }
        else {
            converted_value_str = String.format("%.0f", converted_value);
        }
        return converted_value_str;
    }
    
    
    public static void main(String[] args) {

        WidgetProperties p = new WidgetProperties();
        
        // UNIT MAP
        HashMap<String, String> map_mass = new HashMap<>();
        map_mass.put("Kilogram [kg]", "1");
        map_mass.put("Hectogram [hg]", "10");
        map_mass.put("Dekagram [dag]", "100");
        map_mass.put("Gram [g]", "1000");
        map_mass.put("Ton [t]", "0.001");
        map_mass.put("Pound [lbs]", "2.2046226218");
        map_mass.put("Stone [st]", "0.1574730444");
        map_mass.put("Ounce [oz]", "35.27396195");


        // COMBO BOX OPTIONS
        ArrayList<String> map_mass_al = new ArrayList<>(map_mass.keySet());
        int map_mass_size = map_mass_al.size();
        String[] combo_box_options = new String[map_mass_size];
        for (int i = 0; i < map_mass_size; i++) {
            combo_box_options[i] = map_mass_al.get(i);
        }
        Arrays.sort(combo_box_options);


        // WIDGETS CREATION
        JFrame frame = new JFrame();

        Font combo_box_font_style = new Font("Arial", Font.PLAIN, 14);
        Font label_font_style = new Font("Arial", Font.BOLD, 13);
        Font field_font_style = new Font("Arial", Font.BOLD, 14);

        JTextField field_from = new JTextField();
        field_from.setFont(field_font_style);
        field_from.setHorizontalAlignment(JTextField.RIGHT);
        
        JTextField field_to = new JTextField();
        field_to.setFont(field_font_style);
        field_to.setHorizontalAlignment(JTextField.RIGHT);

        JComboBox<String> combo_box_unit_from = new JComboBox<>(combo_box_options);
        JComboBox<String> combo_box_unit_to = new JComboBox<>(combo_box_options);

        combo_box_unit_from.setFont(combo_box_font_style);
        combo_box_unit_from.setSelectedIndex(3);
        combo_box_unit_to.setFont(combo_box_font_style);
        combo_box_unit_to.setSelectedIndex(5);
        
        JLabel label = new JLabel();
        JLabel label_from = new JLabel();
        JLabel label_to= new JLabel();
        label_from.setText("From");
        label_from.setFont(label_font_style);
        label_to.setText("To");
        label_to.setFont(label_font_style);


        JButton button = new JButton("Go");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String field_from_value = field_from.getText();

                if (field_value_validation(field_from_value)) {

                    double field_from_value_dbl = Double.parseDouble(field_from_value);
                    
                    String unit_from_key = combo_box_unit_from.getItemAt(combo_box_unit_from.getSelectedIndex());
                    String unit_from_value = map_mass.get(unit_from_key);
                    double unit_from_dbl = Double.parseDouble(unit_from_value);
                    
                    String unit_to_key = combo_box_unit_to.getItemAt(combo_box_unit_to.getSelectedIndex());
                    String unit_to_value = map_mass.get(unit_to_key);
                    double unit_to_dbl = Double.parseDouble(unit_to_value);

                    Double converted_value = convert_value(field_from_value_dbl, unit_from_dbl, unit_to_dbl);
                    field_to.setText(gen_result_to_display(converted_value));
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid value. Try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        

        // WIDGETS POS
        field_from.setBounds(p.BASE_X, p.getPosY(0), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        combo_box_unit_from.setBounds(p.BASE_X, p.getPosY(1), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        combo_box_unit_to.setBounds(p.BASE_X, p.getPosY(2), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        field_to.setBounds(p.BASE_X, p.getPosY(3), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        
        label_from.setBounds(p.BASE_X - p.X_DIFF_TEXT, p.getPosY(1), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        label_to.setBounds(p.BASE_X - p.X_DIFF_TEXT, p.getPosY(2), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);

        button.setBounds(p.BASE_X, p.getPosY(5), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        label.setBounds(p.BASE_X, p.getPosY(6), p.WIDGET_WIDTH, p.WIDGET_HEIGHT);
        

        // WIDGETS >> FRAME
        Component[] widgets_array = {
            field_from,
            combo_box_unit_from,
            combo_box_unit_to,
            field_to,
            label_from,
            label_to,
            label,
            button
        };

        for (Component widget : widgets_array) {
           frame.add(widget);
        }

        frame.setTitle("Unit Converter");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(p.FRAME_POS_X,p.FRAME_POS_Y,p.FRAME_WIDTH,p.FRAME_HEIGHT);
    }
}
