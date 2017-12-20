/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpool4;

/**
 *
 * @author andad
 */
public class StringPool4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String eJava = "OCA";
        String guru = "OCA";
        System.out.println(eJava.equals(guru));
        System.out.println(("a" + "b" + "c") == "abc");
        System.out.println(("a" + "b" + "c").intern() == "abc");
    }
    
}
