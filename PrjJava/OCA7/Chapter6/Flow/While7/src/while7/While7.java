/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while7;

/**
 *
 * @author andad
 */
public class While7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b = false;
        int i = 1;
        do {
            i++;
        } while (b = !b);
        System.out.println(i);

    }

}
