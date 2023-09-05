/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paabyvalue3;

/**
 *
 * @author andad
 */
public class PaaByValue3 {

    /**
     * @param args the command line arguments
     */
    public static void incr(int n) {
        n++;
    }

    public static void incr(int[] n) {
        n[0]++;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int[] iArr = {1};
        incr(i);
        incr(iArr);
        System.out.println("i = " + i + "  iArr[0] = " + iArr[0]);
    }

}
