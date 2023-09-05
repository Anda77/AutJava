/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returndata;

/**
 *
 * @author andad
 */
public class ReturnData {

    /**
     * @param args the command line arguments
     */
    static double getData(byte a, double z)
    {
        return (short)a/z *10;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getData((byte)2, 3.6));
        
    }
    
}
