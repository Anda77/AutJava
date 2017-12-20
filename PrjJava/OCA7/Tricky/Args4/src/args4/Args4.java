/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package args4;

/**
 *
 * @author andad
 */
public class Args4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    
        if (args[0].equals("open")) {
            if (args[1].equals("someone")) {
                System.out.println("Hello!");
            } else {
                System.out.println("Go away " + args[1]);
            }
        } else {
            System.out.println("Go away ");
        }

    }

}
