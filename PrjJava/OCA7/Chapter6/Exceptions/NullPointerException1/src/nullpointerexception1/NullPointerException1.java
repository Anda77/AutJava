/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpointerexception1;

/**
 *
 * @author andad
 */
public class NullPointerException1 {

    public static void main(String[] args) {

        printMe(null);
    }

    static void printMe(Object[] oa) {
        for (int i = 0; i <= oa.length; i++) {
            System.out.println(oa[i]);
        }
    }
//Assume that it is called as such: printMe(null);

}
