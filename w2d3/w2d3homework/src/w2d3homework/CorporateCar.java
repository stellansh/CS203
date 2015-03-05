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
public class CorporateCar extends Vehicle implements Asset {

    public double purchasePrice;
    public double currentValue;
    private int yearPurchased;
    private String employee;

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

    public void accelerate() {
        this.speed += 5;
        if (this.speed > 65) {
            this.speed = 65;
        }
    }

    public void brake() {
        this.speed -= 5;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double amoritize(int years) {
        double x = purchasePrice / years;

        if (currentValue < x) {
            int yearsSincePurchase = 2015 - yearPurchased;
            x = purchasePrice - (purchasePrice / years) * yearsSincePurchase;

            if (currentValue < x) {
                double pp = currentValue - x;
                x = x + pp;
            }
        }

        return x;
    }

}
