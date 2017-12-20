/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super3;

/**
 *
 * @author andad
 */
public class Super3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B c = new C();
        System.out.println(c.max(10, 20));
    }



}


    class A {

        int max(int x, int y) {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }
    }

    class B extends A {

        int max(int x, int y) {
            return 2 * super.max(x, y);
        }
    }

    class C extends B {

        int max(int x, int y) {
            return super.max(2 * x, 2 * y);
        }
    }

