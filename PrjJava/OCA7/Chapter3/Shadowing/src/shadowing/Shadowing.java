/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowing;

/**
 *
 * @author anda
 */
public class Shadowing {

    /**
     * @param args the command line arguments
     */
    static final long tooth = 343L;
    static long doIt(long touch)
    {
        System.out.println(++touch);
        return ++touch;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(tooth + " ");
        final long tooth = 340L;
        new Shadowing().doIt(tooth);
        System.out.println(tooth);
        
    }
    
}
