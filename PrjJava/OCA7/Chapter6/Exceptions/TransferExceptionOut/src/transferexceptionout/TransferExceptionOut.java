/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferexceptionout;

/**
 *
 * @author andad
 */
public class TransferExceptionOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            doTest();
        } catch (MyException me) {
            System.out.println(me);
        }

    }

    static void doTest() throws MyException {
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyException {
        throw new MyException("Exception from doAnotherTest");
    }

}
