/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluateoperands;

/**
 *
 * @author andad
 */
public class EvaluateOperands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int divisor = 0;
        try {
          int i = 1 / (divisor * loseBig());
        } catch (Exception e) {
          System.out.println(e);
        }
        
    }
    
    static int loseBig() throws Exception {
        throw new Exception("Shuffle off to Buffalo!");
    }
    
    
}
