/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d6;

/**
 *
 * @author stella
 */
import java.util.Scanner;
import java.util.Calendar;
public class CalenderTestDriver {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1991, 11,16, 9, 20);
        String d= String.format(" %tA, %<tB %<td %<tY", cal.getTime());
        System.out.println(d);
    }
}
    
    

