/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realbrainer2;

/**
 *
 * @author andad
 */
// short circuit operator or 
public class RealBrainer2 {

    /**
     * @param args the command line arguments
     */
    static boolean a; 
    static boolean b; 
    static boolean c;
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }
    
}
