/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract2;

/**
 *
 * @author andad
 */
public abstract class Abstract2 {

    /**
     * @param args the command line arguments
     */
   abstract void calculate();
   public static void main(String[] args){
      System.out.println("calculating");
      Abstract2 x = null;
      x.calculate();
    
}
}
