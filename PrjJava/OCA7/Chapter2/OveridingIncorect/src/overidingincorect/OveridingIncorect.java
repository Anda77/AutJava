/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overidingincorect;

/**
 *
 * @author andad
 */
public class OveridingIncorect {

    /**
     * @param args the command line arguments
     */
      public int getLoad() {
        return 1;
    }

    public double getLoad(int a){ 
        return 3.0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
