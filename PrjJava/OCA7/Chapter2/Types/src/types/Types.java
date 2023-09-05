/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author anda
 */
public class Types {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d = 1234.56;
        double d1 = 1_234.56;
        double d2 = 0_1234.5_6;
        //double d4 = 0_1234._56;  // illegal underscore
        double d3 = 1_234_56;
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
    }
    
}
