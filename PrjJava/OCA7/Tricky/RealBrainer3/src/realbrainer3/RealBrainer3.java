/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realbrainer3;

/**
 *
 * @author andad
 */
public class RealBrainer3 {

    /**
     * @param args the command line arguments
     */
     void probe(Object x) { System.out.println("In Object"); } //3 

    void probe(Number x) { System.out.println("In Number"); } //2

    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Long x) { System.out.println("In Long"); } //4
    
    public static void main(String[] args) {
        // TODO code application logic here
        RealBrainer3  rb = new RealBrainer3 ();
        double a = 10;
        rb.probe(a);
    }
    
}
