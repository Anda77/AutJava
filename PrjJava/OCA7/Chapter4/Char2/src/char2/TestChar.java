/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package char2;

/**
 *
 * @author andad
 */
public class TestChar {

    char c;

    public  void m1() {
        char[] cA = {'a','b'};
        m2(c, cA);
        System.out.println(((int) c) + "," + cA[1]);
    }

    public void m2(char c, char[] cA) {
        c = 'b';
        cA[1] = cA[0] = 'm';
    }

    public static void main(String args[]) {
        new TestChar().m1();
    }

}
