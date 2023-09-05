/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinity4;

/**
 *
 * @author andad
 */
public class Infinity4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.printf("1.0 / 0.0:   %f%n 1.0 / -0.0: %f%n", 1.0 / 0.0, 1.0 / -0.0);
        double zero = 0.0;
        Double d0 = Double.valueOf(zero);
        double zeroMinus = -0.0;
        double d_0 = Double.valueOf(zeroMinus);
        double NaN = d0 / d_0;
        Double dNaN = Double.valueOf(NaN);
        Double dNaN2 = new Double(NaN);
        System.out.printf("0.0 = -0.0: %b%nobj(0.0) = obj(-0.0): %b%n Nan = NaN %b%n obj(Nan) = obj(NaN) %b%n", zero == zeroMinus, d0.equals(d_0), NaN == NaN, dNaN.equals(dNaN2));
    }
    
}
