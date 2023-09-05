/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchaining;

/**
 *
 * @author andad
 */
class A {

    public A() {
    }

    public A(int i) {
        System.out.println(i);
    }
}

public class ConstructorChaining {

    /**
     * @param args the command line arguments
     */
    static A s1 = new A(1);
    A a = new A(2);

    public static void main(String[] args) {
        // TODO code application logic here
        ConstructorChaining b = new ConstructorChaining();
        A a = new A(3);

    }
    static A s2 = new A(4);

}
