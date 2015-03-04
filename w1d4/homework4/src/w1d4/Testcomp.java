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
public class Testcomp {

    public static void main(String[] args) {

        byte b = 5;
        short s = 5;
        int i = 5;
        long L = 5;
        float f = 5.0f;
        double d = 5.0;
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
        System.out.println(b == s && s == i && i == L && L == f && f == d);
        System.out.println(s1 == s2);
        System.out.println((s1 + s2) == s3);
        System.out.println((s1 + s2).equals(s3));

    }
}
