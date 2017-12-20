/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexception;

import java.io.IOException;

/**
 *
 * @author andad
 */
public class RuntimeException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            System.out.println("Hello World");
            throwit();
            System.out.println("Done with try block");
        }
        catch(Exception ex)
        {
            System.out.println("caught");
        }
        finally
        {
            System.out.println("Finally executiong...");
        }
    }
    
    public static void throwit()
    {
        System.out.println("throwit");
        throw new RuntimeException();
    }
    
}
