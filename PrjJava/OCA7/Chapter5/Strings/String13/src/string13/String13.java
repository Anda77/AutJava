/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string13;

/**
 *
 * @author andad
 */
public class String13 {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
//What will be the output of the following program when it is compiled and run with the command line:
//java TestClass 1 2 3
    public static void main(String[] args) {
        String s = 'b'+63+"a";
        System.out.println(s);
        
        System.out.println("Values : " + args[0] + args[1]);
        String Boolean = "Boolean";
        System.out.println(Boolean);
        String myStr = "good";

        char[] myCharArr = {'g', 'o', 'o', 'd'};

        String newStr = "";

        for (char ch : myCharArr) {

            newStr = newStr + ch;
        }

        boolean b1 = newStr == myStr;

        boolean b2 = newStr.equals(myStr);

        System.out.println(b1 + " " + b2);
        //String s = 63 + new Integer(10);
    }
}
