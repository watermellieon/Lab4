import java.util.Scanner;

/**
 * This program prompts the user for a maximum width, ensures it is odd, 
 * and then prints a diamond pattern of stars to the console using loops for both the top and bottom halves.
 * If the user enters an even number, 1 is added to make it odd so that the diamond is symmetric.
 *
 * @author Ellie Russo, erusso@student.sdccd.edu
 * @version v1.0
 * @since 9/14/2025
 */

public class FlashbackProgChall4{
    public static void main(String args[]) {
        //Declare Variables
        int width, half, line, spaces, stars;

        // Create Scanner object to read from console
        Scanner keyboard = new Scanner(System.in);

        // Ask user for width
        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();

        // test to see if width is even
        if (width % 2 == 0) {
            width++;
        }

        half = width / 2; 

        // top half section
        for (line = 0; line <= half; line++) { 
            //spaces
            for (spaces = 0; spaces < half - line; spaces++) {
                System.out.print(" ");
            }
            //stars
            for (stars = 0; stars < (2 * line + 1); stars++) {
                System.out.print("*");
            }
            System.out.println(""); 
        }

        //bottom half 
        for (line = half - 1; line >= 0; line--) { 
            //spaces
            for (spaces = 0; spaces < half - line; spaces++) {
                System.out.print(" ");
            }
            //stars
            for (stars = 0; stars < (2 * line + 1); stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        keyboard.close();// Close scanner
    } 
} 