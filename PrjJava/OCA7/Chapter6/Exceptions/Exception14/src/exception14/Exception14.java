/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception14;

/**
 *
 * @author anda
 */
public class Exception14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
         new Exception14().go();
        }
        catch(Exception e)
        {
            System.out.println("ouch");
        }
            
    }
    
    void go()
    {
        go();
    }
    
}
