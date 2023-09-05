/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

/**
 *
 * @author andad
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String arg, String... args)
    {
        System.out.println(args[0] + args[1]);
    }
      
    public static void main(String args) {
        // TODO code application logic here
       System.out.println("main who is not executed");
    }
    
    public static void main(String... args) {
        // TODO code application logic here
       //System.out.println("main who is executed");
        System.out.println(args[0]);
    }
    
}
