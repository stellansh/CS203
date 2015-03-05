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
public class GarageTestDrive {

    public static void main(String[] args) {
        Garage gobj = new Garage();

        Car c = new Car();
        c.setMake("Toyota");
        c.setModel("corola");
        Truck t = new Truck();
        t.setMake("Ford");
        t.setModel("Focus");
        Item one = new Item();
        one.setName("red");
        Item two = new Item();
        two.setName("blue");
        Item three = new Item();
        three.setName("green");
      
       
        gobj.store(c);
        System.out.println(gobj.retrieve().getMake());// compile time poly
        gobj.store(t);
        System.out.println(gobj.retrieve().getMake());
        
        gobj.store(one);
        gobj.store(two);
        gobj.store(three);
        for(int i = 0; i < 3; i++){    //gobj.getItemCount()
            System.out.println(gobj.retrieve(i).getName());
        
        
   
    }
        
    }
}
