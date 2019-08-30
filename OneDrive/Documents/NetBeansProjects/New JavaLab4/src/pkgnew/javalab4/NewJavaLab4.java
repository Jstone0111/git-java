/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.javalab4;
import java.util.Random;

/**
 *
 * @author Jacob
 */
public class NewJavaLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        Die[] dice = new Die[7];
        dice[0] = new Die("d4", 4);
        dice[1] = new Die("d6", 6);
        dice[2] = new Die("d8", 8);
        dice[3] = new Die("d10", 10);
        dice[4] = new Die("d12", 12);
        dice[5] = new Die("d20", 20);
        dice[6] = new Die("d100", 100);
        
        for (int i = 0; i < 5; i++){
            int x = rand.nextInt(dice.length);
            System.out.print(dice[x]);
        }
        


   }
    
}
