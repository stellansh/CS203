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
public class GoodDog {
    private int size;
    public int getSize(){
       return size;
    }
    public void setSize(int s){
        this.size=s;
    }
    void bark() {
      if (size > 60){
          System .out.println("wooof! Wooof!");
      
      }else if (size> 14) {
           System.out.println("Ruff! Ruff!");
      }else {
           System .out.println( "Yip! Yip!");
    }

   
    }
    
}
