import java.util.Random;

/**
 *This program generates three random integers from 0 to 999 and displays them along with a bar chart. 
 *Each star represents one hundred. Numbers less than 100 are labeled "<100 no stars".
 * @author Ellie Russo, erusso@student.sdccd.edu
 * @version v1.0
 * @since 9/14/2025
 */

public class BarChart{
     public static void main(String[] args) {
        // Declare Variables
        int first, second, third;

        // generate and assign random numbers
        Random generator = new Random();
        first = generator.nextInt(1000);   
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        // Print out the random numbers
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println();

        // Bar Chart Section
        System.out.println("NUMBER BAR CHART");

        // Print stars for each number
        System.out.print("Number 1: ");
        printStars(first);

        System.out.print("Number 2: ");
        printStars(second);

        System.out.print("Number 3: ");
        printStars(third);
    }

    /**
    * Accepts int input and prints stars
    * @param input - number of stars to print out
    */
   
    public static void printStars(int input) {
        if (input < 100) {
            System.out.println("<100 no stars");
        } else {
            int starsCount = input / 100; // integer division gives hundreds
            for (int i = 0; i < starsCount; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}