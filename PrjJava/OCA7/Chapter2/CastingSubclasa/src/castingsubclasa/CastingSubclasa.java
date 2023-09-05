/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingsubclasa;

/**
 *
 * @author andad
 */
class B {
}

class B1 extends B {
}

class B2 extends B {
}

public class CastingSubclasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b = new B();
        B1 b1 = new B1();
        B2 b2 = new B2();
        b1 = (B1) b; 
        //b2 = (B2) b1; compile error
        //b1 = (B) b1; compiler error
        //b2 = (B2) b1; compier error
        //b2 = b;
        //b = b1;
    }

}
