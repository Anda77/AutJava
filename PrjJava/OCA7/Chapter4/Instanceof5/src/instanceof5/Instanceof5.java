/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceof5;

/**
 *
 * @author andad
 */
class A {
}

class B extends A {
}

class C extends B {
}

class D extends C {
}

public class Instanceof5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b = new C();
        A a = b;
        if (a instanceof A) {
            System.out.println("A");
        }
        if (a instanceof B) {
            System.out.println("B");
        }
        if (a instanceof C) {
            System.out.println("C");
        }
        if (a instanceof D) {
            System.out.println("D");
        }
    }

}
