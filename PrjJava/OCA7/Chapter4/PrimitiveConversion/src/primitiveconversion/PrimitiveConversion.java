/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveconversion;

/**
 *
 * @author andad
 */
public class PrimitiveConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float fmin = Float.NEGATIVE_INFINITY;
        float fmax = Float.POSITIVE_INFINITY;
        System.out.println("long: " + (long) fmin
                + ".." + (long) fmax);
        System.out.println("int: " + (int) fmin
                + ".." + (int) fmax);
        System.out.println("short: " + (short) fmin
                + ".." + (short) fmax);
        System.out.println("char: " + (int) (char) fmin
                + ".." + (int) (char) fmax);
        System.out.println("byte: " + (byte) fmin
                + ".." + (byte) fmax);
    }

}
