package learning;

import java.util.List;
import java.util.Scanner;

public class CLI_kg_lb {
    public static void main(String[] args) {
        
        String title = " ".repeat(10) + "UNIT CONVERTER" + " ".repeat(10);
        int title_length = title.length();
        double kg_to_lbs = 2.20462262;
        double lbs_to_kg = 0.45359237;
        List answers = List.of("a", "b", "c");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("\n" + title);
        System.out.println("-".repeat(title_length));
        System.out.println("A. Kilograms >> Pounds");
        System.out.println("B. Pounds >> Kilograms");
        System.out.println("C. Quit\n");
        System.out.print("Choose the conversation direction (A/B/C): ");
        String user_input_conv_dir = scanner.nextLine().toLowerCase();
        

        // INPUT VALIDATION
        while (!answers.contains(user_input_conv_dir)) {
            System.out.print("Your answer is not valid.\nTry again (A/B/C): ");
            user_input_conv_dir = scanner.nextLine().toLowerCase();
        }

        if (user_input_conv_dir.equals("c")) {
            System.out.println("\nThank you for stepping by!\n");
            System.exit(0);
        }

    
        System.out.print("\nAmount to convert: ");
        String user_input_amount = scanner.nextLine();
        double user_input_amount_number;
        boolean user_input_amount_valid = false;
        double value;


        // INPUT VALIDATION
        while (!user_input_amount_valid) {   
            try {
                Double.parseDouble(user_input_amount);
                user_input_amount_valid = true;
            } catch (NumberFormatException e) {
                System.out.print("Your answer is not valid. Try again: ");
                user_input_amount = scanner.nextLine();
            }
        }

        scanner.close();
        user_input_amount_number = Double.parseDouble(user_input_amount);
        String unit_type;
        if (user_input_conv_dir.equals("a")) {
            value = user_input_amount_number * kg_to_lbs;
            unit_type = "lbs";
        }
        else {
            value = user_input_amount_number * lbs_to_kg;
            unit_type = "kgs";
        }
     
        String value_to_print = String.format("Result: %.2f ", value);
        System.out.println(value_to_print +  unit_type + "\n");
    }
}
