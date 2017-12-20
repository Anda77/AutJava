/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytetype;

/**
 *
 * @author anda
 */
public class ByteType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte a = 1;
        byte b = 7;
        byte c = (byte)(a+b);
        byte d = (byte)(a + 7);
        byte e = ++a; 
        byte b1 = (byte)300;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}
