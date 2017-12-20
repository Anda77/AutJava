/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingshort;

/**
 *
 * @author andad
 */
public class CastingShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short s = 123;
        short s1 = 65;
        char c1 = (char)s1;
        char c = (char)s; // error: would require cast
        //s = c;
        System.out.println(c1);
        System.out.println(c);
    }

}
