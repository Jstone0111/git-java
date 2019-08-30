package lab.pkg1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * Jacob Stone
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guess = 0;
        int count = 1;
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        
        System.out.println("Please guess a number:  ");
        guess = in.nextInt();
        
       while ( guess != number)
       {
        if (guess > number){
            System.out.println(guess + " is too high" );
            System.out.println("Guess again");
            guess = in.nextInt();
            count++ ;
        }
        else if (guess < number){
            System.out.println(guess + " is too low" );
            System.out.println("Guess again");
            guess = in.nextInt();
            count++ ;
        }
        
       
       }
      
        if (guess == number){
        System.out.println("Congratualtions! You guessed the number in " + count + " Guess(es)!");
        }
      
    }
    
}
