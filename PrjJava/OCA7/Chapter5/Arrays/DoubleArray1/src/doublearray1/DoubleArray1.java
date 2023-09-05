/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublearray1;

/**
 *
 * @author andad
 */
public class DoubleArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a[][] = new int[3][];
        a[1] = new int[]{1, 2, 3};
        a[2] = new int[]{4, 5};
        System.out.println(a[1][1]);
    }
}
