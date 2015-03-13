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

public class Cardeserial{

        
    public static void main(String[] args){
             
        try{
            FileInputStream fis =  new FileInputStream("Car.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car c1restore = (Car) ois.readObject();
            Car c2restore = (Car) ois.readObject();
            Car c3restore = (Car) ois.readObject();
            System.out.println(c1restore.getX() + " " + c1restore.getY());
            System.out.println(c2restore.getX() + " " + c2restore.getY());
            System.out.println(c3restore.getX() + " " + c3restore.getY());
        } catch (Exception e){
            
        }
        
        
    }

    
}