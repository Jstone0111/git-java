/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5b;

/**
 *
 * @author Jacob
 */
public class Circle {
    public float radius;
    Point center;
    
    public Circle(float r, int x, int y){
        this.radius = r;
        this.center = new Point (x,y);
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
        return (center.toString() + "( " + Float.toString(getArea()) + " )     ");
    }
    
    public Point getPoint(){
        return center;
}
    
    
}