/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string8;

/**
 *
 * @author andad
 */
public class String8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1 == str3 ? " + (str1 == str3));
        System.out.println("str1 equals str3 ? " + (str1.equals(str3)));
        System.out.println(System.getProperty("java.version"));
    }

}
