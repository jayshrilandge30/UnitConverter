package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CLI_multiple_unit_types {

    
    static void Print_title() {
        String title = " ".repeat(10) + "UNIT CONVERTER" + " ".repeat(10);
        System.out.println("\n" + title);
        System.out.println("-".repeat(title.length()));
    }


    static void Print_map(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry: map.entrySet()) {
            String text_to_print = entry.getKey() + ", " + entry.getValue().split(",")[0];
            System.out.println(text_to_print);
        }
    }


    static double Convert_values(Double value, Double conv_from, Double conv_to) {
        Double new_value = value / conv_from * conv_to;
        return new_value;
    }


    static boolean Input_validate_unit_type_selection(String user_input, HashMap<String, String> map) {
        if (map.keySet().contains(user_input)) {
            return true;
        }
        else {
            return false;
        }
    }
    

    static double Input_get_amount(String user_input) {
        boolean user_input_amount_valid = false;
        Scanner scanner = new Scanner(System.in);


        while (!user_input_amount_valid) {   
            try {
                Double.parseDouble(user_input);
                user_input_amount_valid = true;
            } catch (NumberFormatException e) {
                System.out.print("It is not a number. Try again: ");
                user_input = scanner.nextLine();
            }
        }
        return Double.parseDouble(user_input);
    }
  

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Kilogram [kg], 1");
        map.put("B", "Hectogram [hg], 10");
        map.put("C", "Dekagram [dag], 100");
        map.put("D", "Gram [g], 1000");
        map.put("E", "Ton [t], 0.001");
        map.put("F", "Pound [lbs], 2.2046226218");
        map.put("G", "Stone [st], 0.1574730444");
        map.put("H", "Ounce [oz], 35.27396195");
        
                
        
        Print_title();  
        Print_map(map);
        System.out.print("\nSelect the unit to convert from (A-H): ");
        

        // INPUT #1
        String user_input_from = scanner.nextLine().toUpperCase();
        while (!Input_validate_unit_type_selection(user_input_from, map)) {
            System.out.print("Invalid value. Try again (A-H): ");
            user_input_from = scanner.nextLine().toUpperCase();
        }


        // INPUT #2
        System.out.print("Select the unit to convert to (A-H): ");
        String user_input_to = scanner.nextLine().toUpperCase();
        while (!Input_validate_unit_type_selection(user_input_to, map)) {
            System.out.print("Invalid value. Try again (A-H): ");
            user_input_to = scanner.nextLine().toUpperCase();
        }


        // INPUT #3
        System.out.print("Amount to convert: ");
        String amount = scanner.nextLine();
        double amount_dbl = Input_get_amount(amount);
        


        // RESULT
        double conv_from = Double.parseDouble(map.get(user_input_from).split(",")[1]);
        double conv_to = Double.parseDouble(map.get(user_input_to).split(",")[1]);
        double result = Convert_values(amount_dbl, conv_from, conv_to);
        
        // "Gram [g], 1000" -> [g]
        String conv_from_unit = map.get(user_input_from).split(",")[0].split(" ")[1];
        String conv_to_unit = map.get(user_input_to).split(",")[0].split(" ")[1];
        
        String result_to_print = String.format("%.1f ", result);
        String text_to_print = amount_dbl + " " + conv_from_unit + " = " + result_to_print + conv_to_unit;

        System.out.println("\nResult: " + text_to_print + "\n");
        scanner.close();
    }
}
