/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws5;

/**
 *
 * @author andad
 */
public class Throws5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j = 1;
        try {
            int i = doIt() / (j = 2);
        } catch (Exception e) {
            System.out.println(" j = " + j);
        }
    }

    public static int doIt() throws Exception {
        throw new Exception("FORGET IT");
    }

}
