/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsefloat;

/**
 *
 * @author andad
 */
public class ParseFloat {

    /**
     * @param args the command line arguments
     */
    public static float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            System.out.println(f);
            return f;
        } catch (NumberFormatException nfe) {
            f = Float.NaN;
            return f;
        } 
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        float f = parseFloat("0");
        System.out.println(f);
    }

}
