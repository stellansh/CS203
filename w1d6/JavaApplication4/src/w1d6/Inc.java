/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d6;

/**
 *
 * @author stella
 */
public class Inc {
    public static void main(String[] args) {
        int i = 5;
        
        // post increment, changes value after giving it out
        System.out.println(i++);
        System.out.println(i); 
    
       // pre increment, changes value before giving out
        System.out.println(++i);
        
        
        // post decrement, changes value after giving it out
        System.out.println(i--);
        System.out.println(i);
        
        // pre decrement, changes value before giving out
        System.out.println(--i);
        
    }
}
}
