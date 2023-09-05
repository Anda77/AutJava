/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octal1;

/**
 *
 * @author andad
 */
public class Octal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.println(a[3]==b[0][2]);
        System.out.println(a[2]==b[2][1]);
        
    }
    
}
