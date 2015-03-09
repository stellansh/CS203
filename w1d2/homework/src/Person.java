/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stella
 */

    
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        this("John Doe", 40);
        announce("has been created");
    }
    
    private void announce(String msg) {
        System.out.println(name + " " + msg);
        System.out.println(name + " " + msg);
        System.out.println(name + " " + msg);
    }
    
    public void sayHello() {
        System.out.println(name + " says hello");
    }

}
