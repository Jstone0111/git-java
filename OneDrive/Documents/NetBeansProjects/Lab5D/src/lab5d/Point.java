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
public class Point {
    public int x;
    public int y;
    public int z;
    
    public Point(int x, int y, int z){
        if (x <= 0)
            x = 0;
        if (x >= 500)
            x = 500;
        if (y <= 0)
            y = 0;
        if (y >= 500)
            y = 500;
        
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;    
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;    
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
    @Override
    public String toString(){
        return ("(" + getX() + "," + getY() + ")   ");
    }
    
}
