/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

/**
 *
 * @author andad
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object t = new Integer(106);
        int k = ((Integer) t).intValue()/10;
        System.out.println(k);
        System.out.println(100/9.9);
        System.out.println(100/10.0);  
        System.out.println(100/10); 
        System.out.println(3 + 100/10*2-13);
    }
    
}
