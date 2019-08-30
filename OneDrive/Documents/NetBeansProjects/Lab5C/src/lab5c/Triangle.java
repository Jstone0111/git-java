/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5c;

/**
 *
 * @author Jacob
 */
public class Triangle extends Shape {
    public float base;
    public float height;
    
    public Triangle(int x, int y, int z, float b, float h){
        super (x, y, z);
        this.base = b;
        this.height = h;
    }
    
    
    public float getBase(){
        return base;
    }
    public void setBase(float b){
        this.base = b;    
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float h){
        this.height = h;    
    }
    public float area(){
        float area = 0;
        area = (float) (.5 *(base * height));
        
        return area;
    }
    @Override
    public String toString(){
        return (center.toString() + "/ " + Float.toString(area()) + " \\     ");
    }
    
    
}
