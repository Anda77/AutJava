/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertchar;

import java.math.BigInteger;

/**
 *
 * @author andad
 */
public class ConvertChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nString = "5";
        char n = nString.charAt(0);
        System.out.println(n - '0');
        System.out.println(n - 48);
        System.out.println(Character.getNumericValue(n));
        System.out.println(new Integer(nString));
        System.out.println(Integer.valueOf(nString));
        System.out.println(Integer.parseInt(nString));
        System.out.println(new BigInteger(nString));
    }

}
