/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_6;

/**
 *
 * @author anda
 */
public class Chapter4_6 {

    {
        index = 1;
    }
    int index;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Chapter4_6().go();

    }

    void go() {
        int[][] dd = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1, 0}};
        System.out.println(index);
        System.out.println(dd[index++][index++]); ///???
        //System.out.println(dd[1][2]);
        System.out.println(index);
        System.out.println(index--);
        System.out.println(index);
    }

}
