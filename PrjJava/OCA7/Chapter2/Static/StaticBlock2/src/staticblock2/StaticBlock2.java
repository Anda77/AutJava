/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock2;

/**
 *
 * @author anda
 */
public class StaticBlock2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Init(); // order of static block, instance and constructor
        new Init(7); // order of static block, instance and constructor
    }
    
}
