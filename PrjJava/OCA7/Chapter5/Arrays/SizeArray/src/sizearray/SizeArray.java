/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sizearray;

import java.util.ArrayList;

/**
 *
 * @author andad
 */
public class SizeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<String>();
        for(String s :args)
        {
            list.add(s);
        }
        System.out.println(list.size() + " " + args.length);
            
            
        
    }
    
}
