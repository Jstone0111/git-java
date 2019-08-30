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
public class Triangle {
    public float base;
    public float height;
    
    public Triangle(float b, float h){
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
    public float getArea(){
        float area = 0;
        area = (float) (.5 *(base * height));
        
        return area;
    }
    public String toString(){
        return ("/ " + Float.toString(getArea()) + " \\");
    }
    
}
