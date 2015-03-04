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

public class Car extends Automobile{
    
     private boolean convertible;
     private int trunkCapacity;
     
    public void accelerate() {
        speed += 12;
    }
    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
     
       
    
}
