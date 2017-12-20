/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithargs;

/**
 *
 * @author andad
 */
public class FunWithArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
      
        FunWithArgs fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);

    }

}
