import java.util.Scanner;

/**
 * This program converts temperatures between Celsius and Fahrenheit.
 * The user enters a number followed by a unit (C or F). 
 * If the unit is invalid, the user is held in a "while pit" until they provide a valid unit. 
 * The program then converts the temperature and displays the result rounded to one decimal place. 
 * The program runs in a do-while loop until the user decides to stop.
 * 
 * @author Ellie Russo, erusso@student.sdccd.edu
 * @version v1.0
 * @since 9/14/2025
 */

public class Temperature {
    public static void main(String[] args) {
        // Declare Variables
        double inputTemp, outputTemp;
        char inputUnit;
        String again;

        Scanner input = new Scanner(System.in);

        do {
            // Ask user for temperature and unit
            System.out.print("Enter a number and C or F (e.g., 100 F): ");
            inputTemp = input.nextDouble();
            String unitInput = input.next().trim().toUpperCase();
            inputUnit = unitInput.charAt(0);

            // while pit for invalid unit
            while (inputUnit != 'C' && inputUnit != 'F') {
                System.out.print("Invalid unit. Please enter C or F: ");
                unitInput = input.next().trim().toUpperCase();
                inputUnit = unitInput.charAt(0);
            }

            // Conversion
            if (inputUnit == 'F') {
                outputTemp = (inputTemp - 32) * 5.0 / 9.0;
                System.out.printf("%.1f F = %.1f C%n", inputTemp, outputTemp);
            } else { // must be 'C'
                outputTemp = (inputTemp * 9.0 / 5.0) + 32;
                System.out.printf("%.1f C = %.1f F%n", inputTemp, outputTemp);
            }

            // Ask if the user wants another calculation
            System.out.print("Do you want to compute another temperature? (yes/no): ");
            again = input.next();

        } while (again.equalsIgnoreCase("yes"));

        input.close();
    }
}