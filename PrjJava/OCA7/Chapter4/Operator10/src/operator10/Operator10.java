/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator10;

/**
 *
 * @author andad
 */
public class Operator10 {

    /**
     * @param args the command line arguments
     */
    public static boolean longerThan(String input, int length) {
        return input != null && input.length() > length;
    }

    public static boolean longerThan1(String input, int length) {
        return input != null & input.length() > length;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(longerThan(null, 1));
        System.out.println(longerThan1(null, 1));
    }

}
