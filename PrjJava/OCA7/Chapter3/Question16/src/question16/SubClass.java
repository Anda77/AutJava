/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question16;

/**
 *
 * @author anda
 */
public class SubClass extends SuperClass{

    public int doIt(String str, Integer... data) {
        String signature = "(String, Integer[] )";
        System.out.println("Overridden " + str + " " + signature);
        return 0;

    }

}
