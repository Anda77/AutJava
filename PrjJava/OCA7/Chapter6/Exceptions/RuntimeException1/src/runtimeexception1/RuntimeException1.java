/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexception1;

/**
 *
 * @author andad
 */
public class RuntimeException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lake lake = new Lake();
        try {
            lake.waterSkiing();
        } catch (RuntimeException e) {
            System.out.print("RuntimeEx:");
        } catch (Exception e) {
            System.out.print("Ex:");
        }
    }

}
