/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_5;

/**
 *
 * @author anda
 */
public class Chapter4_5 {

    int x = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Chapter4_5 f1 = new Chapter4_5();
        Chapter4_5 f2 = new Chapter4_5();
        Chapter4_5 f3 = FizzSwitch(f1, f2);
        System.out.println((f1 == f3) + " " + (f1.x == f3.x));

    }

    static Chapter4_5 FizzSwitch(Chapter4_5 x, Chapter4_5 y) {
        final Chapter4_5 z = x;
        z.x = 6;
        return z;
    }

}
