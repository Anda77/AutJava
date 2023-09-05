/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock9;

/**
 *
 * @author andad
 */
public class StaticBlock9 {

    /**
     * @param args the command line arguments
     */
    private static int loop = 15;
    static final int INTERVAL = 10;
    boolean flag;

    {
        flag = true;
        loop = 0;
    }
    static { loop += INTERVAL; }
    static { loop = 1; }
    static {System.out.println("Static"); } 

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
