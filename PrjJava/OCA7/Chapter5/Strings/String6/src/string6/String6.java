/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string6;

/**
 *
 * @author anda
 */
public class String6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "mama";
        
        System.out.println(x.lastIndexOf("m"));
        System.out.println(x.lastIndexOf(6));
        System.out.println(x.lastIndexOf("a"));
        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.charAt(-1));
    }
    
}
