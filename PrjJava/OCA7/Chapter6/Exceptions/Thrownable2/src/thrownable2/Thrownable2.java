/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrownable2;

/**
 *
 * @author andad
 */
public class Thrownable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SomeThwonable {
        // TODO code application logic here
        try {
            m1();
        } catch (SomeThwonable e) {
            throw e;
        } finally {
            System.out.println("Done");
        }

    }

    public static void m1() throws MyThrowable {
        throw new MyThrowable();
    }

}
