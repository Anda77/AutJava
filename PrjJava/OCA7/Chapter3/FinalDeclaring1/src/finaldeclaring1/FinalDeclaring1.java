/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldeclaring1;

/**
 *
 * @author andad
 */
public class FinalDeclaring1 {

    /**
     * @param args the command line arguments
     */
     final int shade;
     
     {
         shade = 10;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        FinalDeclaring1 f1 = new FinalDeclaring1();
        System.out.println(f1.shade);
    }
    
}
