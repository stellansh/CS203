/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

/**
 *
 * @author stella
 */
public class MyException extends Exception {
    private String specialReason;
    
    
    
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
    public MyException(String message, String specialReason) {
        super(message);
        this.specialReason = specialReason;
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
