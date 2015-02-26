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

        double smallest = 100;                    //double smallest=nums[0]
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
            //smallest = nums[0];
            System.out.print(nums[i] + " ");
            if (i == 0) {
                smallest = nums[i];
            }

            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println();
        System.out.print(smallest);
    }
}
