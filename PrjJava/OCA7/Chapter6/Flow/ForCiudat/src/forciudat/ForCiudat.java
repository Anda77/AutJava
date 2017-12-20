/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forciudat;

/**
 *
 * @author andad
 */
public class ForCiudat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++) {
            System.out.println(i + " " + j); // it will not executed never
        }
        System.out.println(i + " " + j);
    }

}
