/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forformascurta;

/**
 *
 * @author andad
 */
public class Forformascurta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, j = 5;
        lab1:
        for (;; i++) {
            for (;; --j) {
                if (i > j) {
                    break lab1;
                }
            }
        }
        System.out.println(" i = " + i + ", j = " + j);
    }

}
