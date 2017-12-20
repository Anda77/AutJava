/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super1;

/**
 *
 * @author anda
 */
public class Super1 extends AlternateFuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        go();
    }
    
   static  void go()
    {
        System.out.println(getRating());
        //System.out.println(super.super.getRating());
    }
    
}
