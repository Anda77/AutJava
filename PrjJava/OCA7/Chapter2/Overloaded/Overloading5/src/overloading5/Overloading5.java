/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading5;

/**
 *
 * @author andad
 */
public class Overloading5 {

    /**
     * @param args the command line arguments
     */
     void m1(int x){
        System.out.println("m1 int");
    }
    
    void m1(double x){
        System.out.println("m1 double");
    }
    
    void m1(String x){
        System.out.println("m1 String");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Overloading5 ot = new Overloading5();
        ot.m1(1.0);
    }
    
}
