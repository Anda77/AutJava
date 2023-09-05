/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder5;

/**
 *
 * @author andad
 */
public class StringBuilder5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);
        sb.append(s.substring(4)).delete(3, 5);
        StringBuilder sb1 = new StringBuilder();
        float f = 123.99f;
        double d1= 125.9999;
        sb1.append(3);
        sb1.append("null");
        sb1.insert(sb1.length(),s);
        sb1.append(f);
        sb1.append(d1);
        System.out.println(sb1);
        System.out.println(sb);
    }

}
