/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npe2;

/**
 *
 * @author andad
 */
public class NPE2 {

    /**
     * @param args the command line arguments
     */
    public static int m1() throws Exception{ 
       throw new Exception("Some Exception");
               }
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        int[] a = null;
        int i = a [ m1() ];
        
    }
    
}
