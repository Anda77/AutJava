/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array16;

/**
 *
 * @author andad
 */
public class Array16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
    }
}
