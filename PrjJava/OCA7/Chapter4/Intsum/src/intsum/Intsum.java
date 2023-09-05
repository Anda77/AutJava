/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intsum;

/**
 *
 * @author andad
 */
public class Intsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        a += (a = 4);
        b = b + (b = 5);
        System.out.println(a + ",  " + b);
    }

}
