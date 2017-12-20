/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string3;

/**
 *
 * @author anda
 */
public class String3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "abc";
        String s2 = s1;
        s1 +="d";
        System.out.println(s1 + " " + s2 + " " + (s1==s2));
        
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
        String x = "airplane";
        System.out.println(x.charAt(1));
        //System.out.println(x.charAt(20)) run time exception StringIndexOutofBoundsException
    }
    
}
