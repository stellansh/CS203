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
public class Truck extends Automobile{
    private boolean hasTailgate;
     private int carryingCapacity;
     
     public void accelerate() {
        speed += 7;
    }


    public boolean isHasTailgate() {
        return hasTailgate;
    }

    public void setHasTailgate(boolean hasTailgate) {
        this.hasTailgate = hasTailgate;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    
}
