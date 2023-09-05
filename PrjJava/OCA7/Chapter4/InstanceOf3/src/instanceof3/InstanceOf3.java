/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceof3;

/**
 *
 * @author andad
 */
class A implements T1, T2 {
}

class B extends A implements T1 {
}

interface T1 {
}

interface T2 {
}

public class InstanceOf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        B b = new B();
        if (b instanceof A) System.out.println(true);
        if (b instanceof T2) System.out.println("strange");

    }

}
