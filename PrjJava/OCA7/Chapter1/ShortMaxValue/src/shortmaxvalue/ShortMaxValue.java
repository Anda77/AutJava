/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortmaxvalue;

/**
 *
 * @author andad
 */
public class ShortMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short s = Short.MAX_VALUE; 
        System.out.println(s);
        char c = (char)s; 
        System.out.println(c);
        //System.out.println( c == Short.MAX_VALUE);
    }
    
}
