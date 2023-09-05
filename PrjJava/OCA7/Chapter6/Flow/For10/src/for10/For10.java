/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for10;

/**
 *
 * @author andad
 */
public class For10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, j = 5;
        lab1:
        for (;; i++) // is executed only for i=0, o singura data
        {
            for (;; --j) {
                System.out.println(i);
                System.out.println(j);

                if (i > j) {
                    break lab1;
                }
            }
        }
    }

}
