/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception19;

/**
 *
 * @author anda
 */
public class Exception19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Exception19().doStuff();
    }
    
    void doStuff() throws RuntimeException
    {
        System.out.println(7/0);
    }
            
    
}
