/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement2interfaces;

/**
 *
 * @author andad
 */
interface T1{
   int VALUE = 1;
   void m1();
}
interface T2{
   int VALUE = 2;
   void m1();
}

public class Implement2Interfaces implements T1, T2{

    /**
     * @param args the command line arguments
     */
    public void m1(){}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
