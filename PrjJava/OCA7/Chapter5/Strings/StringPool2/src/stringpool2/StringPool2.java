/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpool2;

/**
 *
 * @author andad
 */
public class StringPool2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp = "hawoo";
        String ejava = "hawaii";
        String guru = ejava.replace('i', 'o');
        System.out.println(guru==temp);
    }
    
}
