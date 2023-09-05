/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldeclaring;

/**
 *
 * @author andad
 */
public class FinalDeclaring {

    /**
     * @param args the command line arguments
     */
    final int shade;

    public FinalDeclaring(int shade) {
        this.shade = shade;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        FinalDeclaring f1 = new FinalDeclaring(4);
        System.out.println(f1.shade);
    }
    
}
