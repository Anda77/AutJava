/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist4;

import java.util.ArrayList;

/**
 *
 * @author andad
 */
public class Arraylist4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<String>();
        al.add("111");
        al.add("222");
        al.add(0,"222");
        al.add(0,"111");
        System.out.println(al.get(al.size()));
    }

}
