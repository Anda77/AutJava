/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringequals;

/**
 *
 * @author andad
 */
public class StringEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        String a = "abcd";
        String b = new String(a);
        if (a.equals(b))
        {
            if (a==b)
            {
                ch = b.charAt(0);
            }
            else
            {
                ch = b.charAt(1);
            }
        }
        else
        {
             if (a==b)
            {
                ch = b.charAt(2);
            }
            else
            {
                ch = b.charAt(3);
            } 
        }
        System.out.println(ch);
    }
    
}
