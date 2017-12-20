/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for8;

/**
 *
 * @author andad
 */
public class For8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j) // 1
        {
            System.out.println(i);
            System.out.println(j);
            sum = sum + i + j;
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println("Sum = " + sum);
    }

}
