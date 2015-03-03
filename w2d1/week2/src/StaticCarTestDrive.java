/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stella
 */
public class StaticCarTestDrive {
    public static void main(String[] args) {
       StaticCar c1 = new StaticCar();
        StaticCar c2 = new StaticCar();
        
        StaticCar.setX(c1, 2);
        StaticCar.setY(c2, 5);
        
        StaticCar.setX(c1, -1);
        StaticCar.setY(c2, 6);
        
        StaticCar.setName(c1, "Car c1");
        StaticCar.setName(c2, "Car c2");
        
        StaticCar.moveDown(c1, 1);
        StaticCar.moveRight(c2, 3);
        StaticCar.moveUp(c2, 1);
        StaticCar.moveLeft(c2, 1);
        
        StaticCar.setLocation(c2, "Car One is at X: " 
                + StaticCar.getX(c1) + ", Y: " + StaticCar.getY(c1));
        StaticCar.setLocation(c2,  "Car Two is at X: " 
                + StaticCar.getX(c2) + ", Y: " + StaticCar.getY(c2));
        
        System.out.println(StaticCar.getLocation(c1));
        System.out.println(StaticCar.getLocation(c2));
    }
}
