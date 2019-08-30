package lab2b;
import java.util.Scanner;
/**
 *
 * @ Jacob Stone
 */
public class Lab2B {

    
    
    public static void main(String[] args) {
        double amount;
        int dol = 100;
        int halfdol = 50;
        int quart = 25;
        int dime = 10;
        int nick = 5;
        int penn = 1;
        int rem;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the total in dollars and cents (example: 1.25): ");
        amount = in.nextFloat();
        
        double newamount = (amount * 100); //doint this so we can convert using Integers.
        
        int totaldol = (int) (newamount / dol);
        rem = (int) (newamount % dol);
        
        int totalhalfdol = (rem / halfdol);
        rem = (rem % halfdol);
        
        int totalquart = (rem / quart);
        rem = (rem % quart);
        
        int totaldime = (rem / dime);
        rem = (rem % dime);
        
        int totalnick = (rem / nick);
        rem = (rem % nick);
        
        int totalpenn = (rem / penn);
        
        
        
        System.out.println("Dollars: " + totaldol);
        System.out.println("Half-Dollars: " + totalhalfdol);
        System.out.println("Quarters: " + totalquart);
        System.out.println("Dimes: " + totaldime);
        System.out.println("Nickles: " + totalnick);
        System.out.println("Pennies: " + totalpenn);
        

    }
    
}
