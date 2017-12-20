/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethods;

/**
 *
 * @author andad
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String s = 'asdf'; compiler error
        String s = "Anda are mere";
        System.out.println(s.contains("me"));
        System.out.println(s.indexOf('m'));
        System.out.println(s.substring(7));
        //System.out.println(s.charAt('a')); run exception and execution is halted
        String s1 = s.replace("Anda","Adrian");
        System.out.println(s1);
        String s5= s.valueOf(true);
        String s2= s.valueOf("14.10");
        System.out.println(s1);
        System.out.println(s2);
        String s3="I";
        String s4=s3.concat(" am ").concat("good ").concat("boy");
        System.out.println(s4);
        //System.out.println(s.endsWith("e"));
        //System.out.println(s.endsWith(null)); // throw NPE
        //System.out.println(s.contains(null)); // Throw NPE
    }
    
}
