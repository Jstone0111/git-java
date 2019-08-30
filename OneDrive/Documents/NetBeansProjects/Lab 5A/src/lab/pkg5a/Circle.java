/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5a;

/**
 *
 * @author Jacob
 */
public class Circle {
    public float radius;
    
    public Circle(float r){
        this.radius = r;
    }
    
    
    public float getRadius(){
        return radius;
    }
    public void setRadius(float r){
        this.radius = r;    
    }
    public float getArea(){
        float area = 0;
        area = (float) (Math.PI * radius * radius);
        
        return area;
    }
    
    public String toString(){
        return ("( " + Float.toString(getArea()) + " )");
    }
}
