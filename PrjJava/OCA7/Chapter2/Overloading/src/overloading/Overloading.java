/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author andad
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Object x) { System.out.println("In Object"); } //3 
    
    void probe(Long x) { System.out.println("In Long"); } //4
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "hello"; 
        new Overloading().probe(a);
    }
    
}
