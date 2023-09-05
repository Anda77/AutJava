/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author andad
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    static String pa;
    static char revpa;
    static String rev = "";

    /**
    static boolean isPalin(String str) {
        int end = str.length();
        if (end == 0) {
            return true;
        }
        int start = 0;
        while (start != end) {
            if (str[start++] != str[end--]) {
                return false;
            }
        }
        return true;
    }
    * */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an string:");
        pa = ob.nextLine();
        String a = new String(pa);
        System.out.println(a);

        for (int i = a.length() - 1; i >= 0; --i) {
            revpa = a.charAt(i);
            rev += revpa;
// madam, mom sunt palindroame
        }
        //System.out.println(rev);
        if (pa.equals(rev)) {
            System.out.println("This is palindrom");
        } else {
            System.out.println("This isn't palindrom");
        }

    }
}
