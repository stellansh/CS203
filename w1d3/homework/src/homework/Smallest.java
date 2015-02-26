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
public class Smallest {
    public static void main(String[] args) {
        
    double smallest =0;
       double[]nums= new double[100];
       for (int i=0;i<nums.length;i++)
       {
         nums[i]=Math.random()*100;
        smallest=nums[0];
        if(nums[i]<smallest){
            nums[i]=smallest;
            
        System.out.print(smallest);
        }
          
        
       }
        
        
    }
}