/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabilelocale;

/**
 *
 * @author andad
 */
public class Variabilelocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "111";
        boolean[] bA = new boolean[1];

        if (bA[0]) {
            str = "222";
        }

        System.out.println(str);
    }

}
