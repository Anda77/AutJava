/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author andad
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> l = new ArrayList<String>();
        l.add("xx"); l.add(" x"); l.add("Xx");
        Comparator c = Collections.reverseOrder();
        Collections.sort(l, c);
        for(String s : l) System.out.println("<" + s + ">" + " ");
    }
    
}
