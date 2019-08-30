package lab.pkg03.pt1;

import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class Lab03Pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num3;
        double num1 = Double.parseDouble(args[0]); //Converting to Double
        double num2 = Double.parseDouble(args[2]); //Converting to Double
        String s = args[1];
        char symbol = s.charAt(0);
        int i = args.length;
        
        Scanner in = new Scanner(System.in); //Assigning Scanner to "in"
        
        for (String arg : args) { 

            if (i < 2){
                System.out.println("ERROR! Not Enough Arguments!");
                break;   
            }
            else if (symbol == '+'){
                num3 = num1 + num2;
                System.out.print(num1 + "   ");
                System.out.print(symbol + "  ");
                System.out.print(num2 + "   =  ");
                System.out.println(num3 + "   ");
                break;
            }
            else if (symbol == '-'){
                num3 = num1 - num2;
                System.out.print(num1 + "   ");
                System.out.print(symbol + "  ");
                System.out.print(num2 + "   =  ");
                System.out.println(num3 + "   ");
                break;
            }
            else if (symbol == 'x' || symbol == 'X'){
                num3 = num1 * num2;
                System.out.print(num1 + "   ");
                System.out.print(symbol + "  ");
                System.out.print(num2 + "   =  ");
                System.out.println(num3 + "   ");
                break;
            }
            else if (num2 == 0 && symbol == '/'){
                System.out.println("ERROR! Division by 0!");
                break;
            }
            else if (symbol == '/' && num2 != 0){
                num3 = num1 / num2;
                System.out.print(num1 + "   ");
                System.out.print(symbol + "  ");
                System.out.print(num2 + "   =  ");
                System.out.println(num3 + "   ");
                break;
            }
        }
    
    }

}