/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question16;

import java.io.IOException;

/**
 *
 * @author anda
 */
public class SuperClass {

    public int doIt(String str, Integer... data) throws IOException {
        String signature = "(String, Integer[])";
        System.out.println(str + " " + signature);
        return 1;
    }
}
