/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringliteral;

/**
 *
 * @author andad
 */
public class Stringliteral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "testString";
        String s2 = "testString";
        if (s1 == s2) {
            System.out.println("equals!");
        }
        if (s1.equals(s2)) 
            System.out.println("metoda equals");
    }

}
