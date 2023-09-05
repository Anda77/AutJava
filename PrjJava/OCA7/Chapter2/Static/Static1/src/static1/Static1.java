/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static1;

/**
 *
 * @author anda
 */
public class Static1 {

    /**
     * @param args the command line arguments
     */
    static int frogCount = 0;
    
    public Static1()
    {
        frogCount += 1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Static1();
        new Static1();
        new Static1();
        System.out.println("FrogCount is now " + frogCount);
        
        
    }
    
}
