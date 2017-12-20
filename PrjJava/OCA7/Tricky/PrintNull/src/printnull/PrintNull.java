/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnull;
import static java.lang.System.out;
/**
 *
 * @author andad
 */
public class PrintNull {

    /**
     * @param args the command line arguments
     */
   static  String getString() { return null; }
            
    public static void main(String[] args) {
     
        //out.println(null + null);
        //out.println(true + null);
        //out.println(null+false);
        //out.println(3+null);
        out.println(getString() + true);
    }
    
}
