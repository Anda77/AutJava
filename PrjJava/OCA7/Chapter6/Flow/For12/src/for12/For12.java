/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for12;

/**
 *
 * @author andad
 */
public class For12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] sa = {"a", "b", "c"};
        for (String s : sa) {
            if ("b".equals(s)) {
                continue;
            }
            System.out.println(s);

            if ("b".equals(s)) {
                break;
            }

            System.out.println(s + " again");
        }
    }
}
