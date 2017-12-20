/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array15;

/**
 *
 * @author andad
 */
public class Array15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="111";
        boolean[] bA = new boolean[1];
        // variabile locale de tip obiect sunt si ele initializate, 
        //bA este pes stiva, iar fiecare elemet se aloca pe heap
        if (bA[0]) 
            str = "222";
        System.out.println(str);
        
    }
    
}
