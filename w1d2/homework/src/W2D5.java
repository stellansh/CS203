/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stella
 */
public class W2D5 {
    public static void main(String[] args) {
        Person p1 = new Person("Jim", 28);
        Person p2 = new Person("George", 30);
        p1.sayHello();
        
        Person p3 = new Person();
        p2.sayHello();
        p3.sayHello();
    }    
}
