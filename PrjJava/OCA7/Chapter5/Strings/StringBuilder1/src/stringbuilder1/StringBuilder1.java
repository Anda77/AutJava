/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder1;

/**
 *
 * @author anda
 */
public class StringBuilder1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder s = new StringBuilder("abcd");
        s.append("s");
        System.out.println(s);
        // object is modified. spre deosebire de String unde obiectul se pierde
    }
    
}
