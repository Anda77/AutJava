/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aray17;

/**
 *
 * @author andad
 */
public class Aray17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] forArr = {1, 2, 3, 4};
        
        //int[] forArr = new int[6];
        forArr = new int[6];
        for (int i = 0; i < forArr.length; i++) {
            forArr[i] = 0;

        }

        for (int i = 0; i < forArr.length; i++) {

            System.out.print(forArr[i] + " ");

        }

        System.out.println("\n--------------");

        int[] enhancedForArr = {1, 2, 3, 4};

        for (int i : enhancedForArr) {

            enhancedForArr[i] = 0;

        }

        for (int i : enhancedForArr) {

            System.out.print(enhancedForArr[i] + " ");

        }
    }

}
