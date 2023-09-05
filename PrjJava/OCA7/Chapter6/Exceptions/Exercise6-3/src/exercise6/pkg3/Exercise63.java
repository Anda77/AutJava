/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6.pkg3;

/**
 *
 * @author andad
 */
public class Exercise63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        try {
            String reverseStr;
            reverseStr = reverse("");
            System.out.println(reverseStr);
        } finally {
            System.out.println("Program completes");
        }
    }

    public static String reverse(String s) throws Exception {

        if (s.length() == 0) {
            throw new Exception("nu poate fi zero lunginea stringului");
        }

        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }

}
