/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5d;

/**
 *
 * @author Jacob
 */
public class Circle extends Shape{
    public float radius;
    
    public Circle(int x, int y, int z, float r){
        super (x, y, z);
        this.radius = r;
    }
    
    
    public float getRadius(){
        return radius;
    }
    public void setRadius(float r){
        this.radius = r;    
    }
    @Override
    public float area(){
        float area = 0;
        area = (float) (Math.PI * radius * radius);
        
        return area;
    }
    
    @Override
    public String toString(){
        return (center.toString() + "( " + Float.toString(area()) + " )   ");
    }
    
    
    
}
