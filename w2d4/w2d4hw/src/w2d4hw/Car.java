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

   public class Car extends Automobile {

    private boolean convertible = false;
    private int trunkCapacity;

    public Car(String make, String model, int year, String color,
            boolean convertible, int truckCapacity) {
        super(make, model, year, color);
        this.convertible = convertible;
        this.trunkCapacity = trunkCapacity;
    }

    public Car(String make, String model, int year,
            String color, int trunkCapacity) {
        super(make, model, year, color);
        this.trunkCapacity = trunkCapacity;
    }

    public Car(String make, String model, int trunkCapacity) {
        super(make, model);
        this.trunkCapacity = trunkCapacity;
    }
    
    @Override
    public void accelerate() {
        speed += 12;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertable) {
        this.convertible = convertable;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
 
}
