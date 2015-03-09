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
public class CorporateCar extends Vehicle{
    public double purchasePrice;
    public double currentValue;
    private int yearPurchased;
    private String employee;

    public CorporateCar(double purchasePrice, double currentValue) {
        this(purchasePrice, currentValue, 2015, null);
    }
    
    public CorporateCar(double purchasePrice, double currentValue, int yearPurchased, String employee) {
        this.purchasePrice = purchasePrice;
        this.currentValue = currentValue;
        this.yearPurchased = yearPurchased;
        this.employee = employee;
    }
    
    public CorporateCar(double x, double y, double direction, double price, double value, int year, String employee) {
        super(x, y, direction);
        this.purchasePrice = price;
        this.currentValue = value;
        this.yearPurchased = year;
        this.employee = employee;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
   
    public void accelerate(){
        this.speed += 5;
        if(this.speed > 65){
            this.speed = 65;
        }
    }
    
    public void brake(){
        this.speed -= 5;
        if(this.speed < 0){
            this.speed = 0;
        }
    }

    @Override
    public int accelerate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int brake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
