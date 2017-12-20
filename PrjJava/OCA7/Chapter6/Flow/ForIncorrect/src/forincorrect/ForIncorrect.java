/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forincorrect;

/**
 *
 * @author andad
 */
public class ForIncorrect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //for (int i=5; i=0; i--) { } int can't be compatible to boolean
        for (int i=5; i>0; i--) { }
    }
    
}
