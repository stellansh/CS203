/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3;

/**
 *
 * @author stella
 */
public class Hamstertest {
    public static void main(String[] args) {
        Hamster[]hums=new Hamster[100];
         double Total=0;
         
         for (int i=0;i<hums.length;i++){
           hums[i]= new Hamster();
           hums[i].age=Math.random()*3;
           Total=(Total+hums[i].age);
         }
           double Average= Total/100;
        System.out.println("The average age is = " + Average); 
      
                   
           
    }
         
      
    
    
    
    
    
    
}
