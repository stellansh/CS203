/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d2;

/**
 *
 * @author stella
 */
import java.util.ArrayList;
public class AutomobileTestDrive {
    public static void main(String[] args) {
        
        ArrayList<Automobile> autos = new ArrayList<>();
        
        Car car1 = new Car();
        autos.add(car1);
        car1.setMake("benz");
        car1.setModel("mercedes");
        
         Car car2 = new Car();
        autos.add(car2);
        car2.setMake("chevy");
        car2.setModel("camaro");
        
        Car car3 = new Car();
        autos.add(car3);
        car3.setMake("ford");
        car3.setModel("fusion");
        
        Truck truck1 = new Truck();
        autos.add(truck1);
        truck1.setMake("toyota");
        truck1.setModel("4runner");
        
         Truck truck2 = new Truck();
        autos.add(truck2);
        truck2.setMake("bentley");
        truck2.setModel("suv");
        
         for (Automobile x : autos) {
             for (int i=0;i<3;i++){
                 x.accelerate();  //runtime poly
             }
                  x.brake();
       System.out.print("The " + x.getMake());
       System.out.print(" " + x.getModel() + " has a speed of ");
       System.out.println( x.speed);// koz am in the same package i dont need
       //get/set and it was public
             
         }
        
                     
           
            
        
       

        
    }
}
