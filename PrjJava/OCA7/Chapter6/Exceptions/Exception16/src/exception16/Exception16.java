/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception16;

/**
 *
 * @author anda
 */
public class Exception16 extends Tire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Exception16().doStuff();
    }
    
    void doStuff()
    {
        System.out.println(7/0);
    }
    
}
