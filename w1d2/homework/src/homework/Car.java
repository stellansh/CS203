/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author stella
 */
public class Car {
    private int x=0;
    private int y=0;

    public Car(){
    }

    public Car(int x, int y) {
     this.x = x;
     this.y = y;
    }
    
    public void moveUp(){  //public int moveUp()
                           //return y+1
        y = y+1;
    }
    
    public void moveDown(){
       y = y-1; 
    }
    
    public void moveRight(){
       x = x+1; 
    }
    
    public void moveLeft(){
       x = x-1;  
    }
    
    public void printLocation(){
        System.out.println("(" + x + "," + y + ")");
    }
 
    
}
