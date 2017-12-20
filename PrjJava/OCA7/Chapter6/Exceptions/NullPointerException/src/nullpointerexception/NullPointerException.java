/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpointerexception;

/**
 *
 * @author anda
 */
public class NullPointerException {

    static String s;

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(s.length());
    }

}
