/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairswithspecificdifference;

import java.util.Arrays;

/**
 *
 * @author andad
 */
public class PairswithSpecificDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] arr = {0, -1, -2, 2, 1};
       int k = 1;
       Arrays.sort(arr);
       for(int i = 0;i<arr.length-1;i++)
       {
          System.out.println(arr[i]);
           if ((arr[i] - arr[i+1])==k)
           {
                System.out.println(arr[i] + " " +arr[i+1]);
           }
    }
    
}
}