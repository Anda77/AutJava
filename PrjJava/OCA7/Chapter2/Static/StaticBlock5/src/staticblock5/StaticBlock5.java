/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock5;

/**
 *
 * @author andad
 */
public class StaticBlock5 {

    /**
     * @param args the command line arguments
     */
    static int x = 2;
    static int z;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(x+z);

    }
    static {
        x = 3;
        System.out.println("x = " + x);
        System.out.println("Class.x = " + StaticBlock5.x);
        z = x;
        System.out.println("z = " + z);
    }
}
