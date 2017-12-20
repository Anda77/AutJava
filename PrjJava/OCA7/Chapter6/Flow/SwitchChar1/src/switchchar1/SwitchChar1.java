/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchchar1;

/**
 *
 * @author andad
 */
public class SwitchChar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch = 'x';
                switch(ch){ 
                case 1 :System.out.println("-1"); break; // This will not compile : "possible loss of precision"    
                default:System.out.println("default");}
    }

}
