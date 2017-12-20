/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialisearray;

/**
 *
 * @author andad
 */
public class InitialiseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char cA[][] = new char[3][];
        for (int i=0; i<cA.length; i++) 
            cA[i] = new char[4];
        System.out.println(cA[2][3]);
        char cA1[][] = { new char[ ]{ 'a', 'b', 'c' },new char[ ]{ 'a', 'b', 'c' }};
        System.out.println(cA1[2][3]);
    }
    
}
