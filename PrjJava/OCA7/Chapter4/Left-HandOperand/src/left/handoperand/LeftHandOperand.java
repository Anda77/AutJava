/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package left.handoperand;

/**
 *
 * @author andad
 */
public class LeftHandOperand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int j = 1;
        try {
            int i = forgetIt() / (j = 2);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Now j = " + j);
        }
        
    }
    static int forgetIt() throws Exception {
        throw new Exception("I'm outta here!");
    }
    
    
}
