/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception5;

/**
 *
 * @author anda
 */
public class Exception5 {

    /**
     * @param args the command line arguments
     */
    static int x = 1;
    public static void main(String[] args) throws Throwable{
      
        try
        {
            if (x==1) throw new Throwable();
            System.out.println("try");
        }
        catch(Exception ex)
        {
            System.out.println("exec");
        }
        // it is executed always with a single exception : System.exit();
        finally
        {
            System.out.println("fin");
        }
        
    }
    
}
