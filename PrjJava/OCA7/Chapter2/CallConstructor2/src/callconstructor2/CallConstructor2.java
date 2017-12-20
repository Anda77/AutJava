/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callconstructor2;

/**
 *
 * @author andad
 */
private class TC extends java.util.ArrayList {

    public TC() {
        super(100);
        System.out.println("TC created");
    }
}

public class CallConstructor2 extends TC {

    /**
     * @param args the command line arguments
     */
    public CallConstructor2() {
        System.out.println("TestClass created");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new CallConstructor2();
    }

}
