/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

/**
 *
 * @author stella
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Lai
 */
public class CarSave implements Serializable{

    public static void main(String[] args){
        Car c1 = new Car(5, 4);
        Car c2 = new Car(10, 20);
        Car c3 = new Car(100, 300);
        
        try{
            FileOutputStream fos = new FileOutputStream("Car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.writeObject(c3);
            
            oos.close();
            fos.close();
        } catch (IOException e){
            
        }
        
    }
}