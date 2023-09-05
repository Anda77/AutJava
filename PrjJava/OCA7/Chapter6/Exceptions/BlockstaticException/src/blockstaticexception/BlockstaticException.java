/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockstaticexception;

/**
 *
 * @author andad
 */
public class BlockstaticException {

    /**
     * @param args the command line arguments
     */
    //static int k = 0;
    static float k = 0;
    static { k = 1/k;}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
