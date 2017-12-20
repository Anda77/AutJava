/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcastexception1;

/**
 *
 * @author andad
 */

public class ClassCastException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object i = Integer.valueOf(42);
        Long s = (Long) i;
        Byte b = (Byte)i; 
        //String s = (String)i;
        String s1 = (String)(Object)i;
    }

}
