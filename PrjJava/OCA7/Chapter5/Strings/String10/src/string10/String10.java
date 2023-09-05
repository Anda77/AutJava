/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string10;

/**
 *
 * @author andad
 */
public class String10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = " Java Duke ";
        int len = s.trim().length();
        String s1 = s.trim();
        String s2 = s.replaceAll("\\s+","");
        System.out.println(len);
        System.out.println(s1);
        System.out.println(s2);
    }

}
