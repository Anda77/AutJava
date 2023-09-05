/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception4;

/**
 *
 * @author anda
 */
public class Exception4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int x = 0;
       int y = Integer.parseInt("-FF", 16);
        try
        {
            x = Integer.parseInt("two");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(x);
        System.out.println(y);
        
    }
    
}
