/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop3;

/**
 *
 * @author andad
 */
public class Loop3 {

    /**
     * @param args the command line arguments
     */
    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }
    int x = 5;

    int getX() {
        return x;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Loop3 tc = new Loop3();
        tc.looper();
        System.out.println(tc.x);
    }

}
