/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception17;

/**
 *
 * @author anda
 */
public class Exception17 extends Tire{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Exception17().doStuff();
    }
    
    void doStuff() throws ArithmeticException
    {
        System.out.println(7/0);
    }
    
}
