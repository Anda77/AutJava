/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do8;

/**
 *
 * @author andad
 */
public class Do8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, sum = 0;
        do {
            System.out.println("count inainte de = " + count);
            if (count % 3 == 0) {
                continue;
             }
            System.out.println("count= " + count);
            sum += count;
          System.out.println("sum is " + sum);  
        } while (count++ < 11);
        System.out.println(sum);

    }

}
