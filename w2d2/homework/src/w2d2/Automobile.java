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


public class Automobile {
   private String make;
   private String model;
    private int year;
    private String color;
    protected int speed;
 

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void move(){
      System.out.println("vroom vroom");
    }
    
    public void accelerate(){
      this.speed += 10;

    }
    public void brake(){
      if (speed > 9) {
            speed =speed- 10;
      }
    }
}
