/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception6;

/**
 *
 * @author anda
 */
public class Exception6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            System.out.println("Hello World");
            throwit();
            System.out.println("done with try block");
        }
        catch(Exception ex)
        {
            System.out.println("catch RuntimeException");
        }
        finally
        {
           System.out.println("Fin executing");         
        }
    }
    public static void throwit() 
    {
        throw new RuntimeException();
    }
    
}
