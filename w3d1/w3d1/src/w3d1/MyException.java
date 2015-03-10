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
public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String string) {
        super(string);
    }

    public MyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MyException(Throwable thrwbl) {
        super(thrwbl);
    }
     public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
