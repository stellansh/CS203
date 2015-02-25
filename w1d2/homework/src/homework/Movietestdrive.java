/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author stella
 */
public class Movietestdrive {
    public static void main(String[] args) {
        // TODO code application logic here
       Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
       Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
       Movie three = new Movie();
       three.title = "Byte Club";
       three.genre = "Tragic but ultimately uplifting";
       three.rating = 127;
       System.out.println(one);
       System.out.println(two);
       System.out.println(three);
   }
}
