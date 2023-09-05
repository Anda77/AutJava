/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergerparseint;

/**
 *
 * @author andad
 */
public class IntergerParseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Float f = null;
        try {
            f = Float.valueOf("12.3");
            String s = f.toString();
            System.out.println(s);
            int i = Integer.parseInt(s);
            System.out.println("i = " + i);
        } catch (Exception e) {
            System.out.println("trouble : " + f);
        }
    }

}
