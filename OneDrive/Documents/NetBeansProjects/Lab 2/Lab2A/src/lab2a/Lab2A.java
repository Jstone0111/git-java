package lab2a;
import java.util.Scanner;
/**
 *
 * @ Jacob Stone
 */
public class Lab2A {

    public static void main(String[] args) {
        int numbers = 0, smallest = 1000, greatest = -1000;
        int guesses;
        float average = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 10 numbers between 1 and 100, and I will tell you the smallest, the largest, and the average. ");
        while (numbers < 10){
            guesses = in.nextInt();
            average = average + guesses;
            numbers++;
            if (guesses < smallest)
                smallest = guesses;
            if (guesses > greatest)
                greatest = guesses;
        }
        average = (average / 10);
        
        
        System.out.println("Smallest:  " + smallest);
        System.out.println("Largest:  " + greatest);
        System.out.println("Average:  "  + average);
        }
}
