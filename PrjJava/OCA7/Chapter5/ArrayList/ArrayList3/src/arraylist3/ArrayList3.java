/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author andad
 */
public class ArrayList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(30));
        list.add(10);
        //Arrays.sort(list);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
