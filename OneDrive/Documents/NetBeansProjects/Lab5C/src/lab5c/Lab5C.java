/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5c;

import java.util.ArrayList;


/**
 *
 * @author Jacob
 */
public class Lab5C {
        public static void main(String[] args) {
        
    
        Circle c = new Circle(2, 8, 3, 7);
        Rectangle r = new Rectangle(4, 6, 8, 3, 5);
        Triangle t = new Triangle(1, 4, 9, 4, 6);
        
        ArrayList<Shape> shape= new ArrayList<>();
        
        shape.add(c);
        shape.add(r);
        shape.add(t);
        
        
        for (Shape s: shape){
            System.out.print("The center and area is: " + s.toString() + "    ");
        }

    }
    
}
