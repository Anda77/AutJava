/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayadi;

/**
 *
 * @author andad
 */
public class Arrayadi {

   

   public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] myArray = new int[4][];
        myArray[0] = new int[3];
        myArray[0][0] = 5;
        //myArray[0][5] = 4;
        myArray[0][2] = 6;
       
        System.out.println(myArray[0][0]);
        System.out.println((myArray[0][1]));

    }
}
