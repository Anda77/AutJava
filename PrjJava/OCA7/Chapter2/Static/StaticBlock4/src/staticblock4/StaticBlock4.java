/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock4;

/**
 *
 * @author andad
 */
public class StaticBlock4 {

    /**
     * @param args the command line arguments
     */
    static int a = 1111;

    {
        a = a++ + ++a;
    }
public static void main(String[] args) {
        // TODO code application logic here
        StaticBlock4 sb4 = new StaticBlock4();
        System.out.println(a);
    }

}
