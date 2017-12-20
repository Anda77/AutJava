/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceof4;

/**
 *
 * @author andad
 */
class A {}
class B extends A {}
class C extends B {}


public class InstanceOf4 extends C{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InstanceOf4 i = new InstanceOf4();
        if (i instanceof A) 
            System.out.println(true);
    }
    
}
