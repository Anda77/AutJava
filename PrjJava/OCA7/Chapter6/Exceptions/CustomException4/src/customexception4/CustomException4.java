/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception4;

/**
 *
 * @author andad
 */
class CustomException5 extends Exception
{
    
}

public class CustomException4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            throw new RuntimeException();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Null Pointer Exception");
        }
         catch(Exception ex)
        {
            System.out.println("Null Pointer Exception");
        }
        finally
        {
            System.out.println("Finally block ");
        }
    }
    
}
