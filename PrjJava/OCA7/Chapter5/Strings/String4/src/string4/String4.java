/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string4;

/**
 *
 * @author anda
 */
public class String4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1_000;
        String b = "1_000";
        int c = a + a;
        String d = a + b; // int and string = string
        System.out.println(c + " " + d);
    }
    
}
