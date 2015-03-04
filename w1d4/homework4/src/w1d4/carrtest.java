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
public class carrtest {
     public static void main(String[] args){
       carr myCar1 = new carr();
       carr myCar2 = new carr();
       
         myCar1.setX(1);
         myCar2.setX(3);
         myCar1.setY(9);
         myCar2.setY(6);
       
       myCar1.display();
       myCar2.display();
     }
}
