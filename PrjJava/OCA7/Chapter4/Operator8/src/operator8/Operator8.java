/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator8;

/**
 *
 * @author anda
 */
public class Operator8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & (b2=true));
        System.out.println(b2);
    }
    
}
