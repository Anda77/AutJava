/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabileneintializate;

/**
 *
 * @author andad
 */
public class Variabileneintializate {

    /**
     * @param args the command line arguments
     */
    static int a; 
    int b;

    public Variabileneintializate() {
        int c;
        c = a;
        a++; 
        b += c;
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Variabileneintializate();
    }
    
}
