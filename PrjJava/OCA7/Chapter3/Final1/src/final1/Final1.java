/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

/**
 *
 * @author anda
 */
public class Final1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length ==0 ) System.exit(0);
        try
        {
            final int x = Integer.parseInt(args[0]);
            final int y = new Final1().go(x);
            
        }
        catch(Exception ex){
            System.out.println("to bad parse");
        }
        
        
    }
    int go(int z)
    {
        return z++;
    }
    
}
