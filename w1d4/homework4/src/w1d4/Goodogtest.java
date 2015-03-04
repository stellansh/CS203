/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d4;

/**
 *
 * @author stella
 */
public class Goodogtest {
    public static void main (String[]args){
        GoodDog one = new GoodDog();
       
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System .out.println ("Dog one:"+one.getSize());
        System.out.println("Dog two:"+two.getSize());
        one. bark ();
        two. bark ();
}
}