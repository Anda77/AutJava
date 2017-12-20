/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring3;

/**
 *
 * @author andad
 */
interface I {
}

class A implements I {

    public String toString() {
        return "in a";
    }
}

class B extends A {

    public String toString() {
        return "in b";
    }
}

public class ToString3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b = new B();
        A a = b;
        I i = a;

        System.out.println(i);
        System.out.println((B) a);
        System.out.println(b);

    }

}
