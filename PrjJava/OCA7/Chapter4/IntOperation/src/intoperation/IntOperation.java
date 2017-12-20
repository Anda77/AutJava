/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intoperation;

/**
 *
 * @author andad
 */
public class IntOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rate = 10;
        int amount = 1 - rate/100*1 - rate/100; // the result can be long, int, float, double
        long amount1 = 1 - rate/100*1 - rate/100;
        double amount2 = 1 - rate/100*1 - rate/100;
        float amount3 = 1 - rate/100*1 - rate/100;
        System.out.println(amount);
        System.out.println(amount1);
        System.out.println(amount2);
        System.out.println(amount3);
    }
    
}
