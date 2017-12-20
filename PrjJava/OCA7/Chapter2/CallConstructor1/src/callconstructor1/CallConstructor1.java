/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callconstructor1;

/**
 *
 * @author andad
 */
public class CallConstructor1 extends Building{

    
    
    
    public CallConstructor1() {
        System.out.print("h ");
    }

    /**
     * @param args the command line arguments
     */
    public CallConstructor1(String name) {
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new CallConstructor1("x ");
    }
    
}
