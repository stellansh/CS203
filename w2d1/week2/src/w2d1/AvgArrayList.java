/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1;

/**
 *
 * @author stella
 */
import java.util.ArrayList;
public class AvgArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();//(100)
        int sum = 0;

        for (int i = 0; i < 100; i++) { //(200)
            int num = (int) (Math.random() * 100);
            nums.add(num);
        }

        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        int avg = sum / 100;
        boolean Inside = nums.contains(avg);

        System.out.println(avg);
        System.out.println(Inside);

    }
}
