/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting2;

/**
 *
 * @author andad
 */
class A {
}

class B extends A {
}

public class Casting2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 9;
        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];
        a = b;// 1    
        b = (B[]) a;// 2   
        b = (B[]) a1; // 3
        Integer i = 9; System.out.println( s == i );
        
    }

}
