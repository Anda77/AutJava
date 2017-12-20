/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author anda
 */
public class Interface1 implements Foo{

    /**
     * @param args the command line arguments
     */
    public void go()
    {
        System.out.println(BAR);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Interface1().go();
    }
    
}
