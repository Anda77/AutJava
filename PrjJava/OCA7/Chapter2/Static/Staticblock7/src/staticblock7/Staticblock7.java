/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock7;

/**
 *
 * @author andad
 */
public class Staticblock7 {

    /**
     * @param args the command line arguments
     */
   int m;
   static int i1 = 5;
   static int i2 ;
   int  j = 100;
   int x;
   
    public Staticblock7(int m){
      System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
   }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Staticblock7 s = new Staticblock7(5);
    }
    
    { j = 30; i2 = 40; }  // Instance Initializer
   static { i1++; }      // Static Initializer
   
}
