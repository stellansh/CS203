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
        p1.name1 = "stella";
        p1.name2 ="nshuti";
        for (int i=0; i<people.length; i++){
            people[i]= p1;
        }
        p1.name2= "smith";
        
        for (int i=0; i<people.length; i++) {
            System.out.println(people[i].name1+" "+people[i].name2);
            
        }
       
    }
    
}
