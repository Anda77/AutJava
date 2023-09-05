/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for11;

/**
 *
 * @author andad
 */
public class For11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                System.out.println("j= " +  j);
                for (int k = 0; k < 3; k++) {
                   System.out.println("k= " + k);
                    if (k - j > 0) {
                        break middle;
                    }
                    
                    //System.out.println(counter);
                    counter++;
                    System.out.println("counter= " + counter);
                }
            }
        }
        System.out.println(counter);
    }
    
}
