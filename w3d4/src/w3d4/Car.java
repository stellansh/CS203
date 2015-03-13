/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Car implements Serializable{
    
    private int x;
    private int y;
        
 

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public void moveUp(int y){
        this.y = this.y + y;
    }
    
    public void moveDown(int y){
        this.y = this.y - y;
    }
    
    public void moveRight(int x){
        this.x = this.x + x;
    }
    
    public void moveLeft(int x){
        this.x = this.x - x;
    }
    
    public String printLocation(){
        return (x + ", " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
