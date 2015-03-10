/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stella
 */
public class MyExceptionTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            doThingA();
        } catch (MyException me) {
            me.printStackTrace();
        } catch (Exception e) {
            System.out.println("other exception");
        }
        System.out.println("The end");
    }
    
    public static void doThingA() throws MyException {
        doThingB();
    }
    public static void doThingB() throws MyException {
        try {
            doThingC();
        } catch (MyException ex) {
            throw new MyException("Didn't really want to deal with it", ex);
        } finally {
            System.out.println("Finally we're doing it");
        }
    }
    public static void doThingC() throws MyException {
        doThingD();
    }
    public static void doThingD() throws MyException {
        //throw new ArithmeticException("Divide by zero");
        throw new MyException("a message");
    }
    
}
