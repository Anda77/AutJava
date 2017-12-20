/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceextend;

/**
 *
 * @author andad
 */
public class InterfaceExtend {

    /**
     * @param args the command line arguments
     */
    interface T1 {
    }

    interface T2 {

        int VALUE = 10;

        void m1();
    }

    interface T3 extends T1, T2 {

        public void m1();

        public void m1(int x);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
