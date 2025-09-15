import java.util.Scanner;

/**
 * This program reads a line of words ending with the word "quit".
 * For each word (excluding "quit"), it checks whether moving the first letter to the end of the word and then reversing produces
 * the original word. 
 * The program outputs whether each word "works" or "does not work". 
 * It repeats if the user chooses to process another line.
 *
 * @author Ellie Russo, erusso@student.sdccd.edu
 * @version v1.0
 * @since 9/14/2025
 */

public class ReverseWord {
    public static void main(String[] args) {
        // Declare Variables
        String word, remaining, combined, flipped;
        char firstLetter;
        String again;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter words separated by a space ending with the word quit: ");

            // start by reading the first word
            word = keyboard.next().toLowerCase();

            // while pit: stop when we reach "quit"
            while (!word.equals("quit")) {
                combined = "";
                flipped = "";

                // get first letter
                firstLetter = word.charAt(0);

                // get the rest of the word
                remaining = word.substring(1);

                // move first letter to the end
                combined = remaining + firstLetter;

                // manually reverse combined
                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                // test if flipped equals original word
                if (flipped.equals(word)) {
                    System.out.println(word + " works");
                } else {
                    System.out.println(word + " does not work");
                }

                // get next word
                word = keyboard.next().toLowerCase();
            }

            // Ask if the user wants another line
            System.out.print("Enter yes to process another line? ");
            again = keyboard.next();

        } while (again.equalsIgnoreCase("yes")); //repeat if yes

        keyboard.close();
    }
}