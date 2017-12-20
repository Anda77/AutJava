/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byte2;

/**
 *
 * @author andad
 */
public class Byte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b = -128;
        int i = b;
        b = (byte) i;
        System.out.println(i + " " + b);
    }

}
