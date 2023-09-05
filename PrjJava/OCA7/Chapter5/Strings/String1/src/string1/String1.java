/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author anda
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "abcd";
        System.out.println(x.toString()); // no effect
        System.out.println(x.indexOf(-1));
        String s = "abc";
        s.concat("s");
        System.out.println("string-ul s nu a fost modificat: " + s);
        s = s.concat("d");
        System.out.println("string-ul s a fost modificat: " + s);
    }
    
}
