/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for13;

/**
 *
 * @author andad
 */
public class For13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        for (i = 1; i < 5; i++) {
            continue;  //(1)
        }
        for (i = 0;; i++) {
            break;       //(2)
        }
        for (; i < 5 ? false : true;);     //(3)
        System.out.println(i);
        for(;i<10;)
        {
            System.out.println(i);
        }
    }

}
