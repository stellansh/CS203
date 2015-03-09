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
public class StaticCar {

    private int x;
    private int y;
    private String name;
    private String location;
    private String make;
    private String model;
    private int year;
    private String color;

    public StaticCar(int x, int y, String make, String model,
            int year, String color) {
        this.x = x;
        this.y = y;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public StaticCar(int x, int y, String make, String model, String color) {
        this(x, y, make, model, 2015, color);
    }

    public StaticCar() {
    }

    public static String getName(StaticCar This) {
        return This.name;
    }

    public static void setName(StaticCar This, String name) {
        This.name = name;
    }

    public static int getX(StaticCar This) {
        return This.x;
    }

    public static void setX(StaticCar This, int x) {
        This.x = x;
    }

    public static int getY(StaticCar This) {
        return This.y;
    }

    public static void setY(StaticCar This, int y) {
        This.y = y;
    }

    public static int moveUp(StaticCar This, int y) {
        This.y = This.y + y;
        return This.y;
    }

    public static int moveDown(StaticCar This, int y) {
        This.y = This.y - y;
        return This.y;
    }

    public static int moveRight(StaticCar This, int x) {
        This.x = This.x + x;
        return This.x;
    }

    public static int moveLeft(StaticCar This, int x) {
        This.x = This.x - x;
        return This.x;
    }
     public static String getLocation(StaticCar This) {
        return This.location;
    }

    public static void setLocation(StaticCar This, String location) {
        This.location = location;
    }
}
