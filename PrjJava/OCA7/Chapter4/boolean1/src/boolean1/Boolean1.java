/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boolean1;

/**
 *
 * @author andad
 */
public class Boolean1 {

    /**
     * @param args the command line arguments
     */
    static boolean a;
            static boolean b; 
            static boolean c;
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.println(a + ", " + b + ", " + c);
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = true;
        System.out.println(b1=true);
        System.out.println(b2=true);
        System.out.println(b3=false);
    }
    
}
