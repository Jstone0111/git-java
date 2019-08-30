package pkgnew.javalab4;
import java.util.Random;
/**
 *
 * @author Jacob
 */
public class Die {
    private final String dice; //Which dice is chosen
    private final int sides; //The sides on that dice
    
    public Die(String d, int s){
        dice = d;
        sides = s;
    }
    
    public int roll(){
        Random rand = new Random();
        int value = sides;
        
        value = (rand.nextInt(value + 1));
        
        return value;

    }
    
    public int getFaceValue(){
        int facevalue = sides;
        return facevalue;
    }
    
    public int getNumFace(){
        int numface = sides;
        return numface;
    }
    

    public String toString(){
        return (dice + " = " + roll() + ", ");
    }
    
    
}
