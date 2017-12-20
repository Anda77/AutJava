/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridding2;

/**
 *
 * @author anda
 */
public class Overridding2 extends Felix{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Felix f = new  Overridding2();
         System.out.println(f.cat());
    }
    // must not make more restrictive
    public long cat()
    {
        return 8;
    }
    
    
}
