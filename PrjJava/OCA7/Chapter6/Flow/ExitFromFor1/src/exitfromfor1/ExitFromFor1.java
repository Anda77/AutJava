/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exitfromfor1;

/**
 *
 * @author andad
 */
public class ExitFromFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i<7; i++)
        {
            System.out.println(i);
            break;
        }
          for(int i = 4; i<7; i++)
        {
            System.out.println(i);
            return;
        }
          
        for(int i = 6; i<7; i++)
        {
            System.out.println(i);
            System.exit(1);
        }
        
        
        
    }
    
}
