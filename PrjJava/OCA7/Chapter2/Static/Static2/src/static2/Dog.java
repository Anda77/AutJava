/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static2;

/**
 *
 * @author anda
 */
public class Dog extends Animal{
    // this is not overriding
    static void doStuff()
    {
        System.out.println("redefinition");
    }
    
}
