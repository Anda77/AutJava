/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock1;

import static java.lang.System.out;

/**
 *
 * @author anda
 */
public class StaticBlock1 {

    /**
     * @param args the command line arguments
     */
    static int x;
    static int y;
    static { x = 7;}
    { y = 0;}
    public static void main(String[] args) {
        // TODO code application logic here
        out.println("x = " + x);
        out.println("y = " + y);
        
    }
    
}
