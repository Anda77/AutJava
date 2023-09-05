/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock6;

/**
 *
 * @author andad
 */
public class StaticBlock6 {

    /**
     * @param args the command line arguments
     */
    public StaticBlock6() {
        s1 = sM1("1");// seventy statement
    }
    static String s1 = sM1("a"); // first statement
    String s3 = sM1("2");// forth statement

    {
        s1 = sM1("3"); // fifty statement
    }

    static {
        s1 = sM1("b");//second statement
    }
    static String s2 = sM1("c"); // third statement
    String s4 = sM1("4");// sixty statement

    public static void main(String args[]) {
        StaticBlock6 it = new StaticBlock6();
    }

    private static String sM1(String s) {
        System.out.println(s);
        return s;
    }

}
