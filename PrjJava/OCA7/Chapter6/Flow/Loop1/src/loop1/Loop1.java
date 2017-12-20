/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

/**
 *
 * @author andad
 */
public class Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, z = 10;
        while (a < z) {
            a++;
            --z;
        }
        System.out.print(a + " : " + z);
    }

}
