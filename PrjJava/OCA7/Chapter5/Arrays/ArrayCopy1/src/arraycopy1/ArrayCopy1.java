/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycopy1;

/**
 *
 * @author andad
 */
public class ArrayCopy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores1 = {1, 2, 3, 4, 5, 6};
        int scores2[] = null;
        System.arraycopy(scores1, 2, scores2, 0, 2);
        for (int i : scores2) {
            System.out.print(i);
        }
    }

}
