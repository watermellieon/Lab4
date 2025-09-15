import java.util.Scanner;

/**
 * String Assessment
 * This program reads in a string from the user, then another string (trimmed)
 * to create a character. It loops through the first string and counts how many
 * times the character occurs. 
 * @author Ellie Russo, erusso@student.sdccd.edu
 * @version v1.0
 * @since 9/14/2025
 */

public class ProgChall5 {
    public static void main(String[] args) {
        //Declare Variables
        char targetChar;
        int count, i;

        Scanner keyboard = new Scanner(System.in);
        
          // Step 1: Read in the string to be assessed
        System.out.print("Enter a string to be assessed: ");
        String str = keyboard.nextLine();

        // Step 2: Read in the second input string and trim it
        System.out.print("Enter a string to create a character: ");
        String charInput = keyboard.nextLine().trim();

        // Step 3: Use the first character of the trimmed string
        targetChar = charInput.charAt(0);

        // Step 4: Loop to count occurrences
        count = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        // Step 5: Display output
        System.out.println("The character '" + targetChar + "' occurs " + count + " time(s) in the string.");
        
        keyboard.close();
    }
}