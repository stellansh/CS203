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
import java.util.ArrayList;
public class AutomobileTestDrive {
    public static void main(String[] args) {

        ArrayList<Automobile> autos = new ArrayList<>();

        Car car1 = new Car("benz", "mercedes", 2013, "red",  10);
        autos.add(car1);
        Car car2 = new Car("Chevy", "camaro", 2015, "White", 15);
        autos.add(car2);
        Car car3 = new Car("ford", "fusion", 12);
        autos.add(car3);
        
        Truck truck1 = new Truck("toyota", "4runner", 2003, "black", 1240, true);
        autos.add(truck1);
        Truck truck2 = new Truck("bentley", "suv", 1982, " Grey", 400);
        autos.add(truck2);
        

       for (Automobile x : autos) {
             for (int i=0;i<3;i++){
                 x.accelerate();  
             }
                  x.brake();
       System.out.print("The " + x.getMake());
       System.out.print(" " + x.getModel() + " has a speed of ");
       System.out.println( x.speed);
        }

    }
}
