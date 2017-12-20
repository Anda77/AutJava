/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofsizezero;

/**
 *
 * @author andad
 */
public class ArrayOfSizeZEro {

    /**
     * @param args the command line arguments
     */
    static int[] x = new int[0];

    static {
        x[0] = 10;
        System.out.println(x[0]);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayOfSizeZEro f = new ArrayOfSizeZEro();
    }

}
