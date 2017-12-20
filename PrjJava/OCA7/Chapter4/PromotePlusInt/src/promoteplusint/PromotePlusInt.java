/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promoteplusint;

/**
 *
 * @author andad
 */
public class PromotePlusInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10;
        float f = 124.9999f;
        long l = 11111111111l;
        double d = 123.5555;
        double d1 = d+f; 
        long l1 = i+l;
        float f1 = i+f;
        System.out.println(f1);// promote float
        System.out.println(l1); // 
        System.out.println(f1);
        System.out.println(d1);
        
    }
    
}
