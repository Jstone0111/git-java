/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5b;

import java.util.Random;

/**
 *
 * @author Jacob
 */
public class Lab5B {

    /**
     * @param args the command line arguments
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        Circle[] c = new Circle[2];
        c[0] = new Circle(6, 4, 35);
        c[1] = new Circle(8, 7, 11);
        
        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(5, 4, 9, 15);
        r[1] = new Rectangle(9, 6, 18, 11);
        
        Triangle[] t = new Triangle[2];
        t[0] = new Triangle(7, 9, 6, 9);
        t[1] = new Triangle(4, 6, 7, 22);
        
        float c0 = c[0].getArea();
        float c1 = c[1].getArea();
        
        float r0 = r[0].getArea();
        float r1 = r[1].getArea();
        
        float t0 = t[0].getArea();
        float t1 = t[1].getArea();
        
        
        
        System.out.println(c[0] + "  " + c[1]);
        System.out.println(r[0] + "  " + r[1]);
        System.out.println(t[0] + "  " + t[1]);
        
        System.out.println(" ");
        
        
        System.out.println("Total Circle Area = " + (c0 + c1));
        System.out.println("Total Rectangle Area = " + (r0 + r1));
        System.out.println("Total Triangle Area = " + (t0 + t1));

    }
    
}

    

