/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch3;

/**
 *
 * @author anda
 */
public class Switch3 {

    /**
     * @param args the command line arguments
     */
    final static short x = 2;
    public static void main(String[] args) {
        // TODO code application logic here
        for(int z = 0;z<4;z++)
        {
            switch(z)
            {
                case x: System.out.print("0 ");
                case x-1: System.out.print("1 "); break;
                default: System.out.print("def ");
                case x-2: System.out.print("2 ");
                
            }
        }
        
    }
    
}
