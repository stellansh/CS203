/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author stella
 */
import java.util.LinkedList;

public class AvgLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100);
            nums.add(num);
        }

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        int avg = sum / 100;
        boolean Inside = nums.contains(avg);

        System.out.println(avg);
        System.out.println(Inside);

    }
} 

