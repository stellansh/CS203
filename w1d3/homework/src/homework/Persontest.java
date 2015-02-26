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
public class Persontest {
    public static void main(String[] args){
        Person[] people= new Person[5];
        Person p1= new Person();
        p1.name = "John Doe";
        for (int i=0; i<people.length; i++){
            people[i]= p1;
        }
        people[0].name= "John Smith";
         for (int j=0; j<people.length; j++) {
            System.out.println(people[j].name);
        }
       
    }
    
}
