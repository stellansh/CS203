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
public class Dogtestdrive {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog();
        Dog d2= new Dog();
        d1.breed = "Golden Retriever";
        d1.size=40;
        d2.breed="bulldog";
        d2.size=30;
                 
        
        System.out.println(d1.breed);
        System.out.println(d2.size);
    }
    
}
