/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_3;

/**
 *
 * @author anda
 */
public class Chapter4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //if (args.length == 1 || args[1].equals("test")) { // no exception
        if (args.length == 1 | args[1].equals("test")) { // throw exception
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }

}
