/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1;

/**
 *
 * @author stella
 */
public class MyExceptionTestDrive {

    public static void main(String[] args) {
        try {
            doThingA();}
        catch (MyException e) {
            System.out.println("some exception occured");
        }
    }

    public static void doThingA() throws MyException {
        doThingB();
    }

    public static void doThingB() throws MyException {
        try {
            doThingC();
        } catch (MyException e) {
            throw new MyException("didn't really want to deal with it", e);
        } finally {
            System.out.println("Finally, we're doing it");
        }
    }

    public static void doThingC() throws MyException {
        doThingD();
    }

    public static void doThingD() throws MyException {
        throw new MyException(" message");
    }
}

