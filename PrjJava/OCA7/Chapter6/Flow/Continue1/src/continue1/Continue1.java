/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continue1;

/**
 *
 * @author andad
 */
public class Continue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) {
                System.out.println("count=" +  count);
                continue;
                
            }
            sum += count;
        } while (count++ < 11);
        System.out.println(sum);
    }

}
