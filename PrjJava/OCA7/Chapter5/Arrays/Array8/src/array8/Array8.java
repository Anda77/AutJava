/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array8;

/**
 *
 * @author anda
 */
public class Array8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array8 a3 = new Array8();
        a3.start();
    }
    void start()
    {
        long[] a1 = {1, 2,3};
        long[] a2 = adjust(a1);
        if (a1==a2) System.out.println("a1==a2");
        System.out.println(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }
    
    long[] adjust(long[] a3)
    {
        a3[2] = 4;
        return a3;
    }
            
}
