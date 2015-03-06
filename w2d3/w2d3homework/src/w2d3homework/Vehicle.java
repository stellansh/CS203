/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3homework;

/**
 *
 * @author stella
 */
public abstract class Vehicle {

    private double x;
    private double y;
    protected int speed;
    private int direction;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    public void move(int amount) {
        double a = Math.toRadians(amount);
        x = (int) (Math.cos(a) * speed);
        y = (int) (Math.sin(a) * speed);
    }

    public void move() {
        x = x + (Math.cos(direction * Math.PI / 180) * speed);
        y = y + (Math.sin(direction * Math.PI / 180) * speed);
    }

    public void turn(int amount) {
         if ((direction += amount) > 360) {
            direction = 360;
        } else if ((direction += amount) < 0) {
            direction = 0;
        } else {
            direction += amount;
        }
    }
               
    public abstract void accelerate();

    public abstract void brake();

    
    
}
            
        
         
  
