/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception15;

/**
 *
 * @author andad
 */
public class Exception15 {

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) throws Exception{ or
    public static void main(String args[]) {
        try {
            Exception e = null;
            throw e;
        } catch (Exception ex) {
                System.out.println("hi");
        }
    }
}
