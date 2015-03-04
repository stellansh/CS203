/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1;

/**
 *
 * @author stella
 */
public class StaticCar {

    private int x = 0;
    private int y = 0;
    public String location;

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

    public static void setLocation(StaticCar This, String location) {
        This.location = location;
    }

    public static String getLocation(StaticCar This) {
        return This.location;
    }
}
