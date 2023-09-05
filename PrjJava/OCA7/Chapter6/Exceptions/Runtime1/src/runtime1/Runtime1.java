/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime1;

/**
 *
 * @author anda
 */
import java.util.Date;
import static java.lang.System.out;
public class Runtime1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runtime r = Runtime.getRuntime();
        out.println("Precesoare disponible " + r.availableProcessors());
        out.println("Max memory " + r.maxMemory());
        out.println("totalMemory: " + r.totalMemory()/1024);
        out.println("Before memory: " + r.freeMemory());
        Date d = null;
        for(int i = 0; i<1000; i++)
        {
            d = new Date();
            d = null;
        }
        System.out.println("After memory: = " + r.freeMemory());
        
        
    }
    
}
