/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exit1;

/**
 *
 * @author anda
 */
public class Exit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args[0].length()==0) 
            System.exit(0);
        else
            System.out.println(args[0]);
        
        
    }
    
}
