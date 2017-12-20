/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodwiththesamewithconstructor;

/**
 *
 * @author andad
 */
public class MethodWithTheSameWithConstructor {

    /**
     * @param args the command line arguments
     */
    long l1;

    public void MethodWithTheSameWithConstructor(long pLong) {
        l1 = pLong;
    }  //(1)

    public static void main(String[] args) {
        // TODO code application logic here
        MethodWithTheSameWithConstructor a, b;
        a = new MethodWithTheSameWithConstructor();  //(2)
        // b = new MethodWithTheSameWithConstructor(5);  //(3) error compiler
        a.MethodWithTheSameWithConstructor(3);
        System.out.println(a.l1);// why result is 3???
        b = new MethodWithTheSameWithConstructor(); 
        System.out.println(b.l1);
    }

}
