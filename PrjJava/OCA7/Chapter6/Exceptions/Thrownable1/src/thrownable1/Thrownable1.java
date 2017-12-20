/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrownable1;

/**
 *
 * @author andad
 */
public class Thrownable1 {

    /**
     * @param args the command line arguments
     */
    static int x = 1;
    
    public static void main(String[] args) throws Throwable{
        // TODO code application logic here
       try
       {
        if (x==1) throw new Throwable();
        System.out.println("try");
       }
       catch(Exception ex)
       {
           System.out.println("exec...");
       }
       finally
       {
         System.out.println("fin...");
       }
    }
    
}
