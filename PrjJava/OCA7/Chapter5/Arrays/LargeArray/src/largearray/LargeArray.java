/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largearray;

/**
 *
 * @author anda
 */
public class LargeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] foo = new long [3000000]; 
        foo[2999999] = 500;
        System.out.println(foo[2999999]);
    }
    
}
