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
public class Rectangle {
    public float length;
    public float width;
    Point center;
    
    public Rectangle (float l, float w, int x, int y){
        this.length = l;
        this.width = w;
        this.center = new Point (x,y);
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
    public float getArea(){
        float area = 0;
        area = length * width;
        
        return area;
    }

    public String toString(){
        return (center.toString() + "[ " + Float.toString(getArea()) + " ]     ");
    }
    
    public Point getPoint(){
        return center;
}
    
}
