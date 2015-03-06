/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4hw;

public abstract class Vehicle {

    private double x;
    private double y;
    protected int speed;
    private double direction;

    public Vehicle() {
        this(0.0, 0.0, 0, 0.0);
    }

    public Vehicle(double x, double y) {
        this(x, y, 0, 0.0);
    }

    public Vehicle(double x, double y, int speed, double direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void move(int seconds) {
        double amount = speed * seconds;
        double a = Math.toRadians(amount);
        x = (int) (Math.cos(a) * speed);
        y = (int) (Math.sin(a) * speed);
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

    public double getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "x=" + x + ", y=" + y + ", "
                + "speed=" + speed + ", direction=" + direction + "}";
    }

    public abstract int accelerate();

    public abstract int brake();
}
