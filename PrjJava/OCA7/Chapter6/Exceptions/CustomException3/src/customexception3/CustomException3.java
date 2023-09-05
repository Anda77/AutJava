/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception3;

/**
 *
 * @author andad
 */
class MyException extends Exception {
}

public class CustomException3 {

    /**
     * @param args the command line arguments
     * if I add throws exception the code will compile
     */
    
    public static void main(String[] args) throws MyException{
        // TODO code application logic here
        CustomException3 tc = new CustomException3();
        try {
            tc.m1();
        } catch (MyException e) {
            tc.m1();
        } finally {
            tc.m2();
        }
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }

}
