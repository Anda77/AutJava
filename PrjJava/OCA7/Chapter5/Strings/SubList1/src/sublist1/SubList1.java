/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sublist1;

/**
 *
 * @author andad
 */
import java.util.*;

public class SubList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(s1.subList(1, 1));
        s1.addAll(s2);
        System.out.println(s1);
    }
}
