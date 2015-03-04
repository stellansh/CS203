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
public class Sumeventest {
     public static void main(String[] args) {
        int[]nums ={3,8,4,10,14,5,21};
        int Sumeven=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                Sumeven=Sumeven+ nums[i];
            }
        }
        System.out.println(Sumeven);
      
    }
}
