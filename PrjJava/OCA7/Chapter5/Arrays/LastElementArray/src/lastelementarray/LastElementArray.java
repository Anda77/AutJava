/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastelementarray;

/**
 *
 * @author andad
 */
public class LastElementArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 0) {
            System.out.println(args[args.length - 1]);
        }
        int i = args.length;
        if (i != 0) {
            System.out.println(args[i - 1]);
        }
        int i1 = args.length - 1;
        if (i1 > 0) {
            System.out.println(args[i1]);
        }
    }

}
