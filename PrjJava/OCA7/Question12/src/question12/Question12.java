/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author anda
 */
public class Question12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer freq;
        String[] words = new String[] {"aaa", "bbb", "ccc", "aaa"};
        Map<String, Integer> m = new TreeMap<String, Integer>();
        for (String word: words)
        {
            freq = m.get(word);
            m.put(word, freq == null ? 1 : freq + 1);
            
        }
        System.out.println(m);
        }
        
        
    }
    

