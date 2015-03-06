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
import java.util.ArrayList;

public class VehiTestdriver {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Asset> assets = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        CorporateCar cc = new CorporateCar();
         cc.move(3);

        vehicles.add(cc);
        assets.add(cc);
        objects.add(cc);
        
        cc.purchasePrice = 20000.00;
        cc.currentValue = 15000.00;
        cc.setYearPurchased(2009);

        cc.brake();                   //for(Assets cc:assets) blablabla
        System.out.println("Speed is " + cc.getSpeed());
        cc.accelerate();
        System.out.println("Speed is " + cc.getSpeed());
        System.out.println(cc.getPurchasePrice());
        System.out.println(cc.toString());//for Obbjects o: 

    }
}
