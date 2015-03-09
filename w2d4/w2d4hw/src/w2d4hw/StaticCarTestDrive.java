/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4hw;

/**
 *
 * @author stella
 */
public class StaticCarTestDrive {
     public static void main (String[] args) {
        StaticCar c1 = new StaticCar(0, 0, "Tesla", "Model X", 2015, "Red");
        StaticCar c2 = new StaticCar(0, 0, "Tesla", "Model S", "Silver");
        
        StaticCar.setX(c1, 2);
        StaticCar.setY(c2, 5);
        StaticCar.setX(c1, -1);
        StaticCar.setY(c2, 6);
        StaticCar.setName(c1, "mycar");
        StaticCar.setName(c2, "yourcar");
        StaticCar.moveDown(c1, 1);
        StaticCar.moveRight(c2, 3);
        StaticCar.moveUp(c1, 1);
        StaticCar.moveLeft(c2, 1);

        StaticCar.setLocation(c1, " " + StaticCar.getX(c1) + " " + StaticCar.getY(c1));
        StaticCar.setLocation(c2, " " + StaticCar.getX(c2) + " " + StaticCar.getY(c2));

        System.out.println(StaticCar.getLocation(c1));
        System.out.println(StaticCar.getLocation(c2));
    }
}
