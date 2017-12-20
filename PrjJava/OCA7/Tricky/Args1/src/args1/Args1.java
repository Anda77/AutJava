/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package args1;

/**
 *
 * @author andad
 */
public class Args1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //args = null;
        args = new String[] {null};
        args[0] = "null";
        for (String a : args) {
        //for(int i = 0; i< args.length; i++)
        System.out.println("  " + a);
        }
    }

}
