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
public class w3d1 {
    private static String test1="hello";
    private String test2;
    public w3d1(String t){
        test1=t;
        test2=t;
    }
    public static void main (String[] args) {
        w3d1 a= new w3d1("testing");
         w3d1 b= new w3d1("things");
          System.out.println(a);
          System.out.println(b);
    }
   static{
        System.out.println("it static"+ test1);
   }
   public String toString(){
      return test1+ ""+test2;
           }
   }


