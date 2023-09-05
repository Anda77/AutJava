/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex1;

/**
 *
 * @author andad
 */
public class Hex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f = 234.56F;
        String hexa1 = Integer.toBinaryString(Float.floatToIntBits(f)).substring(5);
        System.out.println(hexa1);
        short s = (short)f;
        System.out.println(s);
    }
    
}
