/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while2;

/**
 *
 * @author andad
 */
public class While2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 0;
        int x = 0;
        int z = 0;
        while (y-- < 10) {
          //  System.out.println(y);
            continue;
        }
        System.out.println(y);
        String message = y > 10 ? "Greater than" : "Less than";
        System.out.println(message);
          while (++x> -10) {
           continue;
        }
           System.out.println(x);
           while (++z> 10) {
           continue;
        }
           System.out.println(z);
           
    }

}
