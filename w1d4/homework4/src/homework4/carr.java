/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 *
 * @author stella
 */
public class carr {
    private int x=0;
    private int y=0;
    
    public int getX(){
       return this.x=x;
    }
    public int getY(){
       return this.y=y;
       
    }  
       
     public void setX(int x){
        this.x=x;
     }  
     public void setY(int y){
        
        this.y=y;
    
     //}public void setY(int x, int y){
       // this.x=x;
        this.y=y;
       
    }
    
    public void moveUp(int x,int y){  //public int moveUp()
                           //return y+1
        this.y = y+1;
    }
    
    public void moveDown(int x,int y){
       y = y-1; 
    }
    
    public void moveRight(int x,int y){
      this. x = x+1; 
    }
    
    public void moveLeft(int x,int y){
       x = x-1;  
    }
    
    public String returnLocation(){
        return  "("+this.x+","+this.y+")";
        
    }
      public void display(){
      System.out.println(returnLocation());
      }
      
    
}
