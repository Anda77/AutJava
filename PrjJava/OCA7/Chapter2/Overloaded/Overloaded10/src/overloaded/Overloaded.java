/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloaded;

/**
 *
 * @author anda
 */
public class Overloaded {

    /**
     * @param args the command line arguments
     */
    public static void foo(Integer i) {
        System.out.println("foo(Integer)");
    }

    public static void foo(short i) {
        System.out.println("foo(short)");
    }

    public static void foo(long i) {
        System.out.println("foo(long)");
    }

    public static void foo(int... i) {
        System.out.println("foo(int ...)");
    }

   
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        foo((int)10); // call long
        // why is called with parameter long???
                
                
    }

}
