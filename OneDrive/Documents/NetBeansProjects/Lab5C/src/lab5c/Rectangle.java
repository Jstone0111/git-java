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
public class Rectangle extends Shape{
    public float length;
    public float width;
    
    
    public Rectangle(int x, int y, int z, float l, float w){
        super (x, y, z);
        this.length = l;
        this.width = w;
    }
    
    public float getLength(){
        return length;
    }
    public void setLength(float l){
        this.length = l;    
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float w){
        this.width = w;    
    }
    @Override
    public float area(){
        float area = 0;
        area = length * width;
        
        return area;
    }

    @Override
    public String toString(){
        return (center.toString() + "[ " + Float.toString(area()) + " ]     ");
    }
    
    
}

