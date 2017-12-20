/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor1;

/**
 *
 * @author anda
 */
public class XOR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        if ((4 > x++) ^ (++x > 5)) x +=1;// se evelueaza ambele expresii
        System.out.println(x);
    }
    
}
