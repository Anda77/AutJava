/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package private2;

/**
 *
 * @author andad
 */
class A {

    public int i = 10;
    private int j = 20;
}

class B extends A {

    private int i = 30; //1  
    public int k = 40;
}

class C extends B {
}

public class Private2 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        C c = new C();
       //  System.out.println(c.i); //2
        //System.out.println(c.j); //3 
        System.out.println(c.k);

    }

}
