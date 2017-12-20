/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author anda
 */
public class Exception1 {

    public static void main(String[] args) {
       
        PrintWriter out = null;
        try {
// do risky IO things
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        } catch (IOException ex) {
// handle just FileNotFoundException
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            System.out.println("Caught finally");
        }
    }
}
