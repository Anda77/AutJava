/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declare2array;

/**
 *
 * @author andad
 */
public class Declare2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = new int[2][4];
        a[0][0] = 1;
        a[0][1] = 2;
   
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;
        a[1][3] = 6;
        // compile time correct but at runtime throw NPE

    }

}
