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
public class Doggtestdrive {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dogg dogg1=new Dogg();
        dogg1.eat();
        dogg1.chase();
        dogg1.name="bart";
        Dogg[] myDoggs= new Dogg[3];
        myDoggs[0]=new Dogg();
        myDoggs[1]=new Dogg();
        myDoggs[2]=dogg1;
        myDoggs[0].name="fred";
        myDoggs[1].name="marge";
        System.out .print( "last dog's name is ");
        System.out .println(myDoggs[2].name) ;
        int x=0;
        while(x<myDoggs.length){
        myDoggs[x].eat();
        myDoggs[x].chase();
          x=x+1;
        }
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
