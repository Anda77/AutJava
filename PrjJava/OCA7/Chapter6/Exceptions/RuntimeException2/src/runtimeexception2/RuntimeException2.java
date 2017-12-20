/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexception2;

/**
 *
 * @author andad
 */
public class RuntimeException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            RuntimeException ex = null;
            throw ex;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
}
