/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_8;

/**
 *
 * @author anda
 */
public class Chapter4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if ((b2 = false) | (21%5) > 2) s +="x";
        if (b1 || (b2 == true)) s +="y";
        if (b2==true) s +="z";
        System.out.println(s);
        
    }
    
}
