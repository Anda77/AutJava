/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator3;

/**
 *
 * @author anda
 */
public class Operator3 {

    /**
     * @param args the command line arguments
     */
    String name;

    public Operator3(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Operator3 d1 = new Operator3("Boi");
        Operator3 d2 = new Operator3("Tyri");
        System.out.print((d1==d2) + " ");
        Operator3 d3 = new Operator3("Boi");
        d2 = d1;
        System.out.print((d1== d2) + " ");
        System.out.print((d1== d3) + " ");
        
    }
    
}
